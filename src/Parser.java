import java.util.HashMap;

public class Parser {
    private String expression;
    private String[] parts;
    private char differential;
    private HashMap<Character, Void> action;

    public Parser(String expression) {
        this.expression = expression;
    }

    public ReturnState parse() {
        ReturnState state = null;
        for (int i = 0; i < expression.length(); i++) {

        }
        return state;
    }

}
