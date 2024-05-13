package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MemoryBoardRepository implements BoardRepository{

    private static Map<Long, Board> store = new HashMap<>();


    @Override
    public void save(Board board) {
        store.put(board.getId(), board);
    }

    @Override
    public void delete(Long boardId) {
        store.remove(boardId);
    }

    @Override
    public void update(Long boardId, Board newBoard) {
        if(store.containsKey(boardId)){
            store.put(boardId, newBoard);
        }
        else {
            throw new NoSuchElementException("board with Id =" + boardId + "not found");
        }
    }

    @Override
    public Board findById(Long boardId) {
        return store.get(boardId);
    }
}
