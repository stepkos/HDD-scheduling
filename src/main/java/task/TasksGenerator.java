package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TasksGenerator {
    private final int maxArrivalTime;
    private final int maxTaskPosition;
    private final int realTimePercent;

    public TasksGenerator(int maxArrivalTime, int maxTaskPosition, int realTimePercent) {
        this.maxArrivalTime = maxArrivalTime;
        this.maxTaskPosition = maxTaskPosition;
        this.realTimePercent = realTimePercent;
    }

    public List<Task> generateList(int amount, long seed) {
        Random rand = new Random(seed);
        List<Task> taskList = new ArrayList<>();

        for (int i=1; i<=amount; i++) {
            taskList.add(new Task(i,
                    rand.nextInt(0, maxArrivalTime),
                    rand.nextInt(0, maxTaskPosition),
                    rand.nextInt(1, 100) <= realTimePercent
            ));
        }

        return taskList;
    }

    public TaskList generateTaskList(int amount, long seed) {
        return new TaskList(generateList(amount, seed));
    }

}
