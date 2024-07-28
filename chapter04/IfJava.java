package chapter04;

public class IfJava {
    public static void main(String[] args) {
        // 제어문
        // 1. if(조건문)
        // 2. switch(조건문)
        // 3. for(반복문)
        // 4. while(반복문)

        // if~else if~else
        // if(조건문)
        // 학점 계산기
        int score = 92;
        String grade = "";

        if (score > 91) {
            grade = "A";
        } else if (score > 81) {
            grade = "B";
        } else if (score > 71) {
            grade = "C";
        } else if (score > 61) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 성적은 " + grade + "입니다.");
    }
}
