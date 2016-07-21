/**
 * Created by Marcus on 7/21/2016.
 */
package NUMembers;
public class UniversityNebraskaMember
{
    private String name;
    private int NUID;
    private String city;

    public UniversityNebraskaMember(String name, int NUID, String city)
    {
        setName(name);
        setNUID(NUID);
        setCity(city);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setNUID(int NUID)
    {
        if(NUID < 10000000 || NUID > 99999999)
        {
            this.NUID = -1;
        }
        else
        {
            this.NUID = NUID;
        }
    }

    @Override
    public String toString()
    {
        if(NUID == -1)
        {
            return String.format("Name: %s\n" +
                                 "NUID: NOT SET\n" +
                                 "Campus Location: %s\n",
                                  name, city);
        }
        else
        {
            return String.format("Name: %s\n" +
                                 "NUID: %d\n" +
                                 "Campus Location: %s\n",
                                  name, NUID, city);
        }
    }
}
