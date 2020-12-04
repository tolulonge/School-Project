/**
 * A staff class that serves as a super class for the Principal, the Teacher and Non-academic classes respectively
 * It contains the instance variables of each of the subclasses and also setters and getters for each
 * of the variables
 *
 * It overrides a toString method that returns a string representation of each subclass object
 */
public class Staff {
    private String name;
    private String idColour;
    private  boolean hasParkingSpace;

    public Staff(String name, String idColour, boolean hasParkingSpace) {
        this.name = name;
        this.idColour = idColour;
        this.hasParkingSpace = hasParkingSpace;
    }

    /**
     *setName method sets the name of each subclass object
     * @param name name of any of the staff either principal, teacher or nonAcademic
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return returns the name of the subclass respective object
     */
    public String getName() {
        return name;
    }

    /**
     * sets idCardColour of each of the subclass in their respective constructors
     * @param idColour id card colour of the principal, teacher or non-Academic staff
     */
    public void setIdColour(String idColour){
        this.idColour = idColour;
    }

    /**
     * @return returns the colour of the id card
     */
    public String getIdColour(){
        return idColour;
    }

    /**
     * sets the status of a staff if entitled to a parking space or not
     * @param isParked sets the parking space right of the principal, teacher or non-academic staff
     */
    public void setHasParkingSpace(boolean isParked){
        this.hasParkingSpace = isParked;
    }

    /**
     * @return returns the parking space status of the subclasses
     */
    public boolean getHasParkingSpace(){
        return hasParkingSpace;
    }

    /**
     *
     * @return returns a string representation of the object Principal, Teacher and Non-academic staff
     */
    @Override
    public String toString() {
        return "\t" +
                "Name: " + name + "\t\t" +
                "IdColor: " + idColour + "\t\t" +
                "HasParkingSpace: " + hasParkingSpace+"\n";
    }
}
