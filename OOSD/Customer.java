package OOSD;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

public class Customer extends JFrame{
    /**
     * this is the variable maker 
     */
 JLabel id,name,Address,Number;
 JTextField Tid,Tname,TAddress,TNumber;
 JButton insert,update,delete;
/**
 *  this makes the gui application for the customer table design
 */
 public Customer(){
     super("Customer Table");
     id = new JLabel("Id:");
     name = new JLabel("name:");
     Address = new JLabel("Address:");
     Number = new JLabel("Number:");
     id.setBounds(20, 20, 100, 20);
     name.setBounds(20, 50, 100, 20);
     Address.setBounds(20, 80, 100, 20);
     Number.setBounds(20, 110, 100, 20);
     
     Tid = new JTextField(20);
     Tname = new JTextField(20);
     TAddress = new JTextField(20);
     TNumber = new JTextField(20);
     Tid.setBounds(130,20,150,20);
     Tname.setBounds(130, 50, 150, 20);
     TAddress.setBounds(130, 80, 150, 20);
     TNumber.setBounds(130, 110, 150, 20);
     insert = new JButton("Insert");
     update = new JButton("Update");
     delete = new JButton("Delete");
     insert.setBounds(300, 50, 80, 20);
     update.setBounds(300, 80, 80, 20);
     delete.setBounds(300, 110, 80, 20);
     
     
     setLayout(null);
     add(id);
     add(name);
     add(Address);
     add(Number);
     add(Tid);
     add(Tname);
     add(TAddress);
     add(TNumber);
     add(insert);
     add(update);
     add(delete);
     
 
     /**
      * this performs the action of the insert button to the database
      */

   //button insert
   insert.addActionListener(new  ActionListener() {

    public void actionPerformed(ActionEvent e) {
    try{
        theQuery("insert into customer (name,Address,Number) values('"+Tname.getText()+"','"+TAddress.getText()+"',"+TNumber.getText()+")");
    }
    catch(Exception ex){}
    }
});

      /**
     * the update button for the database updating information 
     */
        //button update
        update.addActionListener(new  ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                try{
                
                  theQuery("update customer set name = '"+Tname.getText()+"',Address = '"+TAddress.getText()+"', Number = "+TNumber.getText()+" where Id = "+Tid.getText());
                }
                catch(Exception ex){}
                }
            });
    
    /**
     * delete button for the database
     */
       
         //button delete
        delete.addActionListener(new  ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{
                 
                    theQuery("delete from customer where id = "+Tid.getText());
                }
                catch(Exception ex){}
                }
            });
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     setLocationRelativeTo(null);
     setSize(500,200);
    
 }
 /**
     * the query to connect to the database and messages
     */
 //function to execute the insert update delete query
  public void theQuery(String query){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost/ca3","root","");
          st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"Query Executed");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
   /**
     * launches the gui and oprogramme
     */
     public static void main(String[] args){   
         new  Customer();
     }
}