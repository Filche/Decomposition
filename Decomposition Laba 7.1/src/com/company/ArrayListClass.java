package com.company;

import java.util.ArrayList;

public class ArrayListClass{
    private ArrayList<Integer> _arrayList = new ArrayList<>();

    public ArrayListClass()
    {
        for(int i=0;i<100;i++)
        {
            this._arrayList.add((int)(Math.random() * 100 - 50));
        }
    }

    private int FirstOddNumber()
    {
        for (int _number : this._arrayList){
            if(Math.abs(_number)%2==1)
                return _number;
        }
        return 0;
    }

    public ArrayList<Integer> AddFirstOddNumber()
    {
        int FON = FirstOddNumber();
        System.out.println(FON);
        for(int i=0;i<100;i++)
        {
            int _tempNumber = this._arrayList.get(i);
            this._arrayList.remove(i);
            this._arrayList.add(i,_tempNumber + FON);
        }
        return this._arrayList;
    }

    @Override
    public String toString()
    {
        return this._arrayList.toString();
    }
}
