package model.entity;

public class Queue<Type> extends FIFO<Type> {
    public Queue(){
        this.last = null;
        this.length = 0;
    }



    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public Type pop() {
        if(this.length == 0) return null;
        while (this.last.next.next != null){
            this.last = this.last.next;
        }
        Element<Type> temp = new Element<>();
        temp.setInfo(this.last.next.getInfo());
        this.last.next = null;
        this.last = this.head;
        this.length--;
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


    public static void main(String[] args) {
        Integer i = 1;
        Queue<Integer> st = new Queue<>();
        for (int j = 0; j++ < 10;) {
            st.push(i++);
        }
        st.printAll();
        st.pop();
        System.out.println();
        st.printAll();
    }
}
