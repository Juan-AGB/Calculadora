package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import sun.swing.SwingLazyValue;

public class EncabezadoPanel extends JPanel{
    
    private JTextField txtNumero;
    
    public EncabezadoPanel() {
        
        setLayout(new BorderLayout());
        
        txtNumero = new JTextField(3);
        txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
        
        JPanel pnlNumero = new JPanel();
        pnlNumero.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlNumero.add(txtNumero);
        
        
        
        
        add(pnlNumero, BorderLayout.CENTER);
        
        
    }
    
}
