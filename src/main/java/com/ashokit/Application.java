package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.user;
import com.ashokit.repositopry.userrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		userrepository userrepo=context.getBean(userrepository.class);
	
			user entity4=new user();
		entity4.setUserid(100);
		entity4.setUsername("bishniu");
		entity4.setUserphno(7978165848l);
		entity4.setUserage(24);
		entity4.setCountry("india");
		
	//	userrepo.save(entity);
		
		user entity2=new user();
		entity2.setUserid(101);
		entity2.setUsername("sai");
		entity2.setUserphno(7978165856l);
		entity2.setUserage(9);
		entity2.setCountry("india");
		
		user entity1=new user();
		entity1.setUserid(102);
		entity1.setUsername("hari");
		entity1.setUserphno(7894312942l);
		entity1.setUserage(56);
		entity1.setCountry("india");
		
		user entity3=new user();
		entity3.setUserid(103);
		entity3.setUsername("ram");
		entity3.setUserphno(7894312942l);
		entity3.setUserage(56);
		entity3.setCountry("india");
		
		List<user> entitylist=Arrays.asList(entity4,entity1,entity2,entity3);
		userrepo.saveAll(entitylist);
		
		System.out.println("RECORD INSERTED*****");
		
	}

}
