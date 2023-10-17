
package generativeGear.init;

import generativeGear.init.Materials.MaterialType;
import generativeGear.objects.Point;

public enum Parts {
    
    POMMEL0(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(2, 2)),
    POMMEL1(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(2, 2)),
    POMMEL2(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(2, 2)),
    POMMEL3(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 3)),
    POMMEL4(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 3)),
    POMMEL5(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(1, 1)),
    POMMEL6(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(2, 2)),
    POMMEL7(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 3)),
    POMMEL8(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 3)),
    POMMEL9(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(4, 4)),
    POMMEL10(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 3)),
    POMMEL11(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 3)),
    POMMEL12(PartType.UNIVERSAL_POMMEL, MaterialType.METAL, 0, 0.0, new Point(3, 2)),

    
    SWORD_HANDLE0(PartType.SWORD_HANDLE, MaterialType.METAL, 0, 0, 0.0, new Point(0, 0), new Point(3, 3)),
    SWORD_HANDLE1(PartType.SWORD_HANDLE, MaterialType.METAL, 0, 0, 0.0, new Point(0, 0), new Point(4, 4)),
    SWORD_HANDLE2(PartType.SWORD_HANDLE, MaterialType.METAL, 0, 0, 0.0, new Point(0, 0), new Point(5, 5)),
    SWORD_HANDLE3(PartType.SWORD_HANDLE, MaterialType.METAL, 0, 0, 0.0, new Point(0, 0), new Point(3, 4)),

    
    SWORD_GUARD2_1(PartType.SWORD_SPACER, MaterialType.METAL, 0, new Point(3, 3), new Point(3, 3)),
    SWORD_GUARD3_1(PartType.SWORD_SPACER, MaterialType.METAL, 0, new Point(3, 3), new Point(3, 3)),
    SWORD_GUARD4_1(PartType.SWORD_SPACER, MaterialType.METAL, 0, new Point(7, 7), new Point(8, 8)),
    SWORD_GUARD5_1(PartType.SWORD_SPACER, MaterialType.METAL, 0, new Point(4, 4), new Point(5, 5)),
    SWORD_GUARD6_1(PartType.SWORD_SPACER, MaterialType.METAL, 0, new Point(3, 3), new Point(3, 3)),
    SWORD_GUARD8_1(PartType.SWORD_SPACER, MaterialType.METAL, 0, new Point(2, 2), new Point(2, 2)),

    
    SWORD_GUARD0(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(3, 3), new Point(5, 5)),
    SWORD_GUARD1(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(3, 3), new Point(5, 5)),
    SWORD_GUARD2_0(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(2, 2), new Point(5, 5), SWORD_GUARD2_1),
    SWORD_GUARD3_0(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(3, 3), new Point(7, 7), SWORD_GUARD3_1),
    SWORD_GUARD4_0(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(1, 1), new Point(4, 4), SWORD_GUARD4_1),
    SWORD_GUARD5_0(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(3, 3), new Point(6, 6), SWORD_GUARD5_1),
    SWORD_GUARD6_0(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(3, 3), new Point(6, 6), SWORD_GUARD6_1),
    //SWORD_GUARD7(PartType.SWORD_GUARD, MaterialType.DEMONIC, 0, 0, 0.0, new Point(1, 1), new Point(9, 10)),
    SWORD_GUARD8_0(PartType.SWORD_GUARD, MaterialType.METAL, -5, 0, -7.0, new Point(2, 2), new Point(3, 3), SWORD_GUARD8_1),
    SWORD_GUARD9(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(2, 2), new Point(7, 7)),
    SWORD_GUARD10(PartType.SWORD_GUARD, MaterialType.METAL, 0, 0, 0.0, new Point(2, 2), new Point(5, 5)),
    
    
    SWORD_BLADE_BODY0(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2), new Point(5, 5)),
    SWORD_BLADE_BODY1(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2), new Point(6, 6)),
    SWORD_BLADE_BODY2(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(3, 3), new Point(7, 7)),
    //SWORD_BLADE_BODY3(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2), new Point(6, 6)),
    SWORD_BLADE_BODY4(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2), new Point(5, 5)),
    SWORD_BLADE_BODY5(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(3, 3), new Point(7, 7)),
    SWORD_BLADE_BODY6(PartType.SWORD_BLADE_BODY, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2), new Point(6, 6)),
    
    SWORD_BLADE_TIP0(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2)),
    SWORD_BLADE_TIP1(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 12.0, 10.0, new Point(3, 3)),
    SWORD_BLADE_TIP2(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2)),
    SWORD_BLADE_TIP3(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(4, 4)),
    SWORD_BLADE_TIP4(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(3, 3)),
    SWORD_BLADE_TIP5(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2)),
    SWORD_BLADE_TIP6(PartType.SWORD_BLADE_TIP, MaterialType.DEMONIC, 0, 0, 0.0, 0.0, new Point(3, 2)),
    //SWORD_BLADE_TIP7(PartType.SWORD_BLADE_TIP, MaterialType.DEMONIC, 0, 0, 0.0, 0.0, new Point(3, 2)),
    SWORD_BLADE_TIP8(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2)),
    SWORD_BLADE_TIP9(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(4, 4)),
    SWORD_BLADE_TIP10(PartType.SWORD_BLADE_TIP, MaterialType.METAL, 0, 0, 0.0, 0.0, new Point(2, 2));
    
    private final PartType partType;
    private final MaterialType materialType;
    private final int DURABILITY;
    private final int LENGTH;
    private final double WEIGHT;
    private final double ATTACK_DAMAGE;
    private final int ORIGIN_X_REFERENCE;
    private int originX;
    private final int ORIGIN_Y_REFERENCE;
    private int originY;
    private final int ANCHOR_X_REFERENCE;
    private int anchorX;
    private final int ANCHOR_Y_REFERENCE;
    private int anchorY;
    private final boolean hasSpacer;
    private final Parts spacer;
    private Materials material = null;
    
    // NOTE: Always durability -> weight -> attackDamage
    
    // For sword bodies
    private Parts(PartType partType, MaterialType materialType, int durability, int length, double weight, double attackDamage, Point origin, Point anchor) {
        this.partType = partType;
        this.materialType = materialType;
        this.DURABILITY = durability;
        this.LENGTH = length;
        this.WEIGHT = weight;
        this.ATTACK_DAMAGE = attackDamage;
        this.ORIGIN_X_REFERENCE = origin.x;
        this.originX = this.ORIGIN_X_REFERENCE;
        this.ORIGIN_Y_REFERENCE = 16 - origin.y;
        this.originY = this.ORIGIN_Y_REFERENCE;
        this.ANCHOR_X_REFERENCE = anchor.x;
        this.anchorX = this.ANCHOR_X_REFERENCE;
        this.ANCHOR_Y_REFERENCE = 16 - anchor.y;
        this.anchorY = this.ANCHOR_Y_REFERENCE;
        this.hasSpacer = false;
        this.spacer = null;
    }
    
    // For handles and guards
    private Parts(PartType partType, MaterialType materialType, int durability, int length, double weight, Point origin, Point anchor) {
        this.partType = partType;
        this.materialType = materialType;
        this.DURABILITY = durability;
        this.LENGTH = length;
        this.WEIGHT = weight;
        this.ATTACK_DAMAGE = 0;
        this.ORIGIN_X_REFERENCE = origin.x;
        this.originX = this.ORIGIN_X_REFERENCE;
        this.ORIGIN_Y_REFERENCE = 16 - origin.y;
        this.originY = this.ORIGIN_Y_REFERENCE;
        this.ANCHOR_X_REFERENCE = anchor.x;
        this.anchorX = this.ANCHOR_X_REFERENCE;
        this.ANCHOR_Y_REFERENCE = 16 - anchor.y;
        this.anchorY = this.ANCHOR_Y_REFERENCE;
        this.hasSpacer = false;
        this.spacer = null;
    }
    
    // For guards with a spacer
    private Parts(PartType partType, MaterialType materialType, int durability, int length, double weight, Point origin, Point anchor, Parts spacer) {
        this.partType = partType;
        this.materialType = materialType;
        this.DURABILITY = durability;
        this.LENGTH = length;
        this.WEIGHT = weight;
        this.ATTACK_DAMAGE = 0;
        this.ORIGIN_X_REFERENCE = origin.x;
        this.originX = this.ORIGIN_X_REFERENCE;
        this.ORIGIN_Y_REFERENCE = 16 - origin.y;
        this.originY = this.ORIGIN_Y_REFERENCE;
        this.ANCHOR_X_REFERENCE = anchor.x;
        this.anchorX = this.ANCHOR_X_REFERENCE;
        this.ANCHOR_Y_REFERENCE = 16 - anchor.y;
        this.anchorY = this.ANCHOR_Y_REFERENCE;
        this.hasSpacer = true;
        this.spacer = spacer;
    }
    
    // For spacers
    private Parts(PartType partType, MaterialType materialType, int length, Point origin, Point anchor) {
        this.partType = partType;
        this.materialType = materialType;
        this.DURABILITY = 0;
        this.LENGTH = length;
        this.WEIGHT = 0;
        this.ATTACK_DAMAGE = 0;
        this.ORIGIN_X_REFERENCE = origin.x;
        this.originX = this.ORIGIN_X_REFERENCE;
        this.ORIGIN_Y_REFERENCE = 16 - origin.y;
        this.originY = this.ORIGIN_Y_REFERENCE;
        this.ANCHOR_X_REFERENCE = anchor.x;
        this.anchorX = this.ANCHOR_X_REFERENCE;
        this.ANCHOR_Y_REFERENCE = 16 - anchor.y;
        this.anchorY = this.ANCHOR_Y_REFERENCE;
        this.hasSpacer = false;
        this.spacer = null;
    }
    
    // For sword tips
    private Parts(PartType partType, MaterialType materialType, int durability, int length, double weight, double attackDamage, Point origin) {
        this.partType = partType;
        this.materialType = materialType;
        this.DURABILITY = durability;
        this.LENGTH = length;
        this.WEIGHT = weight;
        this.ATTACK_DAMAGE = attackDamage;
        this.ORIGIN_X_REFERENCE = origin.x;
        this.originX = this.ORIGIN_X_REFERENCE;
        this.ORIGIN_Y_REFERENCE = 16 - origin.y;
        this.originY = this.ORIGIN_Y_REFERENCE;
        this.ANCHOR_X_REFERENCE = 0;
        this.anchorX = this.ANCHOR_X_REFERENCE;
        this.ANCHOR_Y_REFERENCE = 16;
        this.anchorY = this.ANCHOR_Y_REFERENCE;
        this.hasSpacer = false;
        this.spacer = null;
    }
    
    // For pommels
    private Parts(PartType partType, MaterialType materialType, int durability, double weight, Point origin) {
        this.partType = partType;
        this.materialType = materialType;
        this.DURABILITY = durability;
        this.LENGTH = 0;
        this.WEIGHT = weight;
        this.ATTACK_DAMAGE = 0;
        this.ORIGIN_X_REFERENCE = origin.x;
        this.originX = this.ORIGIN_X_REFERENCE;
        this.ORIGIN_Y_REFERENCE = 16 - origin.y;
        this.originY = this.ORIGIN_Y_REFERENCE;
        this.ANCHOR_X_REFERENCE = 0;
        this.anchorX = this.ANCHOR_X_REFERENCE;
        this.ANCHOR_Y_REFERENCE = 16;
        this.anchorY = this.ANCHOR_Y_REFERENCE;
        this.hasSpacer = false;
        this.spacer = null;
    }
    

    public PartType getPartType() { return this.partType; }
    
    public MaterialType getMaterialType() { return this.materialType; }
    
    public int getDurability() { return this.DURABILITY; }
    
    public int getLength() { return this.LENGTH; }
    
    public double getWeight() { return this.WEIGHT; }
    
    public double getAttackDamage() { return this.ATTACK_DAMAGE * 0.5; }
    
    public int getOriginX() { return this.ORIGIN_X_REFERENCE; }
    public int getCurrentOriginX() { return this.originX; }
    public void setOriginX(int x) { this.originX =  this.ORIGIN_X_REFERENCE + x; }
    
    public int getOriginY() { return this.ORIGIN_Y_REFERENCE; }
    public int getCurrentOriginY() { return this.originY; }
    public void setOriginY(int y) { this.originY = this.ORIGIN_Y_REFERENCE + y; }
    
    public int getAnchorX() { return this.ANCHOR_X_REFERENCE; }
    public void setAnchorX(int x) { this.anchorX = this.ANCHOR_X_REFERENCE + x; }
    public int getCurrentAnchorX() { return this.anchorX; }
    
    public int getAnchorY() { return this.ANCHOR_Y_REFERENCE; }
    public void setAnchorY(int y) { this.anchorY = this.ANCHOR_Y_REFERENCE + y; }
    public int getCurrentAnchorY() { return this.anchorY; }
    
    public boolean hasSpacer() { return this.hasSpacer; }
    public Parts getSpacer() { return this.spacer; }
    
    public Materials getMaterial() { return this.material; }
    public void setMaterial(Materials material) { this.material = material; }
    
    public static enum PartType {
        UNIVERSAL_POMMEL,
        SWORD_HANDLE,
        SWORD_GUARD,
        SWORD_SPACER,
        SWORD_BLADE_BODY,
        SWORD_BLADE_TIP;
    }
    
    public static Parts getRandomPartOfType(PartType type) {
        Parts[] parts = Parts.values();
        int rand;
        
        do {
            rand = (int)(Math.random() * parts.length);
        } while(parts[rand].getPartType() != type);
        
        return parts[rand];
    }
    
    
}