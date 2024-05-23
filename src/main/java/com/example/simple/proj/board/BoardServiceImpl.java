package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

import java.util.Date;
import java.util.List;

public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository = new MemoryBoardRepository();

    @Override
    public void post(Board board) {
        board.setCreatedTime(new Date());
        boardRepository.save(board);
    }

//    @Override
//    public void edit(Long boardId, Board newBoard) {
//        boardRepository.update(boardId, newBoard);
//    }
//
//    @Override
//    public void unPost(Long boardId) {
//        boardRepository.delete(boardId);
//    }
//
//    @Override
//    public Board findBoard(Long boardId) {
//        return boardRepository.findById(boardId);
//    }

    @Override
    public List<Board> findAllBoards() {
        return boardRepository.findAll();
    }
}
