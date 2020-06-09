package com.prograiii2020.swing.Gui.Panels;

import com.prograiii2020.swing.util.util;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@Component
public class PanelImagenes extends JPanel {
    public PanelImagenes(){
        this.setPreferredSize(new Dimension(600,190));
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout(1,5));
    }
    @PostConstruct
    public void createPanelimagenes(){
        JPanel imagenPanel = new JPanel();
        imagenPanel.setLayout(new FlowLayout());

        for(int i= 0;i<5;i++){
            JLabel label = new JLabel(getImageIcon(util.success.getImage()));
            imagenPanel.add(label);
        }
        this.add(imagenPanel);
    }
    public ImageIcon getImageIcon(Image src) {
        int width = 100;
        int height = 60;
        int type = BufferedImage.TYPE_INT_RGB;

        BufferedImage dst = new BufferedImage(width, height, type);
        Graphics2D g2 = dst.createGraphics();
        g2.drawImage(src, 0, 0, width, height, this);
        g2.dispose();

        return new ImageIcon(dst);
    }

}
