

/**
 * Shape interface is the template used to define geometric shapes
 * 
 * @author Mr. Jaffe
 * @version 2017-07-14
 */
public class Sixteen implements Shape
{
  private int sideLength;
  private String color;
  
  /**
   * Constructor for objects of class Circle
   */
  public Sixteen(int sideLength, String color)
  {
    this.sideLength = sideLength;
    this.color = color;
  }
  
    /**
   * Computes the area of the shape
   * 
   * @return    The computed area
   */
  public double getArea() {
      double apothem = this.sideLength / (2 * Math.tan(Math.toRadians(180 / 16)));
      return (this.getPerimeter() * apothem / 2);
  }

  /**
   * Computes the perimeter of the shape
   * 
   * @return    The computed perimeter
   */
  public double getPerimeter(){
      return 16 * sideLength;
  }

  /**
   * Gets the shape's color
   * 
   * @return    The color
   */
  public String getColor() {
      return color;
  }
}
