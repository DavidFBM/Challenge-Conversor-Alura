package logica;

public class EnlazarInputLogica {

	private ConvertirMoneda a = new ConvertirMoneda();
	private ConvertirDivisas b = new ConvertirDivisas();
	private ConvertirMetro c = new ConvertirMetro();
	private ConvertirLongitud d = new ConvertirLongitud();
	
	public double ConvertirInput(String tipoConversion, double input) {
		
		switch(tipoConversion) {
		
		case "Cop a Dólar":
			return this.a.CopADolar(input);
			
		case "Cop a Euro":
			return this.a.CopAEuro(input);
			
		case "Cop a Libra Esterlina":
			return this.a.CopALibraEsterlina(input);
			
		case "Cop a Yen Japones":
			return this.a.CopAYenJapones(input);
			
		case "Cop a Won Sur Coreano":
			return this.a.CopAWonSurCoreano(input);
			
		case "Dolar a Cop":
			return this.b.DolarACop(input);
			
		case "Euro a Cop":
			return this.b.EuroACop(input);
			
		case "Libra Esterlina a Cop":
			return this.b.LibraEsterlinaACop(input);
			
		case "Yen Japones a Cop":
			return this.b.YenJaponesACop(input);
			
		case "Won Sur Coreano a Cop":
			return this.b.WonSurCoreanoACop(input);
			
		case "Metro a Milimetro":
			return this.c.MetroAMilimetro(input);
			
		case "Metro a Centimetro":
			return this.c.MetroACentimetro(input);
			
		case "Metro a Decimetro":
			return this.c.MetroADecimetro(input);
			
		case "Metro a Decametro":
			return this.c.MetroADecametro(input);
			
		case "Metro a Hectometro":
			return this.c.MetroAHectometro(input);
			
		case "Metro a Kilometro":
			return this.c.MetroAKilometro(input);
			
		case "Milimetro a Metro":
			return this.d.MilimetroAMetro(input);
			
		case "Centimetro a Metro":
			return this.d.CentimetroAMetro(input);
			
		case "Decimetro a Metro":
			return this.d.DecimetroAMetro(input);
			
		case "Decametro a Metro":
			return this.d.DecametroAMetro(input);
			
		case "Hectometro a Metro":
			return this.d.HectometroAMetro(input);
			
		case "Kilometro a Metro":
			return this.d.KilometroAMetro(input);
			
		default:
			return input;
		}
	}
	
}
