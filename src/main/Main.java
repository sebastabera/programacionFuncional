package main;

import java.util.Collection;
import java.util.List;

import static main.Gender.*;

public class Main {

    public static void main(String[] args){

        List<Person> people = List.of(
                new Person("Jorge", 28, MALE, List.of("Colombia", "EEUU")),
                new Person("Maria", 18, FEMALE, List.of("Brasil", "Argentina")),
                new Person("Francisco", 23, MALE, List.of("Croacia", "Mexico")),
                new Person("Katherine", 30, FEMALE, List.of("Islandia", "Inglaterra")),
                new Person("Pedro", 17, MALE, List.of("Argentina", "Canada")),
                new Person("Lisa", 17, FEMALE, List.of("España", "EEUU"))
        );

        //IMPERATIVA IMPRIMIR HOMBRES
        for (Person person : people) {
            if(MALE.equals(person.getGender())){
                System.out.println(person);
            }
        }

        //DECLARATIVA IMPRIMIR HOMBRES
        people.stream().filter(x -> MALE.equals(x.getGender())).forEach(System.out::println);

        //IMPERATIVA PROMEDIO DE EDADES
        int sumAge = 0;
        for (Person person : people) {
            sumAge += person.getAge();
        }
        double avgAge = sumAge / people.size();
        System.out.println(avgAge);

        //DECLARATIVA PROMEDIO DE EDADES
        //students.stream().map(x -> x.getAge()).
        System.out.println(people.stream().mapToInt(Person::getAge).average());

        //IMPERATIVA IMPRIMIR PAISES DE VIAJE
        for (Person person: people){
            for(String country: person.getTrips()){
                System.out.println(country);
            }
        }

        people.stream().map(Person::getTrips).flatMap(List::stream).distinct().forEach(System.out::println);

    }

}
