package Cars;
public class MyCar {
    public static void main(String[] args) {

        Car toyota = new Car("Red");
        toyota.setSpeed(200);
        toyota.setMilage(1345);
        Car honda = new Car("Blue");
        honda.setSpeed(300);
        honda.setMilage(8987);

        System.out.println("Toyota");
        System.out.println("\tColor : "+toyota.getColor());
        System.out.println("\tSpeed : "+toyota.getSpeed());
        System.out.println("\tMilage : "+toyota.getMilage());

        System.out.println("Honda");
        System.out.println("\tColor : "+honda.getColor());
        System.out.println("\tSpeed : "+honda.getSpeed());
        System.out.println("\tMilage : "+honda.getMilage());

    }
}
