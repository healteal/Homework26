import Task3.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    public void task3Test() {
        Triangle triangle = new Triangle(3,3,3);
        Assertions.assertEquals(3,triangle.getFirstSide());
    }
}
