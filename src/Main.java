import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
  public static void main(String[] args) throws Exception {
    Main window = new Main();
    window.run();
  }

  class Canvas extends JPanel {
    Grid grid = new Grid();
    Stage stage = new Stage(grid);

    public Canvas() {
      setPreferredSize(new Dimension(720, 720));
    }

<<<<<<< HEAD
    @Override
    public void paint(Graphics g) {
      stage.paint(g, getMousePosition());
=======
    class Canvas extends JPanel {
      Stage stage = new Stage();
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
    }
  }

  private Main() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Canvas();
    this.setContentPane(canvas);
    this.pack();
    this.setVisible(true);
  }

  public void run() {
    while (true) {
      repaint();
    }
  }
}
