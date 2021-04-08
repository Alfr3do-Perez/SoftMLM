package interfazGraficaComponentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Esta clase permite gestionar la tabla y los eventos realizados sobre ella
 * cada celda seria un objeto personalizable
 *
 * @author 
 *
 */
public class GestionCeldas extends DefaultTableCellRenderer {

    private String tipo = "text";

    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);

    private JLabel label;

    private ImageIcon iconoObservar;
    private ImageIcon iconoEditar;
    private ImageIcon iconoEliminar;
    private ImageIcon iconoInventariar;
    private ImageIcon iconoGuardar;

    public GestionCeldas() {

    }

   
    public GestionCeldas(String tipo) {
        this.label = new JLabel();
        this.iconoObservar = new ImageIcon(getClass().getResource("/img/administrarCatalogoOpcionObservar.png"));
        this.iconoEditar = new ImageIcon(getClass().getResource("/img/administrarCatalogoOpcionEditar.png"));
        this.iconoEliminar = new ImageIcon(getClass().getResource("/img/administrarCatalogoOpcionEliminar.png"));
        this.iconoInventariar = new ImageIcon(getClass().getResource("/img/administrarCatalogoOpcionInventariar.png"));
        this.iconoGuardar = new ImageIcon(getClass().getResource("/img/ico_guardar.png"));
        this.tipo = tipo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

        Color colorFondo = null;
        Color colorFondoPorDefecto = new Color(192, 192, 192);
        Color colorFondoSeleccion = new Color(140, 140, 140);

        
        if (selected) {
            this.setBackground(colorFondoPorDefecto);
        } else {
            this.setBackground(Color.white);
        }

       
        if (tipo.equals("texto")) {
            if (focused) {
                colorFondo = colorFondoSeleccion;
            } else {
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.LEFT);
            this.setText((String) value);
            this.setBackground((selected) ? colorFondo : Color.WHITE);
            this.setFont(normal);
            return this;
        }

        if (tipo.equals("icono")) {
            if (String.valueOf(value).equals("OBSERVAR")) {
                label.setIcon(iconoObservar);
            } else if (String.valueOf(value).equals("EDITAR")) {
                label.setIcon(iconoEditar);
            } else if (String.valueOf(value).equals("ELIMINAR")) {
                label.setIcon(iconoEliminar);
            } else if (String.valueOf(value).equals("INVENTARIAR")) {
                label.setIcon(iconoInventariar);
            } else {
                label.setIcon(iconoGuardar);
            }
            label.setHorizontalAlignment(JLabel.LEFT);
            return label;
        }

        if (tipo.equals("numerico")) {
            if (focused) {
                colorFondo = colorFondoSeleccion;
            } else {
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setForeground((selected) ? new Color(255, 255, 255) : new Color(32, 117, 32));
            this.setBackground((selected) ? colorFondo : Color.WHITE);
            this.setFont(bold);
            return this;
        }

        return this;

    }

}
