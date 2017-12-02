/*
 * @(#) EmployeeController.java
 *
 * Copyright 2012 by LG CNS, Inc.,
 * All rights reserved.
 *
 * Do Not Erase This Comment!!! (이 주석문을 지우지 말것)
 *
 * 본 클래스를 실제 프로젝트에 사용하는 경우 XXXX 프로젝트 담당자에게
 * 프로젝트 정식명칭, 담당자 연락처(Email)등을 mail로 알려야 한다.
 *
 * 소스를 변경하여 사용하는 경우 XXXX 프로젝트 담당자에게
 * 변경된 소스 전체와 변경된 사항을 알려야 한다.
 * 저작자는 제공된 소스가 유용하다고 판단되는 경우 해당 사항을 반영할 수 있다.
 *
 * (주의!) 원저자의 허락없이 재배포 할 수 없으며
 * LG CNS 외부로의 유출을 하여서는 안 된다.
 */
package devonframe.sample.office.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import devonframe.sample.office.employee.model.Employee;
import devonframe.sample.office.employee.service.EmployeeService;

/**
 * <pre>
 * 본 클래스는 사원 정보에 대한 CRUD를 담당하는 Controller 클래스입니다.
 * </pre>
 *
 * @author XXX팀 OOO
 */

@Controller
public class EmployeeController {

	@Resource(name = "employeeServiceForDao")
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee/retrieveEmployeeList.do")
	public String retrieveEmployeeList(Employee input, ModelMap model) {
		List<Employee> resultList = employeeService.retrieveEmployeeList(input);
		model.addAttribute("input", input);
		model.addAttribute("resultList", resultList);
		return "employee_vo_form";
	}

	@RequestMapping(value = "/employee/retrieveEmployeeAjaxPage.do")
	public String retrieveEmployeeAjaxPage(Employee input, ModelMap model) {
		return "employee_vo_ajax";
	}

	@RequestMapping(value = "/employee/retrieveEmployeeList.ajax")
	@ResponseBody
	public Map<String, Object> retrieveEmployeeListAjax(Employee input, ModelMap model) {
		List<Employee> resultList = employeeService.retrieveEmployeeList(input);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("input", input);
		map.put("resultList", resultList);
		return map;
	}

}
