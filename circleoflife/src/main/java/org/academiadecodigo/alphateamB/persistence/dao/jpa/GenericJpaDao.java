package org.academiadecodigo.alphateamB.persistence.dao.jpa;

import org.academiadecodigo.alphateamB.persistence.dao.Dao;
import org.academiadecodigo.alphateamB.persistence.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericJpaDao <T extends Model> implements Dao<T> {

    protected Class<T> modelType;

    protected EntityManager em;

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    @Override
    public T saveOrUpdate(T modelObject) {

        System.out.println("HEEEEEEYYYYYYYY I'M IN THE SAVE 0R UPDATE!!!!! ");
        return em.merge(modelObject);
    }

    @Override
    public void delete(Integer id) {

        em.remove(em.find(modelType, id));
    }
}
