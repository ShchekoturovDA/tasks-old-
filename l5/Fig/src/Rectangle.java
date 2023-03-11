public class Rectangle extends  Figure implements  Drawable{

    public  Rectangle(Point a, Point b){
        this.p1 = a;
        this.p2 = b;
    }
    public double area(){
        return Math.abs(p1.x - p2.x) * Math.abs(p1.y - p2.y);
    }
    public double perimeter() {
        return 2*Math.abs(p1.x - p2.x) + 2*Math.abs(p1.y - p2.y);
    }

    public void Draw(){
        System.out.println("Нарисован прямоугольник чёрного цвета с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y );
    }
    public void Draw(Color color){
        System.out.println("Нарисован прямоугольник цвета '"+ color +"' с координатами x1 = " + p1.x + ", y1 = " + p1.y + "; x2 = " + p2.x + ", y2 = " + p2.y);
    }

}
