abstract class Pokemon {
    String type; 
    String starterPokemon; 
    int HP; 
    int currentHP;

    public Pokemon(String type, String starterPokemon, int HP){
        this.type = type;
        this.starterPokemon = starterPokemon;
        this.HP = currentHP;
        System.out.println("Congratulations! Here is your pokémon " + this.starterPokemon + " of type: " + this.type + " and HP " + this.HP + ".");
    }

    public void evolve() { 
         if (this.HP >= 200) {
            this.starterPokemon = " ";
            System.out.println("Your Pokémon has successfully evolved into " + this.starterPokemon + ".");
        } else if (this.HP >= 150) {
            this.starterPokemon = " ";
            System.out.println("Your Pokémon has successfully evolved into " + this.starterPokemon + ".");
        } else {
            System.out.println(this.starterPokemon
                    + " does not have enough HP to evolve. Please continue training and try again later.");
        }
    }
    public void heal() {
        
    }
}