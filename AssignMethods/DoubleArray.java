package com.sgtest.AssignMethods;
class DoubleDemo
{
    void Double(double x[][]){
        double y[]=x[0];
        for(int i=x.length-1;i<x.length;i--)
        {
            System.out.println(y[i]);
        }
    }
}
public class DoubleArray {
    public static void main(String[] args) {
        double x[][] ={{2.5,2.4,2.2},{4.9,5.6,6.4},{7.5,8.6,9.7}};
        DoubleDemo s=new DoubleDemo();
        s.Double(x);
    }
}
