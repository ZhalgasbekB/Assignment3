package AdapterPattern;

import AdapterP.ILegacyRectangle;

public class LegacyRectangleAdapter implements  Shape{
    private ILegacyRectangle iLegacyRectangle;

    public LegacyRectangleAdapter(ILegacyRectangle iLegacyRectangle){
        this.iLegacyRectangle = iLegacyRectangle;
    }
    @Override
    public void draw() {
        iLegacyRectangle.drawRectangle();
    }
}
