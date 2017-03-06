package gui;

import gui.listener.OperacionListener;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PrincipalFrame extends JFrame{
    
    private EncabezadoPanel pnlEncabezado;
    private OperacionesPanel pnlOperaciones;
    
    public PrincipalFrame() {
        
        super("Enigma");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        pnlEncabezado = new EncabezadoPanel();
        pnlOperaciones = new OperacionesPanel();
        pnlOperaciones.setListener(new OperacionListener() {
            @Override
            public void btnAgregarNumeroClick(Integer numero) {
                System.out.println("Número ingresado: " + numero);
            }
        });
        
        add(pnlEncabezado, BorderLayout.NORTH);
        add(pnlOperaciones, BorderLayout.CENTER);
        
        
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
}
