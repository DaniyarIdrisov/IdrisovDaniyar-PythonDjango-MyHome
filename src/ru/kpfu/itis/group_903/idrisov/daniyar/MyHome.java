package ru.kpfu.itis.group_903.idrisov.daniyar;

import javax.swing.*;
import java.awt.*;

public class MyHome extends JPanel {

    private final int weight = 400, height = 300;   // panel

    private final int homeX = 60, homeY = 120, homeWeight = 250, homeHeight = 150;  //home coordinates
    private final int doorY = 210, doorWeight = 40, doorHeight = 60, doorX = homeX + homeWeight/2 - doorWeight/2; //door coordinates
    private final int windowLeftX = 90, windowLeftY = 160, windowLeftWeight = 40, windowLeftHeight = 40; // left window coordinates
    private final int windowRightX = 235, windowRightY = 160, windowRightWeight = 40, windowRightHeight = 40; // right window coordinates
    private final int roofX1 = homeX, roofY1 = homeY, roofX2 = homeX + homeWeight/2, roofY2 = 80, roofX3 = homeX + homeWeight, roofY3 = homeY; // roof coordinates

    public MyHome() {
        setPreferredSize(new Dimension(weight, height));
        setBackground(Color.YELLOW);
    }

    public void paint(Graphics home) {
        super.paintComponent(home);
        home.setColor(Color.BLACK);
        home.drawRect(homeX, homeY, homeWeight, homeHeight);
        home.drawRect(doorX, doorY, doorWeight, doorHeight);
        home.drawRect(windowLeftX, windowLeftY, windowLeftWeight, windowLeftHeight);
        home.drawRect(windowRightX, windowRightY, windowRightWeight, windowRightHeight);
        int[] roofX = {roofX1, roofX2, roofX3};
        int[] roofY = {roofY1, roofY2, roofY3};
        home.setColor(Color.RED);
        home.fillPolygon(roofX, roofY, 3);
    }

    public static void main(String[] args) {
        JFrame home = new JFrame("This is My Home");
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.getContentPane().add(new MyHome());
        home.pack();
        home.setVisible(true);
    }

}
