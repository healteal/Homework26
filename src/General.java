import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class General {
    public static void main(String[] args) {
        int number = reader();
        int[] array = array();
        System.out.println("изначальный массив:\n" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / number;
        }
        System.out.println("массив поделённый на число:\n" + Arrays.toString(array));
    }

    static int reader () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        while (true) {
            try {
                System.out.println("Введите число:");
                number = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод\n");
            }
        }
        return number;
    }

    static int[] array () {
        int count = (int) (Math.random() * 10);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 + 10) - 10);
        }
        return array;
    }
}
