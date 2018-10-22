package starwarsintefacepractice;

import java.util.Random;

/**
 * @author SamJay
 */
public class StarWarsIntefacePractice {
    
    public static Character summonCharacter(){
        Random rand=new Random();
        if(Math.abs(rand.nextInt()%2)==0){
            return new Enemy();
        }else{
            return new Hero();
        }
    }
    
    public static void play(){
         Character spy=summonCharacter();
          spy.attack();
          spy.heal();
    }

    public static void main(String[] args) {
//        Enemy hulk = new Enemy();
//        Hero jay = new Hero();
//        hulk.attack();
//        jay.attack();
//        hulk.heal();
//        jay.heal();
//        System.out.println("Enemy Weapon : " + hulk.getWeapon());
//        System.out.println("Enemy Weapon : " + jay.getWeapon());
         play();
         

    }
}
