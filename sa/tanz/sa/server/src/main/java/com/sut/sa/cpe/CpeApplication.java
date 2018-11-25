package com.sut.sa.cpe;

import java.util.stream.Stream;

import com.sut.sa.cpe.entity.*;
import com.sut.sa.cpe.repository.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import java.text.SimpleDateFormat;

//import java.util.stream.Stream;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@SpringBootApplication
public class CpeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpeApplication.class, args);
    }

    @Bean
    ApplicationRunner init(InformationPersonRepository informationPersonRepository,
            TypePersonRepository typePersonRepository, GenderRepository genderRepository,
            UserRepository userRepository)throws ParseException  {
              DateFormat newDate = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss");
              Date b = newDate.parse("Sun Nov 18 2018 00:00:00 GMT+0700 (Indochina Time)");
        return args -> {
            // SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

            TypePerson e = new TypePerson();
            e.setNameType("employeePosition");
            TypePerson e1 = new TypePerson();
            e1.setNameType("HouseOwner");
            TypePerson    e2 = new TypePerson();
            e2.setNameType("LesseeInformation");

            typePersonRepository.save(e);
            typePersonRepository.save(e1);
            typePersonRepository.save(e2);
            Gender g = new Gender();
            g.setGender("Male");
            Gender g1 = new Gender();
            g1.setGender("Female");
            genderRepository.save(g);
            genderRepository.save(g1);

            Stream.of("tanz123@gmail.com").forEach(userid -> {
                User u = new User();
                u.setId(userid);
                u.setPassword("p");
                userRepository.save(u);


                InformationPerson c = new InformationPerson();
                c.setName("tanz");
                c.setIdCardNumber("1319900521000");
                c.setAddress("suranree");
                c.setPhonenumber("09883130000");
                c.setBirthday(b);
                c.setEmail(userid);
                c.setAge(12);
                c.setCareer("-");
                c.setUser(u);
                TypePerson ty = typePersonRepository.findByNametype("employeePosition");
                c.setTpyePerson(ty);
                Gender gender = genderRepository.findBygender("Female");
                c.setGender(gender);
                informationPersonRepository.save(c);
            });

        };
    }
}
