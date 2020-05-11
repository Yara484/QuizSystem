package quizsystem;

import java.io.IOException;

public class QuizSystem {
    public static void main(String[] args) throws IOException {
        
        Login obj = new Login();
        obj.Login();
        boolean res = obj.ReadFile();
        
        ChooseModule obj2 = new ChooseModule();
        obj2.ChooseModule(res);
        
        
    }
    
}
