------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask28
VERSION or DATE: 11/30/16
AUTHORS: Odelia Lorch

TRUE OR FALSE:
4.6. True. These are called aggregate objects.
4.7. False. Multiple objects made from the same class are associated objects.
4.8. False. In this case, they wouldn't be accessible from outside the class.
4.9. True. Constructors just instantiate the instance data variables.
4.10. False. Parameters can be Strings or other objects.

SHORT ANSWER:
4.21.
public void setFaceValue(int face)
{
    if (face <= numFaces)
        faceValue = face;
    else
        faceValue = 1;        
}
4.23.
public int randomInRange(int bottom, int top)
{
    Random random = new Random();
    if (top >= bottom)
        int num = random.nextInt((top-bottom)) + bottom;
    else
        int num = 0;
    return num;
}
