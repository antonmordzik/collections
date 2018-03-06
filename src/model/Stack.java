package model;

public class Stack<Type> extends LIFO {
    public Stack(){
        this.last = null;
        this.length = 0;
    }

    public Element<Type> head;
    private Element<Type> last;
    private int length;


    @Override
    public int getLength() {
        return 0;
    }

    public Type getLast(){
        return this.last.getInfo();
    }

    @Override
    public Type pop() {
        //todo: solve the way, when stack is empty

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
    public void push(Object element) {
        if(this.last == null){
            this.last = new Element<>();
            this.last.setInfo((Type) element);
            this.last.next = null;
            this.head = this.last;
        }
        else{
            Element<Type> temp = new Element<>();
            temp.next = this.last;
            temp.setInfo((Type) element);
            this.last = temp;
            this.head = temp;
        }
    }

    public void printAll(){
        while (this.last != null){
            System.out.println(this.last.getInfo());
            this.last = this.last.next;
        }
        this.last = this.head;
    }

    public static void main(String[] args) {
        Integer i = 1;
        Stack<Integer> st = new Stack<>();
        for (int j = 0; j++ < 10;) {
            st.push(i++);
        }
        st.printAll();
        st.pop();
        System.out.println();
        st.printAll();
    }

}
