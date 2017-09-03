------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask29
VERSION or DATE: 12/2/16
AUTHORS: Odelia Lorch

AP MULTIPLE CHOICE:
4.5. e. Returns j if k and j are equal, k otherwise
4.6. b. 5 5

AP FREE RESPONSE:
4.1.
a)
// instance variables
private String myCode;
private final String MYCODE;

public Code(String code)
{
    myCode = code;
    MYCODE = code;
}

b) 
public void hide(int p1, int p2)
{
    for (int i = p1; i < p2; i++)
    {
        myCode = myCode.substring(0,i) + 'X' + myCode.substring(i+1);
    }
}

c) 
public void recover(int p1, int p2)
{
    myCode = myCode.substring(0,p1) + MYCODE.substring(p1,p2) + myCode.substring(p2);
}