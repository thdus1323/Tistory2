package site.metacoding.blogv3.board;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import site.metacoding.blogv3.category.Category;
import site.metacoding.blogv3.user.User;

import java.time.LocalDateTime;

@Data
@Table(name = "board_tb")
@Entity
public class Board {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer boardId;

    @Column(unique = true, length = 20, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) // 외래키참조
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) //외래키 참조
    private User user;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
