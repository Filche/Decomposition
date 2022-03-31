package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class DequeClass {
    private Deque<Integer> _deque = new LinkedList<>();
    private Deque<Integer> _dequeSecond = new LinkedList<>();

    public DequeClass()
    {
        for(int i=0;i<100;i++)
        {
            this._deque.add((int)(Math.random() * 100 - 50));
        }
    }

    private int FirstOddNumber()
    {
        for (int _number : this._deque){
            if(Math.abs(_number)%2==1)
                return _number;
        }
        return 0;
    }

    public Deque<Integer> AddFirstOddNumber()
    {
        int FON = FirstOddNumber();
        System.out.println(FON);
        for(int i=0;i<100;i++)
        {
            int _tempNumber = this._deque.getFirst();
            this._deque.removeFirst();
            this._dequeSecond.add(_tempNumber + FON);
        }
        this._deque = this._dequeSecond;
        return this._deque;
    }

    @Override
    public String toString()
    {
        return this._deque.toString();
    }
}
