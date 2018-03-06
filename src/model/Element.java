package model;

public class Element<Type> {
    private Type info;
    public Element<Type> next;

    public Type getInfo() {
        return info;
    }

    public void setInfo(Type info) {
        this.info = info;
    }
}
