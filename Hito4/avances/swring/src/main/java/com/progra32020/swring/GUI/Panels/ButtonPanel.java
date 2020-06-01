package com.progra32020.swring.GUI.Panels;

import com.progra32020.swring.Model.ButtonModel;
import com.progra32020.swring.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class ButtonPanel extends JPanel {
    @Autowired
    private ButtonService buttonService;
    public  ButtonPanel(){
        this.setPreferredSize(new Dimension(600,100));
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(4,0));
    }
    @PostConstruct
    public void createButton(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        List<ButtonModel> alllTitles = buttonService.getAllTitleButton();
        alllTitles.forEach(buttonModel -> {
            JButton button = new JButton(buttonModel.getTitleButton());
            button.setPreferredSize(new Dimension(100, 40));
            mainPanel.add(button);
        });
      this.add(mainPanel);

    }
}
