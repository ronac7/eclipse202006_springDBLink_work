package a.b.c.com.dept.dao;

import java.util.List;

import a.b.c.com.dept.vo.DeptVO;

public interface DeptMapper {
	
	public List<DeptVO> listDepartment(DeptVO param);
	public List<DeptVO> selectDepartment(DeptVO param);
	public int insertDepartment(DeptVO param);
	public int updateDepartment(DeptVO param);
	public int deleteDepartment(DeptVO param);

}
