/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie4;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = {getX(), getY()};
        return xy;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public double distance(int x, int y) {
        double dist = Math.sqrt(Math.pow(getX() - x, 2.0) + Math.pow(getY() - y, 2.0));
        return dist;
    }

    public double distance(MyPoint point) {
        double dist = Math.sqrt(Math.pow(getX() - point.getX(), 2.0) + Math.pow(getY() - point.getY(), 2.0));
        return dist;
    }

    public double distance() {
        double dist = Math.sqrt(Math.pow(getX() - 0, 2.0) + Math.pow(getY() - 0, 2.0));
        return dist;
    }
}
