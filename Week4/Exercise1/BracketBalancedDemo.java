public class BracketBalancedDemo {
    public static void main(String[] args) {
        String[] expressions = {
            "{[()]}",
            "[()()]{}",
            "([]",
            "([)]",
            "abc{defg(ijk)[mno]p}q",
            "a(bc]def"
        };

        for (String expression : expressions) {
            System.out.println(
                "Input: " + expression
                + " -> Output: "
                + BalancedBrackets.isBalanced(expression)
            );
        }
    }
}