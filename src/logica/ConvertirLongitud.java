package logica;

import java.text.DecimalFormat;

public class ConvertirLongitud {

	private DecimalFormat decimalFormat = new DecimalFormat("#.###");
	
	public double MilimetroAMetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud / 1000)).replace(',', '.'));
	}
	
	public double CentimetroAMetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud / 100)).replace(',', '.'));
	}
	
	public double DecimetroAMetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud / 10)).replace(',', '.'));
	}
	
	public double DecametroAMetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud * 10)).replace(',', '.'));
	}
	
	public double HectometroAMetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud * 100)).replace(',', '.'));
	}
	
	public double KilometroAMetro(double longitud) {
		return Double.parseDouble((decimalFormat.format(longitud * 1000)).replace(',', '.'));
	}
	
}
