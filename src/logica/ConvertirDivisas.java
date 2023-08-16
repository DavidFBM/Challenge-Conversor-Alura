package logica;

import java.text.DecimalFormat;

public class ConvertirDivisas {

	private DecimalFormat decimalFormat = new DecimalFormat("#.###");
	
	public double DolarACop(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad / 0.00024)).replace(',', '.'));
	}
	
	public double EuroACop(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad / 0.00022)).replace(',', '.'));
	}
	
	public double LibraEsterlinaACop(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad / 0.00019)).replace(',', '.'));
	}
	
	public double YenJaponesACop(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad / 0.0342)).replace(',', '.'));
	}
	
	public double WonSurCoreanoACop(double cantidad) {
		return Double.parseDouble((decimalFormat.format(cantidad / 0.315)).replace(',', '.'));
	}
	
}
