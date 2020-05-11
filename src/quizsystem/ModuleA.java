package quizsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ModuleA extends Module { //subclass of module that get questions of first module and check answers
    
   public void checkFile() throws FileNotFoundException, IOException 
    {
        fileName = "C:\\Users\\yara\\Desktop\\ModuleA.txt";
        File myfile = new File(fileName);
        FileReader fr = new FileReader(myfile);
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        line = br.readLine();
        String ans = JOptionPane.showInputDialog(line);
        if (ans.equals("T") || ans.equals("t"))
        { counter++; }
        
        line = br.readLine();
        String ans2 = JOptionPane.showInputDialog(line);
        if (ans2.equals("F") || ans.equals("f"))
        { counter++; }
        
        line = br.readLine();
        String ans3 = JOptionPane.showInputDialog(line);
        if (ans3.equals("T") || ans.equals("t"))
        { counter++; }
        
        printResult();
        
    }
   public void printResult() {
       JOptionPane.showMessageDialog(null, "Your result is " + this.counter);
   }
}    
