/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie4;

public class Main {

    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle();

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Circumference: " + rectangle.getCircumference());
        System.out.println("Diagonal: " + rectangle.getDiagonal());
    }
}
