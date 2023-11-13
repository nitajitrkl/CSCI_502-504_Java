public class InputChecker {
    public InputChecker(String message) {
        input = message;
    }
    public String getMessage() {
        if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Sure") || input.equalsIgnoreCase("Why not?") || input.equalsIgnoreCase("OK"))
            return "OK";
        else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No"))
            return "Terminating";
        else
            return "Bad Input";
    }
    private final String input;
}