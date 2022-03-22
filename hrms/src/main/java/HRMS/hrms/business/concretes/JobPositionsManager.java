package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.IJobPositionsService;
import HRMS.hrms.dataAccess.abstracts.JobPositionDal;
import HRMS.hrms.entites.concretes.JobPositions;

@Service
public class JobPositionsManager implements IJobPositionsService{

	private JobPositionDal jobPositionDal;
	
	
	@Autowired
	public JobPositionsManager(JobPositionDal jobPositionDal) {
		this.jobPositionDal = jobPositionDal;
	}
	
	
	@Override
	public List<JobPositions> getAll() {
		// TODO Auto-generated method stub
		
		List<JobPositions> allPositions;
		
		allPositions = this.jobPositionDal.findAll();
		
		if (allPositions == null) {
			return null;
		}
			else {
				return allPositions;
			}
	}
	
}
