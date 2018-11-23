package com.sut.sa.cpe.repository;
import com.sut.sa.cpe.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface GenderRepository extends JpaRepository<Gender, Long> {
    Gender findBygender (String gender);

	}
