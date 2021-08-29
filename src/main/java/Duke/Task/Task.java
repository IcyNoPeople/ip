package Duke.Task;

public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone(){
        isDone = true;
    }

    public String getDescription(){
        return description;
    }

    public String getTask(){
        return description;
    }

    public String toString() {
        return " [" + this.getStatusIcon() + "] " + this.getTask();
    }

}
