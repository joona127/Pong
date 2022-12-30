import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle {
    public double x, y, width, height;
    public Color color;

  public Rectangle(double x, double y, double width, double height, Color color) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.color = color;
  }

  public void draw(Graphics2D graphics) {
   graphics.setColor(color);
   graphics.fill(new Rectangle2D.Double(x, y, width, height));

  }


}
