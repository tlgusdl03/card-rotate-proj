package com.example.simple.proj.controller;

import com.example.simple.proj.board.BoardService;
import com.example.simple.proj.board.BoardServiceImpl;
import com.example.simple.proj.model.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BoardController {
    private final BoardService boardService = new BoardServiceImpl();

    @GetMapping("boards")
    public String listBoards(Model model) {
        model.addAttribute("boards", boardService.findAllBoards());
        return "board/list";
    }

    @GetMapping("boards/new")
    public String showCreateForm(Model model) {
        model.addAttribute("board", new Board("test", "test", "test"));
        return "board/form";
    }

    @PostMapping("boards/submit")
    public String createBoard(@ModelAttribute Board board) {
        boardService.post(board);
        return "redirect:/boards";
    }
}
