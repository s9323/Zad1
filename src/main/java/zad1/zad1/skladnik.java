package zad1.zad1;

public abstract class skladnik<T> extends Napoj {
    public abstract String about();
    public abstract boolean check(T obj);
}