import java.awt.*;
import java.util.ArrayList;

public class Layer {
    private String name;
    private ArrayList<Shape> shapes;

    // Construct an empty layer with the given name
    public Layer(String name) {
        this.name = name;
        this.shapes = new ArrayList<>();
    }

    // Returns the layer name
    public String getName() {
        return this.name;
    }

    // Adds s to this layer
    public void addShape(Shape s) {
        shapes.add(s);
    }

    // Returns an ArrayList of the Shape objects in this layer, in any order.
    // Any subsequent changes made to the returned ArrayList should not affect the contents of this Layer.
    public ArrayList<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

    // Removes all shapes from this layer
    public void clear() {
        shapes.clear();
    }
}
