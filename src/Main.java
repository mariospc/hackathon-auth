import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Scanner scanner;
    private static Set<Place> places;
    private static Set<Course> courses;
    private static Set<Lecture> lectures;
    private static Set<Classroom> classrooms;
    private static Set<Department> departments;


    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);
        System.out.println("Welcome!!!!!!!!!!!!!!!!!!!!!!!");
        int choice = menu();
        while (choice != 3)
        {
            int choice2;
            switch (choice)
            {
                case 1:
                    choice2 = addMenu();
                    String name;
                    boolean flag;
                    switch (choice2)
                    {
                        case 1:
                            System.out.println("What is the name of the place you would like to add?");
                            name = scanner.nextLine();
                            flag = false;
                            for (Place p : places)
                            {
                                if (p.getName().equals(name))
                                {
                                    flag = true;
                                    System.out.println("This place already exists");
                                    break;
                                }
                            }
                            if (!flag)
                            {
                                places.add(new Place(name));
                            }
                            break;
                        case 2:
                            System.out.println("What is the name of the department you would like to add?");
                            name = scanner.nextLine();
                            flag = false;
                            for (Department d : departments)
                            {
                                if (d.getName().equals(name))
                                {
                                    flag = true;
                                    System.out.println("This department already exists");
                                    break;
                                }
                            }
                            if (!flag)
                            {
                                System.out.println("What place does your department belong to?");
                                String placeName = scanner.nextLine();
                                for (Place p : places)
                                {
                                    if (p.getName().equals(placeName))
                                    {
                                        departments.add(new Department(name, new Place(placeName)));
                                    }
                                }
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            choice = menu();
                            break;
                    }
                    break;
                case 2:
                    choice2 = searchMenu();
                    switch (choice2)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            choice = menu();
                            break;
                    }
                    break;
            }
        }
    }

    private static int menu()
    {
        System.out.println("1. Add");
        System.out.println("2. Search");
        System.out.println("3. Exit");
        return getInput(1, 3);
    }

    private static int addMenu()
    {
        System.out.println("1. Add place");
        System.out.println("2. Add department");
        System.out.println("3. Add course");
        System.out.println("4. Add classroom");
        System.out.println("5. Add lecture");
        System.out.println("6. Back");
        return getInput(1,6);
    }

    private static int searchMenu()
    {
        System.out.println("1. Find available classrooms");
        System.out.println("2. Find classroom schedule");
        System.out.println("3. Back");
        return getInput(1,3);

    }

    private static int getInput(int min, int max)
    {
        int choice;
        while (true)
        {
            String selection = scanner.nextLine();
            try
            {
                choice = Integer.parseInt(selection);
                if (choice < min || choice > max)
                {
                    System.out.println("Please enter a number from 1 to 6");
                    continue;
                }
                return choice;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please enter a number from 1 to 6");
            }
        }
    }
}
