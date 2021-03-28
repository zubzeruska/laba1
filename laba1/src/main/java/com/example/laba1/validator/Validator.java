package com.example.laba1.validator;
import  com.example.laba1.exceptions.InputException;

public class Validator {

     public  Validator() {

     }
     public void CheckString(String mass1, String mass2, String speed1, String speed2) throws InputException {
         if(mass1.length() == 0 || mass2.length() == 0 || speed1.length() == 0 || speed2.length() == 0) {
             throw new InputException("Некорректный ввод данных");
         }
         else {
             for(int i = 0; i < mass1.length(); i++) {
                 if(mass1.charAt(i) < '0' || mass1.charAt(i) > '9') {
                     throw new InputException("Введите число!!!!");
                 }
             }
             for(int i = 0; i < mass2.length(); i++) {
                 if(mass2.charAt(i) < '0' || mass2.charAt(i) > '9') {
                     throw new InputException("Введите число!!!!");
                 }
             }
             for(int i = 0; i < speed1.length(); i++) {
                    if (speed1.charAt(i) < '0' || speed1.charAt(i) > '9') {
                        throw new InputException("Введите число!!!!");
                    }
             }
             for(int i = 0; i < speed2.length(); i++) {
                 if (speed2.charAt(i) < '0' || speed2.charAt(i) > '9' && speed2.charAt(0)!='-') {
                     throw new InputException("Введите число!!!!");
                 }
             }
         }
     }
}
