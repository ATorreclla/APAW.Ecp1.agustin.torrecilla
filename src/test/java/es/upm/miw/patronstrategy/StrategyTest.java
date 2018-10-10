package es.upm.miw.patronstrategy;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    private Context contextAdd;
    private Context contextDiv;
    private Context contextLog;
    private Context contextAverage;
    private Context contextMod;

    @BeforeEach
    void before() {
        this.contextAdd  = new Context(new Add());
        this.contextDiv  = new Context(new Div());
        this.contextLog  = new Context(new Log());
        this.contextAverage  = new Context(new Average());
        this.contextMod  = new Context(new Mod());
    }

    @Test
    void testAdd() {
        assertEquals(35, contextAdd.executeStrategy(15, 20));
    }

    @Test
    void testDiv() {
        assertEquals(200, contextDiv.executeStrategy(1000, 5));
    }

    @Test
    void testLog() {
        assertEquals(2, contextLog.executeStrategy(300, 5));
    }

    @Test
    void testAverage() {
        assertEquals(505, contextAverage.executeStrategy(10, 1000));
    }

    @Test
    void testMod() {
        assertEquals(8, contextMod.executeStrategy(80, 12));
    }
}