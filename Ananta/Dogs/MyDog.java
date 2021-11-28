package Dogs;
public class MyDog {
    public static void main(String[] args) {
        
        Dog shihwahwaDog = new Dog("White", 15.5f);
        Dog pitbullDog = new Dog("Black", 15.5f);

        System.out.println("Shihwahwa");
        System.out.println("\tColor : "+shihwahwaDog.getColor());
        System.out.println("\tWeight : "+shihwahwaDog.getWeight());

        System.out.println("Pitbull");
        System.out.println("\tColor : "+pitbullDog.getColor());
        System.out.println("\tWeight : "+pitbullDog.getWeight());
        
    }
}
