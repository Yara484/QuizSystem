package quizsystem;

import java.io.*;


abstract public class Module {
    public String fileName = " ";
    public int counter = 0;
    abstract public void checkFile() throws FileNotFoundException, IOException;
    abstract public void printResult();
    
}    