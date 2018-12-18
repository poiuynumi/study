package com.study.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.study.model.dto.Board;

public class BoardDao {
  
  public void insertdBoard(Board board) {
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
      //1. 드라이버 등록
      //2. 연결객체생성 (DriverManager에서 반환)
      conn = ConnectionHelper.getConnection("oracle");
      //3. SQL 작성 + 명령객체 생성 (from connection)
      String sql = 
          "INSERT INTO Board " +
          "(boardno, title, writer, content)" +
          "VALUES (board_sequence.nextval, ?, ?, ?, ";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, board.getTitle());
      pstmt.setString(2, board.getWriter());
      pstmt.setString(3, board.getContent());
      //4. 명령 실행
      pstmt.executeUpdate();
      //5. 결과 있으면 결과 처리
      
  } catch (Exception ex) {
    ex.printStackTrace();
} finally {
    //6. 연결닫기
    if (pstmt != null) try { pstmt.close(); } catch (Exception ex) {}
    if (conn != null) try { conn.close(); } catch (Exception ex) {}
}
}

    
  }
