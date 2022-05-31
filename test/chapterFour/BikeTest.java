package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class BikeTest {
    Bike bike;
    @BeforeEach
    void setUp(){bike = new Bike();}

    @Test
    void bikeCanBeOff(){
        bike.isOn();
        assertTrue(bike.isOn());
        bike.isOff();
        assertTrue(bike.isOff());
    }

    @Test
    void bikeCanBeTurnedOn(){
        bike.isOn();
        assertTrue(bike.isOn());
    }

    @Test
    void bikeCanBeAccelerated(){
        assertEquals(18, bike.acceleration(3));
    }

    @Test
    void bikeCanBeDecelerated(){
        bike.acceleration(3);
        assertEquals(15,bike.deceleration(3));
    }
}
