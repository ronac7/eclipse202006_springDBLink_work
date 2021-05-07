package a.b.c.com.dept.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import a.b.c.com.dept.vo.DeptVO;

public class DeptMapperImpl extends SqlSessionDaoSupport implements DeptMapper {
	
	private final String PACKAGE_PATH = "com.spring.dept.dao.DeptDAO.";

	@Override
	public List<DeptVO> listDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(PACKAGE_PATH+"listDepartment");
	}

	@Override
	public List<DeptVO> selectDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(PACKAGE_PATH+"selectDepartment");
	}

	@Override
	public int insertDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return (int)getSqlSession().insert(PACKAGE_PATH+"insertDepartment");
	}

	@Override
	public int updateDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return (int)getSqlSession().update(PACKAGE_PATH+"updateDepartment");
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return (int)getSqlSession().update(PACKAGE_PATH+"deleteDepartment");
	}

}
