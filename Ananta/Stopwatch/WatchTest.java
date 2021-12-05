package Stopwatch;

public class WatchTest {
    public static void main(String[] args) {
        int size = 100000;

        double[] list = new double[size];

        Watch stopWatch = new Watch();

        stopWatch.start();
        for(int i = 0; i < size; i++){
            System.out.println("heloo world");
        }
        stopWatch.stop();

        System.out.println("Process takes "+stopWatch.getElapsedTime()+" millisecond");
    }
}
