package com.sut.sa.cpe.repository;

import com.sut.sa.cpe.entity.TypePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface TypePersonRepository extends JpaRepository<TypePerson, Long> {
	TypePerson findByNametype (String nametype);

	}
