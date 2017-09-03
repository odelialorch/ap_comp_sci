------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask25
VERSION or DATE: 22 November 2016
AUTHORS: Odelia Lorch

MULTIPLE CHOICE:
4.4. a. formal parameters
4.5. e. 27
4.6. d. more than one method with the same name

TRUE OR FALSE:
4.5. true

SHORT ANSWER:
4.16. 
public static String multiConcat(String str, int count)
{
    if (count < 2)
        return str;
    else
    {    
        newStr = "";
        for (i = count; i > 0; i--)
        {
            newStr += str;
        }
        return newStr;
    }
}
4.17.
public static String multiConcat(String str)
{
    newStr = str + str;
    return newStr;
}

PROGRAMMING PROJECTS:
4.1, 4.2: see Account and Banking class
