import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterbottleTest {

    private Waterbottle waterbottle;

    @Before
    public void before() {
        this.waterbottle = new Waterbottle(100);
    }

    @Test
    public void drinkCanBeTaken() {
        assertEquals(90, waterbottle.drinkTaken());
    }
    @Test
    public void bottleCanBeEmptied() {
        assertEquals(0, waterbottle.emptyWaterbottle());
    }
    @Test
    public void canBeFilled() {
        assertEquals(100, waterbottle.fillWaterbottle());
    }

}

