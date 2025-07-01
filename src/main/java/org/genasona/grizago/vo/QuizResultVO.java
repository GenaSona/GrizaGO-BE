package org.genasona.grizago.vo;

public class QuizResultVO {
    private long id;
    private long userId;
    private long quizId;
    private enum type{
        SOLVED, PASSED, REPORTED;
    }
    private String flag;     // solved : 0 or 1 (제한시간 내 성공 여부), passed : 0 or 1 (직접포기 or 자동포기), reported : 0 or 1 (풀이 여부)
    private int detail;   // solved : 별점(1~5), passed : null, reported : 0000~1111 flag
    private String comment;  // solved : 내용, passed: null, reported : 내용
}
