/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagui;

/**
 *
 * @author jakeg
 */
public class Pet {
    private int petId;
    private String name;
    private String species;
    private int ownerId;
    private String ownerName;
    
    public Pet (int petId, String name, String species, int ownerId, String ownerName) {
        this.petId = petId;
        this.name = name;
        this.species = species;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
    }
    
    public int getPetId() {
        return petId;
    }
    public void setPetId (int petId) {
        this.petId = petId;
    }
    
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    
    public String getSpecies() {
        return species;
    }
    public void setSpecies (String species) {
        this.species = species;
    }
    
    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId (int ownerId) {
        this.ownerId = ownerId;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName (String ownerName) {
        this.ownerName = ownerName;
    }
}
