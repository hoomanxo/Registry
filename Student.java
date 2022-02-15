// Decompiled by DJ v3.2.2.67 Copyright 2002 Atanas Neshkov  Date: 30/09/02 10:59:30 PM
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Student.java

import java.io.BufferedReader;

public class Student
{

    public Student(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8)
    {
        studID = s;
        first = s1;
        last = s2;
        addr = s3;
        city = s4;
        prov = s5;
        pcode = s6;
        phone = s7;
        email = s8;
    }

    public String getID()
    {
        return studID;
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast()
    {
        return last;
    }

    public String getAddr()
    {
        return addr;
    }

    public String getCity()
    {
        return city;
    }

    public String getProv()
    {
        return prov;
    }

    public String getPcode()
    {
        return pcode;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public static Student read(BufferedReader bufferedreader)
        throws Exception
    {
        String s = bufferedreader.readLine();
        if(s == null)
        {
            return null;
        } else
        {
            String s2 = bufferedreader.readLine();
            String s1 = bufferedreader.readLine();
            String s3 = bufferedreader.readLine();
            String s4 = bufferedreader.readLine();
            String s5 = bufferedreader.readLine();
            String s6 = bufferedreader.readLine();
            String s7 = bufferedreader.readLine();
            String s8 = bufferedreader.readLine();
            return new Student(s, s1, s2, s3, s4, s5, s6, s7, s8);
        }
    }

    private String studID;
    private String first;
    private String last;
    private String addr;
    private String city;
    private String prov;
    private String pcode;
    private String phone;
    private String email;
}