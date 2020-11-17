import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 3);
    }

    @Test
    public void checkBusIsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassengers(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(0);
        assertEquals(1, bus.passengerCount());
    }

}
