package br.com.gsb.technicalTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gsb.technicalTest.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
