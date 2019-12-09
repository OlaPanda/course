
package sample.classes;

import java.util.ArrayList;

public class RejectedProcesses {
    public RejectedProcesses(){
        rejectedQueue = new ArrayList<>();
    }

    private ArrayList<Process> rejectedQueue;

    public ArrayList<Process> getRejectedQueue() {
        return rejectedQueue;
    }

    public void add(Process process){
        rejectedQueue.add(process);
    }
}