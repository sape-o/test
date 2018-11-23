package com.sut.sa.cpe.controller;

import com.sut.sa.cpe.entity.*;
import com.sut.sa.cpe.repository.*;
import com.sut.sa.cpe.repository.InformationPersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.Date;
import java.util.Collection;
import java.util.stream.Collectors;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InformationPersonController {
    @Autowired
    private InformationPersonRepository informationPersonRepository;
    @Autowired
    private GenderRepository genderRepository;
    @Autowired
    private TypePersonRepository typepersonRepository;
    @Autowired
    private UserRepository userRepository;

    public InformationPersonController(InformationPersonRepository informationPersonRepository,
                              UserRepository userRepository,
                              GenderRepository genderRepository,
                              TypePersonRepository typepersonRepository) {
        this.informationPersonRepository = informationPersonRepository;
        this.userRepository = userRepository;
        this.genderRepository = genderRepository;
        this.typepersonRepository = typepersonRepository;
    }

    //customer
    @GetMapping(path = "/InformationPerson", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<InformationPerson> getInformationPersons() {
        return informationPersonRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/InformationPerson/{informationpersonId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public InformationPerson getOneCustomer(@PathVariable Long informationpersonId){
        return informationPersonRepository.findById(informationpersonId).get();
    }
    //title
    @GetMapping(path = "/User", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<User> getUsers() {
        return userRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/User/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getOneUser(@PathVariable long userId){
        return userRepository.findById(userId).get();
    }

    //gender
    @GetMapping(path = "/Gender", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Gender> getGender() {
        return genderRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/Gender/{genderId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Gender getOneGender(@PathVariable long genderId){
        return genderRepository.findById(genderId).get();
    }
    //province
    @GetMapping(path = "/TypePerson", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<TypePerson> getProvince() {
        return typepersonRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/TypePerson/{typepersonId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TypePerson getOneTypePerson(@PathVariable long typepersonId){
        return typepersonRepository.findById(typepersonId).get();
    }


    @GetMapping(path ="/InformationPerson/{name}/{idCardNumber}/{address}/{Phonenumber}/{birthday}/{email}/{age}/{career}/{password}/{genderselect}/{typeperson}")
    public InformationPerson newInformationPerson(@PathVariable String name ,
                                                  @PathVariable String idCardNumber,
                                                  @PathVariable String address,
                                                  @PathVariable String Phonenumber,
                                                  @PathVariable String birthday,
                                                  @PathVariable String email,
                                                  @PathVariable Integer age,
                                                  @PathVariable String career,
                                                  @PathVariable String password,
                                                  @PathVariable String genderselect,
                                                  @PathVariable String typeperson
                                )throws ParseException {
        System.out.print("OK");
        Gender gender = genderRepository.findBygender(genderselect);
        TypePerson typePerson = typepersonRepository.findByNametype(typeperson);

        System.out.print(gender);
        System.out.print(typeperson);

        User user = new User();
        user.setId(email);
        user.setPassword(password);
        userRepository.save(user);

        DateFormat newDate = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss");
	 		  Date b = newDate.parse(birthday);

        InformationPerson c = new InformationPerson();
        c.setName(name);
        c.setGender(gender);
        c.setIdCardNumber(idCardNumber);
        c.setAddress(address);
        c.setPhonenumber(Phonenumber);
        c.setBirthday(b);
        c.setEmail(email);
        c.setAge(age);
        c.setCareer(career);
        c.setTpyePerson(typePerson);
        c.setUser(user);


        informationPersonRepository.save(c);
        return c;
    }
    @DeleteMapping(path ="Informationperson/{InformationpersonId}")
    void deleteInformationpersonId(@PathVariable Long informationpersonId){
       informationPersonRepository.deleteById(informationpersonId);
    }
}
