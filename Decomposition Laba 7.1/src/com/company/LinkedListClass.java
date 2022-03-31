package com.company;

import java.util.LinkedList;

public class LinkedListClass {
    private LinkedList<Integer> _arrayLinked = new LinkedList<>();

    public LinkedListClass()
    {
        for(int i=0;i<100;i++)
        {
            this._arrayLinked.add((int)(Math.random() * 100 - 50));
        }
    }

    private int FirstOddNumber()
    {
        for (int _number : this._arrayLinked){
            if(Math.abs(_number)%2==1)
                return _number;
        }
        return 0;
    }

    public LinkedList<Integer> AddFirstOddNumber()
    {
        int FON = FirstOddNumber();
        System.out.println(FON);
        for(int i=0;i<100;i++)
        {
            int _tempNumber = _arrayLinked.get(i);
            _arrayLinked.remove(i);
            _arrayLinked.add(i,_tempNumber + FON);
        }
        return this._arrayLinked;
    }

    @Override
    public String toString()
    {
        return this._arrayLinked.toString();
    }
}
