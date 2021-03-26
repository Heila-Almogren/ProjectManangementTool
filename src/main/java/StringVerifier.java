/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heila
 */


 import javax.swing.*;

 
public class StringVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
       String text = ((JTextField) input).getText();
       if(text.length() < 3)
           return false;

       return true;
    }

    
}
