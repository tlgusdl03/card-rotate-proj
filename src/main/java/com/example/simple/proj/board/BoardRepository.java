package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

import java.util.List;

public interface BoardRepository {
    void save(Board board);
//    void delete(Long boardId);
//    void update(Long boardId, Board newBoard);
//    Board findById(Long boardId);
    List<Board> findAll();
}
