/*
build class to represent dice
class should take number of sides as a construvtor 
it should return string
 */
package dice;
import java.util.Random ;


public class Dice {

    int side;
    public Dice(int side){ // contructor initialisation
        this.side = side;
    }
    public String roll(){ // method that acts as rolling of dice
        int number = this.side+1; //added one because this will act as range 
        Random random = new Random();
        int no = random.nextInt(number);
        if(no==0){ // a dice do not contain 0
           String n = this.roll();
           return n;
        }
        return String.valueOf(no); // convert the number into string
    }
    
    public static void main(String[] args) {
        Dice two = new Dice(2);
        Dice four = new Dice(4);
        Dice six = new Dice(6);
        Dice seven = new Dice(7);
        System.out.println("4 side dice --> "+four.roll());
        System.out.println("6 side dice -->"+six.roll());
        System.out.println("7 side dice -->"+seven.roll());
        
    }
    
}
