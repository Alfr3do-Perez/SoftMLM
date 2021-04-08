/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGraficaComponentes;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author AlfredoPerez
 */
public class PanelPersonalizado extends JPanel {

    private Color color1 = new Color(255, 255, 255);
    private Color color2 = new Color(0, 0, 0);

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2=(Graphics2D)g;

        Rectangle clip = g2.getClipBounds();

        float x = getWidth();

        float y = getHeight();

        g2.setPaint(new GradientPaint(0, 0, color1, 200, 400, color2));

        g2.fillRect(0, 0, getWidth(), getHeight());

    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
}
