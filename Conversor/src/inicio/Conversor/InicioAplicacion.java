package inicio.Conversor;

import javax.swing.JOptionPane;

//import funcionalidad.Longitud.*;
//import conversor_Divisas.*;
//import funcionalidad.Longitud.*;
import interface_Conversores.*;

public class InicioAplicacion {
	public static void main(String[] args) {
		
		Menu_Divisas divisas =new Menu_Divisas();
		Menu_Longitudes temperatura =new Menu_Longitudes();
		
		
		boolean continuando=true;
		while(continuando) 
		{
			String opcion=(JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", 
					"Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Divisas", 
					"Conversor de Longitud"}, "Seleccion")).toString();
					
			switch(opcion) {
			
			//DIVISAS
			case "Conversor de Divisas":
       		
				try {
					String input = JOptionPane.showInputDialog(null,"Ingresa el valor de cambio: ","Conversor De Divisas",JOptionPane.INFORMATION_MESSAGE);    
					double valor1 = Double.parseDouble(input);
					
					divisas.ChangeDiv(valor1);
					int boton=JOptionPane.showConfirmDialog(null, "¿Desea Volver al Menu?","Confirmación",JOptionPane.YES_NO_OPTION);
					if(boton==JOptionPane.YES_OPTION) {
						continuando=true;	
					}else {
						System.exit(boton);
						System.out.println("Finalizo una conversio de DIVISAS");					
					}	
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "!Error, seleccione una opcion valida¡");
				}
				
			//LONGITUDES
			case "Conversor de Longitud":
				
				//codigo de Conversor de Longitud o distancia
				try {
				 	String input = JOptionPane.showInputDialog(null,"Ingresa el valor de la longitud: ","Conversor De Longitud",JOptionPane.INFORMATION_MESSAGE);    
					double grados = Double.parseDouble(input);
				  
				  	temperatura.CambioTemp(grados);
					int boton=JOptionPane.showConfirmDialog(null, "¿Desea Volver al Menu?","Confirmación",JOptionPane.YES_NO_OPTION);
					if(boton==JOptionPane.YES_OPTION) {
						continuando=true;	
					}else {
						System.exit(boton);
						System.out.println("Finalizo una conversion de LONGITUDES");					
					}
					
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "!Error, seleccione una opcion valida¡");
				}
			}
			
			JOptionPane.showConfirmDialog(null, "Finalizando...");
		}               
	}
}