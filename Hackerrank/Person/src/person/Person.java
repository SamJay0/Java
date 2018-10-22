package person;

import static person.HairColor.*;

/**
 * @author SamJay
 */
public class Person {
    HairColor hairColor;
    public Person(){
        HairColor hairColor1 = this.hairColor;
    }
    public HairColor getHairColor(){
       return  hairColor;
    }

    public static void main(String[] args) {
       Person person= new Person(); 
       person.hairColor=BLUE;
    }

}
