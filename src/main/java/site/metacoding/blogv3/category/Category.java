package site.metacoding.blogv3.category;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import site.metacoding.blogv3.board.Board;
import site.metacoding.blogv3.user.User;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "category_tb")
@NoArgsConstructor
public class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer categoryId;

    @Column(unique = true, nullable = false)
    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false) //외래키 참조
    private User user;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Board> boards;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
