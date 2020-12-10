package it.pasticceria.model;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public interface AbstractRepository {

    EntityManager getEntityManager();

    Query createQuery(String query);

    <T> Query createNativeQuery(String query, Class<T> clazz);

    Object merge(Object entity);

    void persist(Object entity);

    void detach(Object entity);

    void remove(Object entity);

    void flush();

    <T> T get(Integer tokenEntity, Class<T> entityClass);

}
