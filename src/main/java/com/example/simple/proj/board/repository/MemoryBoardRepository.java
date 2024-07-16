package com.example.simple.proj.board.repository;

import com.example.simple.proj.board.model.Board;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class MemoryBoardRepository implements BoardRepository {

    private static final AtomicLong counter = new AtomicLong(0);
    private static final Map<Long, Board> store = new HashMap<>();


    @Override
    public void save(Board board) {
        Long id = counter.incrementAndGet();
        board.setId(id);
        store.put(board.getId(), board);
    }

//    @Override
//    public void delete(Long boardId) {
//        store.remove(boardId);
//    }
//
//    @Override
//    public void update(Long boardId, Board newBoard) {
//        if(store.containsKey(boardId)){
//            store.put(boardId, newBoard);
//        }
//        else {
//            throw new NoSuchElementException("board with Id =" + boardId + "not found");
//        }
//    }
//
//    @Override
//    public Board findById(Long boardId) {
//        return store.get(boardId);
//    }

    @Override
    public List<Board> findAll() {
        Collection<Board> boards = store.values();
        return new ArrayList<>(boards);
    }
}
