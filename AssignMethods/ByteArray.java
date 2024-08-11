package com.sgtest.AssignMethods;
class Demo4
{
    void castbyte_int(byte a[])
    {
        int b[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            b[k]=a[i];
            System.out.println(b[k]);
        }
    }
}

public class ByteArray {
    public static void main(String[] args) {
        System.out.println("Byte Array to Integer Array:");
        Demo4 o1=new Demo4();
        o1.castbyte_int(new byte[]{10,20,30,40,50,60});
    }
}
