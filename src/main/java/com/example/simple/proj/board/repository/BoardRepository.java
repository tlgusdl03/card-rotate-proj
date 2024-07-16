package com.example.simple.proj.board.repository;

import com.example.simple.proj.board.model.Board;

import java.util.List;

public interface BoardRepository {
    void save(Board board);
//    void delete(Long boardId);
//    void update(Long boardId, Board newBoard);
//    Board findById(Long boardId);
    List<Board> findAll();
}
