package geometry;
 
 
/**
* Represents a geometric shape with a position and methods to calculate area and circumference.
*/
abstract class Shape {
    protected double x;
    protected double y;
 
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    /**
     * Ermittelt die Fläche der Form
     *
     * @return 
     */
    abstract double calculateArea();
 
    /**
     * Ermittelt den Umfang der Form
     *
     * @return
     */
    abstract double calculateCircumference();
}
 
