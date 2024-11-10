import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
  final int originalTilesSize = 16;
  final int scale = 3;

  final int tileSize = originalTilesSize * scale;

  final int maxScreenCol = 16;
  final int maxScreenRow = 12;

  final int screenWidth = maxScreenCol * tileSize;
  final int screenHeight = maxScreenRow * tileSize;

  Thread gamThread;

  public GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground(Color.BLACK);
    this.setDoubleBuffered(true);
  }

  public void startGameThread() {
    gamThread = new Thread(this);
    gamThread.start();
  }

  @Override
  public void run() {
    // TODO Make game loop here

    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
}
