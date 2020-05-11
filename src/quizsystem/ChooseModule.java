package quizsystem;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ChooseModule implements InterfaceA {
    
    public String choice;
    
    public void ChooseModule(boolean ans) throws IOException { //if the username and id is correct, let the user choose the module 
        if (ans) {
        choice = JOptionPane.showInputDialog("Choose module A, B or C: ");
        choiceA();  //run each method 
        choiceB();
        choiceC();
        }
    }
    
    public void choiceA() throws IOException { //if module A then create an object from module A and get questions
        if (choice.equals("A") || choice.equals("a")) {
            ModuleA quiz = new ModuleA();
            quiz.checkFile();
        }
    }
    
    public void choiceB() throws IOException { //if module B then create an object from module A and get questions
        if (choice.equals("B") || choice.equals("b")) {
            ModuleB quiz = new ModuleB();
            quiz.checkFile();
        }
    }
    
    public void choiceC() throws IOException { //if module c then create an object from module A and get questions
        if (choice.equals("C") || choice.equals("c")) {
            ModuleC quiz = new ModuleC();
            quiz.checkFile();
        }
    }
   
}
