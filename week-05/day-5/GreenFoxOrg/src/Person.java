public class Person {
  String name;
  int age;
  String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + ".");
  }
  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
