package epam.course.java.workflow;

public class Task {
    private Status status = Status.Open;
    private String executor="Manager";

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }


}
