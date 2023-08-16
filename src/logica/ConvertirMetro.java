package logica;

import java.text.DecimalFormat;

public class ConvertirMetro {

	private DecimalFormat decimalFormat = new DecimalFormat("#.###");
	
	public double MetroAMilimetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud * 1000)).replace(',', '.'));
	}
	
	public double MetroACentimetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud * 100)).replace(',', '.'));
	}
	
	public double MetroADecimetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud * 10)).replace(',', '.'));
	}
	
	public double MetroADecametro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud / 10)).replace(',', '.'));
	}
	
	public double MetroAHectometro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud / 100)).replace(',', '.'));
	}
	
	public double MetroAKilometro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud / 1000)).replace(',', '.'));
	}
	
}
