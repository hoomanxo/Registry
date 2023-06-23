

import java.io.BufferedReader;

public class Course
{

    public Course(String s, String s1, String s2)
    {
        courID = s;
        name = s1;
        coord = s2;
    }

    public static Course read(BufferedReader bufferedreader)
        throws Exception
    {
        String s = bufferedreader.readLine();
        if(s == null)
        {
            return null;
        } else
        {
            String s1 = bufferedreader.readLine();
            String s2 = bufferedreader.readLine();
            return new Course(s, s1, s2);
        }
    }

    public String getID()
    {
        return courID;
    }

    public String getName()
    {
        return name;
    }

    public String getCoord()
    {
        return coord;
    }

    private String courID;
    private String name;
    private String coord;
}