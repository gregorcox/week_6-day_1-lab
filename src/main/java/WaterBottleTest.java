import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() { waterBottle = new WaterBottle(100); }

    @Test
    public void hasVolume() {assertEquals(100, waterBottle.getVolume()); }

    @Test
    public void drinkReducesVolumeBy10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyReducesTo0() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

}
