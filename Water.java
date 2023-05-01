class Water extends Pokemon {
    
    public Water(Pokemon_Types type, String starterPokemon) {
        super(type, starterPokemon);
        // this.type = Pokemon_Types.WATER;
        type = Pokemon_Types.WATER;
        this.type = type;
        this.nextPokemon = "Poliwhirl";
        this.finalPokemon = "Poliwrath";
    }

    public Water() {

    }

    public static void main(String[] args) {
        Water myWaterPokemon = new Water("Poliwag");
        myWaterPokemon.HP = 180;
        myWaterPokemon.evolve();
    }
}