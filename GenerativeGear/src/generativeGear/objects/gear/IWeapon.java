
package generativeGear.objects.gear;

public interface IWeapon extends IGear {
    
    void setLength(int length);
    
    int getLength();
    
    void setAttackDamage(double attackDamage);
    
    double getAttackDamage();
    
}
