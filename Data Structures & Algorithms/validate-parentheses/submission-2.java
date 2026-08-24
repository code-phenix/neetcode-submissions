class Solution {


    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();

        for(char iter:s.toCharArray()){
            if(iter=='{' || iter=='(' || iter == '[')
                stack.push(iter);
            else{
                if(stack.isEmpty())
                    return false;
                else{
                    char temp=stack.pop();
                    if(iter==')'){

                        if(temp!='(')
                            return false;
                    }
                    else if(iter=='}'){

                        if(temp!='{')
                            return false;
                    }
                    else {
                        
                        if(temp!='[')
                            return false ;
                    }

                }
            }
        }
        return stack.isEmpty();
    }
}
