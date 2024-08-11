package com.sgtest.AssignMethods;
class Demo5
{
    void castdouble_int(double a[][])
    {
        int b[][]=new int[a.length][a[0].length];
        int k=0,z=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++) {
                b[k][z] =(int) a[i][j];
                System.out.println(b[k][z]);
            }
        }
    }
}
public class IntegerArray {
    public static void main(String[] args) {
        System.out.println("Double Array to Integer Array:");
        Demo5 o1=new Demo5();
        o1.castdouble_int(new double[][]{{10.1,20.2,30.3},{40.4,50.5,60.6},{70.7,80.8,90.9}});
    }
}
