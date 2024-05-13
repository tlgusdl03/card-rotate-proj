package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

public interface BoardRepository {
    void save(Board board);
    void delete(Long boardId);
    void update(Long boardId);
    Board findById(Long boardId);
}
