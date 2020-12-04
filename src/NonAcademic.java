/**
 * A class created for Non-academic staff to create multiple copies of the
 * non-academic staff object which extends a super-class(Staff) that contains all the required
 * instance variables, setters, getters and a toString method
 */
public class NonAcademic extends Staff {


    public NonAcademic(String name, String idColour, boolean hasParkingSpace) {
        super(name, idColour, hasParkingSpace);
    }

    /**
     * A constructor for the non-academic staff object, that initializes the name,
     * idCardColour and hasParkingSpace for the object
     *
     * @param name sends in the name of the non-academic staff
     */

    public NonAcademic(String name) {
        this(name,"Yellow",false);
        super.setName(name);
    }

}
