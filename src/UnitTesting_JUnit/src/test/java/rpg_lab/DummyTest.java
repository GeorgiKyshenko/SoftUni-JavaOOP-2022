package rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    private static final int DEAD_HEALTH = 0;
    private static final int ALIVE_HEALTH = 10;
    private static final int EXPERIENCE = 30;
    private static final int ATTACK_POINTS = 1;

    private Dummy aliveDummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.aliveDummy = new Dummy(ALIVE_HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(DEAD_HEALTH, EXPERIENCE);
    }

    @Test
    public void test_DummyLosesHealth_WhenAttacked() {

        aliveDummy.takeAttack(ATTACK_POINTS);
        assertEquals(ALIVE_HEALTH - ATTACK_POINTS, aliveDummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void test_DeadDummy_LosesHealth_WhenAttacked() {
        deadDummy.takeAttack(ATTACK_POINTS);
    }

    @Test
    public void test_DeadDummy_Gives_Experience() {
        int actual = deadDummy.giveExperience();
        assertEquals(EXPERIENCE, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void test_AliveDummy_CannotGive_Experience() {
        aliveDummy.giveExperience();
    }

    @Test
    public void test_AliveDummy_isAlive() {
        assertFalse(aliveDummy.isDead());
    }

    @Test
    public void test_DeadDummy_isDead() {
        assertTrue(deadDummy.isDead());
    }

}