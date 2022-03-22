package HRMS.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.hrms.business.abstracts.IJobPositionsService;
import HRMS.hrms.entites.concretes.JobPositions;

@RestController
@RequestMapping("/api/jobPositions")
public class JobController {
	
	private	IJobPositionsService jobPositionsService;

	@Autowired 
	public JobController(IJobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}

	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		
		if (jobPositionsService.getAll() != null) {
			return jobPositionsService.getAll();
		}
		else {
			System.out.println("Data Bulunamadı");
			return null;
		}
	}
}
