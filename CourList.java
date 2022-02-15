/ Decompiled by DJ v3.2.2.67 Copyright 2002 Atanas Neshkov  Date: 30/09/02 10:50:40 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   CourList.java

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class CourList
{

    public CourList(Vector vector)
    {
        courseVec = vector;
    }

    public CourList(String s)
        throws Exception
    {
        courseVec = new Vector();
        BufferedReader bufferedreader = null;
        bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        for(Course course = Course.read(bufferedreader); course != null; course = Course.read(bufferedreader))
            courseVec.addElement(course);

    }

    public CourList makeSubList(MarkList marklist)
    {
        Vector vector = new Vector();
        Mark mark;
        for(Enumeration enumeration = marklist.elements(); enumeration.hasMoreElements(); vector.addElement(getCour(mark.getCourID())))
            mark = (Mark)enumeration.nextElement();

        return new CourList(vector);
    }

    public Course getCour(int i)
    {
        return (Course)courseVec.elementAt(i);
    }

    public Course getCour(String s)
    {
        Course course = null;
        boolean flag = true;
        for(Enumeration enumeration = courseVec.elements(); flag && enumeration.hasMoreElements();)
        {
            course = (Course)enumeration.nextElement();
            if(s.equals(course.getID()))
                flag = false;
        }

        if(flag)
            return null;
        else
            return course;
    }

    public int size()
    {
        return courseVec.size();
    }

    private Vector courseVec;
}