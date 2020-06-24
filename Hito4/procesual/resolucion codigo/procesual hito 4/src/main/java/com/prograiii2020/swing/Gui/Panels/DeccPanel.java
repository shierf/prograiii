package com.prograiii2020.swing.Gui.Panels;

import com.prograiii2020.swing.Service.DeccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class DeccPanel extends JPanel {

@Autowired
private DeccService deccService;
        public DeccPanel(){
            this.setPreferredSize(new Dimension(600, 1000));
            this.setLayout(new GridLayout(2, 0));
        }
        @PostConstruct
        public void createButtonsLabel() {
            JPanel caja1 = this.botones();
            this.add(caja1);

        }

         JLabel la1 = new JLabel("word- ");
        JTextField tex1 = new JTextField();
        JTextField tex2 = new JTextField();
        JTextField tex3 = new JTextField();
        JButton button = new JButton("transformar");
        JButton button2 = new JButton("limpiar");
        public JPanel botones()
        {
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new FlowLayout());


            la1.setPreferredSize(new Dimension(70, 30));
            JLabel la2 = new JLabel("lenguage- ");
            la2.setPreferredSize(new Dimension(70, 30));
            JLabel la3 = new JLabel("result- ");
            la3.setPreferredSize(new Dimension(70, 30));



            tex1.setPreferredSize(new Dimension(70, 20));
            tex2.setPreferredSize(new Dimension(70, 20));
            tex3.setPreferredSize(new Dimension(70, 20));







            button2.setPreferredSize(new Dimension(150, 50));
            button.setPreferredSize(new Dimension(150, 50));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JButton button = (JButton) actionEvent.getSource();
                    String w = tex1.getText();
                    String l = tex2.getText();

                    String t = deccService.traducir(w,l);

                    tex3.setText(t);

                }
            });
            button2.setPreferredSize(new Dimension(150, 50));
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JButton button2 = (JButton) actionEvent.getSource();
                    String clear = "";
                    tex1.setText(clear);
                    tex2.setText(clear);
                    tex3.setText(clear);
                }
            });


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



