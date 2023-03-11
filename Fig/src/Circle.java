public class Circle extends Figure implements Drawable{

    public Circle(Point a, Point b){
        this.p1 = a;
        this.p2 = b;
    }
    public double radius(){
        return Math.sqrt(Math.pow(Math.abs(p1.x - p2.x), 2) + Math.pow(Math.abs(p1.y - p2.y), 2));
    }
    public double area(){
        return 3.14 * radius() * radius();
    }
    public double perimeter(){
        return 2 * 3.14 * radius();
    }

    public void Draw(){
        System.out.println("Нарисован круг чёрного цвета с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y );
    }
    public void Draw(Color color){
        System.out.println("Нарисован круг цвета '"+ color +"' с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y);
    }

}
