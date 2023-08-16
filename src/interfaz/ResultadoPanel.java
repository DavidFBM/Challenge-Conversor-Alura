package interfaz;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultadoPanel extends JPanel {
	
    public ResultadoPanel(String resultado, JFrame currentFrame) {
        setLayout(null); // Cambiar al diseño nulo para posicionar manualmente los componentes

        JLabel resultLabel = new JLabel(resultado);
        resultLabel.setBounds(0, 15, 250, 30); // Establecer posición y tamaño
        add(resultLabel);

        JButton closeButton = new JButton("Cerrar");
        closeButton.setBounds(15, 60, 95, 30);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar el programa
                System.exit(0);
            }
        });
        add(closeButton);

        JButton backButton = new JButton("Inicio");
        backButton.setBounds(130, 60, 95, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	currentFrame.dispose(); // cierro la ventana actual
                // Volver al inicio de la aplicación
                Ventana.createAndShowGUI(); // Llamada al método estático de la clase Ventana
            }
        });
        add(backButton);
    }
}
