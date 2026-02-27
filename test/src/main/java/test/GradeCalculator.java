package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeCalculator {

    public static double calculateAverage(Map<String, Integer> scores) {

        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int score : scores.values()) {
            sum += score;
        }
        return sum / scores.size();
    }

    public static void main(String[] args) {
        List<Map<String, Object>> students = new ArrayList<>();

        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "홍길동");
        Map<String, Integer> scores1 = new HashMap<>();
        scores1.put("국어", 85);
        scores1.put("영어", 90);
        scores1.put("수학", 95);
        student1.put("scores", scores1);
        students.add(student1);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "김철수");
        Map<String, Integer> scores2 = new HashMap<>();
        scores2.put("국어", 75);
        scores2.put("영어", 80);
        scores2.put("과학", 88);
        student2.put("scores", scores2);
        students.add(student2);

        for (Map<String, Object> student : students) {
            String name = (String) student.get("name");
            Map<String, Integer> scores = (Map<String, Integer>) student.get("scores");
            double average = calculateAverage(scores);
            System.out.println("학생:" + name + ", 평균 점수:" + average);
        }
    }
}