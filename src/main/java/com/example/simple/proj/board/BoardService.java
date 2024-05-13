package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

public interface BoardService {
    void post();
    void edit();
    void unpost();
    Board findBoard(Long boardId);
}
