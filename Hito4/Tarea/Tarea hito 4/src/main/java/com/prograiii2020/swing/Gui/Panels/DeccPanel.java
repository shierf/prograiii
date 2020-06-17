package com.prograiii2020.swing.Gui.Panels;

import com.prograiii2020.swing.Service.DeccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
@Component
public class DeccPanel extends JPanel {

    JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
        public DeccPanel(){
            this.setPreferredSize(new Dimension(900, 100));
            //this.setLayout(new GridLayout());
            //this.setLayout(new FlowLayout(FlowLayout.CENTER));
            this.setLayout(new BorderLayout());
        }
        @PostConstruct
        public void createButtonsLabel() {
            JPanel caja1 = this.botones();
            this.add(caja1);

        }


        public JPanel botones()
        {
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new FlowLayout());


            boton1=new JButton();
            boton1.setText("boton1");

            boton2=new JButton();
            boton2.setText("boton2");

            boton3=new JButton();
            boton3.setText("boton3");

            boton4=new JButton();
            boton4.setText("boton4");

            boton5=new JButton();
            boton5.setText("boton5");

//            boton6=new JButton();
//            boton6.setText("boton6");
//
//            boton7=new JButton();
//            boton7.setText("boton7");
//
//            boton8=new JButton();
//            boton8.setText("boton8");
//
//            boton9=new JButton();
//            boton9.setText("boton9");

            add(boton1,BorderLayout.CENTER);
            add(boton2,BorderLayout.NORTH);
            add(boton3,BorderLayout.EAST);
            add(boton4,BorderLayout.WEST);
            add(boton5,BorderLayout.SOUTH);
//            add(boton6);
//            add(boton7);
//            add(boton8);
//            add(boton9);
            return mainPanel;
        }


}



