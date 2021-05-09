package a.b.c.com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.dept.vo.DeptVO;
import a.b.c.com.lesson.vo.LessonVO;

@Repository
public class ChabunDAOImpl implements ChabunDAO {
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	@Override
	public DeptVO getChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getChabun");
	}

	@Override
	public LessonVO getLessonChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getLessonChabun");
	}

}
