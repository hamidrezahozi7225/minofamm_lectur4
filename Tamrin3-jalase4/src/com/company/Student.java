package com.company;

public class Student<T> {
    private T name;
    private T id;
    private T fathername;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getFathername() {
        return fathername;
    }

    public void setFathername(T fathername) {
        this.fathername = fathername;
    }
}
