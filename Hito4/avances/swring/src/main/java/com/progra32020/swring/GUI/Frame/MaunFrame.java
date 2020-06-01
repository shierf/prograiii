package com.progra32020.swring.GUI.Frame;

import com.progra32020.swring.GUI.Panels.AlphabetPanel;
import com.progra32020.swring.GUI.Panels.ButtonPanel;
import com.progra32020.swring.GUI.Panels.EmptyPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
@Component
public class MaunFrame extends JFrame {
@Autowired
private EmptyPanel emptyPanel;
    @Autowired
    private ButtonPanel buttonPanel;
    @Autowired
    private AlphabetPanel alphabetPanel;
     public MaunFrame(){
         this.setTitle("intro Swing Progra III");
         this.setBounds(300,200,800,600);
         this.setBackground(Color.BLACK);
         this.setLayout(new GridLayout(3,0));


     }
     @PostConstruct
    public void createMainFrame(){
         JPanel container = new JPanel();
         container.setLayout(new FlowLayout());

         addPanels(container);
         this.add(container);
         this.setVisible(true);
     }
     public void addPanels(JPanel container){
         //container.add(buttonPanel);
         //container.add(emptyPanel);
         container.add(alphabetPanel);
     }

}
