package edu.kh.fin.band.checkPw.model.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CheckPwDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;


	public String selectEncPw(int userNo) {

		return sqlSession.selectOne("loginMapper.selectEncPw",userNo);
	}

}
