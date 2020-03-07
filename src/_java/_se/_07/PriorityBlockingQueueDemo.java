package _java._se._07;



import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        QueueTask pbQueue = new QueueTask();
        for (int i = 0; i < 10; i++) {
            pbQueue.setTask(new Task(i));
        }
        Manager manager1 = new Manager(pbQueue, "John");
        Manager manager2 = new Manager(pbQueue, "Pol");

        Thread th1 = new Thread(manager1);
        Thread th2 = new Thread(manager2);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class QueueTask {
    private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<Task>();

    public Task getTask() {
        return queue.poll();
    }

    public void setTask(Task task) {
        queue.add(task);
    }

    public PriorityBlockingQueue<Task> getQueue() {
        return queue;
    }
}

class Task implements Comparable<Task> {
    private int taskNumber;
    public Task(int taskNumber){
        this.taskNumber = taskNumber;
    }
    public int getTaskNumber(){
        return taskNumber;
    }
    public void  setTaskNumber(int taskNumber){
        this.taskNumber = taskNumber;
    }
    @Override
    public int compareTo(Task task){
        Random random = new Random();
        int comp = random.nextInt(2000);
        if(comp % 2 == 0) return 1;
        if(comp % 3 == 0) return -1;
        else return 0;
    }
}

class Manager implements Runnable {
    private QueueTask pbO;
    private String name;
    public Manager(QueueTask q,String n){
        pbO = q;
        name = n;
    }

    public void run(){
        Task task;
        while((task = pbO.getTask()) != null){
            System.out.println(name + " get task number " + task.getTaskNumber());
        }
    }
}
