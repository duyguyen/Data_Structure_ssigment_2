package Assignment_1.Extra_credit;

import java.util.ArrayList;

public class Timer implements ExecutionTimer {

    // == instant variables ==
    private String title;
    private Long numOfOperation;

    // == constructor ==
    public Timer(String title, Long numOfOperation) {
        title(title);
        numOfOperation(numOfOperation);
        executeTimeElapsed();

    }

    public static void main(String[] args) {
        Timer timer = new Timer("Time of Execution", 1000000L);
    }

    @Override
    public void title(String title) {
        this.title = title;
    }

    @Override
    public void numOfOperation(long nums) {
        this.numOfOperation = nums;
    }

    @Override
    public void executeTimeElapsed() {

        long start = System.currentTimeMillis();

        ArrayList a = new ArrayList();

        for (int i = 0; i <= numOfOperation; i++) {
            a.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(title.toUpperCase());
        System.out.println("Sample Size: " + numOfOperation);
        System.out.println("Elapsed Timer: " + (end - start) + " milliseconds");
    }
}
