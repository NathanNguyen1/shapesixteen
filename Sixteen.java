
/**
 * Implement a circle
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
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return (16 * sideLength * (sideLength / (2 * Math.tan(11.25) * (180 / 16)))) / 2;
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 2 * Math.PI * this.sideLength;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
