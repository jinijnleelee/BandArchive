package edu.kh.fin.band.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.fin.band.board.model.dao.BoardDAO;
import edu.kh.fin.band.board.model.vo.Board;
import edu.kh.fin.band.board.model.vo.BoardBanned;
import edu.kh.fin.band.board.model.vo.BoardDetail;
import edu.kh.fin.band.board.model.vo.BoardLikeVO;
import edu.kh.fin.band.board.model.vo.Criteria;
@Service
public class BoardServiceImpl implements BoardService{


	@Autowired
	private BoardDAO dao;

	@Override
	public int write(Board board) {
		// TODO Auto-generated method stub
		return dao.write(board);
	}

	@Override
	public List<BoardDetail> boardList(Criteria cri, String searchType, String keyword) {
		// TODO Auto-generated method stub
		return dao.boardList(cri, searchType,keyword);
	}

	@Override
	public BoardDetail boardDetail(int boardNo) {
		// TODO Auto-generated method stub
		return dao.boardDetail(boardNo);
	}

	@Override
	public int updateReadCount(int boardNo) {
		return dao.updateReadCount(boardNo);

	}

	@Override
	public int  delete(int boardNo) {
		return dao.delete(boardNo);

	}

	@Override
	public int boardUpdate(Board board) {
		// TODO Auto-generated method stub
		 return dao.boardUpdate(board);
	}


	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		return dao.getTotal(cri);
	}

	@Override
	public List<BoardDetail> boardTalk(Criteria cri) {
		// TODO Auto-generated method stub
		return dao.boardTalk(cri);
	}

	@Override
	public List<BoardDetail> boardQus(Criteria cri) {
		// TODO Auto-generated method stub
		return dao.boardQus(cri);
	}

	@Override
	public List<BoardDetail> boardAll(Criteria cri) {
		// TODO Auto-generated method stub
		return dao.boardAll(cri);
	}

	@Override
	public List<BoardDetail> boardList(Criteria cri) {
		// TODO Auto-generated method stub
		return dao.boardList(cri);
	}

	@Override
	public void reportUser(BoardBanned boardBanned) {
		// TODO Auto-generated method stub

		dao.reportUser(boardBanned);
	}

	@Override
	public List<String> bannedUserIds(BoardBanned boardBanned) {
		// TODO Auto-generated method stub
		return dao.bannedUserIds(boardBanned);
	}


	/**
	 * 좋아요 등록
	 * @author lee
	 * @param likeVo
	 * @return
	 */

	@Override
	public int addLike(BoardLikeVO likeVo) {
		return  dao.addLike(likeVo);

	}

	/**
	 * 좋아요 한지 안한지 체크
	 * @author lee
	 * @param boardDetail
	 * @return
	 */
	@Override
	public int checkLike(BoardLikeVO likeVo) {
		return dao.checkLike(likeVo);
	}



	/**
	 * 댓글 갯수 가져오기 서비스
	 * @author lee
	 * @param boardNo
	 * @return
	 */
	@Override
	public int getReplyCount(int boardNo) {
		return dao.getReplyCount(boardNo);
	}



	@Override
	public int removeLike(BoardLikeVO likeVo) {
		return	dao.removeLike(likeVo);

	}

	@Override
	public int countLike(int boardNo) {
		return dao.countLike(boardNo);
	}

	@Override
	public int loginUserBoardWriteUsercheck(BoardLikeVO likeVo) {
		return dao.loginUserBoardWriteUsercheck(likeVo);
	}

//	@Override
//	public int getLike(int boardNo) {
//		// TODO Auto-generated method stub
//		return dao.getLike(boardNo);
//	}

}
