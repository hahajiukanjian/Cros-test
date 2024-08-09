package com.hahajiukanjian.crosapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrosController {

	@PostMapping("/PostCros")
	@ResponseBody
	public ResponseEntity<String> PostCros01 (){
		//return "successPostCros01";
		return new ResponseEntity<>("successPostCros01", HttpStatus.OK);
	}

	@GetMapping("/GetCros")
	public String GetCros01() {
		return "successGetCros01";
	}

}
