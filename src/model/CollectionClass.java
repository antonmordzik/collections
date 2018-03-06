package model;

public abstract class CollectionClass<Type> implements Collection {
    public abstract int getLength();
    public abstract void push(Type element);
    public abstract Type pop();
}
