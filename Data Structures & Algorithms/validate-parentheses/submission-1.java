class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                bracketStack.push(s.charAt(i));
            } else {
                if (bracketStack.isEmpty()){
                    return false;
                }
                if (s.charAt(i) == ')'){
                    if (bracketStack.pop() != '('){
                        return false;
                    }
                } else if (s.charAt(i) == '}'){
                    if (bracketStack.pop() != '{'){
                        return false;
                    }
                } else if (s.charAt(i) == ']'){
                    if (bracketStack.pop() != '['){
                        return false;
                    }
                } 
            }
        }
        return bracketStack.isEmpty();


    }
}
