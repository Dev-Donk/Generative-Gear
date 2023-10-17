
package generativeGear.init;

public enum Materials {
    
    COPPER(MaterialType.METAL, 20, 3.25, 1),
    //IRON(MaterialType.METAL, 35, 2.25, 5),
    SILVER(MaterialType.METAL, 50, 3.0, 5),
    GOLD(MaterialType.METAL, 25, 2.75, 3),
    PlATINUM(MaterialType.METAL, 75, 3.0, 7),
    DEMON(MaterialType.DEMONIC, 50, 3.25, 10);
    
    private final MaterialType MATERIAL_TYPE;
    private final int BASE_DURABILITY;
    private final double BASE_WEIGHT;
    private final double BASE_ATTACK_DAMAGE;
    
    private Materials(MaterialType materialType, int baseDurability, double baseWeight, int baseAttackDamage) {
        this.MATERIAL_TYPE = materialType;
        this.BASE_DURABILITY = baseDurability;
        this.BASE_WEIGHT = baseWeight;
        this.BASE_ATTACK_DAMAGE = baseAttackDamage;
    }
    
    public MaterialType getMaterialType() { return this.MATERIAL_TYPE; }
    
    public int getbaseDurability() { return this.BASE_DURABILITY; }
    
    public double getBaseWeight() { return this.BASE_WEIGHT; }
    
    public double getBaseAttackDamage() { return this.BASE_ATTACK_DAMAGE  * 0.5; }
    
    public static Materials getMaterialBasedOffType(MaterialType type) {
        Materials[] materials = Materials.values();
        int rand;
        
        do {
            rand = (int)(Math.random() * materials.length);
        } while(materials[rand].getMaterialType() != type);
        
        return materials[rand];
    }
    
    public static enum MaterialType {
        WOOD,
        METAL,
        ELEMENTAL,
        DEMONIC,
        XENOS;
    }
}
