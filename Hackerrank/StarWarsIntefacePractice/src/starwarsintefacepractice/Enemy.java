package starwarsintefacepractice;
/**
 * @author SamJay
 */
public class Enemy implements Character{
     
    public String weapon="lightsaber";
    public Enemy(){
        
    }
    
    @Override
    public String getWeapon(){
       return weapon;
    }
  
    @Override
    public void attack(){
        System.out.println("The enemy attacks you");
    }
   
    @Override
    public void heal(){
        System.out.println("The enemy heals himself");
    }
    public void DrawWeapon(){
        System.out.println("Draw weapon");
    }

}
