public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    //String[] habits;

    Pet (String species, String nickname, int age, int trickLevel)
    {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        //this.habits=habits;
    }
    void eat()
    {
        System.out.println("I am eating");
    }
    void respond()
    {
        System.out.printf("Hello, owner. I am - %s. I miss you!",this.nickname);
    }
    void foul()
    {
        System.out.println("I need to cover it up");
    }
}



