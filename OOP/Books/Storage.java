package Desafios.POO.Books;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> obj = new ArrayList<>();

    public Storage(){}

    public Storage(List<T> obj) {
        this.obj = obj;
    }

    public void addObj(T obj) {
        this.obj.add(obj);
    }

    public void removeObj(T obj) {
        this.obj.remove(obj);
    }

    public List<T> getObj() {
        return obj;
    }

    public void setObj(List<T> obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "items=" + obj +
                '}';
}
}
