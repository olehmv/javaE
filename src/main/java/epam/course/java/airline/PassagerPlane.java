package epam.course.java.airline;

class PassagerPlane extends AirPlane{
    private int passagerCapacity;
    private int fluelPerPassager;

    PassagerPlane(int tankCapacity, String name) {
        super(tankCapacity, name);
    }

    @Override
    public int flingthDistance(int numberOfpassager) {
        return tankCapacity/numberOfpassager*fluelPerPassager;
    }

    @Override
    public int flingthDistance() {
        return tankCapacity/passagerCapacity*fluelPerPassager;
    }

    @Override
    public int capacity() {
        return passagerCapacity;
    }
}