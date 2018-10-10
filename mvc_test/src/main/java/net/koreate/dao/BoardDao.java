package net.koreate.dao;

import java.util.List;

import net.koreate.vo.BoardVo;
import net.koreate.vo.Criteria;

public interface BoardDao {

	void create(BoardVo VO) throws Exception;
	List<BoardVo> listCriteria(Criteria cri) throws Exception;
	int listCountCriteria(Criteria cri) throws Exception;

}