public class Triangle extends Figure implements Drawable{

    public Triangle(Point a, Point b, Point c){
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;

    }
    public double dist(Point a, Point b){
        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
    }
    public double perimeter(){
        return dist(p1, p2) + dist(p2, p3) + dist(p1, p3);
    }
    public double area(){
        return Math.sqrt(perimeter()/2 * (perimeter()/2 - dist(p1, p2)) * (perimeter()/2 - dist(p1, p3)) * (perimeter()/2 - dist(p3, p2)));
    }

    public void Draw(){
        System.out.println("Нарисован треугольник чёрного цвета с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y + "; x3 = " + p3.x + ", y3 = " + p3.y);
    }
    public void Draw(Color color){
        System.out.println("Нарисован треугольник цвета '"+ color +"' с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y + "; x3 = " + p3.x + ", y3 = " + p3.y);
    }

}