package site.metacoding.blogv3.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.metacoding.blogv3.user.UserRequest;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    //글쓰기화면
    @GetMapping("/s/post/write-form")
    public String poWriteForm() {
        return "/post/writeForm";
    }

    //글쓰기("/s/post)
    @PostMapping("/s/post")
    public String poBoard(@ModelAttribute UserRequest.WriteBoardDTO reqDTO){
        boardService.write(reqDTO);
        System.out.println("reqDTO111 = " + reqDTO);
        return "redirect:/";



    }

}
