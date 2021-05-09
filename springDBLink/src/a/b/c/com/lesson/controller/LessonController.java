package a.b.c.com.lesson.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.lesson.service.LessonService;
import a.b.c.com.lesson.vo.LessonVO;
import a.b.c.com.service.ChabunService;

@Controller
@RequestMapping(value="/lesson")
public class LessonController {
	
	private static final String CONTEXT_PATH = "lesson";
	private Logger logger = Logger.getLogger(LessonController.class);
	private ChabunService chabunService;
	
	@Autowired
	private LessonService lessonService;
	
	// #################### 전체 조회 ####################
	@RequestMapping("/listLesson")
	public ModelAndView listLesson(@ModelAttribute LessonVO param) {
		logger.info("LessonController listLesson >>> : ");
		
		List<LessonVO> list = lessonService.listLesson(param);
		ModelAndView mav = new ModelAndView();
		mav.addObject("lessonList", list);
		mav.addObject("paramName", param.getLname());
		mav.setViewName(CONTEXT_PATH + "/lesson");
		
		return mav;
	}
	
	// #################### 상세정보 보기 ####################
	@RequestMapping("/selectLesson")
	public ModelAndView selectLesson(@ModelAttribute LessonVO param) {
		logger.info("LessonController selectLesson >>> : ");
		
		List<LessonVO> list = lessonService.listLesson(param);
		logger.info("LessonController selectLesson no >>> : " + param.getNo());
		
		ModelAndView mav = new ModelAndView();
		if (param.getNo() == 0) {
			mav.addObject("mode", "insert");
		} else {
			mav.addObject("lessonVO", list.get(0));
			mav.addObject("mode", "update");
		}
		mav.setViewName(CONTEXT_PATH + "/lesson_pop");
		return mav;
	}
	
	// #################### 레코드 추가 ####################
	@RequestMapping("/insertLesson")
	public ModelAndView insertLesson(@ModelAttribute LessonVO param) {
		logger.info("LessonController insertLesson >>> : ");
		
		String resultStr = "";
		
		// 채번 세팅
		String no = ChabunUtil.getLessonChabun("N", chabunService.getLessonChabun().getNo());
		int result = lessonService.insertLesson(param);
		
		if(result > 0) resultStr = "등록이 완료되었습니다.";
		else resultStr = "등록에 문제가 있어 완료하지 못했습니다.";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName("/result");
		
		return mav;
	}
	
	// #################### 레코드 수정 ####################
	@RequestMapping("/updateLesson")
	public ModelAndView updateLesson(@ModelAttribute LessonVO param) {
		logger.info("LessonController updateLesson >>> : ");
		
		String resultStr = "";
		int result = lessonService.updateLesson(param);
		
		if(result > 0) resultStr = "수정이 완료되었습니다.";
		else resultStr = "수정에 문제가 있어 완료하지 못했습니다.";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName("/result");
		
		return mav;
	}
	
	// #################### 레코드 삭제 ####################
	@RequestMapping("/deleteLesson")
	public ModelAndView deleteLesson(@RequestParam("no") int no) {
		logger.info("LessonController deleteLesson >>> : ");
		
		String resultStr = "";
		int result = lessonService.deleteLesson(no);
		
		if(result > 0) resultStr = "삭제가 완료되었습니다.";
		else resultStr = "삭제에 문제가 있어 완료하지 못했습니다.";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName("/result");
		
		return mav;
	}
	
}










