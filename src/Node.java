public class Node extends ExpressionTree {
    private String expression;
    private boolean derivative;

    public Node(String expression) {
        this.expression = expression;
    }

    public Node(String expression, boolean derivative) {
        this.expression = expression;
        this.derivative = derivative;
    }

    public String getExpression() {
        return expression;
    }

    public void setDerivative(boolean derivative) {
        this.derivative = derivative;
    }
}
