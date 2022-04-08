package OOSD;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;    
import javax.swing.JOptionPane;

  /**
     * this is the variable maker 
     */
public class Invoice extends JFrame{

 JLabel id,name,Amount,Cost;
 JTextField Tid,Tname,TAmount,Tcost;
 JButton insert,update,delete;
          /**
 *  this makes the gui application for the customer table design
     */
 public Invoice(){
     super("Invoice Table");
     id = new JLabel("Id:");
     name = new JLabel("name:");
     Amount = new JLabel("Amount:");
     Cost = new JLabel("Cost:");
     id.setBounds(20, 20, 100, 20);
     name.setBounds(20, 50, 100, 20);
     Amount.setBounds(20, 80, 100, 20);
     Cost.setBounds(20, 110, 100, 20);
     
     Tid = new JTextField(20);
     Tname = new JTextField(20);
     TAmount = new JTextField(20);
     Tcost = new JTextField(20);
     Tid.setBounds(130,20,150,20);
     Tname.setBounds(130, 50, 150, 20);
     TAmount.setBounds(130, 80, 150, 20);
     Tcost.setBounds(130, 110, 150, 20);
     insert = new JButton("Insert");
     update = new JButton("Update");
     delete = new JButton("Delete");
     insert.setBounds(300, 50, 80, 20);
     update.setBounds(300, 80, 80, 20);
     delete.setBounds(300, 110, 80, 20);
     
     
     setLayout(null);
     add(id);
     add(name);
     add(Amount);
     add(Cost);
     add(Tid);
     add(Tname);
     add(TAmount);
     add(Tcost);
     add(insert);
     add(update);
     add(delete);
     
              /**
     * insert button for database
     */

   //button insert
   insert.addActionListener(new  ActionListener() {

    public void actionPerformed(ActionEvent e) {
    try{
        theQuery("insert into Invoice (name,Amount,Cost) values('"+Tname.getText()+"','"+TAmount.getText()+"',"+Tcost.getText()+")");
    }
    catch(Exception ex){}
    }
});

              /**
     * update button for database
     */
        //button update
        update.addActionListener(new  ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                try{
                
                  theQuery("update Invoice set name = '"+Tname.getText()+"',Amount = '"+TAmount.getText()+"', Cost = "+Tcost.getText()+" where Id = "+Tid.getText());
                }
                catch(Exception ex){}
                }
            });
    
          /**
     * delete button for database
     */
         //button delete
        delete.addActionListener(new  ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{
                 
                    theQuery("delete from Invoice where id = "+Tid.getText());
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
     * excecute the programm
     */

     public static void main(String[] args){
     
         new  Invoice();
     }
}