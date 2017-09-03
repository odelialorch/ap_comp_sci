------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask12
VERSION or DATE: 10/5/2016
AUTHORS: Odelia Lorch

III. Two Meanings of +

1. b)
'8 plus 5 is 85' - The computer evaluated this statement from left to right, so 
    because the first term was a String, the second two are converted to Strings 
    and concatenated.
'8 plus 5 is 13' - The computer evaluated this statement first in the parentheses,
    so it added 5 and 8 arithmetically. It then went from left to right, and 
    because the first term was a String, converted the second term (the sum)
    to a String and concatenated.
'13 equals 8 plus 5' - The computer evaluated this statement from left to right, 
    and because the first two terms were numbers, added them arithmetically, and
    then converted them to Strings to concatenate with the last String.

c) A space can be added at the end of the first String and beginning of the last 
    String of that statement (still within the quotation marks), to added spaces
    around the number 55