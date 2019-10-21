public class Human {

    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;

    Human (String name, String surname, int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
    }


    Human (String name, String surname, int year, int iq, Pet pet, Human mother, Human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;

    }
    void greetPet()
    {
        System.out.printf("Hello, %s ",pet.nickname);
    }

    void describePet()
    {
        System.out.printf("I have a %s, he is %d years old, he is [very sly]>50/[almost not sly]<50",pet.species,pet.age);
    }
    /*
    void toString()
    {
        System.out.printf("Human{name=%s, surname=%s, year=%d, iq=%d, mother=%s, father=%s, pet=%s{nickname=%s, age=%d, trickLevel=%d, habits=[eat, drink, sleep]",this.name, this.surname,this.year, this.iq,this.mother.name, this.father.name, this.pet, this.pet.nickname,this.pet.age, this,pet.trickLevel);
    }*/

    @Override
    public String toString() {
        return String.format("Human{name="+name+" surname=" +surname+", year="+year+", iq=" +iq+ ", mother=" +mother.name +", father=" + father.name+ ", pet=" +pet.species+"{nickname=" +pet.nickname +", age=" +pet.age+ ", trickLevel=" +pet.trickLevel+", habits=[eat, drink, sleep]");
    }
}

