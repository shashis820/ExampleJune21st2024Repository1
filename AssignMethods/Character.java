package com.sgtest.AssignMethods;
class CharacterPZ
{
    void chpz(char ch)
    {
        for(char x='P';x<='Z';x++){
            System.out.print(x);
        }
    }

}
public class Character {
    public static void main(String[] args) {
        CharacterPZ o=new CharacterPZ();
        o.chpz('P');
        o.chpz('Z');
    }
}
