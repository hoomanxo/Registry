// Decompiled by DJ v3.2.2.67 Copyright 2002 Atanas Neshkov  Date: 30/09/02 10:54:27 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Mark.java

import java.io.BufferedReader;

public class Mark
{

    public Mark(String s, String s1, double d)
    {
        studID = s;
        courID = s1;
        score = d;
    }

    public static Mark read(BufferedReader bufferedreader)
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
            double d = Double.valueOf(s2).doubleValue();
            return new Mark(s, s1, d);
        }
    }

    public String getStudID()
    {
        return studID;
    }

    public String getCourID()
    {
        return courID;
    }

    public double getScore()
    {
        return score;
    }

    private String studID;
    private String courID;
    private double score;
}