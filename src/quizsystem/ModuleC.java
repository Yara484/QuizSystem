package quizsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ModuleC extends Module { //subclass of module that get questions of third module and check answers
    
    public void checkFile() throws FileNotFoundException, IOException 
    {
        fileName = "C:\\Users\\yara\\Desktop\\ModuleC.txt";
        File myfile = new File(fileName);
        FileReader fr = new FileReader(myfile);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!=null) {
            
            String ans = JOptionPane.showInputDialog(line);
            if (ans.equals("F") || ans.equals("f"))
                counter++;
         }
        printResult();
    }
    public void printResult() {
       JOptionPane.showMessageDialog(null, "Your result is " + this.counter);
   }
    
}
