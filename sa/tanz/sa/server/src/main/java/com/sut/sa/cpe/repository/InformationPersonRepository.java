package com.sut.sa.cpe.repository;

import com.sut.sa.cpe.entity.InformationPerson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface InformationPersonRepository extends JpaRepository<InformationPerson, Long> {
	InformationPerson findByinformationpersonId (String informationPerson);

	}
