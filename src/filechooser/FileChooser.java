package filechooser;

import filepanel.FilePanel;
import treepanel.TreePanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by alex on 23/04/17.
 */
public class FileChooser {

    private TreePanel treePanel;
    private FilePanel filePanel;
    private String chooserFile;
    private List<String> extentions = null;
    private JDialog dialog;

    public FileChooser(List<String> extentions){
        if (extentions != null) this.extentions = extentions;
        dialog = new JDialog(new JFrame(),"File Chooser",true);
        dialog.setLayout(new GridBagLayout());
        treePanel = new TreePanel(this);
        filePanel = new FilePanel(this);
        AddComponent.add(dialog, treePanel, 0, 0, 1, 1);
        AddComponent.add(dialog, filePanel, 1, 0, 1, 1);
        dialog.setSize(800,350);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }

    public void closeDialog(){
        dialog.dispose();
        dialog = null;
    }

    public void setChooserFile(String chooserFile) {
        this.chooserFile = chooserFile;
    }

    public List<String> getExtentions() {
        return extentions;
    }

    public FilePanel getFilePanel() {
        return filePanel;
    }

    public String getChooserFile() {
        return chooserFile;
    }
}
