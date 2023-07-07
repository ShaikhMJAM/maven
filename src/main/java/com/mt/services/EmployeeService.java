package com.mt.services;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

	
	@GetMapping(value = "/getEmployeeDetails", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {"application/json"})
	@ResponseBody
	public String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws Exception {

		JSONObject js = new JSONObject();
		js.put("Name", "Mithun Technologies");
		js.put("Calling Name", "Mithun");
		js.put("DOB", "08-Nov-2011");
		js.put("Hobbies", "Reading Technical Blogs,Teaching, Helping to Poor People..");
		js.put("Places he like", "His native place");

		return js.toString();
}
}
