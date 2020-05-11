package quizsystem;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Login  {
    
    private Scanner x;
    private String firstName;
    private String lastName;
    private String id;
    public boolean result;
    
    public void Login() { //constructor to get name and ID 
        firstName = JOptionPane.showInputDialog("Enter first name ");
        lastName = JOptionPane.showInputDialog("Enter last name ");
        id = JOptionPane.showInputDialog("Enter ID ");
    } 
    public boolean ReadFile() { //method to read file and check if the information is correct  
        try {
            x = new Scanner(new File("C:\\Users\\yara\\Desktop\\IdList.txt"));
        }
        catch(Exception e) {
            System.out.println("No file found");
        }
        
        while(x.hasNext())
        {
            String id2 = x.next();
            String firstName2 = x.next();
            String lastName2 = x.next();
            if (id2.equals(id) && firstName2.equals(firstName) && lastName2.equals(lastName))
            {
               result = true;
               break;
            }
            //else JOptionPane.showMessageDialog(null, "Name or ID is incorrect, try again");
        }
        x.close(); //close file after checking information
        return result;
    }
}    
   
    
    

