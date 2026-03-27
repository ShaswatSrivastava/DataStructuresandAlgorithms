package com.Shaswat;

import java.util.Stack;


public class BasicCalculator {
    public static void main(String[] args) {
        int ans = calculate("2 + 3");
        System.out.println(ans);
    }
        public static int calculate(String s) {
            int n = s.length();
            Stack<Integer> st = new Stack<>();

            int number = 0;
            int result = 0;
            int sign = 1;

            for(int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    number = number * 10 + (ch - '0');
                } else if (ch == '+') {
                    result += number * sign;
                    number = 0;
                    sign = 1;
                } else if (ch == '-') {
                    result += number * sign;
                    number = 0;
                    sign = -1;
                } else if (ch == '(') {
                    st.push(result);
                    st.push(sign);
                    result = 0;
                    sign = 1;
                } else if (ch == ')') {
                    result += number * sign;
                    number = 0;
                    int prevSign = st.pop();
                    int prevResult = st.pop();
                    result = prevResult + (result * prevSign);
                }
            }

            result += number * sign;
            return result;
        }
}
