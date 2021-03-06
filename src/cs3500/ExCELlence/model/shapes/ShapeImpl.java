package cs3500.ExCELlence.model.shapes;

import cs3500.ExCELlence.model.Color;
import cs3500.ExCELlence.model.Position2D;
import cs3500.ExCELlence.model.Transition;

import java.util.Stack;

public class ShapeImpl {
  protected Position2D p;
  protected double w;
  protected double h;
  protected Color c;
  protected double r;
  protected Stack<Transition> transitionStack;

  private void buildShape(Position2D p, double w, double h, Color c, double r) {
    this.setPosition(p);
    this.setWidth(w);
    this.setHeight(h);
    this.setColor(c);
    this.setRotation(r);
  }

  /**
   * Initialize a shape with zero size, default color, and no rotation
   */
  public ShapeImpl() {
    this.buildShape(new Position2D(0, 0), 0, 0, new Color(),0);
  }

  /**
   * Initialize the shape to a position, width, height, color, and rotation
   * @param p
   * @param w
   * @param h
   * @param c
   * @param r
   */
  public ShapeImpl(Position2D p, double w, double h, Color c, double r) {
    this.buildShape(p, w, h, c, r);
  }

  /**
   * Initialize the shape to a position, width, height, color, and no rotation
   * @param p
   * @param w
   * @param h
   * @param c
   */
  public ShapeImpl(Position2D p, double w, double h, Color c) {
    this.buildShape(p, w, h, c, 0);
  }

  /**
   * Initialize the shape to a position, width, height, default color, and no rotation
   * @param p
   * @param w
   * @param h
   */
  public ShapeImpl(Position2D p, double w, double h) {
    this.buildShape(p, w, h, new Color(), 0);
  }

  /**
   * Copy constructor
   * @param v
   */
  public ShapeImpl(ShapeImpl v) {
    this.buildShape(v.p, v.w, v.h, v.c, v.r);
  }

  /**
   * Get the shape's position.
   * @return p
   */
  public Position2D getPosition() {
    return p;
  }

  /**
   * Set the shape's position.
   * @param p
   */
  public void setPosition(Position2D p) {
    this.p = p;
  }

  /**
   * Get the shape's width.
   * @return w
   */
  public double getWidth() {
    return w;
  }

  /**
   * Set the shape's width.
   * @param w
   */
  public void setWidth(double w) {
    this.w = w;
  }

  /**
   * Get the shape's height.
   * @return h
   */
  public double getHeight() {
    return h;
  }

  /**
   * Set the shape's height.
   * @param h
   */
  public void setHeight(double h) {
    this.h = h;
  }

  /**
   * Get the shape's color.
   * @return c
   */
  public Color getColor() {
    return c;
  }

  /**
   * Set the shape's color.
   * @param c
   */
  public void setColor(Color c) {
    this.c = c;
  }

  /**
   * Get the shape's rotation.
   * @return r
   */
  public double getRotation() {
    return r;
  }

  /**
   * Set the shape's color.
   * @param rotation
   */
  public void setRotation(double rotation) {
    this.r = rotation;
  }
}
