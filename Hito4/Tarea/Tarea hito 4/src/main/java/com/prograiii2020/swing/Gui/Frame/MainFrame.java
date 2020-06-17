package com.prograiii2020.swing.Gui.Frame;

import com.prograiii2020.swing.Gui.Panels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

    @Autowired
    private DeccPanel deccPanel;



    public MainFrame() {
        this.setTitle("diccionario");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(6, 5));
    }

    @PostConstruct
    public void createPanelsMainFrame() {
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());

        addPanels(container);

        this.add(container);
        this.setVisible(true);
    }

    public void addPanels(JPanel container) {

        container.add(deccPanel);
       // container.add(flowLoyout);


    }

}
