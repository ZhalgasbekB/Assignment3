package AdapterPattern;

import AdapterP.ILegacyCycle;
import AdapterP.ILegacyRectangle;

public class LegacyCycleAdapter implements  Shape{
    private ILegacyCycle iLegacyCycle;

    public LegacyCycleAdapter(ILegacyCycle iLegacyCycle){
        this.iLegacyCycle = iLegacyCycle;
    }
    @Override
    public void draw() {
        iLegacyCycle.drawCycle();
    }
}
