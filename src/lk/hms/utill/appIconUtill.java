/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.hms.utill;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class appIconUtill {
    private static Image appIcon;
    
    static{
        try {
            URL iconPath =appIconUtill.class.getResource("/lk/hms/img/hostel.png");
            ImageIcon icon=new ImageIcon(iconPath);
            appIconUtill.appIcon=icon.getImage();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Invalid Icon Path");
        }
    }
    
    
    public static void applyIcon(JFrame frame){
        if(frame != null){
            frame.setIconImage(appIcon);
        }
        
    }
    
}
