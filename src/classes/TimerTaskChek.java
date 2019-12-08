package classes;

import java.util.TimerTask;

public class TimerTaskCheck extends TimerTask {

    private Processes processes;

    public TimerTaskCheck(Processes processes){
        this.processes = processes;
    }

    @Override
    public void run() {
        try {
            processes.CheckByPriority();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}