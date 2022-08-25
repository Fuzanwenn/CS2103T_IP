package duke;

public class Mark extends Task {
    public String command;
    public Mark(String description) {
        super(description);
        this.command = description;
    }

    @Override
    public boolean AddToList() {
        return false;
    }

    @Override
    public String toString() {
        return "Nice! I've marked this task as done:\n" + this.command.substring(0, 3) + "[X]" + this.command.substring(6);
    }
}
