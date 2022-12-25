import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Runnable{

    Graphics2D graphics;
    public Window() {
        this.setSize(800, 600);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphics = (Graphics2D)this.getGraphics();
    }

    public void update(double deltaTime) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 800, 600);

    }
    public void run() {
        double lastFrameTime = 0.0;
      while (true) {
          double time = Time.getTime();
          double dt = time - lastFrameTime;
          lastFrameTime = time;

          update(dt);

          try {
              Thread.sleep(30);
          }
                  catch (Exception e) {

              }
              }
          }

      }


