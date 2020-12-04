/**
 * A class created for teacher to create multiple copies of the
 * teacher object which extends a super-class(Staff) that contains all the required
 * instance variables, setters, getters and a toString method
 */
public class Teacher extends Staff {

    public Teacher(String name, String idColour, boolean hasParkingSpace) {
        super(name, idColour, hasParkingSpace);
    }

    /**
     * A constructor for the teacher object that sets the name, idCardColour and
     * parking space of each teacher
     * @param name name of the teacher
     */


    public Teacher(String name) {
        this(name,"Brown",true);
        super.setName(name);
//        super.setIdColour("Brown");
//        super.setHasParkingSpace(true);
    }

}
