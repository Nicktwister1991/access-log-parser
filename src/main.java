import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int countFiles = 0;
        while (true) {
            System.out.println("Введите путь к файлу ниже.");

            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Файла нет.");
                continue;
            } else if (isDirectory) {
                System.out.println("Это директория, попробуйте, пожалуйста, ещё раз.");
                continue;
            } else {
                System.out.println("Путь к файлу указан верно.");
                countFiles++;
                System.out.println("Количество верно указанных файлов равно: " + countFiles);
            }
        }
    }
}
