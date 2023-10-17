package test;

import io.micrometer.observation.Observation;
import lombok.extern.slf4j.Slf4j;
import test.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Test {

    public static void main(String[] args) {

        //Test.getArrayOfEmps();
        Test.listItem();

//        (int a, int b) -> {
//            return a + b;
//        }

    }

//    public static Streamz<String> list(){
//        Stream<String> list = Arrays.asList("1", "2", "3").forEach(System.out::println);
//        return
//    }


    //  Manipulation d'un tableau d'objets avec les Streams
    public static void getArrayOfEmps() {
       List<Employee> list = Stream.of(
               new Employee(1, "Jeff Bezos", 100000.0),
               new Employee(2, "Bill Gates", 200000.0),
               new Employee(3, "Mark Zuckerberg", 300000.0)
                )
               .filter(e -> e.getPrice() >= 200000)
               .toList()
               ;
       List<String> stringList = Stream.of(
               "One", "Two","Tree", "Four"
                )
               //.filter(e -> e.length() <= 3)
               .peek(e -> System.out.println("Filtered value " + e))
               .map(String::toUpperCase)
               .limit(1)
               .toList();
        System.out.println(stringList);
    }


    // Ajouter des éléments dans une liste
    public static void listItem(){
        List<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entrez un élément (ou tapez 'fin' pour quitter) : ");
            String input = scanner.nextLine();

            if ("fin".equalsIgnoreCase(input)) {
                break; // Sort de la boucle si l'utilisateur tape "fin"
            }

            myList.add(input);
        }

        System.out.println("Contenu de la liste :");
        for (String item : myList) {
            System.out.println(item);
        }

        scanner.close();
    }



}
