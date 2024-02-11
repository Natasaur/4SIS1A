/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinariagui;

/**
 *
 * @authors
 * García Fuentes Omar
 * García Salas Natalia
 * Hernandez Hernandez Lucia
 * Ladrillero Hipolito Eduardo
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VeterinariaGUI extends JFrame {
    private PetDA0 petDA0;
    private OwnerDA0 ownerDA0;

    private JTextField petNameField;
    private JTextField petSpeciesField;
    private JTextField ownerIdField;
    private JTextField ownerNameField;

    public VeterinariaGUI() {
        petDA0 = new PetDA0Impl();
        ownerDA0 = new OwnerDA0Impl();

        // Configuración de la ventana
        setTitle("Veterinaria");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        JButton addButton = new JButton("Agregar Mascota");
        JButton showButton = new JButton("Mostrar Mascotas");

        petNameField = new JTextField(20);
        petSpeciesField = new JTextField(20);
        ownerIdField = new JTextField(20);
        ownerNameField = new JTextField(20);

        // Configurar el diseño
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Agregar componentes a la ventana
        add(new JLabel("Nombre de la mascota:"));
        add(petNameField);
        add(new JLabel("Especie de la mascota:"));
        add(petSpeciesField);
        add(new JLabel("ID del dueño:"));
        add(ownerIdField);
        add(new JLabel("Nombre del dueño:"));
        add(ownerNameField);
        add(addButton);
        add(showButton);

        // Agregar oyentes de eventos
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarMascota();
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMascotas();
            }
        });
    }

    private void agregarMascota() {
        try {
            String petName = petNameField.getText();
            String petSpecies = petSpeciesField.getText();
            int ownerId = Integer.parseInt(ownerIdField.getText());
            String ownerName = ownerNameField.getText();

            Pet newPet = new Pet(petDA0.selectAll().size() + 1, petName, petSpecies, ownerId, ownerName);
            petDA0.insert(newPet);

            JOptionPane.showMessageDialog(this, "Mascota agregada exitosamente");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID del dueño debe ser un número válido");
        }
    }

    private void mostrarMascotas() {
        List<Pet> pets = petDA0.selectAll();
        StringBuilder petInfo = new StringBuilder("Lista de Mascotas:\n");

        for (Pet pet : pets) {
          // Owner owner = ownerDA0.select(pet.getOwnerId());

        //if (owner != null) {
            petInfo.append("ID: ").append(pet.getPetId()).append(", Nombre: ").append(pet.getName())
                    .append(", Especie: ").append(pet.getSpecies()).append(", Dueño: ")
                    .append(pet.getOwnerName()).append("\n");
        /*} else {
            // Manejar el caso en que el dueño no se encuentre en la base de datos
            petInfo.append("ID: ").append(pet.getPetId()).append(", Nombre: ").append(pet.getName())
                    .append(", Especie: ").append(pet.getSpecies()).append(", Dueño: Desconocido\n");
        }*/
        }

        // Mostrar la información en un área de texto en lugar de usar JOptionPane
        JTextArea textArea = new JTextArea(petInfo.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);

        JOptionPane.showMessageDialog(this, scrollPane, "Lista de Mascotas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VeterinariaGUI().setVisible(true);
            }
        });
    }
}

