import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bonus {

    private static boolean isCorrect(String line) {
        int number = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i)))
                number = number*10 + (line.charAt(i)-'0');
            else
                number = 0;

            if (number >= 10)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(isCorrect(line))
                    System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}