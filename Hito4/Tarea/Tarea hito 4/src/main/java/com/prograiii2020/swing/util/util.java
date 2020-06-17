package com.prograiii2020.swing.util;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
@Component
public class util {
    public static final ImageIcon success = new ImageIcon(getresourceparth("imagenes/success.jpg"));
    public static final ImageIcon failed = new ImageIcon(getresourceparth("imagenes/failed.jpg"));
    public static final Font font_text = new Font("Arial",Font.BOLD,28);
   private static URL getresourceparth(String nameimg){
       return util.class.getClassLoader().getResource(nameimg);
   }

    public util()
    {

    }
}
