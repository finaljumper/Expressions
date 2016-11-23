import Exceptions.OperationException;

public enum Operations {
    ADDITION, SUBTRACTION, POWER, MULTIPLY, DIVISION;

    public static Operations getOperation(char token) throws OperationException {
        switch(token) {
            case '+':
                return ADDITION;
            case '-':
                return SUBTRACTION;
            case '^':
                return POWER;
            case '*':
                return MULTIPLY;
            case '/':
                return DIVISION;
            default:
                throw new OperationException();
        }
    }
}
