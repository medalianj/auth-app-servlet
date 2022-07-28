package com.authentification.backend.DAO;

import com.authentification.backend.IDAO.ILoginDAO;
import com.authentification.backend.entities.Login;

import javax.persistence.*;

public class LoginDAO implements ILoginDAO {

    @Override
    public Login isUserExistent(String username, String password) {
        Login user = null;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Query userAthentified = entityManager.createNativeQuery("SELECT Count(*) FROM Login l where l.username=:userN AND l.password_login=:password");
            userAthentified.setParameter("userN", username);
            userAthentified.setParameter("password", password);

            int count = userAthentified.getSingleResult() != null ? Integer.valueOf(userAthentified.getSingleResult().toString()) : 0 ;
            if(count == 0) {
                System.out.println("The user doesn't exist");
            }
            else {
                userAthentified = entityManager.createNativeQuery("SELECT * FROM Login l where l.username=:userN AND l.password_login=:password", Login.class);
                userAthentified.setParameter("userN", username);
                userAthentified.setParameter("password", password);
                user = (Login) userAthentified.getSingleResult();
                System.out.println("The user is " + user.getUsername());
            }

            transaction.commit();
        }
        finally {
            if(transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
        return user;
    }

}
