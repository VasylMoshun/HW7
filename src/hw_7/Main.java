package hw_7;
import static hw_7.Gender.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Taras", 21, Gender.MALE),
                new Person("Vova", 25, Gender.MALE),
                new Person("Ksenia", 33, Gender.FEMALE),
                new Person("Nazar", 80, Gender.MALE),
                new Person("Alina", 17, Gender.FEMALE),
                new Person("Piter", 100, Gender.MALE),
                new Person("Maria", 15, Gender.FEMALE),
                new Person("Kait", 21, Gender.FEMALE),
                new Person("Moshun", 29, Gender.MALE)
        );

        Set<String> listPersonFilter = persons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(HashSet::new,
                        (set, person) -> set.add(person.toString()),
                        HashSet::addAll);
        listPersonFilter.forEach(System.out::println);
    }
}
