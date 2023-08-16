package interfaz;

import javax.swing.*;

import logica.EnlazarInputLogica;

public class Ventana {
    private static JFrame frame;
    private static JPanel currentPanel;
    
    
    public static void createAndShowGUI() {
        frame = new JFrame("Conversor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150); // Tamaño de la vnetana
        frame.setLocationRelativeTo(null); // Centrar pantalla al momento de ejecurtarse

        JPanel panel = new JPanel();
        panel.setLayout(null); // Usar layout null para controlar la ubicación manualmente
        frame.add(panel);

        JLabel label = new JLabel("Bienvenido al conversor,");
        label.setBounds(50, 0, 150, 30); // Establecer posición y tamaño
        panel.add(label);

        JLabel label2 = new JLabel("Elije el tipo de conversor que requieras.");
        label2.setBounds(2, 20, 250, 30); // Establecer posición y tamaño
        panel.add(label2);

        JButton divisasButton = new JButton("Divisas");
        divisasButton.setBounds(10, 60, 100, 30); // Establecer posición y tamaño
        divisasButton.addActionListener(e -> {
            showDivisasPanel();
        });

        JButton longitudesButton = new JButton("Longitudes");
        longitudesButton.setBounds(125, 60, 100, 30); // Establecer posición y tamaño
        longitudesButton.addActionListener(e -> {
            showLongitudesPanel();
        });

        panel.add(divisasButton);
        panel.add(longitudesButton);

        currentPanel = panel; // Establecer el panel actual
        frame.setVisible(true);
    }

    private static void showDivisasPanel() {
        JPanel divisasPanel = new JPanel();
        divisasPanel.setLayout(null);
        
        String[] opcionesDivisas = {"Cop a Dólar", "Cop a Euro", "Cop a Libra Esterlina", 
        		"Cop a Yen Japones", "Cop a Won Sur Coreano", "Dolar a Cop", "Euro a Cop", 
        		"Libra Esterlina a Cop", "Yen Japones a Cop", "Won Sur Coreano a Cop"};
        JComboBox<String> comboBoxDivisas = new JComboBox<>(opcionesDivisas);
        comboBoxDivisas.setBounds(40, 0, 150, 25);
        divisasPanel.add(comboBoxDivisas);
        
        JTextField inputFieldDivisas = new JTextField();
        inputFieldDivisas.setBounds(40, 30, 150, 25);
        divisasPanel.add(inputFieldDivisas);

        JButton convertButtonDivisas = new JButton("Convertir");
        convertButtonDivisas.setBounds(70, 55, 100, 25);
        convertButtonDivisas.addActionListener(e -> {
            String selectedConversion = (String) comboBoxDivisas.getSelectedItem();
            String inputValueText = inputFieldDivisas.getText();
            try {
            double inputValue = Double.parseDouble(inputValueText);
            EnlazarInputLogica a = new EnlazarInputLogica();
            double convertedValue = a.ConvertirInput(selectedConversion, inputValue); // Cálculo de la conversión
            String resultado = inputValue + " " + selectedConversion + " es igual a " + convertedValue;
            ResultadoPanel resultadoPanel = new ResultadoPanel(resultado, frame);
            
            frame.getContentPane().removeAll();
            frame.add(resultadoPanel);
            frame.revalidate();
            frame.repaint();
            } catch (NumberFormatException ex) {
            	JOptionPane.showMessageDialog(frame, "Ingresa un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        divisasPanel.add(convertButtonDivisas);
        
        JLabel label = new JLabel("Cop es peso Colombiano.");
        label.setBounds(0, 80, 250, 12); // Establecer posición y tamaño
        divisasPanel.add(label);
        
        JLabel label2 = new JLabel("Tasa de conversion del 6/08/2023.");
        label2.setBounds(0, 95, 250, 12); // Establecer posición y tamaño
        divisasPanel.add(label2);

        
        frame.remove(currentPanel); // Eliminar el panel actual
        frame.add(divisasPanel); // Agregar el nuevo panel
        frame.revalidate(); // Redibujar el frame
        frame.repaint();
        currentPanel = divisasPanel; // Actualizar el panel actual
        
    }

    private static void showLongitudesPanel() {
        JPanel longitudesPanel = new JPanel();
        longitudesPanel.setLayout(null);
        
        String[] opcionesDivisas = {"Metro a Milimetro", "Metro a Centimetro",
        		"Metro a Decimetro", "Metro a Decametro", "Metro a Hectometro",
        		"Metro a Kilometro", "Milimetro a Metro", "Centimetro a Metro",
        		"Decimetro a Metro", "Decametro a Metro", "Hectometro a Metro",
        		"Kilometro a Metro"};
        JComboBox<String> comboBoxlongitudes = new JComboBox<>(opcionesDivisas);
        comboBoxlongitudes.setBounds(40, 0, 150, 25);
        longitudesPanel.add(comboBoxlongitudes);
        
        JTextField inputFieldLongitudes = new JTextField();
        inputFieldLongitudes.setBounds(40, 30, 150, 25);
        longitudesPanel.add(inputFieldLongitudes);

        JButton convertButtonLongitudes = new JButton("Convertir");
        convertButtonLongitudes.setBounds(70, 55, 100, 25);
        convertButtonLongitudes.addActionListener(e -> {
            String selectedConversion = (String) comboBoxlongitudes.getSelectedItem();
            String inputValueText = inputFieldLongitudes.getText();
            try {
            double inputValue = Double.parseDouble(inputValueText);
            EnlazarInputLogica a = new EnlazarInputLogica();
            double convertedValue = a.ConvertirInput(selectedConversion, inputValue); // Cálculo de la conversión
            String resultado = inputValue + " " + selectedConversion + " es igual a " + convertedValue;
            
            ResultadoPanel resultadoPanel = new ResultadoPanel(resultado,frame);
            
            frame.getContentPane().removeAll();
            frame.add(resultadoPanel);
            frame.revalidate();
            frame.repaint();
            } catch (NumberFormatException ex) {
            	JOptionPane.showMessageDialog(frame, "Ingresa un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        longitudesPanel.add(convertButtonLongitudes);

        
        frame.remove(currentPanel); // Eliminar el panel actual
        frame.add(longitudesPanel); // Agregar el nuevo panel
        frame.revalidate(); // Redibujar el frame
        frame.repaint();
        currentPanel = longitudesPanel; // Actualizar el panel actual
    }
}
