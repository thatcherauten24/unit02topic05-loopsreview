public class Main {
  
  public static String formGradeString(int[] grades) {
    String letterGrades = "";
    for (int grade : grades) {
      if (grade <= 59) {
        letterGrades += "F";
      } else if (grade <= 69) {
        letterGrades += "D";
      } else if (grade <= 79) {
        letterGrades += "C";
      } else if (grade <= 89) {
        letterGrades += "B";
      } else if (grade <= 100) {
        letterGrades += "A";
      }
    }
    return letterGrades;
  }

  public static String valedictorianName(String[] studentNames, double[] studentGrades) {
    int index = 0;
    double highestGPA = 0;
    int namesIndex = 0;
    for (index = 0; index < studentGrades.length; index++) {
      if (studentGrades[index] > highestGPA) {
        highestGPA = studentGrades[index];
        namesIndex = index;
      }
      
    }
    return studentNames[namesIndex];
  }
  public static void main(String[] args) {
    System.out.println(formGradeString(new int[] {70, 80, 33, 97}));
    System.out.println(valedictorianName(new String[] {"emily", "albert", "sophie", "phillip", "ophelia"}, new double[] {0.223, 3.538, 3.237, 1.437, 1.162}));
  }
}