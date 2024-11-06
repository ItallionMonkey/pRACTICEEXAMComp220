abstract class Shape {
    // Member variables
    private int x;
    private int y;

    // Constructor with parameters
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor
    public Shape() {
        this(0, 0); // Default to origin (0,0)
    }

    // Should return the x coordinate of the center
    public int getX() {
        return x;
    }

    // Should return the y coordinate of the center
    public int getY() {
        return y;
    }

    // Abstract method to be implemented by subclasses
    public abstract double getArea();

    // Abstract method to be implemented by subclasses
    public abstract double getPerimeter();

    // Should return the yield of the shape,
    // which is the area divided by the perimeter
    public double getYield() {
        return getArea() / getPerimeter();
    }

    // Should update the x and y coordinates of the shape,
    // adding dx to the previous x position
    // and dy to the previous y position
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
