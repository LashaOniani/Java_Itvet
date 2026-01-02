package Week4;

public class GradeChecker implements GradingRules {
    public char getGrade(int grade){
        if(grade > MAX_SCORE || grade < 0){
            return '?';
        } else if (grade >= 90) {
            return 'A';
        } else if (grade >= 81 ) {
            return 'B';
        } else if (grade >= 71) {
            return 'C';
        } else if (grade >= 61) {
            return 'D';
        } else if (grade > PASS_SCORE){
            return 'E';
        } else{
          return 'F';
        }
    }
}
