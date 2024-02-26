import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class FunnySound extends JFrame implements KeyListener {
    public FunnySound() {
        setTitle("Press a Key for a Funny Sound!");
        setSize(300, 200);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        // Check if the pressed key is 'A' (for example)
       // if (e.getKeyCode() == KeyEvent.VK_A) {
            try {
                // Assuming you have a sound file named "funny_sound.wav" in the same directory
                File soundFile = new File("C:\\Users\\Zach\\Documents\\workspace\\FunnySounds\\src\\FartToot.wav");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                ex.printStackTrace();
            }
        }


    public void keyReleased(KeyEvent e) { }

    public void keyTyped(KeyEvent e) { }

    public static void main(String[] args) {
        new FunnySound();
    }
}
