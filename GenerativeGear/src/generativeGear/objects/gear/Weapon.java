
package generativeGear.objects.gear;

import generativeGear.init.Parts;

public abstract class Weapon implements IWeapon {
    
    protected Parts[] parts;
    protected int durability;
    protected double weight;
    protected int length;
    protected double attackDamage;
    
    public Weapon(Parts[] parts) {
        
    }
    
    @Override
    public void setDurability(int durability) { this.durability = durability; }
    @Override
    public int getDurability() { return this.durability; }
    
    @Override
    public void setWeight(double weight) { this.weight = weight; }
    @Override
    public double getWeight() { return this.weight; }
    
    @Override
    public void setLength(int length) { this.length = length; }
    @Override
    public int getLength() { return this.length; }
 
    @Override
    public void setAttackDamage(double attackDamage) { this.attackDamage = attackDamage; }
    @Override
    public double getAttackDamage() { return this.attackDamage; }
    
    @Override
    public String toString() {
        return "Durability: " + this.getDurability() + " | Weight: " +
                this.getWeight() + " | Attack Damage: " + this.getAttackDamage();
    }
    
}
