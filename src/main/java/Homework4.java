public class Homework4 {
    public static void main(String[] args) {

        Pet p1= new Pet("cirt","bobik",10,20);
        System.out.println(p1.age);

        Human h1= new Human("Adam", "Adamov",1970);
        System.out.println(h1.name+" "+ h1.surname);

        Human h2=new Human("Insan","Adamov",1940,90,p1,h1,h1);
    }
}
