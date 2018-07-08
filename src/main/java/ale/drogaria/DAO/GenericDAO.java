package ale.drogaria.DAO;

import ale.drogaria.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDAO<E> {

    private Class<E> classe;

    @SuppressWarnings("unchecked")
    public GenericDAO() {
        // Pega uma reflexão para o paramentro genérica.
        this.classe = (Class<E>)((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0];

    }
    public void salvar(E entity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw  e;
        } finally {
            session.close();
        }
    }

    @SuppressWarnings("unchecked")
    public List<E> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session
                    .createCriteria(this.classe)
                    .list();
        }catch (Exception e) {
            throw  e;
        } finally {
            session.close();
        }
    }

    @SuppressWarnings("unchecked")
    public E buscar(Long codigo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return (E) session
                    .createCriteria(this.classe)
                    .add(Restrictions.idEq(codigo))
                    .uniqueResult();
        }catch (Exception e) {
            throw  e;
        } finally {
            session.close();
        }
    }

    public void deletar(E entity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw  e;
        } finally {
            session.close();
        }
    }

    public void editar(E entity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw  e;
        } finally {
            session.close();
        }
    }

    public void merge(E entity ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw  e;
        } finally {
            session.close();
        }
    }

}
