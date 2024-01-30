package geometry;
 
import java.util.ArrayList;
import java.util.List;
 
class Group {
	
	
    private List<Shape> shapes;
 
    public Group() {
        shapes = new ArrayList<>();
    }
 
    /**
     * Fügt eine Form der Gruppe hinzu
     *
     * @param 
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
 
    /**
     * Entfernt eine Form aus der Gruppe
     *
     * @param 
     */
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
 
    /**
     * Ermittelt die gesamte Fläche aller Formen
     *
     * @return 
     */
    public double calculateTotalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
 
    /**
     * Ermittelt den gesamten Umfang aller Formen in der Gruppe
     *
     * @return 
     */
    public double calculateTotalCircumference() {
        double totalCircumference = 0.0;
        for (Shape shape : shapes) {
            totalCircumference += shape.calculateCircumference();
        }
        return totalCircumference;
    }
 
    /**
     * ermittelt die größte Form in der Gruppe
     *
     * @return 
     */
    public Shape findLargestShape() {
        if (shapes.isEmpty()) {
            return null;
        }
 
        Shape largestShape = shapes.get(0);
        double largestArea = largestShape.calculateArea();
 
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (area > largestArea) {
                largestArea = area;
                largestShape = shape;
            }
        }
 
        return largestShape;
    }
 
    /**
     * Gibt alle Formen aus
     */
    public void printAllShapes() {
        for (Shape shape : shapes) {
            System.out.println("Shape Type: " + shape.getClass().getSimpleName());
            System.out.println("Position: (" + shape.x + ", " + shape.y + ")");
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Circumference: " + shape.calculateCircumference());
            System.out.println();
        }
    }
    
}