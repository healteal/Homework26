package Task3;

public class Triangle {
    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new RuntimeException("Некорректный ввод");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}
