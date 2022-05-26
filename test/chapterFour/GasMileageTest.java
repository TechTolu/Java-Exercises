package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    @Test
    void gasMileageCanBeCreated(){
        //GIVEN
        GasMileage gasMileage = new GasMileage(0,0);
        //WHEN
        gasMileage.setMiles(25);
        gasMileage.setGallons(12);
        assertEquals(25, gasMileage.getMiles());
        assertEquals(12, gasMileage.getGallons());
    }

    @Test
    void milesPerGallonCalculation(){
        //GIVEN
        GasMileage gasMileage = new GasMileage(0,0);
        //WHEN AND ASSERT
        assertEquals(4,gasMileage.milesPerGallon(100,25));
    }
}
