package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TerminalDto;
import com.example.demo.entity.Cource;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;
import com.example.demo.repository.OrganizationRepo;
import com.example.demo.repository.TerminalRepo;
import com.example.demo.services.OraginazationService;

@RestController
public class OrganizationController {

	@Autowired
	private OraginazationService serv;
	
	@RequestMapping("/")
	public String hello() {
		
		return "development";
	}
	
	//fecthing get customers for dealerid
	
	@GetMapping("/dealer/{delid}")
	public List<Organization> findByDelarid(@PathVariable String delid) {

		//System.out.println(delid);
		//return org.findByDelid(delid);
		return serv.findByDelid(delid);
		
		
	}
	// get terminal
	
	/*@GetMapping("/terminal/{orgid}")
	public List<Terminal> findByOrgid(@PathVariable Organization orgid){
		
		
		return serv.findTerminialByOrgid(orgid);
	}*/
	
	//fetching get terminals for customers id
	
	@GetMapping("/Customers/{orgid}")
	public List<TerminalDto> findByOrgid(@PathVariable int orgid){
		
		return serv.findTerminalByOrgid(orgid);
	}
	
	// add dealer and customers
	
	@PostMapping("/addOrganization")
	public Organization addOrganization(@RequestBody Organization org) {
		
		return serv.saveOrganization(org);
		
		
	}
	
	@PostMapping("/addTerminal")
	public Terminal addTerminal(@RequestBody Terminal ter) {
		
		return serv.saveTerminal(ter);
		
		
	}
	
	@GetMapping("/allTerminals")
	public List<Terminal> allTerminals() {
		
		return serv.allTerminals();
		
		
	}
	
	@GetMapping("/allCource")
	public List<Cource> allCource() {
		
		return serv.allcource();
		
		
	}
	
}
