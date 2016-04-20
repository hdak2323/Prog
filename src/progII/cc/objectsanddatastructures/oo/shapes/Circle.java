package cc.objectsanddatastructures.oo.shapes;

public class Circle implements Shape
{
  double r;

  public Circle(double r)
  {
    this.r = r;
  }
  
  @Override
  public double calculateArea()
  {
    return r * r * Math.PI;
  }
}
