class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}

public class TestBox {
    public static void main(String[] args) {
        Box box1 = new Box(10.0, 20.0, 15.0);
        Box box2 = new Box(3.0, 4.0, 5.0);
        System.out.println("Volume of Box1: " + box1.volume());
        System.out.println("Volume of Box2: " + box2.volume());
    }
}