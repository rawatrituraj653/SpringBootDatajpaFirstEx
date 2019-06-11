package com.st.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	@Id
	@NonNull
	@GeneratedValue
	private Integer eid;	
	@NonNull
	private String ename;
	@NonNull
	private Double esal;
	@NonNull
	private Integer deptno;
	public Employee(@NonNull String ename, @NonNull Double esal, @NonNull Integer deptno) {
		this.ename = ename;
		this.esal = esal;
		this.deptno = deptno;
	}
	
	
}
