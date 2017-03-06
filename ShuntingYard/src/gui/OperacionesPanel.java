package gui;

import gui.listener.OperacionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OperacionesPanel extends JPanel{
    
    private JButton btnAbreParentesis, btnCierraParentesis;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnPotencia;
    private JButton btnIgual;
    private OperacionListener listener;
    
    public OperacionesPanel() {
        
        setLayout(new BorderLayout());
        
        btnAbreParentesis = new JButton("(");
        btnAbreParentesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnAgregarNumeroClick(5);
            }
        });
        btnCierraParentesis = new JButton(")");
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnPotencia = new JButton("^");
        btnIgual = new JButton("=");
        
        JPanel pnlBotones = new JPanel();
        pnlBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlBotones.add(btnAbreParentesis);
        pnlBotones.add(btnCierraParentesis);
        pnlBotones.add(btnSumar);
        pnlBotones.add(btnRestar);
        pnlBotones.add(btnMultiplicar);
        pnlBotones.add(btnDividir);
        pnlBotones.add(btnPotencia);
        pnlBotones.add(btnIgual);
        
        add(pnlBotones);
    }

    public void setListener(OperacionListener listener) {
        this.listener = listener;
    }
}
