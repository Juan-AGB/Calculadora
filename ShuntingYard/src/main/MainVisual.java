package main;

import gui.PrincipalFrame;
import javax.swing.SwingUtilities;

public class MainVisual {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PrincipalFrame frame = new PrincipalFrame();
            }
        });
        
        
    }
    
}
