import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    // Setting Frame
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setTitle("Treasure Hunter");

    // Game panel
    GamePanel gamePanel = new GamePanel();
    window.add(gamePanel);

    window.pack();

    window.setLocationRelativeTo(null);
    window.setVisible(true);
  }
}
