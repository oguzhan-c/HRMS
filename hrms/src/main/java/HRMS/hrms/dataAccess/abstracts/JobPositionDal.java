package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entites.concretes.JobPositions;

public interface JobPositionDal extends JpaRepository<JobPositions, Integer>{

}
