
package generativeGear.objects;

import generativeGear.init.Materials;
import generativeGear.init.Parts;

public class Part {
    
    private final Parts part;
    private final Materials material;
    private int durability;
    
    
    public Part(Parts part, Materials material) {
        this.part = part;
        
        if(material.getMaterialType() == part.getMaterial().getMaterialType()) {
            this.material = material; 
        }
        else {
            this.material = Materials.getMaterialBasedOffType(part.getMaterialType());
        }
        
        this.part.setMaterial(material);
        this.durability = this.part.getDurability() + this.material.getbaseDurability();
    }
    
    public Part(Parts part) {
        this.part = part;
        this.material = null;
        
        this.durability = this.part.getDurability() + this.material.getbaseDurability();
    }
    
    public int getDurability() { return this.durability; }
}
