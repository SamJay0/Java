public class Aquarium{

    public Aquarium(int number){
        System.out.println("the number is "+number);
    }
    public static void main(String[] args) {
       Aquarium aq = new Aquarium(Integer.parseInt(args[0]));
       String s="hello there";
       StringBuilder sb=new StringBuilder(s);
       
    }
}