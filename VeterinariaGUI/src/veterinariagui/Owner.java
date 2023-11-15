/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagui;

/**
 *
 * @author jakeg
 */
public class Owner {
    private int ownerId;
    private String ownerName;
    private String contactNumber;
    
    public Owner (int ownerId, String ownerName, String contactNumber) {
        this.ownerName = ownerName;
        this.ownerId = ownerId;
        this.contactNumber = contactNumber;
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
    
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber (String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
