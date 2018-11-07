package cs3500.animator.model;

import java.awt.*;

public class StateImpl implements State {

  private Point position;
  private Dimension size;
  private Color color;

  public StateImpl(Point position, Dimension size, Color color) {
    this.position = position;
    this.size = size;
    this.color = color;
  }

  @Override
  public Point getPosition() {
    return new Point(position);
  }

  @Override
  public Dimension getSize() {
    return new Dimension(size);
  }

  @Override
  public Color getColor() {
    return new Color(color.getRGB());
  }

  public boolean equals(Object other) {
    if (!(other instanceof State)) {
      return false;
    } else {
      State otherState = (State) other;
      return otherState.getPosition().equals(this.getPosition()) &&
              otherState.getSize().equals(this.getSize()) &&
              otherState.getColor().equals(this.getColor());
    }
  }

  public int hashCode() {
    return position.hashCode() + size.hashCode() + color.hashCode();
  }
}
