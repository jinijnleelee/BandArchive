package edu.kh.fin.band.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.fin.band.board.model.vo.Board;
import edu.kh.fin.band.board.model.vo.BoardBanned;
import edu.kh.fin.band.board.model.vo.BoardDetail;
import edu.kh.fin.band.board.model.vo.BoardLikeVO;
import edu.kh.fin.band.board.model.vo.Criteria;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public int write(Board board) {
		// TODO Auto-generated method stub
		return sqlSession.insert("boardMapper.write",board);
	}

	public List<BoardDetail> boardList(Criteria cri, String searchType, String keyword) {
		// TODO Auto-generated method stub
		
		  HashMap<String, Object> data = new HashMap<String, Object>();
		  
		  
		
		  data.put("cri", cri);
		  
		  data.put("searchType", searchType);
		  data.put("keyword", keyword);
		 return sqlSession.selectList("boardMapper.boardList",data);
	}

	public BoardDetail boardDetail(int boardNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.boardDetail",boardNo);
	}

	public int updateReadCount(int boardNo) {
		// TODO Auto-generated method stub
		return sqlSession.update("boardMapper.updateReadCount",boardNo);
	}
	
	

	public int delete(int boardNo) {
		return sqlSession.delete("boardMapper.delete",boardNo);
		
	}

	public int  boardUpdate(Board board) {
		// TODO Auto-generated method stub
		return sqlSession.update("boardMapper.boardUpdate",board);
	}

	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.getTotal",cri);
	}

	public List<BoardDetail> boardTalk(Criteria cri) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.boardTalk",cri);
	}

	public List<BoardDetail> boardQus(Criteria cri) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.boardQus",cri);
	}

	public List<BoardDetail> boardAll(Criteria cri) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.boardAll",cri);
	}

	public List<BoardDetail> boardList(Criteria cri) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.boardList",cri);
	}


	public Object reportUser(BoardBanned boardBanned) {
		// TODO Auto-generated method stub
		return sqlSession.insert("boardMapper.reportUser",boardBanned);
	}

	public List<String> bannedUserIds(BoardBanned boardBanned) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.bannedUserIds",boardBanned);
	}
	
	
	
	
	
	/**
	 * 좋아요 등록
	 * @author lee
	 * @param likeVo
	 * @return
	 */
	
	//좋아요 등록
	
	public void addLike(BoardLikeVO likeVo) {
		sqlSession.insert("boardMapper.addLike", likeVo);
	}
	
//	/**
//	 * 좋아요 취소 
//	 * @author lee
//	 * @param boardNo
//	 * @param loginUser
//	 * @return
//	 */
//	
//	public void removeLikeFromLikeTable(BoardLikeVO likeVo) {
//		sqlSession.delete("boardMapper.removeLikeFromLikeTable", likeVo);
//	}
//	
//	
//	
//	//좋아요 갯수
//	public int countLike(int board_no) {
//	    return sqlSession.selectOne("boardMapper.countLike", board_no);
//	}
//	
	/**
	 * 좋아요 한지 안한지 체크
	 * @author lee
	 * @param likeVo
	 * @return
	 */
	public int checkLike(BoardLikeVO likeVo) {
		return sqlSession.selectOne("boardMapper.checkLike", likeVo);
	}

	/**
	 * 댓글 갯수 가져오기 DAO
	 * @author lee
	 * @param boardNo
	 * @return
	 */
	public int getReplyCount(int boardNo) {
		return sqlSession.selectOne("replyMapper.getReplyCount", boardNo);
	}
//
//	public int getLike(int boardNo) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//

	
	
}