/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package veterinariagui;

/**
 *
 * @author jakeg
 */
import java.util.List;

public interface PetDA0 {
    void insert(Pet pet);
    Pet select(int petId);
    List<Pet> selectAll();
    void update(Pet pet);
    void delete(int petId);
}
