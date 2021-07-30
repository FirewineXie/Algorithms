package com.study.Getting;

/**
 * @version : 1.0
 * @auther : Firewine     
 * @Program Name: <br>
 * @Create : 2018-10-14-23:26
 */
public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    private int width;
    private  int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void getArea(){

        System.out.println(this.width * this.height);


    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.getArea();
    }
}
