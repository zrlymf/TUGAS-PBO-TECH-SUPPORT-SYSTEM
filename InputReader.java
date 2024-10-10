import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    // Membaca input dari pengguna
    public String getInput() {
        System.out.print("> ");
        return scanner.nextLine().toLowerCase();  // Mengubah input menjadi huruf kecil untuk pemrosesan lebih mudah
    }
}
