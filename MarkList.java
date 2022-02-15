// Decompiled by DJ v3.2.2.67 Copyright 2002 Atanas Neshkov  Date: 30/09/02 10:56:02 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MarkList.java

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class MarkList
{

    public MarkList(Vector vector)
    {
        markVec = vector;
    }

    public MarkList(String s)
        throws Exception
    {
        markVec = new Vector();
        BufferedReader bufferedreader = null;
        bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        for(Mark mark = Mark.read(bufferedreader); mark != null; mark = Mark.read(bufferedreader))
            markVec.addElement(mark);

    }

    public MarkList makeSubList(Student student)
    {
        Vector vector = new Vector();
        for(Enumeration enumeration = elements(); enumeration.hasMoreElements();)
        {
            Mark mark = (Mark)enumeration.nextElement();
            if(student.getID().equals(mark.getStudID()))
                vector.addElement(mark);
        }

        return new MarkList(vector);
    }

    public MarkList makeSubList(Course course)
    {
        Vector vector = new Vector();
        for(Enumeration enumeration = elements(); enumeration.hasMoreElements();)
        {
            Mark mark = (Mark)enumeration.nextElement();
            if(course.getID().equals(mark.getCourID()))
                vector.addElement(mark);
        }

        return new MarkList(vector);
    }

    public double getScore(String s, boolean flag)
    {
        Enumeration enumeration = markVec.elements();
        boolean flag1 = true;
        Mark mark = null;
        while(flag1 && enumeration.hasMoreElements()) 
        {
            mark = (Mark)enumeration.nextElement();
            if(s.equals(flag ? ((Object) (mark.getCourID())) : ((Object) (mark.getStudID()))))
                flag1 = false;
        }
        return mark.getScore();
    }

    public double getAveScore()
    {
        double d = 0.0D;
        for(Enumeration enumeration = markVec.elements(); enumeration.hasMoreElements();)
            d += ((Mark)enumeration.nextElement()).getScore();

        return size() != 0 ? d / (double)size() : d;
    }

    public Enumeration elements()
    {
        return markVec.elements();
    }

    public int size()
    {
        return markVec.size();
    }

    private Vector markVec;
}