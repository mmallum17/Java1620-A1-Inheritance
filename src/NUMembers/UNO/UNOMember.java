/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers.UNO;
import NUMembers.UniversityNebraskaMember;
public class UNOMember extends UniversityNebraskaMember
{
    private String netID;

    public UNOMember(String name, int NUID, String netID)
    {
        super(name, NUID, "Omaha");
        setNetID(netID);
    }

    public void setNetID(String netID)
    {
        if(netID == null)
        {
            this.netID = "NOT SET";
        }
        else
        {
            this.netID = netID;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s" +
                             "NetID: %s\n", super.toString(), netID);
    }
}
