package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectSpringBootApplication {
	static class VipUsers
	{
		public void displayVipUsers()
		{
			System.out.println("Welcome Vip User");
		}
	}
	class NormalUsers
	{
		public void displayNormalUsers()
		{
			System.out.println("Welcome Normal User");
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringBootApplication.class, args);
		System.out.println("Table Proper Create");
		ProjectSpringBootApplication.VipUsers vip = new ProjectSpringBootApplication.VipUsers();
		vip.displayVipUsers();
	}

}
