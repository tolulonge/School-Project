import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The main class for the school model where the principal controls employing and
 * removing teaching and non-academic personnel in the school
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Initializes a new arrayList for both the teacher and non-academic staff
        List<Teacher> teachers = new ArrayList<>();
        List<NonAcademic> nonAcademics = new ArrayList<>();


        // Creates the object of the principal which is only done once since we can have only one principal
        Principal principal = new Principal("Adekoya", teachers, nonAcademics);

        // Creates various copies of teachers already present in the school
        Teacher bolanle = new Teacher("Bolanle");
        Teacher abubakar = new Teacher("Abubakar");
        Teacher stephen = new Teacher("Stephen");


        // Creates copies of non-academic staff already present in the school
        NonAcademic seun = new NonAcademic("Seun");
        NonAcademic fatai = new NonAcademic("Fatai");


        // Adds the created teachers into the teachers arrayList
        teachers.add(bolanle);
        teachers.add(abubakar);
        teachers.add(stephen);

        // Adds the created non-academic staff into the nonacademics arrayList
        nonAcademics.add(seun);
        nonAcademics.add(fatai);

        // Creates a boolean value that checks if the principal is still running the program
        boolean isRunning = true;

        // A loop that continues running until the principal quits and the condition is set to false
        while (isRunning) {
            System.out.println("Welcome To MySchool\n1. List all staff in the school\n2. Add a new staff\n3. Sack a staff" +
                    "\n4. Quit");
            int homeChoice = scanner.nextInt();

            // Checks for the input and matches it to various implementation has stated in the welcome message
            switch (homeChoice) {

                // Lists all the staff in the school
                case 1 -> principal.printAllStaff();

                // Adds a new teacher or non academic staff
                case 2 -> {
                    System.out.println("\t1. Add a new teacher\n\t2. Add a new new non-academic staff");
                    int addStaffChoice = scanner.nextInt();
                    switch (addStaffChoice) {

                        // Adds a new teacher
                        case 1 -> {
                            System.out.println("\tEnter the new teachers name");
                            String newTeacherName = scanner.next();
                            principal.addNewTeacher(new Teacher(newTeacherName));
                            System.out.println(newTeacherName + " has being successfully employed");
                        }

                        // Adds a new non academic staff
                        case 2 -> {
                            System.out.println("Enter the new non academic staff name");
                            String nonStaffname = scanner.next();
                            principal.addNewNonAcademic(new NonAcademic(nonStaffname));
                            System.out.println(nonStaffname + " has been successfully employed");
                        }


                    }

                }

                // Sacks a teacher or non-academic staff if found to be under-performing
                case 3 -> {
                    System.out.println("\t1. Sack a teacher\n\t2. Sack a non-academic staff");
                    int sackStaffChoice = scanner.nextInt();
                    switch (sackStaffChoice) {

                        // Sacks a teacher
                        case 1 -> {
                            System.out.println("\tEnter the teachers name you want to sack");
                            String sackedTeacherName = scanner.next();
                            principal.sackTeacher(sackedTeacherName);
                        }

                        // Sacks a non academic staff
                        case 2 -> {
                            System.out.println("Enter the non academic staff name you want to sack");
                            String sackedNonStaffname = scanner.next();
                            principal.sackNonAcademics(sackedNonStaffname);

                        }


                    }


                }

                //Closes the program and logs off the user
                case 4 -> isRunning = false;

            }
        }

    }
}




