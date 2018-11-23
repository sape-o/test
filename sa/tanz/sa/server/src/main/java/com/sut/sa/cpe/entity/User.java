package com.sut.sa.cpe.entity;

import lombok.*;

import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="user")
public class User {
	@Id
	@SequenceGenerator(name="user_seq",sequenceName="user_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_seq")      
	@Column(name="userId",unique = true, nullable = true)
    private @NonNull Long userId;
    private  String id;
	private  String password;


    /*@OneToOne
    @JoinColumn(name = "infromationpersonId")
    private InfromationPerson infromationperson;*/

	public Long getUserId() {
        return userId;
    }


	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
