public class Pokemon {
    // private Pokemon_Types type;
    public Pokemon_Types type;
    String starterPokemon;
    int HP;
    int currentHP;
    String nextPokemon;
    String finalPokemon;
    
    public Pokemon(Pokemon_Types type, String starterPokemon) {
        this.type = type;
        this.starterPokemon = starterPokemon;
        // HP = 100;
        this.HP = 100;
        this.nextPokemon = nextPokemon;
        this.finalPokemon = finalPokemon;
        System.out.println("Congratulations! Here is your pokémon " + this.starterPokemon + " of type " + this.type
                + " and HP " + this.HP + ".");
    }

    /**
     * getter for private attribute FuelType f
     * @return returns the fuel type for this engine
     */
    // public Pokemon_Types getPokemonType(){
    //     return this.type;
    // }    
    
    public void evolve() {
        if (this.HP >= 200) {
            this.starterPokemon = this.finalPokemon;
            System.out.println("Your Pokémon has successfully evolved into " + this.starterPokemon + ".");
        } if (this.HP >= 150) {
            this.starterPokemon = this.nextPokemon;
            System.out.println("Your Pokémon has successfully evolved into " + this.starterPokemon + ".");
        } else {
            System.out.println(this.starterPokemon + " does not have enough HP to evolve. Please continue training and try again later.");
        }
    }

    public void heal() {
        if (this.HP <= HP) {
            this.HP = currentHP;
            System.out.println(this.starterPokemon + " has been healed. Current HP level at " + currentHP + ".");
        }
    }

    public static void main(String[] args) {
        Pokemon myPokemon = new Pokemon(Pokemon_Types.WATER, "Poliwag");
        myPokemon.HP = 180;
        myPokemon.evolve();
    }
}