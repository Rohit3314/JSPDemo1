package com.Demo.repository;

import com.Demo.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Logininterface extends JpaRepository<Loginmodel,String>
{

}
