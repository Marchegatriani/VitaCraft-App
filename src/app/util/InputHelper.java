package app.util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Masukkan angka yang valid: ");
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static String getMultilineInput(String prompt) {
        System.out.println(prompt + " (Ketik 'END' untuk selesai)");
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("END")) break;
            sb.append(line).append("\n");
        }
        return sb.toString().trim();
    }

    
    public static String getEmail(String prompt) {
        System.out.print(prompt);
        String email;
        while (true) {
            email = scanner.nextLine();
            if (isValidEmail(email)) {
                break;
            } else {
                System.out.print("Masukkan email yang valid dengan format '@gmail.com': ");
            }
        }
        return email;
    }

    private static boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@gmail\\.com");
    }

    public static String getPhoneNumber(String prompt) {
        System.out.print(prompt);
        String phoneNumber;
        while (true) {
            phoneNumber = scanner.nextLine();
            if (isValidPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.print("Masukkan nomor telepon yang valid (hanya angka): ");
            }
        }
        return phoneNumber;
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }
}
