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
    /*

    Human (String name, String surname, int year, int iq, Pet pet, Human mother, Human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;

    }*/
}
