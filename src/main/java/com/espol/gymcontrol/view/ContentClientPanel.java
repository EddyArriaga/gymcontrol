package com.espol.gymcontrol.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class ContentClientPanel extends JPanel {
    public ContentClientPanel() {
        setLayout(new BorderLayout());

        JPanel manipulationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

            JButton buttonAddData = new JButton("Agregar");
            JButton buttonDeleteData = new JButton("Eliminar");
            JButton buttonDeleteAll = new JButton("Eliminar todo");
            
            JLabel orderLabel = new JLabel("Ordenar por");
            String[] listOrder = {"ID","Nombres","Apellidos"};
            JComboBox<String> jComboBoxOrder = new JComboBox<>(listOrder);

        manipulationPanel.add(buttonAddData);
        manipulationPanel.add(buttonDeleteData);
        manipulationPanel.add(buttonDeleteAll);
        manipulationPanel.add(orderLabel);
        manipulationPanel.add(jComboBoxOrder);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

            String[] columns = {"ID", "Nombres", "Apellidos", "Correo", "Estado suscripción"};
            Object[][] rows = {
                {1,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {2,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "No activo"},
                {3,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {4,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {5,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Suspendido"},
                {7,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {8,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {9,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {10,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {11,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {12,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {13,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {14,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {15,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {16,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {17,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {18,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {19,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"},
                {20,"Eddy Teodoro", "Arriaga Arreaga", "eddyarri@espol.edu.ec", "Activo"}
            };

            
            JTable table = new JTable(rows, columns);
            table.setFont(new Font("Arial", Font.PLAIN, 15));
            table.setForeground(new Color(0, 0, 0));
            table.setRowHeight(40);
            JScrollPane scrollTable = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        contentPanel.add(scrollTable);
        
        add(manipulationPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);

    }
}
