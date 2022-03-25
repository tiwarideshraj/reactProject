package com.example.demo.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TerminalDto;
import com.example.demo.entity.Cource;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Terminal;
import com.example.demo.repository.OrganizationRepo;
import com.example.demo.repository.TerminalRepo;
import com.example.demo.repository.courceRepo;
import com.example.demo.services.OraginazationService;
@Service
public class OrginzationServiceImp implements OraginazationService{

	@Autowired
	private OrganizationRepo orgrep;
	
	@Autowired
	private TerminalRepo terrep;
	@Autowired
	private courceRepo courceRep;
	@Override
	public List<Organization> findByDelid(String delid) {
		
		return orgrep.findByDelid(delid);
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public List<Terminal> findTerminialByOrgid(Organization orgid) {
		// TODO Auto-generated method stub
		Terminal ter= new Terminal();
		
		return terrep.findByOrgid(orgid);
	}*/
	
	@Override
	public List<TerminalDto> findTerminalByOrgid(int orgid) {
		// TODO Auto-generated method stub
		
		
		 List<Terminal> terminal= terrep.findTerminialByOrgid(orgid);
		 List<TerminalDto> tdto=new ArrayList<>();
		for(Terminal t:terminal) {
			TerminalDto dto=new TerminalDto();
			dto.setTrid(t.getTrid());
			dto.setTrname(t.getTrname());
			dto.setTrtype(t.getTrtype());
			dto.setOrgid(t.getOrgid().getOrgid());
			tdto.add(dto);
		}
		return tdto;
	}

	@Override
	public Organization saveOrganization(Organization org) {
		// TODO Auto-generated method stub
		return orgrep.save(org);
	}

	@Override
	public Terminal saveTerminal(Terminal ter) {
		// TODO Auto-generated method stub
		return terrep.save(ter);
	}
	
	@Override
	public List<Terminal> allTerminals() {
		// TODO Auto-generated method stub
		return terrep.findAll();
	}

	@Override
	public List<Cource> allcource() {
		// TODO Auto-generated method stub
		return courceRep.findAll();
	}
}
