public class Mentor extends  Person {
  String level;

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
  }
  Mentor() {
    super("Jane Doe", 30, "female");
    level = "inter";
  }
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
  public void introduce() {
    System.out.println("Hi, I'm " + name + " ,a " + age + " year old " + gender + " developer.");
  }
}
