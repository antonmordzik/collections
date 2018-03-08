package model.entity;

public abstract class FIFO<Type> extends CollectionClass<Type> {
    public Element<Type> head;
    protected Element<Type> last;
    protected int length;
}