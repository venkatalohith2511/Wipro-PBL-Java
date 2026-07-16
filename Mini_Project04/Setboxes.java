import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.getVolume(), this.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume());
    }
}

public class Setboxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Box> boxSet = new HashSet<>();

        System.out.println("Enter the number of Box");
        int numberOfBoxes = scanner.nextInt();

        for (int i = 1; i <= numberOfBoxes; i++) {
            System.out.println("Enter the Box " + i + " details");
            
            System.out.println("Enter Length");
            double length = scanner.nextDouble();
            
            System.out.println("Enter Width");
            double width = scanner.nextDouble();
            
            System.out.println("Enter Height");
            double height = scanner.nextDouble();

            Box currentBox = new Box(length, width, height);
            boxSet.add(currentBox);
        }

        scanner.close();
    }
}