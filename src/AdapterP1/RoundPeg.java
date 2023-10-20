package AdapterP1;

public class RoundPeg implements  IRoundPeg{
    private  int radius;
    @Override
    public void roundPeg(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
