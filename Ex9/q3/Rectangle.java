public class Rectangle extends Shape {
	private int width, height;
	public Rectangle(int width, int height, 
    int x, int y) {
        this.width = width;
        this.height = height;
        super.setxPos(x);
        super.setyPos(y);
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
	//accept the visit by calling the visit method of the visitor
	//passing self as an argument
	//i.e. please do whatever you have to do when visiting me. 
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
