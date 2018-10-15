package com.sthlmj;

public class Main {

    public static void main(String[] args) {

        //unicode characters map: http://unicode-table.com/en/#basic-latin
        //char width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //challenge
        //1. Find the code for the registered symbol on the same line as the copyright symbol. 00AE
        //2. Create a variable of type char and assign it the unicode value for that symbol.
        //3. Display on screen.

        char myRegSymbol = '\u00AE';
        System.out.println("unicode ourput of reg symbol is: " + myRegSymbol);
    }
}
