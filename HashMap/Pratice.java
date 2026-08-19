import  java.util.*;
public class Pratice {
  public static void main(String[] args) {
    HashMap<Integer, String> students =new HashMap<>();

    students.put(1, "Ishant");
    students.put(2, "Ashish");
    students.put(3,"Sourabh");

    String student = students.get(2);
     System.out.println(student);
     System.out.println(students.get(1));
     String std =students.get(3);
     System.out.println(std);
     System.out.println(students.containsValue("Ishant"));
     System.out.println(students.containsKey(2));
     System.out.println(students);

     Set<Integer> keys=students.keySet();
    for(int i: keys){
        System.out.println(students.get(i));
    }
    
    Set<Map.Entry<Integer, String>> entries =students.entrySet();

    for(Map.Entry<Integer, String> entry :entries){
        System.out.println(entry.getKey()+ ": "+ entry.getValue());
    }

    for(Map.Entry<Integer, String> entry :entries){
        entry.setValue(entry.getValue().toUpperCase());
    }
    System.out.println(students);
}
}