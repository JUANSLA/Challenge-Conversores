package interface_Conversores;

import javax.swing.JOptionPane;
import conversor_Divisas.*;
/** MENU
 * esta clase como su nombre sera el menu que se mostrara, y desplegara las opciones de divisas
 *  segun convenga al usuario.
 * 
 * @author juans
 * **/
public class Menu_Divisas {

	FuncionalidadDolar divisaUsd=new FuncionalidadDolar();
	FuncionalidadPesos divisasCop=new FuncionalidadPesos();
	
	double divisaOrigen;
	boolean continuar;
	int repetir=0;
	
	public void ChangeDiv(double entrada) {

		String option1=(JOptionPane.showInputDialog(null,"Seleccione la divisa origen: ","Cambio De Divisas",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] 
				{"1.|COP| Pesos Colombianos","2.|USD| Dolar"},"Selección")).toString();
		
		switch(option1) {
		case "1.|COP| Pesos Colombianos":
			String cop=(JOptionPane.showInputDialog(null,"Seleccione por la cual desea cambiar: ","< Divisas >",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] 
					{"1.|USD| Dolar","2.|CAD| Dolar Canadiense","3.|GBP| Libra Sterlina","4.|EUR| EURO", 
					"5.|CHF| (Franco Suizo)","6.|MEX| Peso Mxicano","7.|JPY| Yen Japones"},"Selección")).toString();
			
			switch(cop) {
			case "1.|USD| Dolar":
				divisasCop.ChangePesoDolar(entrada);
				break;
			case "2.|CAD| Dolar Canadiense":
				divisasCop.ChangePesoDolarCan(entrada);
				break;
			case "3.|GBP| Libra Sterlina":
				divisasCop.ChangePesoLibra(entrada);
				break;
			case "4.|EUR| EURO":
				divisasCop.ChangePesoEuro(entrada);
				break;
			case "5.|CHF| (Franco Suizo)":
				divisasCop.ChangePesoFranco(entrada);
				break;
			case "6.|MEX| Peso Mxicano":
				divisasCop.ChangePesoMexpeso(entrada);
				break;
			case "7.|JPY| Yen Japones":
				divisasCop.ChangePesoYen(entrada);
				break;
			}
			
			break;
		
		case "2.|USD| Dolar":
			String usd=(JOptionPane.showInputDialog(null,"Seleccione por la cual desea cambiar: ","< Divisas >",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] 
					{"1.|COP| Pesos Colombiano","2.|CAD| Dolar Canadiense","3.|GBP| Libra Sterlina","4.|EUR| EURO",
							"5.|CHF| (Franco Suizo)","6.|MEX| Peso Mxicano","7.|JPY| Yen Japones"},"Selección")).toString();
			
			switch(usd) {
			case "1.|COP| Pesos Colombiano":
				divisaUsd.ChangeDolarPeso(entrada);
				break;
			case "2.|CAD| Dolar Canadiense":
				divisaUsd.ChangeDolarDolarCan(entrada);
				break;
			case "3.|GBP| Libra Sterlina":
				divisaUsd.ChangeDolarLibra(entrada);
				break;
			case "4.|EUR| EURO":
				divisaUsd.ChangeDolarEuro(entrada);
				break;
			case "5.|CHF| (Franco Suizo)":
				divisaUsd.ChangeDolarFranco(entrada);
				break;
			case "6.|MEX| Peso Mxicano":
				divisaUsd.ChangeDolarMexpeso(entrada);
				break;
			case "7.|JPY| Yen Japones":
				divisaUsd.ChangeDolarYen(entrada);
				break;
				}
			break;
			}	
}

}
