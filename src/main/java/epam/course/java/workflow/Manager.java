package epam.course.java.workflow;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    public Map<String,Task>tasks=new HashMap<>();

    public Task findTask(Status status){
       return tasks.get(status.toString());
    }

    public Task asingTask(Task task,String executor){ ;
        task=findTask(task.getStatus());
        task.setExecutor(executor);
        return task;
    }
}
