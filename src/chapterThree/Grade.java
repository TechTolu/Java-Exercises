package chapterThree;

public class Grade {
    private String grade;

    public Grade(String grade) {
    }

    public void setScore(double score) {
        if(score >= 96 && score <= 100){
            grade = "A+";
        }else if (score >= 90){
            grade = "A";
        }else if(score >= 86){
            grade = "B+";
        }else if(score >= 80){
            grade = "B";
        }else if(score >= 76){
            grade = "C+";
        }else if(score >= 70){
            grade = "C";
        }else if(score >= 60){
            grade = "D";
        }else
            grade = "E";
    }

    public String getScore() {
        return grade;
    }
}
