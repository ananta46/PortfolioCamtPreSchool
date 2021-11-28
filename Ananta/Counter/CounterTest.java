package Counter;

public class CounterTest {
    public static void main(String[] args) {

        Counter tally1 = new Counter();
        Counter tally2 = new Counter();

        System.out.println("TALLY 1");
        System.out.println("Click");
        tally1.click();
        System.out.println("Click");
        tally1.click();
        System.out.println("Click");
        tally1.click();
        System.out.println("Show : "+tally1.getCount());
        System.out.println("Reset");
        tally1.reset();
        System.out.println("Show : "+tally1.getCount());

        System.out.println("\n\n");

        System.out.println("TALLY 1");
        System.out.println("Click");
        tally2.click();
        System.out.println("Click");
        tally2.click();
        System.out.println("Click");
        tally2.click();
        System.out.println("Show : "+tally2.getCount());
        System.out.println("Reset");
        tally1.reset();
        System.out.println("Show : "+tally1.getCount());
        


    }
}
