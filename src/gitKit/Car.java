package gitKit;

public class Car {

  private String color;
  private String maxSpeed;

  public void setColor(String color) {
    this.color = color;
  }

  public void setMaxSpeed(String maxSpeed){
    this.maxSpeed = maxSpeed;
  }

  public String getColor() {
    return color;
  }
  public String getMaxSpeed(){
    return maxSpeed;
  }

  public void drive() {
    System.out.println("dyr dyr dyr");
  }
}