package com.study.Getting;

/**
 * @version : 1.0
 * @auther : Firewine     
 * @Program Name: <br>
 * @Create : 2018-10-14-22:49
 */
public class LowercaseToUppercase {

    public static  char lowercaseToUppercase(char character){

        String temp = String.valueOf(character);

        temp = temp.toUpperCase();

        character = temp.charAt(0);
        return character;
    }

    public static void main(String[] args) {

        System.out.println(LowercaseToUppercase.lowercaseToUppercase('a'));
    }
}
