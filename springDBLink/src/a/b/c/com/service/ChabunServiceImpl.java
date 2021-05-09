package a.b.c.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.dao.ChabunDAO;
import a.b.c.com.dept.vo.DeptVO;
import a.b.c.com.lesson.vo.LessonVO;

@Service
@Transactional
public class ChabunServiceImpl implements ChabunService {
	
	@Autowired
	private ChabunDAO chabunDAO;

	@Override
	public DeptVO getChabun() {
		// TODO Auto-generated method stub
		return chabunDAO.getChabun();
	}

	@Override
	public LessonVO getLessonChabun() {
		// TODO Auto-generated method stub
		
		return chabunDAO.getLessonChabun();
	}

}
