public class PaintExample{
    public static void main(String[] args) {
        Point p1 = new Point(5.3, 6.2);
        Point p2 = new Point(12.45, 8);
        Point p3 = new Point(4, 0.1);
        Circle circ = new Circle(p1, p2);
        Rectangle rect = new Rectangle(p1, p2);
        Square sq = new Square(p1, p2);
        Triangle triang = new Triangle(p1, p2, p3);
        System.out.println("Периметр круга: " + circ.perimeter() + ", а площадь: " + circ.area());
        circ.Draw();
        circ.Draw(Color.Coral);
        System.out.println("Периметр прямоугольника: " + rect.perimeter() + ", а площадь: " + rect.area());
        rect.Draw();
        rect.Draw(Color.Silver);
        System.out.println("Периметр квадрата: " + sq.perimeter() + ", а площадь: " + sq.area());
        sq.Draw();
        sq.Draw(Color.Red);
        System.out.println("Периметр треугольника: " + triang.perimeter() + ", а площадь: " + triang.area());
        triang.Draw();
        triang.Draw(Color.Turquoise);
        System.out.println("Теперь через FigureUtil");
        System.out.println("Периметр круга: " + FigureUtil.perimetr(circ) + ", а площадь: " + FigureUtil.area(circ));
        FigureUtil.Draw(circ);
        FigureUtil.Draw(circ, Color.Blue);
        System.out.println("Периметр прямоугольника: " + FigureUtil.perimetr(rect) + ", а площадь: " + FigureUtil.area(rect));
        FigureUtil.Draw(rect);
        FigureUtil.Draw(rect, Color.Turquoise);
        System.out.println("Периметр квадрата: " + FigureUtil.perimetr(sq) + ", а площадь: " + FigureUtil.area(sq));
        FigureUtil.Draw(sq);
        FigureUtil.Draw(sq, Color.Coral);
        System.out.println("Периметр треугольника: " + FigureUtil.perimetr(triang) + ", а площадь: " + FigureUtil.area(triang));
        FigureUtil.Draw(triang);
        FigureUtil.Draw(triang, Color.Silver);
    }
}