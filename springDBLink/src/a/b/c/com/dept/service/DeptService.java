package a.b.c.com.dept.service;

import java.util.List;

import a.b.c.com.dept.vo.DeptVO;

public interface DeptService {
	
	public List<DeptVO> listDepartment(DeptVO param);
	public List<DeptVO> selectDepartment(DeptVO param);
	public int insertDepartment(DeptVO param);
	public int updateDepartment(DeptVO param);
	public int deleteDepartment(DeptVO param);

}
