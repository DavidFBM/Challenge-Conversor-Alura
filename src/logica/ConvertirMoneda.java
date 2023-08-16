package logica;

import java.text.DecimalFormat;

public class ConvertirMoneda {
	
	private DecimalFormat decimalFormat = new DecimalFormat("#.###");
	
	public double CopADolar(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad * 0.00024)).replace(',', '.'));
	}
	
	public double CopAEuro(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad * 0.00022)).replace(',', '.'));
	}
	
	public double CopALibraEsterlina(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad * 0.00019)).replace(',', '.'));
	}
	
	public double CopAYenJapones(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad * 0.0342)).replace(',', '.'));
	}
	
	public double CopAWonSurCoreano(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad * 0.315)).replace(',', '.'));
	}
	
}
