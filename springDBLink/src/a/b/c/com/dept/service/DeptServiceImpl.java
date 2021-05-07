package a.b.c.com.dept.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.dept.dao.DeptMapper;
import a.b.c.com.dept.vo.DeptVO;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<DeptVO> listDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		List<DeptVO> list = new ArrayList<DeptVO>();
		list = deptMapper.listDepartment(param);
		
		return list;
	}

	@Override
	public List<DeptVO> selectDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		List<DeptVO> list = new ArrayList<DeptVO>();
		list = deptMapper.selectDepartment(param);
		
		return list;
	}

	@Override
	public int insertDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return deptMapper.insertDepartment(param);
	}

	@Override
	public int updateDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return deptMapper.updateDepartment(param);
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return deptMapper.deleteDepartment(param);
	}

}
