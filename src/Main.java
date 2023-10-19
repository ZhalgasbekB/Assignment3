import AdapterP.ILegacyRectangle;
import AdapterP.LegacyRectangle;
import AdapterPattern.LegacyRectangleAdapter;
import AdapterPattern.Shape;

public class Main {
    public static void main(String[] args) {
        ILegacyRectangle ilegacyRectangle = new LegacyRectangle();
        Shape adapter = new LegacyRectangleAdapter(ilegacyRectangle);

        // Вызываем метод draw через интерфейс Shape
        adapter.draw();    }
}