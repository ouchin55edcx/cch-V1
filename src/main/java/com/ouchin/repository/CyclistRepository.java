package com.ouchin.repository;


import com.ouchin.entity.Cyclist;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CyclistRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Cyclist cyclist){
        sessionFactory.getCurrentSession().save(cyclist);
    }
}
