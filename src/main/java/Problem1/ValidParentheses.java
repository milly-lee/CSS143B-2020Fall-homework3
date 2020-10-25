package Problem1;

public class  ValidParentheses {

    public static boolean isValid(String str)
    {
        if(str == null){
            return true;
        }
        ArrayStack<Character> stack = new ArrayStack(str.length());
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if( c == '(' || c == '{'|| c == '[')
            {
                stack.push(c);
            }
            else if( c == ')') {
                if(stack.size() == 0 || stack.pop() != '(')
                {
                    return false;
                }
            }
            else if( c == '}') {
                if(stack.size() == 0 || stack.pop() != '{')
                {
                    return false;
                }
            }
            else if( c == ']')
            {
                if(stack.size() == 0 || stack.pop() != '[')
                {
                    return false;
                }
            }

            else
            {
                return false;
            }

        }
        return stack.size() == 0;
    }
}

