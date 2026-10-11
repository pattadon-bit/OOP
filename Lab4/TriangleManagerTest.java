public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager manager = new TriangleManager(true);
        manager.addTriangle(new EquilateralTriangle(4.0));
        manager.addTriangle(new RightTriangle(3.0, 4.0, 5.0));

        Triangle largest = manager.findTriangleWithLargestPerimeter();
        System.out.println(largest.getPerimeter());
    }
}