import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assign2 {

public static void main (String[] args){
  JFrame frame = new JFrame("Gemini Corp.");
  frame.setVisible(true);
  frame.setSize(700,700);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panel = new JPanel();
  frame.add(panel);
  
  JButton button = new JButton("Kyle");
  panel.add(button);
  button.addActionListener (new Action1());

  JButton button2 = new JButton("AJ");
  panel.add(button2);
  button2.addActionListener (new Action2());

  JButton button3 = new JButton("Jared");
  panel.add(button3);
  button3.addActionListener (new Action3());

  JButton button4 = new JButton("Keysha");
  panel.add(button4);
  button4.addActionListener (new Action4());
}
static class Action1 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
    JFrame frame2 = new JFrame("Kyle Lucke");
    frame2.setVisible(true);
    frame2.setSize(500,500);
    JLabel label = new JLabel("Kyle's profile info, w00t.");
    JPanel panel = new JPanel();
    frame2.add(panel);
    panel.add(label);
  }
}
static class Action2 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
    JFrame frame3 = new JFrame("AJ \"Ants In My Eyes Johnson\" Brown");
    frame3.setVisible(true);
    frame3.setSize(500,500);

    JLabel label = new JLabel("AJ will put bio info here.");
    JPanel panel = new JPanel();
    frame3.add(panel);
    panel.add(label);
  }
}
  static class Action3 implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      JFrame frame4 = new JFrame("Jared");
      frame4.setVisible(true);
      frame4.setSize(600, 600);
      
      //Components
      JPanel panel = new JPanel();
      JPanel subPanel = new JPanel();
      
      ImageIcon icon = new ImageIcon("./src/Mario.JPEG");
      
      JLabel label = new JLabel("Jared's page.");
      JLabel nameLabel = new JLabel("Name: Mario");
      JLabel eduLabel = new JLabel("Education: None");
      JLabel jobLabel = new JLabel("Job Description: Running, Jumping, Professional Sports");
      JLabel picLabel = new JLabel(icon);
      
      //Set up Layouts
      panel.setLayout(new BorderLayout());
      subPanel.setLayout(new GridLayout(3, 1));
      
      //Setting Component Position
      label.setHorizontalAlignment(SwingConstants.CENTER);
      nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
      nameLabel.setVerticalAlignment(SwingConstants.TOP);
      eduLabel.setHorizontalAlignment(SwingConstants.LEFT);
      eduLabel.setVerticalAlignment(SwingConstants.CENTER);
      jobLabel.setHorizontalAlignment(SwingConstants.LEFT);
      jobLabel.setVerticalAlignment(SwingConstants.BOTTOM);
      
      
      //Add Components
      frame4.add(panel);
      panel.add(label, BorderLayout.NORTH);
      panel.add(subPanel, BorderLayout.CENTER);
      subPanel.add(nameLabel);
      subPanel.add(eduLabel);
      subPanel.add(jobLabel);
      panel.add(picLabel, BorderLayout.EAST);
    }
  }
    static class Action4 implements ActionListener {
      public void actionPerformed (ActionEvent e) {
        JFrame frame5 = new JFrame("Keysha");
        frame5.setVisible(true);
        frame5.setSize(500,500);

        JLabel label = new JLabel("Keysha info.");
        JPanel panel = new JPanel();
        frame5.add(panel);
        panel.add(label);
      }
    }
}

