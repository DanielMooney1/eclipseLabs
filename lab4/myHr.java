package lab4;
import java.util.Scanner;
public class myHr {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        address addresses = new address();
        Employee[] employees = new Employee[5];
        office[] offices = new office[3];
        int seclectedoption;
 
        int menuChoice = 0;
        
        for(int i = 0; i <= 2; i++) {
            office currentOffice = new office();
            offices[i] = currentOffice;
        }
        
        do
        {
            System.out.println("Please enter one of the shown options");
            System.out.println("1. List all Offices \n2. Create new employee record" + "\n3. List all Employees \n4. Exit");
            
            menuChoice = in.nextInt();
        
            switch(menuChoice) {
                case 1:
                for(office thisOffice: offices) {
                    System.out.println(thisOffice + "\nNumber of Employees:" + thisOffice.getEmployee());
                    if(thisOffice.getEmployee() != 0) {
                        System.out.println("Employees' Details: " + "\n" + thisOffice.printEmployeeDetails());
                    }
                }
                break;

            case 2:
                    if(employees.length <= 5) {
                        Scanner userInput = new Scanner(System.in);
                        String carDetails = null;
                        System.out.println("Please enter the employee's first name");
                        String firstName = userInput.nextLine();
                        
                        System.out.println("Please enter the employee's last name");
                        String lastName = userInput.nextLine();
                        
                        System.out.println("Please enter street");
                        String street = userInput.nextLine();
                        
                        System.out.println("Please enter town/city");
                        String townCity = userInput.nextLine();
                        
                        System.out.println("Please enter county");
                        String county = userInput.nextLine();
                        
                        System.out.println("Is the employee a manager or staff member?");
                        String employeeType = userInput.nextLine();
                        
                        if(employeeType.equalsIgnoreCase("Manager")) {
                            System.out.println("Please enter the details of the company car.");
                            carDetails = userInput.nextLine();
                        }
                        
                        address newAdd = new address(street, townCity, county);
                        Employee newEmp = new Employee();
                        employees[Employee.employees()] = newEmp;
    
                        for(office currentOffice: offices) {
                            if(currentOffice.employee() < 2) {
                                currentOffice.addEmployee(newEmp);
                                break;
                            }
                        }
                } else {
                    System.out.println("Max number of employee details has been entered.");
                    break;
                }
                    break;
            case 3:
                for(Employee currentEmployee: employees) {
                    if(currentEmployee != null) {
                        System.out.println(currentEmployee);
                    }
                }
                break;
                
            case 4:
                System.out.println("Exiting the program...\nProgram Terminated.");
                System.exit(0);
                break;
            default:
                System.out.println("Ensure you have entered a valid option");
            }
            
        }while(menuChoice != 4);
    }
    }