public class App1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String CLEAR = "\033[H\033[2J";
    private static final String COLOR_BLUE_BOLD = "\033[34;1m";
    private static final String COLOR_RED_BOLD = "\033[31;1m";
    private static final String RESET = "\033[0m";

    private static final String DASHBOARD = "👷 Welcome to Start Banking";
    private static final String CREATE_ACCOUNT = "➕ Create New Account";
    private static final String DEPOSIT = "💰 Deposit";
    private static final String WITHDRAWAL = "💸 Withdrawal";
    private static final String TRANSFER = "🔄 Transfer";
    private static final String CHECK_BALANCE = "📊 Check the Balance";
    private static final String DELETE_ACCOUNT = "🗑 Delete Account";
    private static final String EXIT = "❌ Exit Banking";

    private static String[] customers = new String