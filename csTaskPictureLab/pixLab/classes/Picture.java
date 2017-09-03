import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set the red and green to 0 */
  public void keepOnlyBlue()
  { 
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    { 
      for (Pixel pixelObj : rowArray)
      { 
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to negate all pixels in a picture */
  public void negate()
  { 
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    { 
      for (Pixel pixelObj : rowArray)
      { 
          pixelObj.setBlue(255-pixelObj.getBlue());   
          pixelObj.setRed(255-pixelObj.getRed());
          pixelObj.setGreen(255-pixelObj.getGreen());
      }
    }
  }
  
  /** Method to turn a picture to grayscale */
  public void grayscale()
  { 
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    { 
      for (Pixel pixelObj : rowArray)
      { 
          int value = (int) pixelObj.getAverage();
          pixelObj.setBlue(value);
          pixelObj.setGreen(value);
          pixelObj.setRed(value);
      }
    }
  }
  
  /** Method to fix an underwater picture */
  public void fixUnderwater()
  { 
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    { 
      for (Pixel pixelObj : rowArray)
      { 
          if (pixelObj.getGreen() > pixelObj.getBlue())
          {
              int val = (int) pixelObj.getAverage();
              pixelObj.setGreen(val);
              pixelObj.setBlue(val);
              pixelObj.setRed(val);
          }
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from right to left */
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from top to bottom */
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int length = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < length / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[length-1-row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from bottom to top */
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int length = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < length / 2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[length-1-row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors a square part of the picture around a 
      diagonal mirror from bottom left to top right*/
  public void mirrorDiagonal()
  {
      Pixel[][] pixels = this.getPixels2D();
      int sidelength;
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      if (pixels.length < pixels[0].length)
        sidelength = pixels.length;
      else
        sidelength = pixels[0].length;
      for (int row = 0; row < sidelength; row++)
      {
          for (int col = 0; col <= row; col ++)
          {
              bottomPixel = pixels[row][col];
              topPixel = pixels[col][row];
              topPixel.setColor(bottomPixel.getColor());
          }
      }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  /** Mirror just part of a picture of a snowman to give it four arms */
  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    for (int col = 105; col <= 170; col++)
    {
      for (int row = 160; row < mirrorPoint; row++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    for (int col = 238; col <= 295; col++)
    {
      for (int row = 170; row < mirrorPoint; row++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  /** Mirror just part of a picture of a beach so there are two seagulls */
  public void mirrorGull()
  {
    int mirrorPoint = 345;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 235; row <= 340; row++)
    {
      for (int col = 235; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** copy from part of the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param toStartRow the start row to copy to
    * @param toStartCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol, 
                    int toStartRow, int toStartCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startRow, toRow = toStartRow; 
         fromRow < endRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = startCol, toCol = toStartCol; 
           fromCol < endCol &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  /** Method to create a collage of several pictures */
  public void myCollage()
  {
    Picture moon = new Picture("moon-surface.jpg");
    moon.mirrorVerticalRightToLeft();
    Picture swan = new Picture("swan.jpg");
    swan.mirrorDiagonal();
    Picture flowerNoBlue = new Picture("whiteFlower.jpg");
    flowerNoBlue.zeroBlue();
    this.copy(moon,0,0);
    this.copy(swan,67,280,74,390,300,400);
    this.copy(swan,67,280,74,390,300,50);
    this.copy(flowerNoBlue,100,265,280,445,150,250);
    this.mirrorHorizontalBotToTop();
    this.write("myCollage.jpg");
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color botColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[row+1][col];
        botColor = botPixel.getColor();
        if (topPixel.colorDistance(botColor) > 
            edgeDist)
          topPixel.setColor(Color.BLACK);
        else
          topPixel.setColor(Color.WHITE);
      }
    }
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection2(int edgeDist)
  {
    Pixel centerPixel = null;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel topLeftPixel = null;
    Pixel topRightPixel = null;
    Pixel botLeftPixel = null;
    Pixel botRightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color centerColor = null;
    for (int row = 1; row < pixels.length-1; row++)
    {
      for (int col = 1; 
           col < pixels[0].length-1; col++)
      {
        centerPixel = pixels[row][col];
        leftPixel = pixels[row][col-1];
        rightPixel = pixels[row][col+1];
        topPixel = pixels[row-1][col];
        botPixel = pixels[row+1][col];
        topLeftPixel = pixels[row-1][col-1];
        topRightPixel = pixels[row-1][col+1];
        botLeftPixel = pixels[row+1][col-1];
        botRightPixel = pixels[row+1][col+1];
        Pixel[] surrounding = {leftPixel,rightPixel,topPixel,botPixel,topLeftPixel,
                                topRightPixel,botLeftPixel,botRightPixel};
        centerColor = centerPixel.getColor();
        for (int i = 0; i < surrounding.length; i++)
        {
            // if (surrounding[i].colorDistance(centerColor) > edgeDist)
                // surrounding[i].setColor(Color.BLACK);
            // else
                // surrounding[i].setColor(Color.WHITE);
        }
      }
    }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
