package model.entity;

public class Stack<Type> extends LIFO<Type> {
    public Stack(){
        this.last = null;
        this.length = 0;
    }



    @Override
    public int getLength() {
        return 0;
    }

    public Type getLast(){
        return this.last.getInfo();
    }

    @Override
    public Type pop() {
        if(this.length == 0) return null;
        Element<Type> temp = new Element<>();
        temp.setInfo(this.last.getInfo());
        this.last = this.last.next;
        this.head = this.last;
        return temp.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public void push(Type element) {
        if(this.last == null){
            this.last = new Element<>();
            this.last.setInfo(element);
            this.last.next = null;
            this.head = this.last;
        }
        else{
            Element<Type> temp = new Element<>();
            temp.next = this.last;
            temp.setInfo(element);
            this.last = temp;
            this.head = temp;
        }
        this.length++;
    }

    public void printAll(){
        while (this.last != null){
            System.out.println(this.last.getInfo());
            this.last = this.last.next;
        }
        this.last = this.head;
    }

    /*public static void main(String[] args) {
        Integer i = 1;
        Stack<Integer> st = new Stack<>();
        for (int j = 0; j++ < 10;) {
            st.push(i++);
        }
        //st.printAll();
        System.out.println(st.pop());
        System.out.println();
        //st.printAll();
    }*/

}
