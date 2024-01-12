package edu.kh.fin.band.board.model.dao;

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
		return sqlSession.insert("boardMapper.write",board);
	}

	public List<BoardDetail> boardList(Criteria cri, String searchType, String keyword) {

		  HashMap<String, Object> data = new HashMap<>();

		  data.put("cri", cri);
		  data.put("searchType", searchType);
		  data.put("keyword", keyword);
		  
		 return sqlSession.selectList("boardMapper.boardList",data);
	}

	public BoardDetail boardDetail(int boardNo) {
		return sqlSession.selectOne("boardMapper.boardDetail",boardNo);
	}

	public int updateReadCount(int boardNo) {
		return sqlSession.update("boardMapper.updateReadCount",boardNo);
	}



	public int delete(int boardNo) {
		return sqlSession.delete("boardMapper.delete",boardNo);

	}

	public int  boardUpdate(Board board) {
		return sqlSession.update("boardMapper.boardUpdate",board);
	}

	public int getTotal(Criteria cri) {
		return sqlSession.selectOne("boardMapper.getTotal",cri);
	}

	public List<BoardDetail> boardTalk(Criteria cri) {
		return sqlSession.selectList("boardMapper.boardTalk",cri);
	}

	public List<BoardDetail> boardQus(Criteria cri) {
		return sqlSession.selectList("boardMapper.boardQus",cri);
	}

	public List<BoardDetail> boardAll(Criteria cri) {
		return sqlSession.selectList("boardMapper.boardAll",cri);
	}

	public List<BoardDetail> boardList(Criteria cri) {
		return sqlSession.selectList("boardMapper.boardList",cri);
	}


	public Object reportUser(BoardBanned boardBanned) {
		return sqlSession.insert("boardMapper.reportUser",boardBanned);
	}

	public List<String> bannedUserIds(BoardBanned boardBanned) {
		return sqlSession.selectList("boardMapper.bannedUserIds",boardBanned);
	}





	/**
	 * 좋아요 등록
	 * @param likeVo
	 * @return
	 */

	public int addLike(BoardLikeVO likeVo) {
			
		int addLike = sqlSession.insert("boardMapper.addLike", likeVo);
		
		if(addLike > 0) {
		
		sqlSession.update("boardMapper.boardLikePlus",likeVo.getBoardNo());
		     
		return addLike;
		 
		 } else {
		    	
		return -1;
		 
		 }
	}
	

	/**
	 * 좋아요 취소
	 * @param boardNo
	 * @param loginUser
	 * @return
	 */

	public int removeLike(BoardLikeVO likeVo) {
		
		int removeLike = sqlSession.delete("boardMapper.removeLike", likeVo);

		if(removeLike > 0) {
			 
		sqlSession.update("boardMapper.boardLikeMinus",likeVo.getBoardNo());
			
		return removeLike;
			
		} else {
		    	
		return -1;
		}
	}
	



	/**
	 * 좋아요 갯수 
	 * @param boardNo
	 * @return
	 */
	public int countLike(int boardNo) {
	    return sqlSession.selectOne("boardMapper.countLike", boardNo);
	}

	/**
	 * 좋아요 한지 안한지 체크
	 * @param likeVo
	 * @return
	 */
	public int checkLike(BoardLikeVO likeVo) {
		return sqlSession.selectOne("boardMapper.checkLike", likeVo);
	}

	/**
	 * 댓글 갯수 가져오기 DAO
	 * @param boardNo
	 * @return
	 */
	public int getReplyCount(int boardNo) {
		return sqlSession.selectOne("replyMapper.getReplyCount", boardNo);
	}


	public int loginUserBoardWriteUsercheck(BoardLikeVO likeVo) {
		return sqlSession.selectOne("boardMapper.loginUserBoardWriteUsercheck", likeVo);
	}



}