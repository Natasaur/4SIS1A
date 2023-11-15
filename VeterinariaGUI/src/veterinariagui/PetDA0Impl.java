/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagui;

/**
 *
 * @author jakeg
 */
import java.util.ArrayList;
import java.util.List;

public class PetDA0Impl implements PetDA0{
    private List<Pet> pets;

    public PetDA0Impl() {
        this.pets = new ArrayList<>();
    }

    @Override
    public void insert(Pet pet) {
        pets.add(pet);
    }

    @Override
    public Pet select(int petId) {
        for (Pet pet : pets) {
            if (pet.getPetId() == petId) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public List<Pet> selectAll() {
        return new ArrayList<>(pets);
    }

    @Override
    public void update(Pet pet) {
        for (Pet p : pets) {
            if (p.getPetId() == pet.getPetId()) {
                p.setName(pet.getName());
                p.setSpecies(pet.getSpecies());
                p.setOwnerId(pet.getOwnerId());
                break;
            }
        }
    }

    @Override
    public void delete(int petId) {
        pets.removeIf(pet -> pet.getPetId() == petId);
    }
}
