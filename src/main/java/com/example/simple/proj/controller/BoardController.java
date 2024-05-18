package com.example.simple.proj.controller;

import com.example.simple.proj.board.BoardService;
import com.example.simple.proj.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;


    @GetMapping("list")
    public String list(Model model){
        List<Board> list = boardService.findAllBoards();
        model.addAttribute("boards", list);
        return "list";
    }

    @GetMapping("board")
    public String board(Model model, @RequestParam("id") Long id) {
        Board board = boardService.findBoard(id);
        model.addAttribute("board", board);
        return "board";
    }

    @GetMapping("write")
    public String write() {
        return "write";
    }

    @PostMapping("write/new")
    public String writeNew(@RequestParam("author") String author, @RequestParam("content") String content, @RequestParam("title") String title) {
        Board newBoard = new Board(0,new Date(), author, title, content);
        return "redirect:/list";
    }

}
