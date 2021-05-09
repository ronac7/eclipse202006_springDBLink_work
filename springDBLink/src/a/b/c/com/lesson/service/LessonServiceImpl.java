package a.b.c.com.lesson.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.lesson.dao.LessonMapper;
import a.b.c.com.lesson.vo.LessonVO;

@Service
@Transactional
public class LessonServiceImpl implements LessonService {
	
	private Logger logger = Logger.getLogger(LessonServiceImpl.class);
	
	@Autowired
	private LessonMapper lessonMapper;

	@Override
	public List<LessonVO> listLesson(LessonVO param) {
		// TODO Auto-generated method stub
		List<LessonVO> list = new ArrayList<LessonVO>();
		list = lessonMapper.listLesson(param);
		return list;
	}

	@Override
	public List<LessonVO> selectLesson(LessonVO param) {
		// TODO Auto-generated method stub
		List<LessonVO> list = new ArrayList<LessonVO>();
		list = lessonMapper.selectLesson(param);
		return list;
	}

	@Override
	public int insertLesson(LessonVO param) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl insertLesson 함수 진입 >>>: ");
		logger.info("LessonServiceImpl lvo >>>: " + param);
		return lessonMapper.insertLesson(param);
	}

	@Override
	public int updateLesson(LessonVO param) {
		// TODO Auto-generated method stub
		return lessonMapper.updateLesson(param);
	}

	@Override
	public int deleteLesson(int no) {
		// TODO Auto-generated method stub
		return lessonMapper.deleteLesson(no);
	}

}
