package Assignment_1.Extra_credit;

/*
* Use System.currentTimeMillis() to figure out start time and end time.
* To find the elapsed time, take the end time minus the start time.
* Interface ExecutionTimer is implemented by the timer class.
* */

public interface ExecutionTimer {
    public void title(String title);
    public void numOfOperation(long nums);
    public void executeTimeElapsed();
}
