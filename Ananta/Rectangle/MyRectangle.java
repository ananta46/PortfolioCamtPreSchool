package Rectangle;
public class MyRectangle {
    
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5.0f,5.0f);
        Rectangle none_square = new Rectangle(8.0f,5.0f);

        
        System.out.println("square 5 x 5");
        System.out.println("\tArea : "+square.getArea());
        System.out.println("\tPerimeter : "+square.getPeri());

        System.out.println("square 5 x 5");
        System.out.println("\tArea : "+none_square.getArea());
        System.out.println("\tPerimeter : "+none_square.getPeri());
    }
}
