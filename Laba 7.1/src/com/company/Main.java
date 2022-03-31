package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> _arrayList = new ArrayList<>();
        LinkedList<Integer> _arrayLinked = new LinkedList<>();
        Deque<Integer> _deque = new LinkedList<>();
        Deque<Integer> _dequeSecond = new LinkedList<>();

        for(int i=0;i<100;i++)
        {
            _arrayList.add((int)(Math.random() * 100 - 50));
        }
        for(int i=0;i<100;i++)
        {
            _arrayLinked.add((int)(Math.random() * 100 - 50));
        }
        for(int i=0;i<100;i++)
        {
            _deque.add((int)(Math.random() * 100 - 50));
        }

        System.out.println(_arrayList.toString());
        System.out.println(_arrayLinked.toString());
        System.out.println(_deque.toString());

        int _arrayListFON=0;
        int _arrayLinkedFON=0;
        int _dequeFON=0;

        for (int _number : _arrayList){
            if(Math.abs(_number)%2==1) {
                _arrayListFON = _number;
                break;
            }
        }
        for (int _number : _arrayLinked){
            if(Math.abs(_number)%2==1)
            {
                _arrayLinkedFON = _number;
                break;
            }
        }
        for (int _number : _deque){
            if(Math.abs(_number)%2==1)
            {
                _dequeFON = _number;
            }
        }

        System.out.println(_arrayListFON);
        System.out.println(_arrayLinkedFON);
        System.out.println(_dequeFON);

        for(int i=0;i<100;i++)
        {
            int _tempNumber = _arrayList.get(i);
            _arrayList.remove(i);
            _arrayList.add(i,_tempNumber + _arrayListFON);
        }
        for(int i=0;i<100;i++)
        {
            int _tempNumber = _arrayLinked.get(i);
            _arrayLinked.remove(i);
            _arrayLinked.add(i,_tempNumber + _arrayLinkedFON);
        }
        for(int i=0;i<100;i++)
        {
            int _tempNumber = _deque.getFirst();
            _deque.removeFirst();
            _dequeSecond.add(_tempNumber + _dequeFON);
        }

        _deque = _dequeSecond;

        System.out.println(_arrayList.toString());
        System.out.println(_arrayLinked.toString());
        System.out.println(_deque.toString());
    }
}
