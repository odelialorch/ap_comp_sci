
/**
 * Write a description of class PlAyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int points;
    private int total;

    public Player(String s){
        name = s;
    }

    public void addpts(int x, int y) {
        if (x != 1 || y != 1)
            points += x + y;
        else if( x == 1 && y == 1)
            total = 0;
        else
            points = 0;
    }

    public int showpts(){
        return points;
    }

    public void addTotal() {
        total += points;
    }

    public int showTotalPts(int x){
        total += points;
        return total;
    }
}
