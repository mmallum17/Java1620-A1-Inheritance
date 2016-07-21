/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers.UNL;
import NUMembers.UniversityNebraskaMember;
public class UNLMember extends UniversityNebraskaMember
{
    private String myUNLID;

    public UNLMember(String name, int NUID, String myUNLID)
    {
        super(name, NUID, "Lincoln");
        setMyUNLID(myUNLID);
    }

    public void setMyUNLID(String myUNLID)
    {
        if(myUNLID == null)
        {
            this.myUNLID = "NOT SET";
        }
        else
        {
            this.myUNLID = myUNLID;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s" +
                             "MyUNLID: %s\n", super.toString(), myUNLID);
    }
}
