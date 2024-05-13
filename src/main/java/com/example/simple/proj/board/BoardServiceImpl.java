package com.example.simple.proj.board;

import com.example.simple.proj.model.Board;

public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void post(Board board) {
        boardRepository.save(board);
    }

    @Override
    public void edit(Long boardId, Board newBoard) {
        boardRepository.update(boardId, newBoard);
    }

    @Override
    public void unPost(Long boardId) {
        boardRepository.delete(boardId);
    }

    @Override
    public Board findBoard(Long boardId) {
        return boardRepository.findById(boardId);
    }
}
