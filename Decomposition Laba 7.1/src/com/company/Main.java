package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayListClass _arrayList = new ArrayListClass();
        LinkedListClass _arrayLinked = new LinkedListClass();
        DequeClass _deque = new DequeClass();

        System.out.println(_arrayList.toString());
        System.out.println(_arrayLinked.toString());
        System.out.println(_deque.toString());

        _arrayList.AddFirstOddNumber();
        _arrayLinked.AddFirstOddNumber();
        _deque.AddFirstOddNumber();

        System.out.println(_arrayList.toString());
        System.out.println(_arrayLinked.toString());
        System.out.println(_deque.toString());
    }
}
