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

public class ContentMembershipPanel extends JPanel {
    public ContentMembershipPanel() {
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

            String[] columns = {"ID", "Tipo", "Costo", "Duración", "Beneficio"};
            Object[][] rows = {
                {1, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {2, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {3, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {4, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {5, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {6, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {7, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {8, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {9, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {10, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {11, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {12, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {13, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {14, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {15, "Premium", "$ 25.00", "1 mes", "Beneficios..."},
                {16, "Premium", "$ 25.00", "1 mes", "Beneficios..."}
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
