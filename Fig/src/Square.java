public class Square extends Figure implements  Drawable {

    public Square(Point a, Point b){
        this.p1 = a;
        this.p2 = b;
    }
    public double area(){
        return Math.pow(Math.abs(p1.x - p2.x), 2);
    }
    public double perimeter() {
        return 4*Math.abs(p1.x - p2.x);
    }

    public void Draw(){
        System.out.println("Нарисован квадрат чёрного цвета с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y );
    }
    public void Draw(Color color){
        System.out.println("Нарисован квадрат цвета '"+ color +"' с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y);
    }

}
