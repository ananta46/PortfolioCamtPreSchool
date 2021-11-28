package Rectangle;
public class Rectangle {
    
    private double width;
    private double height;
    

    public Rectangle(double w,double h){

        width = w;
        height = h;
    }

    public double getPeri(){

        return 2*(width*height);
    }
    public double getArea(){

        return width*height;
    }

}
