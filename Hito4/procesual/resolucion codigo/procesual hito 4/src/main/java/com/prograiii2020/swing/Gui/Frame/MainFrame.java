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
    private EmptyPanel emptyPanel;
    @Autowired
    private AlphabetPanel alphabetPanel;
    @Autowired
    private PanelImagenes panelImagenes;
    @Autowired
    private DeccPanel deccPanel;
    @Autowired
    private ultimopanel ultimopanel;


    public MainFrame() {
        this.setTitle("diccionario");
        this.setBounds(300, 200, 800, 500);
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(1, 0));
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
        //container.add(alphabetPanel);
       // container.add(panelImagenes);
       // container.add(emptyPanel);
        //container.add(deccPanel);
        container.add(ultimopanel);


    }

}
