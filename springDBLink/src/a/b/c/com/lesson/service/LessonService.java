package a.b.c.com.lesson.service;

import java.util.List;

import a.b.c.com.lesson.vo.LessonVO;

public interface LessonService {
	
	public List<LessonVO> listLesson(LessonVO param);
	public List<LessonVO> selectLesson(LessonVO param);
	public int insertLesson(LessonVO param);
	public int updateLesson(LessonVO param);
	public int deleteLesson(int no);
}
