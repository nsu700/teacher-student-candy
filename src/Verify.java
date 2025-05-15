
import java.util.Arrays;

public class Verify {
  public static void main(String[] args) {
    int numberOfCandy = 20;
    int studentScore;
    int awardNum;
    String color;
// - Create a teacher to buy 20 candies
// - TuckShop sold 20 candies
// - Teacher checks student's score
// - if score higher than 60, award one candy for each 10 score
// - Student verify how many candies they receive

    Teacher teacher = new Teacher();
    if (teacher.checkCandy() == 0) {
      teacher.buyCandy(numberOfCandy);
    }

    System.out.println("Start");
    System.out.println("Teacher has candies: " + teacher.checkCandy());
    System.out.println(Arrays.toString(teacher.showCandy()));

    Student[] students = new Student[4];
    Student studentA = new Student(70, "Jace");
    Student studentB = new Student(100, "Ray");
    Student studentC = new Student(50, "Allan");
    Student studentD = new Student(150, "John");
    students[0] = studentA;
    students[1] = studentB;
    students[2] = studentC;
    students[3] = studentD;

// Teacher would award student candies, and the number of candies depends on student's score, each 10 points over 60 get a single candy
    for(int i = 0; i < students.length; i++) {
      studentScore = students[i].showScore();
      System.out.println("Student's score is " + studentScore);
      if(studentScore > 60) {
        awardNum = (studentScore - 60) / 10;
        System.out.println("Teacher award " + awardNum + " candies");
        for(int j = 0; j < awardNum; j++) {
          color = teacher.awardCandy();
          students[i].receiveCandy(color);
        }
      }
    }

    System.out.println("End verification");
    System.out.println("Teacher now only have candies left: " + teacher.checkCandy());
    System.out.println(Arrays.toString(teacher.showCandy()));
    for (int i = 0; i < students.length; i++) {
        System.out.println("Student " + students[i].getName() + " got candies: " + Arrays.toString(students[i].showCandy()));
    }
  }
}
