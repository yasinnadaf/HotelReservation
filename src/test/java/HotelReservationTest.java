import com.bridgelabz.hotelreservation.Hotel;
import com.bridgelabz.hotelreservation.HotelReservationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    HotelReservationService hotelReservation = new HotelReservationService();

@Test
    public void givenHotelShouldBeAddedToHotelList(){
        boolean result = hotelReservation.addHotel(new Hotel("Lakewood",110));
        Assertions.assertTrue(result);
    }
}
