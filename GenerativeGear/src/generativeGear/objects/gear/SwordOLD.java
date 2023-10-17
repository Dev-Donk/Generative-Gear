
package generativeGear.objects.gear;

import generativeGear.init.Materials;
import generativeGear.init.Parts;

public class SwordOLD implements IWeapon {
    
    private int durability;
    private double weight;
    private double attackDamage;
    private Parts pommel;
    private Parts handle;
    private Parts guard;
    private Parts blade_body;
    private Parts blade_tip;
    
    // TODO: Add length junk
    
    public SwordOLD(Parts pommel, Parts handle, Parts guard, Parts blade_body, Parts blade_tip) {
        this.pommel = pommel;
        this.pommel.setMaterial(Materials.getMaterialBasedOffType(this.pommel.getMaterialType()));
        
        this.handle = handle;
        this.handle.setMaterial(Materials.getMaterialBasedOffType(this.handle.getMaterialType()));
        
        this.guard = guard;
        this.guard.setMaterial(Materials.getMaterialBasedOffType(this.guard.getMaterialType()));
        
        this.blade_body = blade_body;
        this.blade_body.setMaterial(Materials.getMaterialBasedOffType(this.blade_body.getMaterialType()));
        
        if(this.guard.hasSpacer()) {
            this.guard.getSpacer().setMaterial(this.blade_body.getMaterial());
        }
        
        this.blade_tip = blade_tip;

        if(this.blade_tip.getMaterialType() != this.blade_body.getMaterialType()) {
            this.blade_tip.setMaterial(Materials.getMaterialBasedOffType(this.blade_tip.getMaterialType()));
        }
        else {
            this.blade_tip.setMaterial(this.blade_body.getMaterial());
        }
        
        this.durability = (this.pommel.getDurability() + this.pommel.getMaterial().getbaseDurability()) +
                            (this.handle.getDurability() + this.handle.getMaterial().getbaseDurability()) +
                            (this.guard.getDurability() + this.guard.getMaterial().getbaseDurability()) +
                            (this.blade_body.getDurability() + this.blade_body.getMaterial().getbaseDurability()) +
                            (this.blade_tip.getDurability() + this.blade_tip.getMaterial().getbaseDurability());
        this.weight = (this.pommel.getWeight() + this.pommel.getMaterial().getBaseWeight()) +
                            (this.handle.getWeight() + this.handle.getMaterial().getBaseWeight()) +
                            (this.guard.getWeight() + this.guard.getMaterial().getBaseWeight()) +
                            (this.blade_body.getWeight() + this.blade_body.getMaterial().getBaseWeight()) +
                            (this.blade_tip.getWeight() + this.blade_tip.getMaterial().getBaseWeight());
        this.attackDamage = (this.blade_body.getAttackDamage() + this.blade_body.getMaterial().getBaseAttackDamage()) +
                            (this.blade_tip.getAttackDamage() + this.blade_tip.getMaterial().getBaseAttackDamage());
    }
        public SwordOLD(Parts pommel, Parts handle, Parts guard, Parts blade_body, Parts blade_tip,
                    Materials pommelMat, Materials handleMat, Materials guardMat, Materials blade_bodyMat, Materials blade_tipMat) {           
        this.pommel = pommel;
        
        if(pommelMat.getMaterialType() == this.pommel.getMaterial().getMaterialType()) {
            this.pommel.setMaterial(pommelMat);
        } else {
            this.pommel.setMaterial(Materials.getMaterialBasedOffType(this.pommel.getMaterialType()));
        }
        
        this.handle = handle;
        
        if(handleMat.getMaterialType() == this.handle.getMaterial().getMaterialType()) {
            this.handle.setMaterial(handleMat);
        } else {
            this.handle.setMaterial(Materials.getMaterialBasedOffType(this.handle.getMaterialType()));
        }
        
        this.guard = guard;
        
        if(guardMat.getMaterialType() == this.guard.getMaterial().getMaterialType()) {
            this.guard.setMaterial(guardMat);
        } else {
            this.guard.setMaterial(Materials.getMaterialBasedOffType(this.guard.getMaterialType()));
        }
        
        this.blade_body = blade_body;
        
        if(blade_bodyMat.getMaterialType() == this.blade_body.getMaterial().getMaterialType()) {
            this.blade_body.setMaterial(blade_bodyMat);
        } else {
            this.blade_body.setMaterial(Materials.getMaterialBasedOffType(this.blade_body.getMaterialType()));
        }
        
        if(this.guard.hasSpacer()) {
            this.guard.getSpacer().setMaterial(this.blade_body.getMaterial());
        }
        
        this.blade_tip = blade_tip;

        if(this.blade_tip.getMaterialType() != this.blade_body.getMaterialType()) {
            if (blade_tipMat.getMaterialType() == this.blade_tip.getMaterial().getMaterialType()) {
                this.blade_tip.setMaterial(blade_tipMat);
            } else {
                this.blade_tip.setMaterial(Materials.getMaterialBasedOffType(this.blade_tip.getMaterialType()));
            }
        }
        else {
            this.blade_tip.setMaterial(this.blade_body.getMaterial());
        }
        
        this.durability = (this.pommel.getDurability() + this.pommel.getMaterial().getbaseDurability()) +
                            (this.handle.getDurability() + this.handle.getMaterial().getbaseDurability()) +
                            (this.guard.getDurability() + this.guard.getMaterial().getbaseDurability()) +
                            (this.blade_body.getDurability() + this.blade_body.getMaterial().getbaseDurability()) +
                            (this.blade_tip.getDurability() + this.blade_tip.getMaterial().getbaseDurability());
        this.weight = (this.pommel.getWeight() + this.pommel.getMaterial().getBaseWeight()) +
                            (this.handle.getWeight() + this.handle.getMaterial().getBaseWeight()) +
                            (this.guard.getWeight() + this.guard.getMaterial().getBaseWeight()) +
                            (this.blade_body.getWeight() + this.blade_body.getMaterial().getBaseWeight()) +
                            (this.blade_tip.getWeight() + this.blade_tip.getMaterial().getBaseWeight());
        this.attackDamage = (this.blade_body.getAttackDamage() + this.blade_body.getMaterial().getBaseAttackDamage()) +
                            (this.blade_tip.getAttackDamage() + this.blade_tip.getMaterial().getBaseAttackDamage());      
    }
    
    
    // **UNSURE OF SETTERS AT THE MOMENT. WILL BE COMMENTED OUT UNTIL FURTHER DEVELOPMENT.**
        
    @Override
    public void setAttackDamage(double attackDamage) { this.attackDamage = attackDamage; }  
    @Override
    public double getAttackDamage() { return this.attackDamage; }

    @Override
    public void setDurability(int durability) { this.durability = durability; }
    @Override
    public int getDurability() { return this.durability; }

    @Override
    public void setWeight(double weight) { this.weight = weight; }
    @Override
    public double getWeight() { return this.weight; }

    
    public Parts getPommel() {
        if(this.pommel.getPartType() != Parts.PartType.UNIVERSAL_POMMEL) {
            this.pommel = Parts.getRandomPartOfType(Parts.PartType.UNIVERSAL_POMMEL);
            this.pommel.setMaterial(Materials.getMaterialBasedOffType(this.pommel.getMaterialType()));
        }
        
        return this.pommel;
    }
//    public void setPommel(Parts pommel) {
//        if(pommel.getPartType() != Parts.PartType.SWORD_POMMEL) {
//            pommel = Parts.getRandomPartOfType(Parts.PartType.SWORD_POMMEL);
//        }
//        this.pommel = pommel;
//    }
    
    public Parts getHandle() {
        if(this.handle.getPartType() != Parts.PartType.SWORD_HANDLE) {
            this.handle = Parts.getRandomPartOfType(Parts.PartType.SWORD_HANDLE);
            this.handle.setMaterial(Materials.getMaterialBasedOffType(this.handle.getMaterialType()));
        }
        
        return this.handle;
    }
//    public void setHandle(Parts handle) {
//        if(handle.getPartType() != Parts.PartType.SWORD_HANDLE) {
//            handle = Parts.getRandomPartOfType(Parts.PartType.SWORD_HANDLE);
//        }
//        this.handle = handle;
//    }
    
    public Parts getGuard() {
        if(this.guard.getPartType() != Parts.PartType.SWORD_GUARD) {
            this.guard = Parts.getRandomPartOfType(Parts.PartType.SWORD_GUARD);
            this.guard.setMaterial(Materials.getMaterialBasedOffType(this.guard.getMaterialType()));
        }
        
        return this.guard;
    }
//    public void setGuard(Parts guard) {
//        if(guard.getPartType() != Parts.PartType.SWORD_GUARD) {
//            guard = Parts.getRandomPartOfType(Parts.PartType.SWORD_GUARD);
//        }
//        this.guard = guard;
//    }
    
    public Parts getBladeBody() {
        if(this.blade_body.getPartType() != Parts.PartType.SWORD_BLADE_BODY) {
            this.blade_body = Parts.getRandomPartOfType(Parts.PartType.SWORD_BLADE_BODY);
            this.blade_body.setMaterial(Materials.getMaterialBasedOffType(this.blade_body.getMaterialType()));
        }
        
        return this.blade_body;
    }
//    public void setBladeBody(Parts blade_body) {
//        if(blade_body.getPartType() != Parts.PartType.SWORD_BLADE_BODY) {
//            blade_body = Parts.getRandomPartOfType(Parts.PartType.SWORD_BLADE_BODY);
//        }
//        this.blade_body = blade_body;
//    }
    
    public Parts getBladeTip() {
        if(this.blade_tip.getPartType() != Parts.PartType.SWORD_BLADE_TIP) {
            this.blade_tip = Parts.getRandomPartOfType(Parts.PartType.SWORD_BLADE_TIP);
            this.blade_tip.setMaterial(Materials.getMaterialBasedOffType(this.blade_tip.getMaterialType()));
        }
        
        return this.blade_tip;
    }
//    public void setBladeTip(Parts blade_tip) {
//        if(blade_tip.getPartType() != Parts.PartType.SWORD_BLADE_TIP) {
//            blade_tip = Parts.getRandomPartOfType(Parts.PartType.SWORD_BLADE_TIP);
//        }
//        this.blade_tip = blade_tip;
//    }
    
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
                        + " | Total Attack Damage: " + this.getAttackDamage() + "\n";
        return swordPrint;
    }

    @Override
    public void setLength(int length) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
