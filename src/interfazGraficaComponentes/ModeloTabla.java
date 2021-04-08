package interfazGraficaComponentes;

import javax.swing.table.DefaultTableModel;


public class ModeloTabla extends DefaultTableModel{
	
	String[] titulos;
	Object[][] datos;
	
	/**
	 * Determina el modelo con el que se va a construir la tabla
	 * @param titulos
	 */
	public ModeloTabla(String[] titulos) {
		super();
		this.titulos=titulos;
		this.datos= new Object[0][0];
		setDataVector(datos, titulos);
	}
	
	public ModeloTabla() {
		// TODO Auto-generated constructor stub
	}

        @Override
	public boolean isCellEditable (int row, int column){return false;}

}
