package com.sut.sa.cpe.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
@Table(name = "InformationPerson")
public class InformationPerson {
    @Id
    @SequenceGenerator(name="informationperson_seq",sequenceName="informationperson_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="informationperson_seq")
    @Column(name="informationpersonId",unique = true, nullable = false)

    private @NonNull Long informationpersonId;

    private  String name;
    private  String idCardNumber;
    private  String address;
    private  String Phonenumber;
    private  Date birthday;
    private  String email;
    private  Integer age;
    private  String career;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

   @ManyToOne
   @JoinColumn(name = "genderId")
   private Gender gender;


   @ManyToOne
   @JoinColumn(name = "tpyepersonId")
    private TypePerson tpyeperson;

    public String getName() {
     return name;
    }
    public String getIdCardNumber() {
        return idCardNumber;
    }
    public String getAddress() {
        return address;
    }
    public Date getBirthday() {
        return birthday;
    }
    public String getPhonenumber() {
       return Phonenumber;
    }
    public Integer getAge() {
       return age;
    }
    public String getCareer() {
       return career;
    }
    public String getEmail() {
        return email;
    }

    public Long getInformationPersonId() {
        return informationpersonId;
    }



    public User getUser(){
        return user;
    }
    public Gender getGender() {
        return gender;
    }
    public TypePerson getTpyeperson(){
        return tpyeperson;
    }
    public void setInformatPersonionId(Long informationperson) {
        this.informationpersonId = informationpersonId;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setTpyePerson(TypePerson tpyeperson){
        this.tpyeperson = tpyeperson;
    }
    public void setUser(User user){
          this.user = user;
     }



    public void setName(String name) {
        this.name = name;
    }

    public void setIdCardNumber(String idCardNumber){
        this.idCardNumber = idCardNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setCareer(String career) {
        this.career = career;
    }




}
