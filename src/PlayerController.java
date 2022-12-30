import java.awt.event.KeyEvent;

public class PlayerController {
    public Rectangle rectangle;
    public Listener listener;

    public PlayerController(Rectangle rectangle, Listener listener) {
        this.rectangle = rectangle;
        this.listener = listener;
    }

    public void update(double deltaTime) {
        if (listener.isKeyPressed(KeyEvent.VK_DOWN)) {
            this.rectangle.y += 100 * deltaTime;
        }
    }


}
