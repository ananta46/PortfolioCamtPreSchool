package Counter;

public class Counter {
    
    private int count;

    public Counter(){
        count = 0;
    }

    public void click(){
        count = count + 1;
    }

    public void reset(){
        count = 0;
    }

    public int getCount(){
        return count;
    }
}
