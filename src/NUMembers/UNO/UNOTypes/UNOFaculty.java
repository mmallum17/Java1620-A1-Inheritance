/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers.UNO.UNOTypes;
import NUMembers.UNO.UNOMember;
public class UNOFaculty extends UNOMember
{
    private String department;
    private String title;
    private double salary;

    public UNOFaculty(String name, int NUID, String netID, String department, String title, double salary)
    {
        super(name, NUID, netID);
        setDepartment(department);
        setTitle(title);
        setSalary(salary);
    }

    public void setDepartment(String department)
    {
        if(department == null)
        {
            this.department = "NOT SET";
        }
        else
        {
            this.department = department;
        }
    }

    public void setTitle(String title)
    {
        if(title == null)
        {
            this.title = "NOT SET";
        }
        else
        {
            this.title = title;
        }
    }

    public void setSalary(double salary)
    {
        if(salary < 23660)
        {
            this.salary = -1;
        }
        else
        {
            this.salary = salary;
        }
    }

    @Override
    public String toString()
    {
        if(salary == -1)
        {
            return String.format("%s" +
                                 "Department: %s\n" +
                                 "Title: %s\n" +
                                 "Salary: NOT SET",
                                  super.toString(), department, title);
        }
        else
        {
            return String.format("%s" +
                                 "Department: %s\n" +
                                 "Title: %s\n" +
                                 "Salary: $%.2f",
                                  super.toString(), department, title, salary);
        }
    }
}
