package epam.course.java.airline;

class CargoPlane extends AirPlane{
    private int tonCapacity;
    private int fluelPerTon;
    CargoPlane(int tankCapacity, String name) {
        super(tankCapacity, name);
    }

    @Override
    public int flingthDistance(int numberOfTon) {
        return tankCapacity/numberOfTon*fluelPerTon;
    }

    @Override
    public int flingthDistance() {
        return 0;
    }

    @Override
    public int capacity() {
        return capacity();
    }

}
