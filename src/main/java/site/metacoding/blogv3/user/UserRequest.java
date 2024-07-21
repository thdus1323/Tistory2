package site.metacoding.blogv3.user;

import lombok.Data;
import site.metacoding.blogv3.category.Category;

import java.time.LocalDateTime;

public class UserRequest {

    @Data
    public static class JoinDTO {
        private String userName;
        private String userPassword;
        private String userEmail;
        private String ConfirmPassword;
    }

    @Data
    public static class LoginDTO {
        private String userName;
        private String userPassword;
    }

    @Data
    public static class ChangePasswordDTO {
        private String userPassword;
        private String newPassword;
    }

    //게시판 글쓰기
    @Data
    public static class WriteBoardDTO{
        private String title;
        private String content;
        private Integer categoryId;
        private Integer userId;
        private LocalDateTime createdAt;
    }
}
