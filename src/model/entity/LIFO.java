package model.entity;

public abstract class LIFO<Type> extends CollectionClass<Type> {
    public Element<Type> head;
    protected Element<Type> last;
    protected int length;

}
