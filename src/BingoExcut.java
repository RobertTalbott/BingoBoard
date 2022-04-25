//package com.example.bingoboard;

import java.security.SecureRandom;

public class BingoExcut{
    public static void main(String[] args) {

        BingoBoard1[] myBingo = new BingoBoard1[4];
        myBingo[0] = new BingoBoard1("Alex");
        myBingo[1] = new BingoBoard1("Steven");
        myBingo[2] = new BingoBoard1("john");
        myBingo[3] = new BingoBoard1("adam");

        BingoNumber main = new BingoNumber();
        for(int count = 0; count < 30; count++) {
            int rnd = main.NewNumber();
            for (int i = 0; i < myBingo.length; i++) {
                myBingo[i].AddMarker(rnd);
            }
        }
        //for(int i = 0; i < 16; i++){
        //    myBingo[0].AddMarker(i);
        //}

        myBingo[0].AddMarker(2);
        myBingo[0].showBoard();
        System.out.println(myBingo[0].WinCheck());
        for (int i = 0; i < myBingo.length; i++) {
            System.out.println(myBingo[i].WinCheck());
        }
    }
}
