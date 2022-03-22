package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.entites.concretes.JobPositions;

public interface IJobPositionsService {
	List<JobPositions> getAll();
}
