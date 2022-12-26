import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Runnable{

    Graphics2D graphics;
    Listener listener = new Listener();
    Rectangle playerOne, ai, ball;

    public Window() {
        this.setSize(800, 600);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(listener);
        graphics = (Graphics2D)this.getGraphics();

        playerOne = new Rectangle(Constants.HORIZONTAL_PADDING, 40, Constants.OBJECT_WIDTH, Constants.OBJECT_HEIGHT, Constants.OBJECT_COLOR);
        ai = new Rectangle(Constants.SCREEN_WIDTH - Constants.OBJECT_WIDTH - Constants.HORIZONTAL_PADDING, 40, Constants.OBJECT_WIDTH, Constants.OBJECT_HEIGHT, Constants.OBJECT_COLOR);
        ball = new Rectangle(Constants.SCREEN_WIDTH / 2, Constants.SCREEN_HEIGHT / 2, Constants.BALL_WIDTH, Constants.BALL_WIDTH, Constants.OBJECT_COLOR);
    }

    public void update(double deltaTime) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 800, 600);

        playerOne.draw(graphics);
        ai.draw(graphics);
        ball.draw(graphics);

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


