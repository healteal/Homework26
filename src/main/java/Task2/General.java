package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class General {
    public static void main(String[] args) {
        number(initNumber());
    }

    public static int number(int number) {
        if (number > 100) {
            throw new RuntimeException("Число больше 100");
        }
        if (number < 0) {
            throw new RuntimeException("Число отрицательное");
        }
        return number;
    }
    public static int initNumber() {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        while (true) {
            try {
                number = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Неверный ввод");
            }
        }
        return number;
    }
}
