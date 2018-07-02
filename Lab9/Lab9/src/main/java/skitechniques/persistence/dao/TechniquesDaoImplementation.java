package skitechniques.persistence.dao;

import skitechniques.tecniques.Techniques;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.io.Serializable;

@Named
@Dependent
public class TechniquesDaoImplementation extends AbstractDao<Techniques> implements TechniquesDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Techniques> getEntityClass() {
        return Techniques.class;
    }

    @Resource
    private UserTransaction userTransaction;

}