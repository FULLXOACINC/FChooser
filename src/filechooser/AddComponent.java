package filechooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by alex on 23/04/17.
 */
public class AddComponent {

    private static final Insets insets = new Insets(0, 0, 0, 0);

    public static void add(Container container, Component component,
                           int gridx, int gridy, int gridwidth, int gridheight) {
        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, insets, 0, 0);
        container.add(component, gbc);
    }

    public static void makeButton(Container container, String imgString, ActionListener action){
        JButton button = new JButton();
        button.addActionListener(action);
        String patch = "img/" + imgString;
        ImageIcon img = new ImageIcon(patch);
        button.setIcon(img);
        container.add(button);
    }
}
