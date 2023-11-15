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

public class OwnerDA0Impl implements OwnerDA0 {
    private List<Owner> owners;

    public OwnerDA0Impl() {
        this.owners = new ArrayList<>();
    }

    @Override
    public void insert(Owner owner) {
        owners.add(owner);
    }

    @Override
    public Owner select(int ownerId) {
        for (Owner owner : owners) {
            if (owner.getOwnerId() == ownerId) {
                return owner;
            }
        }
        return null;
    }

    @Override
    public List<Owner> selectAll() {
        return new ArrayList<>(owners);
    }

    @Override
    public void update(Owner owner) {
        for (Owner o : owners) {
            if (o.getOwnerId() == owner.getOwnerId()) {
                o.setName(owner.getName());
                o.setContactNumber(owner.getContactNumber());
                break;
            }
        }
    }

    @Override
    public void delete(int ownerId) {
        owners.removeIf(owner -> owner.getOwnerId() == ownerId);
    }
}

