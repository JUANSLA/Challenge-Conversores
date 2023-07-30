package conversor_Divisas;

import javax.swing.JOptionPane;

public class FuncionalidadDolar {
	
	private double divisa;
	
	//1.COP (Pesos Colombianos)
		public void ChangeDolarPeso(double valor) {
			divisa= valor / 0.00025d;
			divisa= (double) Math.round(divisa* 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + divisa+ " Pesos Colombianos");
			
		}

	// 2.CAD (Dolar Canadiense)
		public void ChangeDolarDolarCan(double valor) {
			/*double pesoDolarcan = valor / 0.75904;
			pesoDolarcan = (double) Math.round(pesoDolarcan * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + pesoDolarcan + " Dolares Canadienses");*/
			divisa= valor / 0.75904;
			//divisa= (double) Math.round(divisa* 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + divisa+ " Dolares CAN");
		}

	// 3.GBP (Libra Sterlina)
		public void ChangeDolarLibra(double valor) {
			double dolarLibra = valor / 1.28548;
			dolarLibra = (double) Math.round(dolarLibra * 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + dolarLibra + " Libra Sterlina");
		}

	// 4.EUR (EURO)
		public void ChangeDolarEuro(double valor) {
			double dolarEuro = valor/1.108;
			dolarEuro = (double) Math.round(dolarEuro * 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + dolarEuro + " Euros");
		}

	// 5.CHF (Franco Suizo)
		public void ChangeDolarFranco(double valor) {
			double dolarFranco = valor/1.16 ;
			dolarFranco = (double) Math.round(dolarFranco * 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + dolarFranco + " Franco Suizo");
		}

	// 6.MEX (Peso Mxicano)
		public void ChangeDolarMexpeso(double valor) {
			double dolarMexican = valor / 0.059d;
			dolarMexican = (double) Math.round(dolarMexican * 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + dolarMexican + " Peso Mxicano");
		}

	// 7.JPY (Yen Japones)
		public void ChangeDolarYen(double valor) {
			double dolarYen = valor / 0.007125d;
			dolarYen = (double) Math.round(dolarYen * 100d) / 100d;
			JOptionPane.showMessageDialog(null, "Tienes $ " + dolarYen + " Yenes ");
		}
}
