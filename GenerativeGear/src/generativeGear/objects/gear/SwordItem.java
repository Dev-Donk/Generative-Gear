
package generativeGear.objects.gear;

import generativeGear.init.Materials;
import generativeGear.init.Parts;
import generativeGear.init.Parts.PartType;

public class SwordItem extends Weapon {
    
    private final PartType[] SWORD_PART_TYPES = {PartType.UNIVERSAL_POMMEL, PartType.SWORD_HANDLE, PartType.SWORD_GUARD, PartType.SWORD_BLADE_BODY, PartType.SWORD_BLADE_TIP};
    private final Parts[] SWORD_PARTS = new Parts[5];
    private final Materials[] SWORD_PART_MATERIALS = new Materials[5];
    
    // TODO: Streamline the getters of parts more efficiently for all tools?
    
    public SwordItem(Parts[] swordParts) {
        super(swordParts);

        for (int i = 0; i < SWORD_PARTS.length; i++) {
            if(swordParts[i].getPartType() == this.SWORD_PART_TYPES[i]) {
                this.SWORD_PARTS[i] = swordParts[i];
                
            } else {
                this.SWORD_PARTS[i] = Parts.getRandomPartOfType(this.SWORD_PART_TYPES[i]);
                System.err.println("\n**Incorrect Part Type of " + this.SWORD_PART_TYPES[i] + ". Replacing with " + this.SWORD_PARTS[i] + ".**");
            }
            
            if(i > 3) {
                    if(this.SWORD_PARTS[2].hasSpacer()) {
                        this.SWORD_PARTS[2].getSpacer().setMaterial(this.SWORD_PARTS[3].getMaterial());
                    }
                    
                    if(this.SWORD_PARTS[4].getMaterialType() != this.SWORD_PARTS[3].getMaterialType()) {
                        this.SWORD_PARTS[4].setMaterial(Materials.getMaterialBasedOffType(this.SWORD_PARTS[4].getMaterialType()));
                    } else {
                        this.SWORD_PARTS[4].setMaterial(this.SWORD_PARTS[3].getMaterial());
                    }
                    
            } else {
                    this.SWORD_PARTS[i].setMaterial(Materials.getMaterialBasedOffType(this.SWORD_PARTS[i].getMaterialType()));
            }
            
            this.SWORD_PART_MATERIALS[i] = this.SWORD_PARTS[i].getMaterial();
            
            this.durability += this.SWORD_PARTS[i].getDurability() + this.SWORD_PARTS[i].getMaterial().getbaseDurability();
            this.weight += this.SWORD_PARTS[i].getWeight()+ this.SWORD_PARTS[i].getMaterial().getBaseWeight();
            this.length += this.SWORD_PARTS[i].getLength();
            if(i > 2) {
                this.attackDamage += this.SWORD_PARTS[i].getAttackDamage() + this.SWORD_PARTS[i].getMaterial().getBaseAttackDamage();
            }

        }
    }
    
    public Parts getPommel() {
        if(this.SWORD_PARTS[0].getMaterial() != this.SWORD_PART_MATERIALS[0]) {
            System.err.println("Departure from original material.");
            this.SWORD_PARTS[0].setMaterial(this.SWORD_PART_MATERIALS[0]);
        }
        
        return this.SWORD_PARTS[0];
    }
    public Parts getHandle() { 
        if(this.SWORD_PARTS[1].getMaterial() != this.SWORD_PART_MATERIALS[1]) {
            System.err.println("Departure from original material.");
            this.SWORD_PARTS[1].setMaterial(this.SWORD_PART_MATERIALS[1]);
        }
        
        return this.SWORD_PARTS[1];
    }
    public Parts getGuard() { 
        if(this.SWORD_PARTS[2].getMaterial() != this.SWORD_PART_MATERIALS[2]) {
            System.err.println("Departure from original material.");
            this.SWORD_PARTS[2].setMaterial(this.SWORD_PART_MATERIALS[2]);
        }
        
        return this.SWORD_PARTS[2];
    }
    public Parts getBladeBody() { 
        if(this.SWORD_PARTS[3].getMaterial() != this.SWORD_PART_MATERIALS[3]) {
            System.err.println("Departure from original material.");
            this.SWORD_PARTS[3].setMaterial(this.SWORD_PART_MATERIALS[3]);
        }
        
        return this.SWORD_PARTS[3];
    }
    public Parts getBladeTip() { 
        if(this.SWORD_PARTS[4].getMaterial() != this.SWORD_PART_MATERIALS[4]) {
            System.err.println("Departure from original material.");
            this.SWORD_PARTS[4].setMaterial(this.SWORD_PART_MATERIALS[4]);
        }
        
        return this.SWORD_PARTS[4];
    }
    
    @Override
    public String toString() {
        String swordPrint = "Pommel: " + this.getPommel() + " " + this.getPommel().getMaterial()
                        + " | Handle: " + this.getHandle() + " " + this.getHandle().getMaterial()
                        + " | Guard: " + this.getGuard() + " " + this.getGuard().getMaterial();
        if (this.getGuard().hasSpacer()) {
            
            swordPrint += " | Spacer: " + this.getGuard().getSpacer() + " " + this.getGuard().getSpacer().getMaterial();
        }
        swordPrint += " | Blade Body: " + this.getBladeBody() + " " + this.getBladeBody().getMaterial()
                        + " | Blade Tip: " + this.getBladeTip() + " " + this.getBladeTip().getMaterial()
                        + "\nTotal Durability: " + this.getDurability() + " | Total Weight: " + this.getWeight()
                        + " | Total Attack Damage: " + this.getAttackDamage() + " | Total Length: "
                        + this.getLength() + "\n";
        return swordPrint;
    }
    
//    @Override
//    public Parts getPart(int i) {
//        if(this.SWORD_PARTS[i].getMaterial() != this.SWORD_PART_MATERIALS[i]) {
//            System.err.println("Departure from original material. " + this.SWORD_PARTS[i].getPartType());
//            this.SWORD_PARTS[i].setMaterial(this.SWORD_PART_MATERIALS[i]);
//        }
//
//        return this.SWORD_PARTS[i];
//    }
    
}
