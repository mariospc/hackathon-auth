public class Course
{
    //private Long id;
    private String name;
    private Department department;

    public Course()
    {
        name = "";
        department = null;
    }

    public Course(String name, Department department)
    {
        this.name = name;
        this.department = department;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }
}
