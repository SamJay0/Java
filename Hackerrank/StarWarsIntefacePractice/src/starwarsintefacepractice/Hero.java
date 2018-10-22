package starwarsintefacepractice;
/**
 * @author SamJay
 */
public class Hero implements Character {
    
    public String weapon="The Force";
    
    public Hero(){
    }
    
    @Override
    public String getWeapon(){
       return weapon;
    }
    
    @Override
    public void attack(){
        System.out.println("The Hero attacks the enemy");
    }
    
    @Override
    public void heal(){
        System.out.println("The Hero heals you");
    }

}
