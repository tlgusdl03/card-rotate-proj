//package com.example.simple.proj.board;
//
//import com.example.simple.proj.board.model.Board;
//import com.example.simple.proj.user.model.User;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.Date;
//
//public class BoardServiceTest {
//
//    String user = "test001";
//
//    BoardService boardService;
//    BoardRepository boardRepository;
//
//    @BeforeEach
//    void BoardServiceTest() {
//        boardRepository = new MemoryBoardRepository();
//        this.boardService = new BoardServiceImpl(boardRepository);
//    }
//
//    @Test
//    @DisplayName("게시물 생성 테스트")
//    void post(){
//        //given
//        Board board = new Board(new Date(), user, "testBoard001", "It`s first test board");
//
//        //when
//        boardService.post(board);
//
//        //then
//        System.out.println("board = " + board);
//        Board after = boardService.findBoard(1L);
//        System.out.println("after = " + after);
//        Assertions.assertThat(board).isEqualTo(after);
//    }
//
//    @Test
//    @DisplayName("게시물 수정 테스트")
//    void edit(){
//        //given
//        Board board = new Board(new Date(), user, "testBoard001", "It`s first test board");
//        Board newBoard = new Board(new Date(), user, "testBoard001", "It`s changed test board");
//
//        //when
//        boardService.post(board);
//        boardService.edit(newBoard.getId(), newBoard);
//
//        //then
//        System.out.println("newboard = " + newBoard);
//        Board after = boardService.findBoard(1L);
//        System.out.println("after = " + after);
//        Assertions.assertThat(newBoard).isEqualTo(after);
//    }
//
//    @Test
//    @DisplayName("게시물 삭제 테스트")
//    void unPost(){
//        //given
//        Board board = new Board(new Date(), user, "testBoard001", "It`s first test board");
//
//        //when
//        boardService.post(board);
//        boardService.unPost(board.getId());
//
//        //then
//        Board after = boardService.findBoard(1L);
//        Assertions.assertThat(after).isNull();
//    }
//
//
//
//}
