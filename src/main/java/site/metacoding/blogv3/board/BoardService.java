package site.metacoding.blogv3.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.metacoding.blogv3.user.UserRepository;
import site.metacoding.blogv3.user.UserRequest;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    //게시판 글쓰기
    public Board write(UserRequest.WriteBoardDTO reqDTO){
        Board board = new Board();
        board.setTitle(reqDTO.getTitle());

        board.setContent(reqDTO.getContent());
        board.setCreatedAt(LocalDateTime.now());
      

        return boardRepository.save(board);

    }

}
