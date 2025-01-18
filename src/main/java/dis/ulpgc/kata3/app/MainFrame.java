package dis.ulpgc.kata3.app;

import dis.ulpgc.kata3.control.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private final Map<String, Command> commands;
    private final JFreeBarchartDisplay display;

    public MainFrame() throws HeadlessException {
        this.setTitle("Kata 3");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(BorderLayout.NORTH, menu());
        this.add(display = statisticPanel());
        commands = new HashMap<>();
    }

    public Command put(String key, Command value) {
        return commands.put(key, value);
    }

    public JFreeBarchartDisplay getDisplay() {
        return display;
    }

    private JFreeBarchartDisplay statisticPanel() {
        return new JFreeBarchartDisplay();
    }

    private Component menu() {
        JPanel panel = new JPanel();
        panel.add(toggle());
        return panel;
    }

    private Component toggle() {
        JButton button = new JButton("toggle");
        button.addActionListener(e -> commands.get("toggle").execute());
        return button;
    }
}
