package AdapterP1;

public class AdapterSquarePeg implements IRoundPeg{
    private  ISquarePeg iSquarePeg;

    public AdapterSquarePeg(ISquarePeg iSquarePeg) {
        this.iSquarePeg = iSquarePeg;
    }
    @Override
    public void roundPeg(int radius) {

    }

    @Override
    public int getRadius() {
        return (int) (iSquarePeg.getWidth() * Math.sqrt(2)/ 2);
    }
}
