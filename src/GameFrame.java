import sun.awt.image.BufferedImageDevice;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameFrame extends JFrame {
BufferedImage bi = null;
    GamePanel panel;

    GameFrame() throws MalformedURLException {
        Image img = Toolkit.getDefaultToolkit().getImage("tb (2).jpg");

        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        //this.setBackground(setIconImage(img));
        this.setIconImage(img);
        this.setBackground(Color.BLUE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
