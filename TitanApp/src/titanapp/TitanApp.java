/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titanapp;

/**
 *
 * @author jakeg
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TitanApp {

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}

class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Menú Principal");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton fundadorButton = new JButton("Titan Fundador");
        JButton ataqueButton = new JButton("Titan de Ataque");
        JButton colosalButton = new JButton("Titan Colosal");
        JButton acorazadoButton = new JButton("Titan Acorazado");
        JButton hembraButton = new JButton("Titan Hembra");
        JButton bestiaButton = new JButton("Titan Bestia");
        JButton mandivulaButton = new JButton("Titan Mandívula");
        JButton cargueroButton = new JButton("Titan Carguero");
        JButton martilloButton = new JButton("Titan Martillo de Guerra");

        fundadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame fundadorInfo = new TitanInfoFrame("Titan Fundador", "Se trata del titán más poderoso de todos ya que puede crear titanes puros y controlar todas sus acciones.\n", "fundador.jpg");
                fundadorInfo.setSize(1000,800);
                fundadorInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });

        ataqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame ataqueInfo = new TitanInfoFrame("Titan de Ataque", "Tras la Gran Guerra de los Titanes, el país de Marley consiguió a 7 de los 9 titanes.\n Uno de los que se resistió que el Titán de Ataque que siempre ha luchado por la libertad de Eldia.\n", "ataque.jpg");
                ataqueInfo.setSize(1000,800);
                ataqueInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        colosalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame colosalInfo = new TitanInfoFrame("Titan Colosal", "El Titán Colosal se reconoce muy fácilmente por su aspecto y fue uno de los primeros titanes en aparecer en la serie.\n Es el más grande y fuerte físicamente, aunque también es lento.\n Como habilidad única, es capaz de expulsar grandes cantidades de vapor caliente por todo su cuerpo sin necesidad de recibir daño.\n ", "colosal.jpg");
                colosalInfo.setSize(1000,800);
                colosalInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        acorazadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame acorazadoInfo = new TitanInfoFrame("Titan Acorazado", "Como su propio nombre indica, el Titán Acorazado destaca por la dureza de su piel, extremadamente gruesa.\n Por esa razón, tanto el Titán Colosal como el Acorazado se consideran tan letales.\n", "acorazado.jpg");
                acorazadoInfo.setSize(1000,800);
                acorazadoInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        hembraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame hembraInfo = new TitanInfoFrame("Titan Hembra", "El primer encuentro con el Titán Hembra dejó muchas evidencias sobre quién podría estar detrás de ese gigante.\n Todas las pistas apuntaban a Annie Leonhart y poco después se confirmó.\n", "hembra.jpg");
                hembraInfo.setSize(1000,800);
                hembraInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        bestiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame bestiaInfo = new TitanInfoFrame("Titan Bestia", "Todos los titanes tienen un aspecto singular, en especial el Titán Bestia.\n El portador de este poder tiene una gran fuerza física y es capaz de convertir a los seres humanos en titanes.\n ", "bestia.jpg");
                bestiaInfo.setSize(1000,800);
                bestiaInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        mandivulaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame mandivulaInfo = new TitanInfoFrame("Titan Mandívula", "En la serie anime se han visto varios Titanes Mandíbula, aunque quizás el más popular sea Ymir.\n El aspecto de esta criatura es bastante desproporcionado, pero sus fortalezas son una poderosa mandíbula y las garras.\n El primer portador conocido es Marcel Galliard que colaboró en la guerra de expansión territorial de Marley, donde fue utilizado como un arma militar.", "mandivula.jpg");
                mandivulaInfo.setSize(1000,800);
                mandivulaInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        cargueroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame cargueroInfo = new TitanInfoFrame("Titan Carguero", "Quizás sea uno de los titanes más desconocidos porque no tiene especial relevancia en la trama de la serie.\n Eso no quiere decir que no sea peligroso, ya que todos los titanes son utilizados como un arma de guerra desde hace siglos.\n ", "carguero.jpg");
                cargueroInfo.setSize(1000,800);
                cargueroInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });
        
        martilloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TitanInfoFrame martilloInfo = new TitanInfoFrame("Titan Martillo de Guerra", "Si hablamos de este titán, es necesario hablar de la familia Tybur.\n Es un clan bastante influyente que tiene el poder del Titán Martillo de Guerra, pero es más raro verlos en acción.\n ", "martillo.jpg");
                martilloInfo.setSize(1000,800);
                martilloInfo.setVisible(true);
                dispose(); // Cierra el menú principal
            }
        });

        JPanel panel = new JPanel();
        panel.setSize(1000,800);
        panel.add(new JLabel("Selecciona un Titan:"));
        panel.add(fundadorButton);
        panel.add(ataqueButton);
        panel.add(colosalButton);
        panel.add(acorazadoButton);
        panel.add(hembraButton);
        panel.add(bestiaButton);
        panel.add(mandivulaButton);
        panel.add(cargueroButton);
        panel.add(martilloButton);

        add(panel);
    }
}

class TitanInfoFrame extends JFrame {
    public TitanInfoFrame(String titanName, String titanDescription, String imageName) {
        setTitle(titanName);
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel(titanName);
        //JLabel infoLabel = new JLabel(titanInfo);
        JTextArea descriptionTextArea = new JTextArea(titanDescription);
        descriptionTextArea.setEditable(false);
        JLabel imageLabel = new JLabel();

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageName)));

        JButton backButton = new JButton("Regresar al Menú Principal");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });

        JPanel panel = new JPanel();
        panel.setSize(1000,800);
        panel.add(nameLabel);
        panel.add(descriptionTextArea);
        panel.add(imageLabel);
        panel.add(backButton);

        add(panel);
    }
}
