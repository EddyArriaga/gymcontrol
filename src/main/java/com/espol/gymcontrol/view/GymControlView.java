package com.espol.gymcontrol.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GymControlView extends JFrame {
    private JComboBox<String> jComboBoxTables;
    private JPanel contentPanel;
    private ContentClientPanel contentClientPanel;
    private ContentMembershipPanel contentMembershipPanel;

    public GymControlView() {
        setTitle("Gym Control"); // Título de la ventana.
        setSize(1000,600); // Tamaño de la ventana.
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

            JPanel mainPanel = new JPanel(); // <--- Panel principal.
            mainPanel.setBackground(new Color(255, 255, 255));
            mainPanel.setLayout(new BorderLayout());

                JPanel tableSelectorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                tableSelectorPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

                    JLabel tableLabel = new JLabel("Tabla: ");
                    tableLabel.setFont(new Font("Arial", Font.PLAIN, 15));
                    tableLabel.setForeground(new Color(0, 0, 0));

                    String[] listTables = {"Clientes", "Membresias", "Pagos", "Asistencia", "Producto"};
                    jComboBoxTables = new JComboBox<>(listTables);
                    jComboBoxTables.setForeground(new Color(0, 0, 0));
                    jComboBoxTables.setFont(new Font("Arial", Font.PLAIN, 15));

                tableSelectorPanel.add(tableLabel);
                tableSelectorPanel.add(jComboBoxTables);

                CardLayout cardLayout = new CardLayout();
                contentPanel = new JPanel(cardLayout);
                
                    contentClientPanel = new ContentClientPanel();
                    contentMembershipPanel = new ContentMembershipPanel();

                contentPanel.add(contentClientPanel, "clientes");
                contentPanel.add(contentMembershipPanel, "membresias");

                jComboBoxTables.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selection = ((String) jComboBoxTables.getSelectedItem()).toLowerCase();
                        cardLayout.show(contentPanel, selection);
                    }
                });
                
            mainPanel.add(tableSelectorPanel, BorderLayout.NORTH);
            mainPanel.add(contentPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    public JComboBox<String> getjComboBoxTables() {
        return jComboBoxTables;
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public ContentClientPanel getContentClientPanel() {
        return contentClientPanel;
    }

    public ContentMembershipPanel getContentMembershipPanel() {
        return contentMembershipPanel;
    }
}
