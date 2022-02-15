

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.util.Vector;

public class Registry extends Applet
    implements ActionListener
{

    public Registry()
    {
        f = new Font("Courier", 1, 10);
        ff = new Font("SansSerif", 0, 10);
        fff = new Font("SansSerif", 1, 11);
        background = new Color(192, 192, 192);
        lightbackg = new Color(230, 230, 230);
        green = new Color(0, 160, 0);
        blue = new Color(50, 50, 220);
        brown = new Color(100, 60, 30);
        white = new Color(255, 255, 255);
        red = new Color(255, 100, 100);
        lblue = new Color(200, 200, 255);
        messTL = new Label("MESSAGES", 0);
        studIDTL = new Label("STUDENT ID", 2);
        firstTL = new Label("FIRST NAME", 2);
        lastTL = new Label("LAST NAME", 2);
        addressTL = new Label("ADDRESS", 2);
        cityTL = new Label("CITY", 2);
        provinceTL = new Label("PROVINCE", 2);
        pcodeTL = new Label("P.CODE", 2);
        phoneTL = new Label("PHONE", 2);
        emailTL = new Label("E-MAIL", 2);
        nccTL = new Label("NUMBER OF COURSES COMPLETED", 2);
        courIDTL = new Label("COURSE ID", 2);
        cnameTL = new Label("COURSE NAME", 2);
        coordTL = new Label("COORDINATOR", 2);
        nspTL = new Label("NUMBER OF STUDENTS PASSED", 2);
        studAveTL = new Label("STUDENT'S AVERAGE GRADE", 2);
        studGradeTL = new Label("STUDENT'S GRADE", 2);
        courAveTL = new Label("AVERAGE GRADE IN COURSE", 2);
        student = null;
        course = null;
        studMode = false;
        courMode = false;
    }

    public void init()
    {
        setBackground(background);
        setLayout(new BorderLayout(0, 12));
        setFont(f);
        makeButtons();
        makeTFS();
        Panel panel = makePanel(new BorderLayout(3, 0), background);
        Panel panel1 = makePanel(new BorderLayout(3, 0), background);
        Panel panel2 = makePanel(new GridLayout(6, 1, 3, 5), background);
        Panel panel3 = makePanel(new GridLayout(6, 1, 3, 5), background);
        Panel panel4 = makePanel(new BorderLayout(3, 0), background);
        panel4.add(studTotTF, "South");
        panel4.add(studBakB, "West");
        panel4.add(studB, "Center");
        panel4.add(studForB, "East");
        Panel panel5 = makePanel(new BorderLayout(3, 0), background);
        panel5.add(courTotTF, "South");
        panel5.add(courBakB, "West");
        panel5.add(courB, "Center");
        panel5.add(courForB, "East");
        panel.add(panel4, "West");
        panel.add(clearB, "Center");
        panel.add(panel5, "East");
        add(panel, "North");
        Panel panel6 = makePanel(new FlowLayout(0, 0, 0), background);
        Panel panel7 = makePanel(new FlowLayout(0, 0, 0), background);
        Panel panel8 = makePanel(new FlowLayout(0, 0, 0), background);
        Panel panel9 = makePanel(new FlowLayout(0, 0, 0), background);
        Panel panel10 = makePanel(new FlowLayout(0, 0, 0), background);
        Panel panel11 = makePanel(new FlowLayout(0, 0, 0), background);
        panel6.add(studIDTL);
        panel6.add(studIDTF);
        panel6.add(studFindB);
        panel7.add(lastTL);
        panel7.add(lastTF);
        panel7.add(firstTL);
        panel7.add(firstTF);
        panel8.add(addressTL);
        panel8.add(addressTF);
        panel9.add(cityTL);
        panel9.add(cityTF);
        panel9.add(provinceTL);
        panel9.add(provinceTF);
        panel9.add(pcodeTL);
        panel9.add(pcodeTF);
        panel10.add(phoneTL);
        panel10.add(phoneTF);
        panel10.add(emailTL);
        panel10.add(emailTF);
        panel11.add(nccTL);
        panel11.add(nccTF);
        panel2.add(panel6);
        panel2.add(panel7);
        panel2.add(panel8);
        panel2.add(panel9);
        panel2.add(panel10);
        panel2.add(panel11);
        add(panel2, "West");
        Panel panel12 = makePanel(new FlowLayout(0, 2, 0), background);
        Panel panel13 = makePanel(new FlowLayout(0, 2, 0), background);
        Panel panel14 = makePanel(new FlowLayout(0, 2, 0), background);
        Panel panel15 = makePanel(new FlowLayout(0, 2, 0), background);
        Panel panel16 = makePanel(new FlowLayout(0, 2, 0), background);
        Panel panel17 = makePanel(new FlowLayout(0, 2, 0), background);
        panel12.add(courIDTL);
        panel12.add(courIDTF);
        panel12.add(courFindB);
        panel13.add(new Label(" "));
        panel14.add(cnameTL);
        panel14.add(cnameTF);
        panel15.add(new Label(" "));
        panel16.add(coordTL);
        panel16.add(coordTF);
        panel17.add(nspTL);
        panel17.add(nspTF);
        panel3.add(panel12);
        panel3.add(panel13);
        panel3.add(panel14);
        panel3.add(panel15);
        panel3.add(panel16);
        panel3.add(panel17);
        add(panel3, "East");
        Panel panel18 = makePanel(new BorderLayout(0, 0), background);
        Panel panel19 = makePanel(new FlowLayout(0), background);
        panel19.add(studAveTL);
        panel19.add(studAveTF);
        Panel panel20 = makePanel(new FlowLayout(1), background);
        panel20.add(studGradeTL);
        panel20.add(studGradeTF);
        Panel panel21 = makePanel(new FlowLayout(0), background);
        panel21.add(courAveTL);
        panel21.add(courAveTF);
        panel18.add(panel19, "West");
        panel18.add(panel20, "Center");
        panel18.add(panel21, "East");
        Panel panel22 = makePanel(new FlowLayout(1, 0, 4), background);
        panel22.add(messTL);
        panel22.add(messTF);
        panel1.add(panel18, "North");
        panel1.add(new Label(" "), "Center");
        panel1.add(panel22, "South");
        add(panel1, "South");
        try
        {
            studMaster = new StudList("students.txt");
            courMaster = new CourList("courses.txt");
            markMaster = new MarkList("marks.txt");
        }
        catch(Exception exception)
        {
            studMaster = new StudList(new Vector());
            courMaster = new CourList(new Vector());
            markMaster = new MarkList(new Vector());
            messTF.setText("Problems with reading the database.");
        }
        clearRegi();
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        Object obj = actionevent.getSource();
        if(obj == clearB)
            clearRegi();
        else
        if(obj == studB)
            handleStudB();
        else
        if(obj == courB)
            handleCourB();
        else
        if(studMode || courMode)
            if(obj == studBakB)
                handleStudBakB();
            else
            if(obj == studForB)
                handleStudForB();
            else
            if(obj == courBakB)
                handleCourBakB();
            else
            if(obj == courForB)
                handleCourForB();
    }

    public void handleStudBakB()
    {
        if(studList.size() > 1)
        {
            sIndex--;
            if(sIndex < 0)
                sIndex += studList.size();
            if(studMode)
                displayStudent();
            else
                displayStud();
        }
    }

    public void handleStudForB()
    {
        if(studList.size() > 1)
        {
            sIndex++;
            if(sIndex == studList.size())
                sIndex = 0;
            if(studMode)
                displayStudent();
            else
                displayStud();
        }
    }

    public void handleCourBakB()
    {
        if(courList.size() > 1)
        {
            cIndex--;
            if(cIndex < 0)
                cIndex += courList.size();
            if(courMode)
                displayCourse();
            else
                displayCour();
        }
    }

    public void handleCourForB()
    {
        if(courList.size() > 1)
        {
            cIndex++;
            if(cIndex == courList.size())
                cIndex = 0;
            if(courMode)
                displayCourse();
            else
                displayCour();
        }
    }

    public void handleStudB()
    {
        clearRegi();
        setStudButtsBcolor(green);
        setCourButtsBcolor(brown);
        studMode = true;
        courMode = false;
        studList = studMaster;
        studTotTF.setText(centerString(studTotTF.getColumns(), "A TOTAL OF " + studList.size()));
        if(studList.size() > 0)
        {
            sIndex = 0;
            displayStudent();
        } else
        {
            courList = new CourList(new Vector());
            messTF.setText("There are no students in any of the courses.");
        }
    }

    public void handleCourB()
    {
        clearRegi();
        setCourButtsBcolor(green);
        setStudButtsBcolor(brown);
        courMode = true;
        studMode = false;
        courList = courMaster;
        courTotTF.setText(centerString(courTotTF.getColumns(), "A TOTAL OF " + courList.size()));
        if(courList.size() > 0)
        {
            cIndex = 0;
            displayCourse();
        } else
        {
            studList = new StudList(new Vector());
            messTF.setText("There are no courses to show.");
        }
    }

    public void clearRegi()
    {
        studList = null;
        courList = null;
        markListOfS = null;
        sIndex = -1;
        cIndex = -1;
        mIndex = -1;
        studMode = false;
        courMode = false;
        clearStudTexts();
        setStudButtsBcolor(brown);
        clearCourTexts();
        setCourButtsBcolor(brown);
        messTF.setText("Applet Registry has been cleared.");
        studTotTF.setText(centerString(studTotTF.getColumns(), "A TOTAL OF " + studMaster.size()));
        courTotTF.setText(centerString(courTotTF.getColumns(), "A TOTAL OF " + courMaster.size()));
    }

    public void clearStudTexts()
    {
        clearText(studIDTF, lightbackg);
        clearText(firstTF, lightbackg);
        clearText(lastTF, lightbackg);
        clearText(addressTF, lightbackg);
        clearText(cityTF, lightbackg);
        clearText(provinceTF, lightbackg);
        clearText(pcodeTF, lightbackg);
        clearText(phoneTF, lightbackg);
        clearText(emailTF, lightbackg);
        clearText(nccTF, lightbackg);
        clearText(studTotTF, background);
        clearScoreTexts();
    }

    public void clearScoreTexts()
    {
        clearText(studAveTF, lightbackg);
        clearText(studGradeTF, lightbackg);
        clearText(courAveTF, lightbackg);
    }

    public void clearCourTexts()
    {
        clearText(courIDTF, lightbackg);
        clearText(cnameTF, lightbackg);
        clearText(coordTF, lightbackg);
        clearText(nspTF, lightbackg);
        clearText(courTotTF, background);
        clearScoreTexts();
    }

    public void display9()
    {
        studIDTF.setText(" " + student.getID());
        firstTF.setText(" " + student.getFirst());
        lastTF.setText(" " + student.getLast());
        addressTF.setText(" " + student.getAddr());
        cityTF.setText(" " + student.getCity());
        provinceTF.setText(" " + student.getProv());
        pcodeTF.setText(" " + student.getPcode());
        phoneTF.setText(" " + student.getPhone());
        emailTF.setText(" " + student.getEmail());
    }

    public void displayStudent()
    {
        student = studList.getStud(sIndex);
        markListOfS = markMaster.makeSubList(student);
        clearCourTexts();
        courTotTF.setText(centerString(courTotTF.getColumns(), "COMPLETED BY STUDENT " + student.getID()));
        ncc = markListOfS.size();
        courList = courMaster.makeSubList(markListOfS);
        display9();
        nccTF.setText(" " + Integer.toString(ncc));
        if(ncc != 0)
        {
            messTF.setText("");
            cIndex = 0;
            studAveTF.setText(" " + round1(markListOfS.getAveScore()));
            displayCour();
        } else
        {
            messTF.setText("This student has completed none of the courses.");
        }
    }

    public void displayCour()
    {
        course = courList.getCour(cIndex);
        markListOfC = markMaster.makeSubList(course);
        nsp = markListOfC.size();
        display3();
        nspTF.setText(" " + Integer.toString(nsp));
        courAveTF.setText(" " + round1(markListOfC.getAveScore()));
        studGradeTF.setText(" " + round1(markListOfS.getScore(course.getID(), true)));
    }

    public void display3()
    {
        courIDTF.setText(" " + course.getID());
        cnameTF.setText(" " + course.getName());
        coordTF.setText(" " + course.getCoord());
    }

    public void displayCourse()
    {
        course = courList.getCour(cIndex);
        markListOfC = markMaster.makeSubList(course);
        clearStudTexts();
        studTotTF.setText(centerString(studTotTF.getColumns(), "WHO HAVE COMPLETED " + course.getID()));
        nsp = markListOfC.size();
        studList = studMaster.makeSubList(markListOfC);
        display3();
        nspTF.setText(" " + Integer.toString(nsp));
        if(nsp > 0)
        {
            messTF.setText("");
            sIndex = 0;
            courAveTF.setText(" " + round1(markListOfC.getAveScore()));
            displayStud();
        } else
        {
            messTF.setText("None of the students completed this course.");
        }
    }

    public void displayStud()
    {
        student = studList.getStud(sIndex);
        markListOfS = markMaster.makeSubList(student);
        ncc = markListOfS.size();
        display9();
        nccTF.setText(" " + Integer.toString(ncc));
        studAveTF.setText(" " + round1(markListOfS.getAveScore()));
        studGradeTF.setText(" " + round1(markListOfC.getScore(student.getID(), false)));
    }

    public void setStudButtsBcolor(Color color)
    {
        studB.setBackground(color);
        studBakB.setBackground(color);
        studForB.setBackground(color);
        studFindB.setBackground(color);
    }

    public void setCourButtsBcolor(Color color)
    {
        courB.setBackground(color);
        courBakB.setBackground(color);
        courForB.setBackground(color);
        courFindB.setBackground(color);
    }

    public void clearText(TextField textfield, Color color)
    {
        textfield.setText("");
        textfield.setBackground(color);
        textfield.setEditable(false);
    }

    public void start()
    {
        appletWidth = 630;
        appletHeight = 380;
    }

    public void paint(Graphics g)
    {
        setSize(appletWidth, appletHeight);
        validate();
    }

    private double round1(double d)
    {
        return Math.floor(10D * d + 0.5D) / 10D;
    }

    private Button makeButton(String s, Color color, Color color1, Font font)
    {
        Button button = new Button(s);
        button.setBackground(color);
        button.setForeground(color1);
        button.setFont(font);
        button.addActionListener(this);
        return button;
    }

    private Panel makePanel(LayoutManager layoutmanager, Color color)
    {
        Panel panel = new Panel();
        panel.setLayout(layoutmanager);
        panel.setBackground(color);
        return panel;
    }

    private TextField makeTF(String s, int i, Color color, boolean flag)
    {
        TextField textfield = new TextField(s, i);
        textfield.setFont(ff);
        textfield.setBackground(color);
        textfield.setEditable(flag);
        return textfield;
    }

    private void makeTFS()
    {
        studTotTF = makeTF("", 53, background, false);
        courTotTF = makeTF("", 33, background, false);
        studIDTF = makeTF("", 7, lightbackg, false);
        firstTF = makeTF("", 11, lightbackg, false);
        lastTF = makeTF("", 13, lightbackg, false);
        addressTF = makeTF("", 42, lightbackg, false);
        cityTF = makeTF("", 11, lightbackg, false);
        provinceTF = makeTF("", 2, lightbackg, false);
        pcodeTF = makeTF("", 5, lightbackg, false);
        phoneTF = makeTF("", 12, lightbackg, false);
        emailTF = makeTF("", 20, lightbackg, false);
        nccTF = makeTF("", 2, lightbackg, false);
        courIDTF = makeTF("", 7, lightbackg, false);
        cnameTF = makeTF("", 19, lightbackg, false);
        coordTF = makeTF("", 19, lightbackg, false);
        nspTF = makeTF("", 2, lightbackg, false);
        studAveTF = makeTF("", 3, lightbackg, false);
        studGradeTF = makeTF("", 3, lightbackg, false);
        courAveTF = makeTF("", 3, lightbackg, false);
        messTF = makeTF("", 89, lblue, false);
        messTF.setFont(fff);
    }

    private void makeButtons()
    {
        clearB = makeButton("C L E A R", blue, white, f);
        clearB.setSize(10, 60);
        studBakB = makeButton("<-", green, white, f);
        courBakB = makeButton("<-", brown, white, f);
        studB = makeButton("S T U D E N T S", green, white, f);
        courB = makeButton("C O U R S E S", brown, white, f);
        studForB = makeButton("->", green, white, f);
        courForB = makeButton("->", brown, white, f);
        studFindB = makeButton("F I N D", green, white, f);
        courFindB = makeButton("F I N D", brown, white, f);
    }

    private String centerString(int i, String s)
    {
        int j = i - s.length();
        if(j > 0)
            return getBlanks(j) + s;
        else
            return s;
    }

    private String getBlanks(int i)
    {
        String s = "";
        for(int j = 0; j < i; j++)
            s = s + " ";

        return s;
    }

    private Font f;
    private Font ff;
    private Font fff;
    private int appletWidth;
    private int appletHeight;
    private Button studB;
    private Button courB;
    private Button studBakB;
    private Button courBakB;
    private Button studForB;
    private Button courForB;
    private Button clearB;
    private Button studFindB;
    private Button courFindB;
    private Color background;
    private Color lightbackg;
    private Color green;
    private Color blue;
    private Color brown;
    private Color white;
    private Color red;
    private Color lblue;
    private Label messTL;
    private Label studIDTL;
    private Label firstTL;
    private Label lastTL;
    private Label addressTL;
    private Label cityTL;
    private Label provinceTL;
    private Label pcodeTL;
    private Label phoneTL;
    private Label emailTL;
    private Label nccTL;
    private Label courIDTL;
    private Label cnameTL;
    private Label coordTL;
    private Label nspTL;
    private Label studAveTL;
    private Label studGradeTL;
    private Label courAveTL;
    private TextField studTotTF;
    private TextField courTotTF;
    private TextField studIDTF;
    private TextField firstTF;
    private TextField lastTF;
    private TextField addressTF;
    private TextField cityTF;
    private TextField provinceTF;
    private TextField pcodeTF;
    private TextField phoneTF;
    private TextField emailTF;
    private TextField nccTF;
    private TextField messTF;
    private TextField courIDTF;
    private TextField cnameTF;
    private TextField coordTF;
    private TextField nspTF;
    private TextField studAveTF;
    private TextField studGradeTF;
    private TextField courAveTF;
    private StudList studMaster;
    private StudList studList;
    private CourList courMaster;
    private CourList courList;
    private MarkList markMaster;
    private MarkList markListOfS;
    private MarkList markListOfC;
    private int sIndex;
    private int cIndex;
    private int mIndex;
    private int ncc;
    private int nsp;
    private Student student;
    private Course course;
    private boolean studMode;
    private boolean courMode;
}