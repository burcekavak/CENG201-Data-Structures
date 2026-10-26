public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        BracketStack stack = new BracketStack();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (!isMatchingPair(opening, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        }

        if (opening == '{' && closing == '}') {
            return true;
        }

        if (opening == '[' && closing == ']') {
            return true;
        }

        return false;
    }
    
}
