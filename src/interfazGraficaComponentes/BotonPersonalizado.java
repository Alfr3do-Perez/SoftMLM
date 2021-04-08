/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGraficaComponentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author AlfredoPerez
 */
public class BotonPersonalizado extends JButton implements MouseListener{

    private Color colorNormal = new Color(0,0,102);
    private Color colorHover = new Color(58, 103, 201);
    
    private Color colorTexto = new Color(255,255,255);
    private Color colorTextoHover = new Color(255,255,255);
    
    
    public BotonPersonalizado() {
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setFont(new java.awt.Font("Segoe UI", 0, 11));
        this.setPreferredSize(new Dimension(120, 30));
        this.setBackground(colorNormal);
        this.setForeground(colorTexto);
        this.setSize(120, 30);
        this.addMouseListener(this);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) { 
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        this.setBackground(colorHover);
        this.setForeground(colorTextoHover);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        this.setBackground(colorNormal);
        this.setForeground(colorTexto);
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.colorNormal = colorNormal;
        this.setBackground(colorNormal);
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
        this.setForeground(colorTexto);
    }

    public Color getColorTextoHover() {
        return colorTextoHover;
    }

    public void setColorTextoHover(Color colorTextoHover) {
        this.colorTextoHover = colorTextoHover;
    }

    
    
    
    
    
}
