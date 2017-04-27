package treepanel;

import java.io.File;

/**
 * Created by alex on 26.4.17.
 */
class Node {

    private String fileName;
    private File file;

    Node(File file, String fileName) {
        this.fileName = fileName;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    @Override
    public String toString() {
        return fileName;
    }

    String getName() {
        return fileName;
    }
}
