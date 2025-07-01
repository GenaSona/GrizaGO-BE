package org.genasona.grizago.vo;

public class QuizReportVO {
    private Long id;
    private Long userId;
    private Long quizId;

    private enum reasonFlag {
        NONE(0, "정상"), // 신고 접수 불가 처리
        NICKNAME(1, "부적절한 닉네임"),
        QUIZ(2, "부적절한 문제"),
        TOPIC(4, "부적절한 주제어"),
        HINT(8, "부적절한 힌트"),

        NICKNAME_QUIZ(3, "부적절한 닉네임 + 문제"),
        NICKNAME_TOPIC(5, "부적절한 닉네임 + 주제어"),
        NICKNAME_HINT(9, "부적절한 닉네임 + 힌트"),
        QUIZ_TOPIC(6, "부적절한 문제 + 주제어"),
        QUIZ_HINT(10, "부적절한 문제 + 힌트"),
        TOPIC_HINT(12, "부적절한 주제어 + 힌트"),

        NICKNAME_QUIZ_TOPIC(7, "부적절한 닉네임 + 문제 + 주제어"),
        NICKNAME_QUIZ_HINT(11, "부적절한 닉네임 + 문제 + 힌트"),
        NICKNAME_TOPIC_HINT(13, "부적절한 닉네임 + 주제어 + 힌트"),
        QUIZ_TOPIC_HINT(14, "부적절한 문제 + 주제어 + 힌트"),

        ALL(15, "부적절한 닉네임 + 문제 + 주제어 + 힌트");

        private final int code;
        private final String description;

        reasonFlag(int code, String description) {
            this.code = code;
            this.description = description;
        } // 0 : 정상 / 1 ~ 15 신고 혹은 삭제로 인한 숨김처리 상태
    }

    private String reasonDetail;
}
