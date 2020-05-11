package quizsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ModuleB extends Module { //subclass of module that get questions of second module and check answers
    
    public void checkFile() throws FileNotFoundException, IOException 
    {
        fileName = "C:\\Users\\yara\\Desktop\\ModuleB.txt";
        File myfile = new File(fileName);
        FileReader fr = new FileReader(myfile);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!=null) {
            
            String ans = JOptionPane.showInputDialog(line);
            if (ans.equals("T") || ans.equals("t"))
                counter++;
         }
        printResult();
    }
    public void printResult() {
       JOptionPane.showMessageDialog(null, "Your result is " + this.counter);
   }
}
