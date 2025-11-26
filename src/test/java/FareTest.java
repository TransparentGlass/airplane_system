
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airplane.FlightSystem.BusinessClass;
import com.airplane.FlightSystem.Fare;
import com.airplane.FlightSystem.Flight;

public class FareTest {
    
    @Test
    public void testCalculateDistance() {
        double distance = Fare.calculateDistance(Fare.getLocationCoords("Cebu"), Fare.getLocationCoords("Manila"));
        // Approximate distance between Cebu and Manila is around 570 km
        assertEquals(571, Math.floor(distance));
    }

    @Test
    public void testCalculateFare() {

        BusinessClass myFlight = new BusinessClass("PR123", "Cebu", "Manila", null, null, 100);
        int fare = myFlight.getFare();
       
        // Expected fare is approximately 1713 pesos * 3 for Business class
        assertEquals(1713 * 3, fare);
    }
}
