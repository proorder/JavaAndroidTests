class Test1 {
  public static void main(String[] args) {
    Employee tester = new Employee(7, "Developer");
    System.out.println(tester.getId());
    System.out.println(tester.getVacancy());
  }
}
class Employee {
  private long id;
  private Vacancy vacancy;
  public Employee(int id, String vacancy) {
    this.vacancy = new Vacancy(vacancy);
    this.id = id;
  }
  String getVacancy() {
    return vacancy.getVacancy();
  }
  long getId() {
    return id;
  }
}
class Vacancy {
  String vacancy;
  public Vacancy(String vacancy) {
    this.vacancy = vacancy;
  }
  String getVacancy() {
    return this.vacancy;
  }
}
