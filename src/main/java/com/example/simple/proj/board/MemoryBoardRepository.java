package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

import java.util.HashMap;
import java.util.Map;

public class MemoryBoardRepository implements BoardRepository{

    private static Map<Long, Board> store = new HashMap<>();

    @Override
    public void save(Board board) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
