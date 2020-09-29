package com.example.koltinlearn;

public class GenericClass {
    public static void main(String[] args) {
        Pair<Number> p1 = new Pair<>(12.3, 4.56);
        Pair<Integer> p2 = new Pair<>(123, 456);
        setSame(p1, 100);
        setSame(p2, 200);
//        System.out.println(p1.getFirst() + ", " + p1.getLast());
//        System.out.println(p2.getFirst() + ", " + p2.getLast());
    }

    static void setSame(Pair<? super Integer> p, Integer n) {
        p.setFirst(n);
        p.setLast(n);
        //Number p = p.getLast(); 无法确定类型
    }

    static void setSome(Pair<? super Number> p ){
        p.setLast(100);
        p.setLast(200);

    }
}

class Pair<T> {
    public T first;
    public T last;
    public Pair(T first, T last){
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }
}