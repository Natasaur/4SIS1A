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

public interface OwnerDA0 {
    void insert(Owner owner);
    Owner select(int ownerId);
    List<Owner> selectAll();
    void update(Owner owner);
    void delete(int ownerId);
}
