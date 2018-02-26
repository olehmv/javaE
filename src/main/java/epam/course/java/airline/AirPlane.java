package epam.course.java.airline;

public abstract class AirPlane {
    protected int tankCapacity;
    protected String name;
  AirPlane(int tankCapacity,String name){
      this.tankCapacity=tankCapacity;
      this.name=name;
  }

    public abstract int flingthDistance(int cargoWeigth);
    public abstract int flingthDistance();
  public abstract int capacity();

}

