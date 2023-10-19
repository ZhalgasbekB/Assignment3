package AdapterP;

import AdapterP.ILegacyRectangle;

public class LegacyRectangle implements ILegacyRectangle {
    @Override
    public void drawRectangle() {
        System.out.println("Drawing a legacy rectangle");
    }
}
