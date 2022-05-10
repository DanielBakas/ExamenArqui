import java.util.Scanner;
public class Menu {
    private static String[] options = new String[] {
            "0. Exit",
            "1. Create Account",
            "2. Show Account",
            "3. Deposit",
            "4. Withdraw"
    };
    private static Scanner scanner = new Scanner(System.in);

    private static void createAccount() {
        System.out.print("Please enter the account's owner's first name, then press [Enter]: ");
        String name = scanner.next();
        String accountNumber = AccountService.createAccount(name);
        System.out.println("==============================");
        System.out.println("Successfully created an account: " + accountNumber);
    }

    private static void getAccountByIndex() {

    }

    private static void getAccountByAccountNumber() {
        System.out.println("==============================");
        System.out.print("Please select the desired option, then press [Enter]");
        String accountNumber = scanner.next();
    }

    private static void showAccount() {
        System.out.print("1. Get Account by Account Number");
        System.out.print("2. Get Account by Index in Repository");
        System.out.println("==============================");
        System.out.print("Please select the desired option, then press [Enter]");
        switch (scanner.nextInt()) {
            case 1: getAccountByIndex();
            case 2: getAccountByAccountNumber();
        }
    }

    private static void showMenu() {
        System.out.println("           Menu               ");
        for(String i: Menu.options) { System.out.println(i); }
        System.out.println("==============================");
        System.out.print("Please select an option number, then press [Enter]: ");
    };

    private static void showSelectedOption(int optionIndex) {
        String result = "==============================\n";
        if (optionIndex == 0)
            result += "Hasta la vista baby!";
        else if (optionIndex > 0 & optionIndex < options.length)
            result += String.format("Selected option: %s", Menu.options[optionIndex]);
        else
            result +="Invalid option. Please try again.";
        result +="\n==============================";
        System.out.println(result);
    }
    public static void show() {
        System.out.println("==============================");
        System.out.println("   Welcome to Bankinator");
        System.out.println("==============================");
        int optionIndex;
        while(true) {
            showMenu();
            optionIndex = scanner.nextInt();
            showSelectedOption(optionIndex);
            if (optionIndex > 0 & optionIndex < options.length)
                switch (optionIndex) {
                    case 1: Menu.createAccount(); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                }
            else if (optionIndex == 0) break;
            System.out.println("==============================");
        }
    }
}