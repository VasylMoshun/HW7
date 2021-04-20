package hw_7;
import static hw_7.Gender.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Taras", 21, MALE),
                new Person("Vova", 25, MALE),
                new Person("Ksenia", 33, FEMALE),
                new Person("Nazar", 80, MALE),
                new Person("Alina", 17, FEMALE),
                new Person("Piter", 100, MALE),
                new Person("Maria", 15, FEMALE),
                new Person("Kait", 21, FEMALE),
                new Person("Moshun", 29, MALE)
        );

        Set<String> listPersonFilter = persons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(HashSet::new,
                        (set, person) -> set.add(person.toString()),
                        HashSet::addAll);
        listPersonFilter.forEach(System.out::println);
    }
}
