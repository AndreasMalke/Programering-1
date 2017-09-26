package lektionOP;

public class Car {
	private int numberOfDoors = 5;
	private int numberOfwheels = 4;
	private String color = "purple";
    private int antaletrattar = 1; 
    private String carBrand = "Volvo"; 
    private int speed = 0; 

    /**
     * konstuktor för Bil classen
     * Setter färgen på bilen vid skapande.
     */
    
    public car (String selectedColor) {
    	color = selectedColor;
    }
    public void setSpeed(int newSpeed) {
	    speed = newSpeed;
    }
	public int getspeed() { 
		return speed;
	}
	
	public void setColor(String newColor) {
	      color = newColor;
	}
	public String getColor() {
		  return color;
	}

}
