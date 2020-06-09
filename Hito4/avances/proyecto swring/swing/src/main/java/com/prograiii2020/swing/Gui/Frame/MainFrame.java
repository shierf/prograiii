package com.prograiii2020.swing.Gui.Frame;

import com.prograiii2020.swing.Gui.Panels.AlphabetPanel;
import com.prograiii2020.swing.Gui.Panels.ButtonPanel;
import com.prograiii2020.swing.Gui.Panels.EmptyPanel;
import com.prograiii2020.swing.Gui.Panels.PanelImagenes;
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

    public MainFrame() {
        this.setTitle("PROGRA III 2020");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(2, 0));
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
        container.add(alphabetPanel);
        container.add(panelImagenes);
        container.add(emptyPanel);
    }
}
