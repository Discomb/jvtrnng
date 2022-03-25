public class JVtraining {

    public static void main(String[] args) {

        Point a = new Point(0, -19);
        Point b = new Point(6, 10);
        Point c = new Point(75, -56);

        System.out.println();
        System.out.println("==== Программа в рамках домашнего задания ====");
        System.out.println();
        System.out.println("==== ДЗ №2 ====");
        System.out.println("Результат работы функции distance:   Расстояние между точками a и b равно " + distance(a, b));
        System.out.println("Результат работы метода класса:      Расстояние между точками a и c равно " + Point.distance(c, a));
        System.out.println("===============");

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }


}