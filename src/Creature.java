/**
 * Created by k1764018 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public void eat(){
        if (fullness >= 12) {
            print("Woops, " + this.getName() + " is already full.");
        } else {
            fullness += 8;
            happiness -= 6;
            energy -=4;

            if (fullness > 15) { fullness = 15; }

            print("Yum, " + this.getName() + " it was good!");
        }
    }

    public void sleep(){
        if (energy >= 12) {
            print("Woops, " + this.getName() + " is not that sleepy.");
        } else {
            energy += 8;
            happiness -= 5;
            fullness -=5;

            if (energy > 15) { energy = 15; }
        }
    }

    public void play(){
            happiness += 8;
            energy -= 6;
            fullness -=4;

        if ( happiness > 15) { happiness = 15; }

            print("This was so much fun!");
    }

    public String checkStatus(){
        String status = "";

        if( happiness <= 0 || fullness <= 0 || energy <= 0 ) {
            print("Oh no! " + this.getName() + " has died! You're a terrible owner!");
            System.exit(Status: 0);
        }

        if (happiness <= 6) {
            status += "Oh, " + this.getName() + " is feeling sad.\n";
        }

        if (fullness <= 6) {
            status += "Hm, " + this.getName() + " is realy tired.\n";
        }

        if ( energy <= 6 ) {
            status += "Woops, " + this.getName() + " is super hungry.\n";
        }

        return status;
    }

    public String getName() {
        return name;
    }

    public void print(String s){
        System.out.println(s);
    }
}
