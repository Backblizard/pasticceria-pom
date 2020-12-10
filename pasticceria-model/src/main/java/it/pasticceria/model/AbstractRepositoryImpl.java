package it.pasticceria.model;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Dependent 
public abstract class AbstractRepositoryImpl implements AbstractRepository {
    
    @PersistenceContext(unitName = "persist")
	protected EntityManager entityManager;


    public void setEntityManager(EntityManager arg) {
		this.entityManager = arg;
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void detach(Object entity) {
		entityManager.detach(entity);
	}

	@Override
	public void remove(Object entity) {
		entityManager.remove(entity);
	}

	@Override
	public Object merge(Object entity) {
		return entityManager.merge(entity);
	}

	@Override
	public void persist(Object entity) {
		entityManager.persist(entity);
	}

	@Override
	public void flush() {
		entityManager.flush();
	}
	
	@Override
	public <T> T get(Integer tokenEntity, Class<T> entityClass) {
		return entityManager.find(entityClass, tokenEntity);
	}
	
	@Override
	public Query createQuery(String query) {
		if (query == null) {
			throw new IllegalArgumentException(query);
		}

		return entityManager.createQuery(query);
	}

	@Override
	public <T> Query createNativeQuery(String query, Class<T> clazz) {
		if (query == null) {
			throw new IllegalArgumentException(query);
		}

		return entityManager.createNativeQuery(query);
	}
}