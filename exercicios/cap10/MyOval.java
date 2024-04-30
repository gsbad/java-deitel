package exercicios.cap10;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval {
    private int x1; // x-coordinate of top-left corner
    private int y1; // y-coordinate of top-left corner
    private int width; // width of the oval
    private int height; // height of the oval
    private Color color; // color of this oval

    // constructor with input values
    public MyOval(int x1, int y1, int width, int height, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Draws the oval
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x1, y1, width, height);
    }
}
