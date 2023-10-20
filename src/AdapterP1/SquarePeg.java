package AdapterP1;

public class SquarePeg implements ISquarePeg{
    private  int width;
    @Override
    public void squarePeg(int width) {
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
