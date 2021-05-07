package a.b.c.com.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import a.b.c.com.dept.service.DeptService;
import a.b.c.com.dept.vo.DeptVO;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {
	
	private static final String CONTEXT_PATH="dept";
	
	@Autowired
	private DeptService deptService;
	
	/* 전체조회 */
	@RequestMapping("/listDepartment")
	public ModelAndView listDepartment(@ModelAttribute DeptVO param) {
		List<DeptVO> list = deptService.listDepartment(param);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("departmentList", list);
		mav.setViewName(CONTEXT_PATH + "/department");
		return mav;
		
	}
	
	/* 상세 정보 보기 */
	@RequestMapping("/selectDepartment")
	public ModelAndView selectDepartment(@ModelAttribute DeptVO param) {
		
		ModelAndView mav = new ModelAndView();
		
		if (param.getDeptid().equals("")) { // 등록 버튼 클릭시
			mav.addObject("mode", "insert");
		} else { //[수정/삭제] 버튼 클릭시
			mav.addObject("DeptVO", param);
			mav.addObject("mode", "update");
		}
		
		mav.setViewName(CONTEXT_PATH + "/department_pop");
		
		return mav;
		
	}
	
	/* 레코드 추가 */
	@RequestMapping("/insertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute DeptVO param) {
		String resultStr = "";
		
		int result = deptService.insertDepartment(param);
		
		if (result > 0) resultStr = "등록이 완료되었습니다.";
		else resultStr = "등록에 문제가 있어 완료하지 못했습니다.";
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", resultStr);
		mav.setViewName("result");
		
		return mav;
	}
	
	/* 레코드 수정 */
	@RequestMapping("/updateDepartment")
	public ModelAndView updateDepartment(@ModelAttribute DeptVO param) {
		
		String resultStr = "";
		
		int result = deptService.updateDepartment(param);
		
		if(result > 0) resultStr = "수정이 완료되었습니다.";
		else resultStr = "수정에 문제가 있어 완료하지 못했습니다.";
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", resultStr);
		mav.setViewName("result");
		
		return mav;
	}
	
	/* 레코드 삭제 */
	@RequestMapping("/deleteDepartment")
	public ModelAndView deleteDepartment(@ModelAttribute DeptVO param) {
		String resultStr = "";
		int result = deptService.deleteDepartment(param);
		
		if(result > 0) resultStr = "삭제가 완료되었습니다.";
		else resultStr = "삭제가 문제가 있어 완료하지 못했습니다.";
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", resultStr);
		mav.setViewName("result");
		
		return mav;
	}

}
