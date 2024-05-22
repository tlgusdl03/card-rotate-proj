package com.example.simple.proj.controller;

import com.example.simple.proj.board.BoardService;
import com.example.simple.proj.board.BoardServiceImpl;
import com.example.simple.proj.model.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class BoardController {
    private final BoardService boardService = new BoardServiceImpl();

    @PostMapping("boards/submit")
    public String createBoard(@RequestParam("user") String user,
                              @RequestParam("title") String title,
                              @RequestParam("content") String content) {
        Board board = new Board(new Date(), user, title, content);
        boardService.post(board);
        return "redirect:/boards";
    }

    @GetMapping("boards")
    public String listBoards(Model model) {
        model.addAttribute("boards", boardService.findAllBoards());
        return "board/list";
    }

    @GetMapping("boards/new")
    public String showCreateForm(Model model) {
        model.addAttribute("board", new Board(new Date(), "test", "test", "test"));
        return "board/form";
    }
}
