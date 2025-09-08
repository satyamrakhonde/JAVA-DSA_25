package Streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streama {

  public static void main(String[] args) {

    int[] array2 = { 1, 2, 3, 4, 5 };
    int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).collect(null, null, null);

    List<String> list = Arrays.asList("apple", "banana", "cherry");
    Stream<String> myStream = list.stream();

    String[] array = { "apple", "banana", "cherry" };
    Stream<String> stream = Arrays.stream(array);

    Stream.of(1, 2, 3);

    Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100); // limit use

    Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);

    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4322, 9, 0, 5, 44, 23, 433);
    List<Integer> filteredList = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    System.out.println(filteredList);
    List<Integer> mappedList = filteredList.stream().map(x -> x /
        2).collect(Collectors.toList());
    System.out.println(mappedList);

    // The above operations in single line
    // List<Integer> filteredList = list1.stream().filter(x -> x % 2 == 0).map(x ->
    // x / 2)
    // .collect(Collectors.toList());
    // System.out.println(filteredList);

    // Add distinct - to avoid repeated elements -> add distinct before collect
    // List<Integer> filteredList = list1.stream().filter(x -> x % 2 == 0).map(x ->
    // x / 2).distinct().collect(Collectors.toList());

    // Claims whose status is approved
    // List<Claims> approvedClaims = claims.stream().filter(claim ->
    // "APPROVED".equalsIgnoreCase(claim.getStatus())).collect(Collectors.toList());

    // Filter High Amount Claims (> ₹10,000)
    // List<Claims> greaterAmountClaims = claims.stream().filter(claim ->
    // claim.getAmount() > 10000).collect(Collectors.toList());

    // Filter Claims for specific Member
    // List<Cliams> specificMemberClaim = claims.stream().filter(claim ->
    // claim.getMemberId().equals(memberId)).collect(Collectors.toList());

    // Combine Multiple Business Rule
    // Llist<Claims> validCliams = claims.stream()
    // .filter(claim -> "APPROVED".equalsIgnoreCase(claim.getStatus))
    // .filter(claim -> claim.getAmount() > 10000)
    // .filter(claim ->
    // claim.getSubmissionDate().isAfter(LocalDate.now().minusDays(30)))
    // .collect(Collectors.toList());

    // In the Discovery Health project, I frequently worked with claim data where we
    // had to apply business rules using Java Streams. For example, we filtered
    // claims based on status, amount thresholds, and time windows. This approach
    // made our code clean, readable, and easy to test. We also used this to prepare
    // data before sending it to downstream systems or dashboards

    // Group all claims into categories like "APPROVED", "PENDING", "REJECTED".
    // Map<String, List<Claim>> claimsByStatus = claims.stream()
    // .collect(Collectors.groupingBy(Claim::getStatus));

    // Inteview question
    // List<Employee> employees = ArrayList.asList(
    // new Employee(1, "Satyam Kumar", LocalDate.of(2017, 8, 10)),
    // new Employee(2, "Satyam Rakhonde", LocalDate.of(2022, 1, 5))
    // );

    // LocalDate fiveYearsAgo = LocalDate.now().minusYears(5);

    // List<Employee> filtered = employees.stream()
    // .filter(e -> e.getDateOfJoining().isBefore(fiveYearsAgo) ||
    // e.getDateOfJoining.isEqual(fiveYearsAgo))
    // .collect(Collectors.toList());

    // filtered.forEach(System.out::println);

    ////////////////////////////////////
    // Map and FlatMap
    // it is intermediate methods and return another stream as part of the output.

    // map() method used for transformation
    // flatMap() used for transformation and flattening

    /*
     * pubic static List<Customer> getAll() {
     * return Stream.of(
     * new Customer(101, "john", "john@gmail.com", Array.asList("43209422",
     * "3241341531"));
     * new Customer(101, "smith", "smith@gmail.com", Array.asList("8903140134",
     * "4300934134"));
     * new Customer(101, "peter", "peter@gmail.com", Array.asList("134341341",
     * "46764746"));
     * new Customer(101, "kely", "kely@gmail.com", Array.asList("38909213490078531",
     * "1348791851"));
     * ).collect(Collectors.toList());
     * }
     * 
     * Main Class {
     * List<Customer> customers = EkartDataBase.getAll();
     * 
     * // List<Customer> convert List<String> -> Data Transformation
     * 
     * //mapping logic : customer -> customer.getEmail()
     * //customer.getEmail() one to one mapping means one customer has one email id
     * .
     * customers.stream().map(customer ->
     * customer.getEmail()).collect(Collectors.toList());
     * 
     * 
     * //customer -> customer.getPhoneNumbers() ->> One to many mapping
     * List<List<String>> phoneNumbers = customers.stream().map(customer ->
     * customer.getPhoneNumbers()).collect(Collectors.toList());
     * Sysout(phoneNumber); //Output -> [["43209422", "3241341531"], ["8903140134",
     * "4300934134"], ["134341341", "46764746"], ["38909213490078531",
     * "1348791851"]]
     * 
     * 
     * // List<Customer> convert List<String> -> Data Transformation
     * 
     * //mapping logic : customer -> phone Numbers
     * //customer -> customer.getPhoneNumbers() ->> One to Many Mapping
     * List<String> phones = customers.stream()
     * .flatMap(customer -> customer.getPhoneNumbers().stream())
     * .collect(Collectors.toList());
     * Sysout(phones); //Output -> ["43209422", "3241341531", "8903140134",
     * "4300934134", "134341341", "46764746", "38909213490078531", "1348791851"]
     * 
     * }
     */

    // Map
    // List of fruits to Lowercase
    /*
     * 
     * 
     * List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange",
     * "Banana", "APPLE", "mango"));
     * 
     * List<String> lowerCaseFruits = fruits.stream()
     * .filter(fruit -> fruit.equals(fruit.toLowerCase()))
     * .collect(Collectors.toList());
     * 
     * 
     * System.out.println("LowerCase fruits: " + lowerCaseFruits);
     */

    // Filter Students Alphabetically and Sort by Age

    // List<Student> sortedStudents = students.stream()
    // .filter(s -> s.getName().matches("^[A-Za-z].*"))
    // .sorted(Compartor.comparing(Student::getName)
    // .thenComparing(Student::getAge))
    // .collect(Collectors.toList());

    // filter By Age and compare by Name
    // List<Student> stude = students.stream()
    // .filter(e -> e.getAge() > 22)
    // .sorted(Comparator.comparing(Student::getName))
    // .collect(Collectors.toList());

    // count student with City Delhi
    // student.stream().filter(e -> e.getCity().equals("Delhi")).count();



    // String text = "Apple, apple!  Banana apple; ORANGE banana.";

    // Map<String, Long> wordCount = Arrays.stream(text.toLowerCase().replaceAll("[^a-z]", "")).split("\\s+")
    //                         .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

    // System.out.println(wordCount);
                            
  }
}
