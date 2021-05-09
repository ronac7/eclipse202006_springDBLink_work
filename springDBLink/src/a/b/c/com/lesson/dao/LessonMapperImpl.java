package a.b.c.com.lesson.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import a.b.c.com.lesson.vo.LessonVO;


public class LessonMapperImpl extends SqlSessionDaoSupport implements LessonMapper {
	
	private Logger logger = Logger.getLogger(LessonMapperImpl.class);
	private final String PACKAGE_PATH = "a.b.c.com.lesson.dao.LessonDAO";

	@Override
	public List<LessonVO> listLesson(LessonVO param) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(PACKAGE_PATH + "/listLesson");
	}

	@Override
	public List<LessonVO> selectLesson(LessonVO param) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne(PACKAGE_PATH+"selectLesson");
	}

	@Override
	public int insertLesson(LessonVO param) {
		// TODO Auto-generated method stub
		logger.info("insertLesson 함수 진입 >>> : ");
		logger.info("insertLesson lvo >>> : " + param);
		return (int)getSqlSession().insert(PACKAGE_PATH+"insertLesson");
	}

	@Override
	public int updateLesson(LessonVO param) {
		// TODO Auto-generated method stub
		return (int)getSqlSession().update(PACKAGE_PATH+"updateLesson");
	}

	@Override
	public int deleteLesson(int no) {
		// TODO Auto-generated method stub
		return (int)getSqlSession().delete(PACKAGE_PATH+"deleteLesson");
	}

}
