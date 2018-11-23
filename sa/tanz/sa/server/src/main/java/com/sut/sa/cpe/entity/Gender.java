package com.sut.sa.cpe.entity;

import lombok.*;

import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import com.fasterxml.jackson.core.sym.Name;

//import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

import javax.persistence.SequenceGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Gender")
public class Gender {
    @Id
    @SequenceGenerator(name = "gender_seq",sequenceName = "gender_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gender_seq")
    @Column(name = "genderId" ,unique = true, nullable = true)
    private @NonNull Long genderId;//1ไพเมรี่คี
    private  String gender;//แอคทิิ


   /* @OneToMany
     @JoinColumn(name = "informationpersonId")
    private InfromationPerson infromationPerson;*/

    public Long getGenderId() {
        return genderId;
    }

    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}