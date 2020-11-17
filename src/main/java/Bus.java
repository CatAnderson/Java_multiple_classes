import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = 3;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void pickUp(BusStop busStop) {
        if (this.capacity > passengerCount()){
            Person person = busStop.removePerson();
            this.passengers.add(person);
        }
    }

    public void removePassenger(int index) {
        this.passengers.remove(0);
    }
}
