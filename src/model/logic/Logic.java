package model.logic;

import model.entity.Stack;

public class Logic {
    private Stack<Character> createStack(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            st.push(str.charAt(i));
        }
        return st;
    }

    private String createStringFromStack(Stack<Character> st){
        String str = "";
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < st.getLength(); i++){
            bld.append(st.pop());
            //str += st.pop();
        }
        return str;
    }

    public static void main(String[] args) {
        Logic l = new Logic();
        Stack<Character> st = new Stack<>();



        st = l.createStack("abcde");
        st.printAll();
        System.out.println(l.createStringFromStack(st));
    }

}
