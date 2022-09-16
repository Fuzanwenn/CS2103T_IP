package duke;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Represents a storage that stores the command list.
 */
public class Storage {
    private OutputStream out;
    private String input;

    public Storage(String filePath) throws IOException {
        this.out = new FileOutputStream(filePath);
    }

    /**
     * Stores the current list command in the file.
     *
     * @param list A list of String type.
     */
    public void push(String list) throws IOException {
        this.input = list;
        this.out.write(input.getBytes());
        this.out.close();
    }

    /**
     * Returns a String representation of the list.
     *
     * @return String
     */
    public String load() {
        return this.input;
    }
}
