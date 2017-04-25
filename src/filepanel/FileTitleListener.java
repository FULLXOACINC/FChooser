package filepanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * Created by alex on 23/04/17.
 */
public class FileTitleListener extends MouseAdapter {

    private String filePatch;
    private FileTitlePanel fileTitlePanel;
    private FilePanel filePanel;

    public FileTitleListener(FileTitlePanel fileTitlePanel, String filePatch){
        this.fileTitlePanel = fileTitlePanel;
        this.filePatch = filePatch;
        this.filePanel = fileTitlePanel.getFilePanel();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        File file = new File(filePatch);
        if (e.getClickCount() == 1) {
            fileTitlePanel.deleteSelection();
            JPanel panelSelection = (JPanel) e.getSource();
            panelSelection.setBackground(Color.LIGHT_GRAY);
            if (file.isFile()) {
                filePanel.setChooseText(filePatch);
            }
        } else if (e.getClickCount() == 2) {
            if (file.isDirectory()) {
                filePanel.setPatchText(filePatch);
                filePanel.updatePanel();
            }
        }
    }
}
