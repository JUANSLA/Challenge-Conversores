package funcionalidad.Longitud;

import javax.swing.JOptionPane;

public class LongitudCentimetro {

	double unidad;
	
	//1.|Km| Kilometro
	public void CambioCmKm(double valor) {
		unidad= valor / 100000d;
		JOptionPane.showMessageDialog(null, valor+"cm = " + unidad+ "km");	
	}
	
	//2.|hm| Hectometro
	public void CambioCmHm(double valor) {
		unidad= valor / 10000d;
		JOptionPane.showMessageDialog(null, valor+"cm = " + unidad+ "hm");	
	}
	
	//3.|dam| Decametro
	public void CambioCmDam(double valor) {
		unidad= valor / 1000d;
		JOptionPane.showMessageDialog(null, valor+"cm = " + unidad+ "dam");	
	}
	//4.|m| Metro
	public void CambioCmM(double valor) {
		unidad= valor / 100d;
		JOptionPane.showMessageDialog(null, valor+"cm = " + unidad+ "m");	
	}
	//5.|dm| Decimetro
	public void CambioCmdm(double valor) {
		unidad= valor / 10d;
		JOptionPane.showMessageDialog(null, valor+"cm = " + unidad+ "dm");	
	}
	
	//6.|mm| Milimetro
	public void CambioCmMm(double valor) {
		unidad= valor / 0.1d;
		JOptionPane.showMessageDialog(null, valor+"cm = " + unidad+ "mm");	
	}
		
}
/*"1.|Km| Kilometro"
"2.|hm| Hectometro"
"3.|dam| Decametro"
"4.|m| Metro"
"5.|dm| Decimetro"
"6.|cm| Centimetro"
"7.|mm| Milimetro"
*/