import designpattern.structural.Guest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuestTest {
    @Test
    void deveRetonarGastoHospede() {
        Guest guest = new Guest();
        guest.setSpent(120.0);

        assertEquals(120.0, guest.getSpent());
    }

}
