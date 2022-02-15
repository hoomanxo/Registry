/ Decompiled by DJ v3.2.2.67 Copyright 2002 Atanas Neshkov  Date: 30/09/02 10:52:30 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Course.java

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