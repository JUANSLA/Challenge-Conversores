package conversor_Divisas;

import javax.swing.JOptionPane;

/**
 * Funcion de cambio de Divisas la siguente clase tiene la funcionalidad de
 * tomar las divisas seleccionadas por el usuario y convertir el valor de una
 * divisa origen a la divisa destino.
 */
public class FuncionalidadPesos {

	// 1.USD (Dolar)
	public void ChangePesoDolar(double valor) {
		double pesoDolar = valor / 3954.08;
		pesoDolar = (double) Math.round(pesoDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoDolar + " Dolares");
	}

	// 2.CAD (Dolar Canadiense)
	public void ChangePesoDolarCan(double valor) {
		double pesoDolarcan = valor / 3001.29;
		pesoDolarcan = (double) Math.round(pesoDolarcan * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoDolarcan + " Dolares Canadienses");
	}

	// 3.GBP (Libra Sterlina)
	public void ChangePesoLibra(double valor) {
		double pesoLibra = valor / 5082.89;
		pesoLibra = (double) Math.round(pesoLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoLibra + " Libras Esterlinas");
	}

	// 4.EUR (EURO)
	public void ChangePesoEuro(double valor) {
		double pesoEuro = valor / 4371.66;
		pesoEuro = (double) Math.round(pesoEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoEuro + " Euros");
	}

	// 5.CHF (Franco Suizo)
	public void ChangePesoFranco(double valor) {
		double pesoFranco = valor / 4578.72;
		pesoFranco = (double) Math.round(pesoFranco * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoFranco + " Franco Suizo");
	}

	// 6.MEX (Peso Mxicano)
	public void ChangePesoMexpeso(double valor) {
		double pesoMexican = valor / 234.301;
		pesoMexican = (double) Math.round(pesoMexican * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoMexican + " Pesos Mexicanos");
	}

	// 7.JPY (Yen Japones)
	public void ChangePesoYen(double valor) {
		double pesoYen = valor / 27.993;
		pesoYen = (double) Math.round(pesoYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoYen + " Yeanes");
	}

}
