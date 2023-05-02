import java.util.Scanner;
// import java.time.Duration;

public class Battle {
    int shields;
    Pokemon opponent;

    public Battle() {
        this.shields = 2;
    }

    public int defend() {
        this.shields -= 1;
        if (this.shields == 0) {
            throw new RuntimeException("You have no more shields left.");
        }
        return this.shields;
    }

    public void attack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(opponent + " is attacking! \n" + "You have " + this.shields + " left. \n" + "Do you want to use a shield? (Type yes or no)");
        String shield_use = scanner.nextLine();
        if (shield_use.equalsIgnoreCase("yes")) {
            defend();
        }
        else {
            System.out.println("Do you wish to counterattack?");
            String counter_attack = scanner.nextLine();
            if (counter_attack.equalsIgnoreCase("yes")) {
                // use learned attack from trainer class ~ "here are your options"
                // if typed in less than 5 seconds, power of attack stays same, if more, attack is less powerful 
        }

    }   
}
}

// What user should see

// Generates opponent
// Opponent is throwing an attack! You have # shields left. Do you want to use a shield? (Type yes or no)
// if yes, hp stays the same
// if not using shields or have 0 shields; type in attack; 
// if typed in less than 5 (or some #) seconds, power of attack stays same, if more, attack is less powerful 