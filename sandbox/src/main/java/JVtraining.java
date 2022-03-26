public class JVtraining {

    public static void main(String[] args) {

        Point a = new Point(0, -19);
        Point b = new Point(6, 10);
        Point c = new Point(75, -56);

        Rectangle r1 = new Rectangle(8, 19);
        Square s1 = new Square(15);

        System.out.println();
        System.out.println("==== Программа в рамках домашнего задания ====");
        System.out.println();
        System.out.println("==== ДЗ №2 ====");
        System.out.println("Результат работы функции distance:   Расстояние между точками a и b равно " + distance(a, b));
        System.out.println("Результат работы метода класса:      Расстояние между точками a и c равно " + Point.distance(c, a));
        System.out.println("===============");
        System.out.println("Площадь квадрата со стороной " + s1.l + " равна " + area(s1));
        System.out.println("Площадь прямоугольника со сторонами " + r1.a + " и " + r1.b + " равна " + area(r1));


    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }


    public static double area(Square s){
        return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }

}