package com.prograiii2020.swing.Gui.Panels;

import com.prograiii2020.swing.Service.DeccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
@Component
public class DeccPanel extends JPanel {


        public DeccPanel(){
            this.setPreferredSize(new Dimension(900, 100));
            this.setLayout(new GridLayout(1, 0));
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

            JLabel la1 = new JLabel("word- ");
            la1.setPreferredSize(new Dimension(70, 30));
            JLabel la2 = new JLabel("lenguage- ");
            la2.setPreferredSize(new Dimension(70, 30));
            JLabel la3 = new JLabel("result- ");
            la3.setPreferredSize(new Dimension(70, 30));


            JTextField tex1 = new JTextField();
            tex1.setPreferredSize(new Dimension(70, 20));
            JTextField tex2 = new JTextField();
            tex2.setPreferredSize(new Dimension(70, 20));
            JTextField tex3 = new JTextField();
            tex3.setPreferredSize(new Dimension(70, 20));


            JButton button = new JButton("transformar");
            button.setPreferredSize(new Dimension(150, 50));


            JButton button2 = new JButton("limpiar");
            button2.setPreferredSize(new Dimension(150, 50));




            mainPanel.add(la1);
            mainPanel.add(tex1);
            mainPanel.add(la2);
            mainPanel.add(tex2);
            mainPanel.add(la3);
            mainPanel.add(tex3);



            mainPanel.add(button);
            mainPanel.add(button2);






            return mainPanel;
        }


}



