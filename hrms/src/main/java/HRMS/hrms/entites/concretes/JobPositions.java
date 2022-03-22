package HRMS.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import HRMS.hrms.entites.abstracts.IEntity;
import lombok.Data;


@Data
@Entity
@Table(name = "jobpositons")
public class JobPositions implements IEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id ;
	
	@Column(name = "positionname")
	private String positionName;
	
	public JobPositions() {
		
	}
	
	public JobPositions(int id , String positionName) {
		this.id = id;
		this.positionName = positionName;
	}
	
}
