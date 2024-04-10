package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        JFrame a = new JFrame("example");
//        a.setSize(400,700);
//        a.setLayout(null);
//        a.setVisible(true);

//        int[] values = {1,2,3,4,5,6,7,8,9};
//        String[] names = {"6","7","8","9","10","В","Д","К","Т'"};
//        String[] mast = {"Пики","Чирва","Бубна","Крести"};
//
//        Card[] stack = new Card[36];
//
//        for (int i = 0; i < 4; i++){
//            int cardId = 0;
//            for (int j = 0; j < 9; j++) {
//                stack[cardId] = new Card(values[i],names[i],mast[j]);
////                stack[cardId].setAll(values[i],names[i],mast[j]);
//                cardId++;
//            }
//        }
//
//        System.out.println(stack);
        String name = "";
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Привет, /n"+name);
    }
}

class Card{
    private int value;
    private String name;
    private String mast;

    public Card(){}

    public Card(int value, String name, String mast) {
        this.value = value;
        this.name = name;
        this.mast = mast;
    }

    public void setAll(int value, String name, String mast) {
        this.value = value;
        this.name = name;
        this.mast = mast;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }
}