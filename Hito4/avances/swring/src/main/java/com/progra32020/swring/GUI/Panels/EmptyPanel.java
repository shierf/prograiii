package com.progra32020.swring.GUI.Panels;

import com.progra32020.swring.Repo.ButtonRepository;
import com.progra32020.swring.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
@Component
public class EmptyPanel extends JPanel {
    @Autowired
    private ButtonService buttonService;

    public EmptyPanel(){
        this.setPreferredSize(new Dimension(600, 300));
        this.setBackground(Color.YELLOW);
        this.setLayout(new GridLayout(2, 1));
    }
@PostConstruct
    public void createEmptyPanel(){
       // String obtener = buttonService.obtenerRegistro();

        //JButton customButton = new JButton("TITLE BUTTON");
        //customButton.setPreferredSize(new Dimension(20, 20));


    }

}
