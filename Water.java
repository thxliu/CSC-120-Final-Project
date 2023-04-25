class Water extends Pokemon {
    public Water(String type, String starterPokemon, int HP) {
        super(type, starterPokemon, HP);
        this.type = "water";
        this.HP = HP;
    }

    public void evolve() {
        if (this.HP >= 200) {
            this.starterPokemon = "Poliwrath";
        } else if (this.HP >= 150) {
            this.starterPokemon = "Poliwhirl";
        } 
    }

    public void heal(){

    }

    public static void main(String[] args) {
        Pokemon myPokemon = new Water("water", "Poliwag", 170);
        myPokemon.evolve();
    }
}