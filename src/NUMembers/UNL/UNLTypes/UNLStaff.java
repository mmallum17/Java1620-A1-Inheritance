/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers.UNL.UNLTypes;
import NUMembers.UNL.UNLMember;
public class UNLStaff extends UNLMember
{
    private String position;
    private double wage;

    public UNLStaff(String name, int NUID, String myUNLID, String position, double wage)
    {
        super(name, NUID, myUNLID);
        setPosition(position);
        setWage(wage);
    }

    public void setPosition(String position)
    {
        if(position == null)
        {
            this.position = "NOT SET";
        }
        else
        {
            this.position = position;
        }
    }

    public void setWage(double wage)
    {
        if(wage < 9.00)
        {
            this.wage = -1;
        }
        else
        {
            this.wage = wage;
        }
    }

    @Override
    public String toString()
    {
        if(wage == -1)
        {
            return String.format("%s" +
                                 "Position: %s\n" +
                                 "Wage: NOT SET",
                                  super.toString(), position);
        }
        else
        {
            return String.format("%s" +
                                 "Position: %s\n" +
                                 "Wage: $%.2f",
                                  super.toString(), position, wage);
        }
    }
}

