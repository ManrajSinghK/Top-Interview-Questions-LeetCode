class Solution {
    public boolean isValid(String s) {
        
        Stack < Character > st = new Stack < Character > ();

        for (char c: s.toCharArray()){

            if (st.isEmpty()){
                st.push(c);
                continue;
            }

            if (c == ')'){
                
                if (st.peek() == '(')
                    st.pop();
                else return false;

                continue;
            }

            if (c == '}'){

                if (st.peek() == '{')
                    st.pop();
                else return false;

                continue;
            }

            if (c == ']'){

                if (st.peek() == '[')
                    st.pop();
                else return false;

                continue;
            }

            st.push(c);
        }

        if (st.empty())
            return true;
        else return false;
    }
}
