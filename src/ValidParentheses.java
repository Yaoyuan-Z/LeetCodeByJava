import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ']':
                    if (!temp.isEmpty() && temp.lastElement() == '[') {
                        temp.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')':
                    if (!temp.isEmpty() && temp.lastElement() == '(') {
                        temp.pop();
                    } else {
                        return false;
                    }
                    break;

                case '}':
                    if (!temp.isEmpty() && temp.lastElement().equals('{')) {
                        temp.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    temp.push(s.charAt(i));
                    break;

            }


        }
        return temp.isEmpty();


    }
}
