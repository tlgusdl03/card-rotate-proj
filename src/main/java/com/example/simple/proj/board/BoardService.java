package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

public interface BoardService {
    void post(Board board);
    void edit(Long boardId, Board newBoard);
    void unPost(Long boardId);
    Board findBoard(Long boardId);
}
