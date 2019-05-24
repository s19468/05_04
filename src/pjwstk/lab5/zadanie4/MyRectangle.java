/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie4;

public class MyRectangle {

    private MyPoint corner1 = new MyPoint(1, 3);
    private MyPoint corner2 = new MyPoint(4,1);

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.corner1.setXY(x1, y1);
        this.corner2.setXY(x2, y2);
    }

    public MyRectangle(MyPoint corner1, MyPoint corner2) {
        this.corner1 = corner1;
        this.corner2 = corner2;
    }

    public MyRectangle() {}

    public MyPoint getCorner1() {
        return corner1;
    }

    public void setCorner1(MyPoint corner1) {
        this.corner1 = corner1;
    }

    public MyPoint getCorner2() {
        return corner2;
    }

    public void setCorner2(MyPoint corner2) {
        this.corner2 = corner2;
    }

    public void setCorners(int x1, int y1, int x2, int y2) {
        this.corner1.setXY(x1, y1);
        this.corner2.setXY(x2, y2);
    }

    public int[] getCorners() {
        int[] values = { getCorner1().getX(), getCorner1().getY(), getCorner2().getX(), getCorner2().getY()};
        return values;
    }

    @Override
    public String toString() {
        return "MyRectangle[corner1=" + getCorner1().toString() + ",corner2=" + getCorner2().toString() + "]";
    }

    public double getArea() {
        int x1 = getCorner1().getX();
        int y1 = getCorner2().getY();

        int x2 = getCorner2().getX();
        int y2 = getCorner2().getY();

        double width = getCorner1().distance(x2,y1);
        double height = getCorner1().distance(x1, y2);

        return width * height;
    }

    public double getCircumference() {
        int x1 = getCorner1().getX();
        int y1 = getCorner2().getY();

        int x2 = getCorner2().getX();
        int y2 = getCorner2().getY();

        double width = getCorner1().distance(x2,y1);
        double height = getCorner1().distance(x1, y2);

        return (2 * width) + (2 * height);
    }

    public double getDiagonal() {
        return getCorner1().distance(getCorner2());
    }
}
