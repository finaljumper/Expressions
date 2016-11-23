import Interfaces.Command;
import java.util.HashMap;

public class Parser {
    private String expression;
    private String[] parts;
    private char differential;
    private HashMap<Character, Command> action;

    public Parser(String expression) {
        this.expression = expression;
    }

    public ReturnState parse() {
        ReturnState state = null;
        //https://en.wikipedia.org/wiki/Command_pattern
        for (int i = 0; i < expression.length(); i++) {
            action.get(expression.charAt(i)).execute();
        }
        return state;
    }

}
