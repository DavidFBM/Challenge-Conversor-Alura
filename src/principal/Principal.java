package principal;

import interfaz.Ventana;

import javax.swing.SwingUtilities;

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            Ventana.createAndShowGUI();
        });
	}
	
}
