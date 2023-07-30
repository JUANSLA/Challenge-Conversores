package interface_Conversores;

import javax.swing.JOptionPane;
import funcionalidad.Longitud.LongitudCentimetro;
import funcionalidad.Longitud.LongitudKilometro;

public class Menu_Longitudes {

	LongitudCentimetro longitudCm = new LongitudCentimetro();
	LongitudKilometro longitudKm= new LongitudKilometro();
	
	public void CambioTemp(double entrada) {

		String medida=(JOptionPane.showInputDialog(null,"Seleccione la unidad origen: ","Convertidor de Longitud",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] 
				{"1.|cm| Centimetro","2.|Km| Kilometro"},"Selección")).toString();
		
		switch(medida) {
		case "1.|cm| Centimetro":
			String cm=(JOptionPane.showInputDialog(null,"Seleccione la unidad a convertir: ","Longitud",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"1.|Km| Kilometro","2.|hm| Hectometro",
							"3.|dam| Decametro","4.|m| Metro","5.|dm| Decimetro","6.|mm| Milimetro"},"Selección")).toString();
			switch(cm) {
			case "1.|Km| Kilometro":
				longitudCm.CambioCmKm(entrada);
				break;
			case "2.|hm| Hectometro":
				longitudCm.CambioCmHm(entrada);
				break;
			case "3.|dam| Decametro":
				longitudCm.CambioCmDam(entrada);
				break;
			case "4.|m| Metro":
				longitudCm.CambioCmM(entrada);
				break;
			case "5.|dm| Decimetro":
				longitudCm.CambioCmdm(entrada);
				break;
			case "6.|mm| Milimetro":
				longitudCm.CambioCmMm(entrada);
				break;
			}
			
			break;
		
		case "2.|Km| Kilometro":
			String km=(JOptionPane.showInputDialog(null,"Seleccione la unidad a convertir: ","Longitud",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"1.|hm| Hectometro","2.|dam| Decametro",
					"3.|m| Metro","4.|dm| Decimetro","5.|Cm| Centimetro","6.|mm| Milimetro"},"Selección")).toString();
			
			switch(km) {
			case "1.|hm| Hectometro":
				longitudKm.CambioKmHm(entrada);
				break;
				
			case "2.|dam| Decametro":
			longitudKm.CambioKmHm(entrada);
			break;
			
			case "3.|m| Metro":
			longitudKm.CambioKmHm(entrada);
			break;
			
			case "4.|dm| Decimetro":
			longitudKm.CambioKmdm(entrada);
			break;
			
			case "5.|Cm| Centimetro":
			longitudKm.CambioKmCm(entrada);
			break;
			
			case "6.|mm| Milimetro":
			longitudKm.CambioKmMm(entrada);
			break;
		}	
		//break;
		}
	}
}