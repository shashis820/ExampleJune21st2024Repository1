package com.sgtest.AssignMethods;
class Demo6
{
    void castchar_int(char a[][])
    {
        int b[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++) {
                b[i][j] =(int) a[i][j];
                System.out.println(b[i][j]);
            }
        }
    }
}
public class CharecterArray {
    public static void main(String[] args) {
        System.out.println("Character Array to Integer Array:");
        Demo6 o1 = new Demo6();
        o1.castchar_int(new char[][]{{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}});
    }
}
