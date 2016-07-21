/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers.UNO.UNOTypes;
import NUMembers.UNO.UNOMember;
public class UNOStudent extends UNOMember
{
    private double balance;
    private int credits;
    private double GPA;

    public UNOStudent(String name, int NUID, String netID, double balance, int credits, double GPA)
    {
        super(name, NUID, netID);
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
