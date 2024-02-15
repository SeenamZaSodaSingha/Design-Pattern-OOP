public class RasterVisitor implements Visitor{
    
    public void visit(Circle c) {
        System.out.println("Saving the circle... with radius " + c.getRadius() + " at position " + c.getxPos() + ", " + c.getyPos() + " as a vector");
    }
    public void visit(Rectangle r) {
        System.out.println("Saving the rectangle... with width " + r.getWidth() + " and height " + r.getHeight() + " at position " + r.getxPos() + ", " + r.getyPos() + " as a vector");
    }
    public void visit(Triangle t) {
        System.out.println("Saving the triangle... with base " + t.getBase() + " and height " + t.getHeight() + " at position " + t.getxPos() + ", " + t.getyPos() + " as a vector");
    }
}
