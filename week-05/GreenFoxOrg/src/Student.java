public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age , gender);
    skippedDays = 0;
  }
  Student() {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + "from " + previousOrganization + " who skipped " + skippedDays + " days from the course already");
  }
  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Student("JohnTheClone",this.age, this.gender, this.previousOrganization);
  }
}
