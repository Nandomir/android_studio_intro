package com.codeclan.tddintro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RobotTest {

    Robot robot;
    @Before
    public void before() {
        robot = new Robot("C3PO", "gold");
    }

    @Test
    public void testRobotSetup() {
        assertEquals("C3PO", robot.getName());
        assertEquals("gold", robot.getColour());
    }

    @Test
    public void testCheckBattery() {
        double battery = robot.getBattery();
        assertEquals(100.0, battery, 0.01);
    }

    @Test
    public void testMakeDrink() {
        assertEquals("I'm making a Mohito", robot.makeDrink("Mohito"));
        assertEquals(90.0, robot.getBattery(), 0.01);
    }

    @Test
    public void washDishes() {
        String task = robot.washDishes();
        double batteryLife = robot.getBattery();
        assertEquals("I'm washing the dishes", robot.washDishes());
        assertEquals(70.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testRechargeBattery() {
        String task = robot.washDishes();
        double batteryLife = robot.getBattery();
        assertEquals(70.0, robot.getBattery(), 0.01);

        robot.rechargeBattery();
        batteryLife = robot.getBattery();
        assertEquals(100.0, robot.getBattery(), 0.01);
    }

}