package ClasesAutomatas;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RotateJLabelTest extends JLabel {
   public RotateJLabelTest(String text) {
      super(text);
      Font font = new Font("Verdana", Font.ITALIC, 10);
      FontMetrics metrics = new FontMetrics(font){};
      Rectangle2D bounds = metrics.getStringBounds(text, null);
      setBounds(0, 0, (int) bounds.getWidth(), (int) bounds.getHeight());
   }
   @Override
   public void paintComponent(Graphics g) {
      Graphics2D gx = (Graphics2D) g;
      gx.rotate(0.6, getX() + getWidth()/2, getY() + getHeight()/2);
      super.paintComponent(g);
   }
}

