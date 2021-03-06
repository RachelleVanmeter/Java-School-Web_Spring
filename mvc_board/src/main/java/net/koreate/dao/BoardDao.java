package net.koreate.dao;

import java.util.List;

import net.koreate.vo.BoardVo;
import net.koreate.vo.Criteria;
import net.koreate.vo.SearchCriteria;

public interface BoardDao {

	public void create(BoardVo boardVo) throws Exception;
	public List<BoardVo> listAll() throws Exception;
	public BoardVo read(int bno) throws Exception;
	public void modify(BoardVo boardVo) throws Exception;
	public void remove(int bno) throws Exception;
	public List<BoardVo> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria() throws Exception;
	public void updateViewCnt(int bno) throws Exception;
	public List<BoardVo> listSearch(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
}
