import java.awt.*;

public class  Square {
    private int x;
    private int y;
    private int sideLength;

    // x and y are the coordinates of the center of the square,
    // and sideLength is the length of one side.
    public Square(int x, int y, int sideLength) {
        super();
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    // Should return the length of one side
    public int getSideLength() {
        return this.sideLength;


    }

    // Should set the sideLength to be len
    public void setSideLength(int len) {
        this.sideLength = len;

    }

    // Should return the x coordinate of the center
    public int getX() {
        return this.x;


    }

    // Should return the y coordinate of the center
    public int getY() {
        return this.y;

    }

    // Should return the area of the shape
    public double getArea() {
        return this.sideLength * this.sideLength;

    }

    // Should return the perimeter of the shape
    public double getPerimeter() {
        return this.sideLength *4;

    }

    // Should return the yield of the shape,
    // which is the area divided by the perimeter
    public double getYield() {
        return (getArea() / getPerimeter());

    }

    // Should update the x and y coordinates of the shape,
    // adding dx to the previous x position
    // and dy to the previous y position
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
