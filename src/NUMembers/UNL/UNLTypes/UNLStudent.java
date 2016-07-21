/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers.UNL.UNLTypes;
import NUMembers.UNL.UNLMember;
public class UNLStudent extends UNLMember
{
    private double balance;
    private int credits;
    private double GPA;

    public UNLStudent(String name, int NUID, String myUNLID, double balance, int credits, double GPA)
    {
        super(name, NUID, myUNLID);
        setBalance(balance);
        setCredits(credits);
        setGPA(GPA);
    }

    public void setBalance(double balance)
    {
        this.balance = Math.max(0, balance);
    }

    public void setCredits(int credits)
    {
        this.credits = Math.max(0, credits);
    }

    public void setGPA(double GPA)
    {
        if(GPA > 4 || GPA < 0)
        {
            this.GPA = 0;
        }
        else
        {
            this.GPA = GPA;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s" +
                             "Balance: $%.2f\n" +
                             "Credits: %d\n" +
                             "GPA: %.2f",
                              super.toString(), balance, credits, GPA);
    }
}

