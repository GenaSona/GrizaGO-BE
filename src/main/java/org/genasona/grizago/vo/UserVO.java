package org.genasona.grizago.vo;

import java.util.List;

public class UserVO {
    private Long id;
    private String password;
    private String email;

    private String nickName;
    private UserStateVO userStateVO;
    private List<QuizVO> quizList;
}
