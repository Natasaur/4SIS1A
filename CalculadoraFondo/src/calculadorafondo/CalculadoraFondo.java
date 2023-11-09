/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorafondo;

/**
 *
 * @author jakeg
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.lang.Math;

public class CalculadoraFondo extends JFrame implements ActionListener {
    // Declaración de componentes
    private JTextField pantalla;
    private JButton botonSeno, botonCoseno, botonTangente, botonPotencia, botonRaiz, botonBorrar, botonIgual;
    private String operacion, resultado;
    
    public CalculadoraFondo() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        // Pantalla de resultado
        pantalla = new JTextField();
        pantalla.setBounds(10, 10, 280, 50);
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.PLAIN, 20));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        
        // Botones
        botonSeno = crearBoton("Sen", 10, 70, 70, 50);
        botonCoseno = crearBoton("Cos", 90, 70, 70, 50);
        botonTangente = crearBoton("Tan", 170, 70, 70, 50);
        botonPotencia = crearBoton("^", 10, 140, 70, 50);
        botonRaiz = crearBoton("√", 90, 140, 70, 50);
        botonBorrar = crearBoton("C", 170, 140, 70, 50);
        botonIgual = crearBoton("=", 10, 210, 230, 50);
        
        // Agregar componentes al panel
        panel.add(pantalla);
        panel.add(botonSeno);
        panel.add(botonCoseno);
        panel.add(botonTangente);
        panel.add(botonPotencia);
        panel.add(botonRaiz);
        panel.add(botonBorrar);
        panel.add(botonIgual);
        
        // Agregar el panel a la ventana
        add(panel);
        
        // Inicialización
        operacion = "";
        resultado = "";
    }
    
    private JButton crearBoton(String etiqueta, int x, int y, int ancho, int alto) {
        JButton boton = new JButton(etiqueta);
        boton.setBounds(x, y, ancho, alto);
        boton.addActionListener(this);
        boton.setFont(new Font("Arial", Font.PLAIN, 20));
        return boton;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        String etiqueta = boton.getText();
        
        if (etiqueta.equals("=")) {
            calcular();
        } else if (etiqueta.equals("C")) {
            pantalla.setText("");
            operacion = "";
        } else {
            operacion += etiqueta;
            pantalla.setText(operacion);
        }
    }
    
    private void calcular() {
        try {
            if (operacion.startsWith("Sen")) {
                double valor = Double.parseDouble(operacion.substring(3));
                resultado = String.valueOf(Math.sin(Math.toRadians(valor)));
            } else if (operacion.startsWith("Cos")) {
                double valor = Double.parseDouble(operacion.substring(3));
                resultado = String.valueOf(Math.cos(Math.toRadians(valor)));
            } else if (operacion.startsWith("Tan")) {
                double valor = Double.parseDouble(operacion.substring(3));
                resultado = String.valueOf(Math.tan(Math.toRadians(valor)));
            } else if (operacion.startsWith("^")) {
                double valor = Double.parseDouble(operacion.substring(1));
                resultado = String.valueOf(Math.pow(valor, 2));
            } else if (operacion.startsWith("√")) {
                double valor = Double.parseDouble(operacion.substring(1));
                resultado = String.valueOf(Math.sqrt(valor));
            }
            
            pantalla.setText(resultado);
            operacion = "";
        } catch (Exception e) {
            pantalla.setText("Error");
        }
    }
    
    public static void main(String[] args) {
        CalculadoraFondo calculadora = new CalculadoraFondo();
        calculadora.setVisible(true);
    }
}
