import java.util.List;

/** A principal class which extends the Staff class, that creates a new principal, and also contains a list
 * of teachers and the nonAcademic staff, thereby allowing the principal to add
 * and remove both teachers and non-academic staff
 */
public class Principal extends Staff{
    List<Teacher> teachers;
    List<NonAcademic> nonAcademics;


    public Principal(String name, String idColour, boolean hasParkingSpace, List<Teacher> teachers, List<NonAcademic> nonAcademics) {
        super(name, idColour, hasParkingSpace);
        this.teachers = teachers;
        this.nonAcademics = nonAcademics;
    }

    /**
     * A constructor for the principal object
     * @param name  name of the principal
     * @param teachers contains the list of the teachers
     * @param nonAcademics list of all non-academic staff in the school
     */


    public Principal(String name, List<Teacher> teachers, List<NonAcademic> nonAcademics) {
        this(name,"Green",true,teachers,nonAcademics);
        super.setName(name);
//        super.setIdColour("Green");
//        super.setHasParkingSpace(true);
//        this.teachers = teachers;
//        this.nonAcademics = nonAcademics;

    }

    /**
     *
     * @return returns the list of the all the teachers
     */
    public List<Teacher> getTeacher() {

        return teachers;
    }

    /**
     * This is an add new teacher method that takes in a new object of teacher in form of teacher
     * as the param and adds it to the existing list of teachers
     * @param teacher teacher object -> new Teacher
     */
    public void addNewTeacher(Teacher teacher) {

        this.teachers.add(teacher);
    }

    /**
     *
     * @return returns the list of nonAcademics staff
     */
    public List<NonAcademic> getNonAcademics() {

        return nonAcademics;
    }

    /**
     * This is an add new non-academic staff method that takes in a new object of a nonacademic in form of nonacademic
     * as the param and adds it to the existing list of non-academic staff
     * @param nonAcademic teacher object -> new Teacher
     */
    public void addNewNonAcademic(NonAcademic nonAcademic){
        this.nonAcademics.add(nonAcademic);
    }

    /**
     *This sack method takes in a parameter of the teachers name to be sacked and removes it
     * from the list
     * @param name name of the teacher to be sacked
     */
    public void sackTeacher(String name) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getName().equals(name)) {
                this.teachers.remove(i);
                System.out.println(name + " successfully sacked");
            }
        }
    }

    /**
     *This sack method takes in a parameter of the non academic staff name to be sacked and removes it
     * from the list
     * @param name name of the non-academic staff to be sacked
     */
        public void sackNonAcademics (String name){
            for (int i = 0; i < nonAcademics.size(); i++) {
                if (nonAcademics.get(i).getName().equals(name)) {
                    this.nonAcademics.remove(i);
                    System.out.println(name + " successfully sacked");
                }
            }
        }



    /**
     *
     * @return returns a string representation of the principal
     */
    @Override
    public String toString() {
        return "The principal of the school is: "+ super.getName() + "\n\t" +
                "IdColour: " + super.getIdColour() +
                "\t\thasParkingSpace=" + super.getHasParkingSpace();
    }


    /**
     * This method is called ny the principal to print all the staff present in the school including the principal
     */
    public void printAllStaff(){
        System.out.println(toString());
        System.out.println("\nTeachers in the school are:");
        for (int i = 0; i<teachers.size();i++){
            System.out.println(teachers.get(i));
        }
        System.out.println("\nNon-Academic Staffs in the school are:");
        for (int i = 0; i< nonAcademics.size(); i++){
            System.out.println(nonAcademics.get(i));
        }

    }
}

