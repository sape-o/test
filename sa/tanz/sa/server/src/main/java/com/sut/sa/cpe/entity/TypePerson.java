package com.sut.sa.cpe.entity;

import lombok.*;

import javax.persistence.*;
//import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "TypePerson")
public class TypePerson {
    @Id
    @SequenceGenerator(name="typeperson_seq",sequenceName="typeperson_seq")               
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="typeperson_seq")  
    @Column(name="tyepersonId",unique = true, nullable = false)

    private @NonNull Long typepersonId;
    
    private  String nametype;

   // @OneToMany
    //@JoinColumn(name = "infromationpersonId")
   // private InfromationPerson  InfromationPerson;


    public void setNameType(String nametype) {
        this.nametype = nametype;
    }
    
    public String getNameType() {
        return nametype;
    }
}
    
   /* public InfromationPerson setInfromationPerson(){
        return InfromationPerson;
    }
        
    public void setInfromationPerson(InfromationPerson infromationperson){
            this.InfromationPerson = infromationperson;
     }*/