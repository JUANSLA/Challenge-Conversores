package funcionalidad.Longitud;

import javax.swing.JOptionPane;

public class LongitudKilometro {
	double unidad;
	
	//1.|hm| Hectometro
	public void CambioKmHm(double valor) {
		unidad= valor / 0.1d;
		JOptionPane.showMessageDialog(null, valor+"Km = " + unidad+ " hm");	
	}
	
	//2.|dam| Decametro
	public void CambioKmDam(double valor) {
		unidad= valor / 0.01d;
		JOptionPane.showMessageDialog(null, valor+"Km = " + unidad+ " dam");	
	}
	//3.|m| Metro
	public void CambioKmM(double valor) {
		unidad= valor / 0.001d;
		JOptionPane.showMessageDialog(null, valor+"Km = " + unidad+ " m");	
	}
	//4.|dm| Decimetro
	public void CambioKmdm(double valor) {
		unidad= valor / 0.0001d;
		JOptionPane.showMessageDialog(null, valor+"Km = " + unidad+ " dm");	
	}
	//5.|cm| Centimetro
	public void CambioKmCm(double valor) {
		unidad= valor / 0.0001d;
		JOptionPane.showMessageDialog(null, valor+"Km = " + unidad+ " cm");	
	}
	
	//6.|mm| Milimetro
	public void CambioKmMm(double valor) {
		unidad= valor / 0.00001d;
		JOptionPane.showMessageDialog(null, valor+"Km = " + unidad+ " mm");	
	}
}
