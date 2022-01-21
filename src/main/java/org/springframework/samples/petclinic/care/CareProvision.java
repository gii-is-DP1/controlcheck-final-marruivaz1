package org.springframework.samples.petclinic.care;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="care_provision")
public class CareProvision extends BaseEntity{   
    
	@NotNull
	@Min(0)
	@Column(name="duration")
	double duration;
	
	
	@ManyToOne
	@JoinColumn(name="visit_id")
    Visit visit;
    
	@NotNull
	@ManyToOne
    @JoinColumn(name="care_id")
    Care care;   
}
