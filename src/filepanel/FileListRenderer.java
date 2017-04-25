package filepanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alex on 23/04/17.
 */
public class FileListRenderer extends JLabel implements ListCellRenderer {

    public Component getListCellRendererComponent(JList list, Object value,
                                                  int index, boolean isSelected,
                                                  boolean cellHasFocus) {
        FileListModel file = (FileListModel) value;
        setIcon(file.getIcon());
        setText(file.getValue());
        if (isSelected) {
            setBackground(Color.LIGHT_GRAY);
            setForeground(list.getSelectionForeground());
        }
        else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setOpaque(true);
        return this;
    }

}
