package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Book fahrenheit451 = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953);
        Book fahrenheit452 = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953);
        Book alchemist = new Book("Alchemist", new Author("Paulo","Coelho"), 1988);
        Author RayBradbury = new Author("Ray", "Bradbury");
        Author PauloCoelho = new Author("Paulo","Coelho");

//Task HM10
        System.out.println(fahrenheit451);
        System.out.println(alchemist);
        System.out.println(fahrenheit451.equals(fahrenheit452));
        System.out.println(fahrenheit451.hashCode());
        System.out.println(alchemist.hashCode());
    }
}
