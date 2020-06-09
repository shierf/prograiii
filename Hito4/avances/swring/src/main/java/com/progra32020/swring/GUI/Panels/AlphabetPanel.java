package com.progra32020.swring.GUI.Panels;

import com.progra32020.swring.Model.AlphabetModel;
import com.progra32020.swring.Model.ButtonModel;
import com.progra32020.swring.Service.AlphabetService;
import com.progra32020.swring.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;
@Component
public class AlphabetPanel extends JPanel{
    @Autowired
    private AlphabetService alphabetService;
    @Autowired
    private AlphabetModel alphabetModel;
    public AlphabetPanel(){
        this.setPreferredSize(new Dimension(600,100));
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(1,0));
    }
    @PostConstruct
    public void createButtonletters(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());


        List<AlphabetModel> alllTitles = alphabetService.getAllLettersFirst();
        String[] tittlealphabet = alllTitles.get(0).getLetter().split(";");
            for (String title : tittlealphabet){
                JButton button = new JButton(title);
               button.setPreferredSize(new Dimension(100,45));
               mainPanel.add(button);

                this.add(mainPanel);
    }

       }
}


