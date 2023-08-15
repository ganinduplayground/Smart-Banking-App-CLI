import java.util.Scanner;

public class smartApp{
    private final static Scanner scaneer = new Scanner(System.in);

    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "Welcome to Smart Banking";
        final String CREATE_NEW_ACCOUNT = "Create New Account";
       

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String screen = DASHBOARD;

        do{
            final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);

            String[] id = new String[0];
            String[] name = new String[0];
            Double[] accBalance = new Double[0]; 

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch ((screen)) {
                case DASHBOARD:

                    System.out.println("\t[1] Create New Account");
                    System.out.println("\t[2] Deposits");
                    System.out.println("\t[3] Withdrawals");
                    System.out.println("\t[4] Transfer");
                    System.out.println("\t[5] Print Statement");
                    System.out.println("\t[6] Delete Account");
                    System.out.println("\t[7] Exit");
                    System.out.print("\tEnter an option to continue: ");
                    int option = scaneer.nextInt();
                    scaneer.nextLine();
                   
                case CREATE_NEW_ACCOUNT:
                    


                    break;



                    
            
                default:
                    break;
            }

        }while(true);
        
    }
}