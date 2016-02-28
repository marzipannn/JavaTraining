package rpg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

/**
 * Created by Cinnamon on 2/28/16.
 */
public class SelectHero {
    private JList list1;
    private JTextArea textArea1;
    private JButton button1;
    private JPanel rootPanel;

    public GUIView mainView;

    public SelectHero(JFrame topFrame, GUIView callingView) {
        mainView = callingView;
        topFrame.setContentPane(rootPanel);
        topFrame.pack();



        topFrame.setLocationRelativeTo(null);
        topFrame.setVisible(true);
    }
}
