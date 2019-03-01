import java.util.*;

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  // Constructor
  Person(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }

  // Print person data
  public void printPerson(){
     System.out.println(
        "Name: " + lastName + ", " + firstName
      +   "\nID: " + idNumber);
  }

}

class Student extends Person{
  private int[] testScores;
    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    Student(String firstName, String lastName,int id ,int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate() {
        int total = 0;
        // this.testScores = scores;

        for(int grades:testScores) {
            total += grades;
        }

        total = total / this.testScores.length;

        if(total >= 90 && total <= 100) {
            return 'O';
        } else if (total >= 80 && total < 90) {
            return 'E';
        } else if (total >= 70 && total < 80) {
            return 'A';
        } else if (total >= 55 && total < 70) {
            return 'P';
        } else if (total >= 40 && total < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}


