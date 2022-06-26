package br.com.gsb.technicalTest.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gsb.technicalTest.model.User;

@Service
public class UserService {
	
	public void formatBirthDate(List<User> users)
	{
		for(User user : users)
		{
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String newDate = formatter.format(user.getBirthDate());
			
			user.setFormatedBirthDate(newDate);
		}
	}

}
