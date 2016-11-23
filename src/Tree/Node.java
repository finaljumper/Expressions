package Tree;

import Tree.ExpressionTree;

public class Node extends ExpressionTree {
    private String expression;

    private boolean brackets;

    public Node(String expression) {
        super();
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public boolean isBrackets() {
        return brackets;
    }

    public void setBrackets(boolean brackets) {
        this.brackets = brackets;
    }
}
