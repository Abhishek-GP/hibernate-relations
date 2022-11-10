package com.ty.onetoonebi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.PanCard;
import com.ty.onetoonebi.dto.Person;

public class PanCardDao {
//public void savepancard(PanCard pancard) {
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ab");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction =entityManager.getTransaction();
//	
//	Person person =pancard.getPerson();
//	entityTransaction.begin();
//	entityManager.persist(person);
//	entityManager.persist(pancard);
//	entityTransaction.commit();
//}
//public PanCard findPancard(int id) {
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ab");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	PanCard card=entityManager.find(PanCard.class, id);
//	return card;
//}
}
