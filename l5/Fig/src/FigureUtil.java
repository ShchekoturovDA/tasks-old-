public class FigureUtil {

    private FigureUtil(){
    }

    public static double perimetr(Figure figure){
        return figure.perimeter();
    }
    public static double area(Figure figure){
        return figure.area();
    }
    public static void Draw(Drawable figure){
        figure.Draw();
    }
    public static void Draw(Drawable figure, Color color) {
        figure.Draw(color);
    }

}
