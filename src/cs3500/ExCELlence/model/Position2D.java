package cs3500.ExCELlence.model;

import java.util.Objects;

/**
 * This class represents a 2D position
 */
public class Position2D {
  private double x, y;

  /**
   * Initialize the object to the specified position
   * @param x
   * @param y
   */
  public Position2D(double x, double y) {
    this.setX(x);
    this.setY(y);
  }

  /**
   * Copy constructor
   * @param v
   */
  public Position2D(Position2D v) {
    this.setX(v.x);
    this.setY(v.y);
  }

  /**
   * Get the x-coordinate of this position
   *
   * @return x
   */
  public double getX() {
    return x;
  }

  /**
   * Get the y-coordinate of this position
   *
   * @return y
   */
  public double getY() {
    return y;
  }

  /**
   * Set the x-coordinate of this position
   *
   * @param x
   */
  public void setX(double x) {
    this.x = x;
  }

  /**
   * Set the y-coordinate of this position
   *
   * @param y
   */
  public void setY(double y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object a) {
    if (this == a)  { return true; }
    if (!(a instanceof Position2D)) { return false; }

    Position2D that = (Position2D) a;

    return ((Math.abs(this.x - that.x) < 0.01)
        && (Math.abs(this.y - that.y) < 0.01));
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }
}
