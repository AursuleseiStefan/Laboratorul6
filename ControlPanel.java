package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        setLayout(new GridLayout(1, 4));
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::Reset);
        exitBtn.addActionListener(this::exit);

    }

    private void exit(ActionEvent actionEvent) {
        System.out.println("Exiting");
        System.exit(0);
    }

    private void Reset(ActionEvent actionEvent) {
        try {
            BufferedImage read = ImageIO.read(new File(".../asd.png"));
        } catch (IOException e) {
        }
    }

    private void load(ActionEvent actionEvent) {
        try {
            BufferedImage read = ImageIO.read(new File(".../asd.png"));
        } catch (IOException e) {
        }
    }

    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG",
                    new FileOutputStream(".../asd.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }
}
