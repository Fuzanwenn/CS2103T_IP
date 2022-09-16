package duke;

import java.util.ArrayList;

/**
 * Represents the unmark command.
 */
public class Unmark extends Parser {
    private String command;

    public Unmark(String description, ArrayList<String> arrayList, int num) {
        super(description);
        this.command = description;
        arrayList.set(num, arrayList.get(num).substring(0, 3) + "[ ]" + arrayList.get(num).substring(6));
    }

    /**
     * Checks if the command should be added to the list.
     *
     * @return boolean
     */
    @Override
    public boolean addToList() {
        return false;
    }

    /**
     * Returns a String representation of the command.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "OK, I've marked this task as not done yet:\n" + this.command.substring(0, 3) + "[ ]" + this.command.substring(6);
    }
}
