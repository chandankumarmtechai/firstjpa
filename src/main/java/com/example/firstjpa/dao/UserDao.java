package com.example.firstjpa.dao;

import com.example.firstjpa.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public int insert(User user)
    {
        entityManager.persist(user);
        return user.getId();
    }
}
