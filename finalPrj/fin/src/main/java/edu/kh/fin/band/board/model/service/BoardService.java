package edu.kh.fin.band.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import edu.kh.fin.band.board.model.vo.Board;
import edu.kh.fin.band.board.model.vo.BoardBanned;
import edu.kh.fin.band.board.model.vo.BoardDetail;
import edu.kh.fin.band.board.model.vo.BoardLikeVO;
import edu.kh.fin.band.board.model.vo.Criteria;

public interface BoardService {

	int write(Board board);

	List<BoardDetail> boardList(Criteria cri, String searchType, String keyword);

	BoardDetail boardDetail(int boardNo);

	int updateReadCount(int boardNo);

	int delete(int boardNo);

	int boardUpdate(Board board);

	int getTotal(Criteria cri);

	List<BoardDetail> boardTalk(Criteria cri);

	List<BoardDetail> boardQus(Criteria cri);

	List<BoardDetail> boardAll(Criteria cri);

	List<BoardDetail> boardList(Criteria cri);

	void reportUser(BoardBanned boardBanned);

	List<String> bannedUserIds(BoardBanned boardBanned);

	/**
	 * 좋아요 등록 
	 * @author lee
	 * @param likeVo
	 * @return
	 */
	public void addLike(BoardLikeVO likeVo);

	/**
	 * 좋아요 취소 
	 * @author lee
	 * @param likeVo
	 * @return
	 */
	public void removeLike(BoardLikeVO likeVo);

	
//	/**
//	 * 좋아요 갯수 
//	 * @author lee
//	 * @param board_no
//	 * @return
//	 */
//	public int countLike(int board_no);

	/**
	 * 좋아요 한지 안한지 체크
	 * @author lee
	 * @param like
	 * @return
	 */
	int checkLike(BoardLikeVO likeVo);

	/**
	 * 댓글 갯수 가져오기 서비스
	 * @author lee
	 * @param boardNo
	 * @return
	 */
	int getReplyCount(int boardNo);










}