package test2_12;

import java.util.HashSet;
import java.util.Set;

public class MeetingAttendees {
    public static void main(String[] args) {
        Set<String> attendees = new HashSet<>();

        attendees.add("김철수");
        attendees.add("이영희");
        attendees.add("박지성");
        attendees.add("김철수");

        boolean isPresent = attendees.contains("박지성");
        System.out.println("박지성 참석 여부:" + isPresent);
        System.out.println("최종 참석자 수:" + attendees.size());
        System.out.println("전체 명단:" + attendees);
    }
}