package Stopwatch;
import java.util.*;

public class Watch {
    
    private long startTime ;
    private long stopTime;


    public Watch(){
        
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return stopTime - startTime;
    }
}
