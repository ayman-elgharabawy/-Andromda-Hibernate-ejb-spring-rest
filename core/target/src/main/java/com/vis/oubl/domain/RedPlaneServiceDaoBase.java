// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: hibernate/SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package com.vis.oubl.domain;

import com.vis.oubl.PrincipalStore;
import com.vis.oubl.PropertySearch;
import com.vis.oubl.Search;
import com.vis.oubl.vo.My010CustomerVO;
import com.vis.oubl.vo.RedPlaneServiceVO;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.andromda.spring.PaginationResult;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>RedPlaneService</code>.
 * </p>
 *
 * @see RedPlaneService
 */
public abstract class RedPlaneServiceDaoBase
    extends HibernateDaoSupport
    implements RedPlaneServiceDao
{
    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(final int transform, final Integer id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.get - 'id' can not be null");
        }
        final Object entity = this.getHibernateTemplate().get(RedPlaneServiceImpl.class, id);
        return transformEntity(transform, (RedPlaneService)entity);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public RedPlaneService get(Integer id)
    {
        return (RedPlaneService)this.get(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object load(final int transform, final Integer id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.load - 'id' can not be null");
        }
        final Object entity = this.getHibernateTemplate().get(RedPlaneServiceImpl.class, id);
        return transformEntity(transform, (RedPlaneService)entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedPlaneService load(Integer id)
    {
        return (RedPlaneService)this.load(TRANSFORM_NONE, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<RedPlaneService> loadAll()
    {
        return (Collection<RedPlaneService>) this.loadAll(RedPlaneServiceDao.TRANSFORM_NONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(RedPlaneServiceDao.TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize)
    {
        try
        {
            final Criteria criteria = this.getSession(false).createCriteria(RedPlaneServiceImpl.class);
            if (pageNumber > 0 && pageSize > 0)
            {
                criteria.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
                criteria.setMaxResults(pageSize);
            }
            final Collection<?> results = criteria.list();
            this.transformEntities(transform, results);
            return results;
        }
        catch (HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * firstResult = (pageNumber - 1) * pageSize
     * @param pageNumber
     * @param pageSize
     * @return firstResult
     */
    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedPlaneService create(RedPlaneService redPlaneService)
    {
        return (RedPlaneService)this.create(RedPlaneServiceDao.TRANSFORM_NONE, redPlaneService);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(final int transform, final RedPlaneService redPlaneService)
    {
        if (redPlaneService == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.create - 'redPlaneService' can not be null");
        }
        this.getHibernateTemplate().save(redPlaneService);
        return this.transformEntity(transform, redPlaneService);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"unchecked"})
    public Collection<RedPlaneService> create(final Collection<RedPlaneService> entities)
    {
        return (Collection<RedPlaneService>) create(RedPlaneServiceDao.TRANSFORM_NONE, entities);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> create(final int transform, final Collection<RedPlaneService> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().executeWithNativeSession(
            new HibernateCallback()
            {
                public Object doInHibernate(Session session)
                    throws HibernateException
                {
                    for (RedPlaneService entity : entities)
                    {
                        create(transform, entity);
                    }
                    return null;
                }
            });
        return entities;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedPlaneService create(
        String msisdn)
    {
        return (RedPlaneService)this.create(RedPlaneServiceDao.TRANSFORM_NONE, msisdn);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object create(
        final int transform,
        String msisdn)
    {
        RedPlaneService entity = new RedPlaneServiceImpl();
        entity.setMsisdn(msisdn);
        return this.create(transform, entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(RedPlaneService redPlaneService)
    {
        if (redPlaneService == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.update - 'redPlaneService' can not be null");
        }
        this.getHibernateTemplate().update(redPlaneService);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Collection<RedPlaneService> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().executeWithNativeSession(
            new HibernateCallback()
            {
                public Object doInHibernate(Session session)
                    throws HibernateException
                {
                    for (RedPlaneService entity : entities)
                    {
                        update(entity);
                    }
                    return null;
                }
            });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(RedPlaneService redPlaneService)
    {
        if (redPlaneService == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.remove - 'redPlaneService' can not be null");
        }
        this.getHibernateTemplate().delete(redPlaneService);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Integer id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.remove - 'id' can not be null");
        }
        RedPlaneService entity = this.get(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Collection<RedPlaneService> entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "RedPlaneService.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public My010CustomerVO[] getAllCustomers()
    {
        try
        {
            return this.handleGetAllCustomers();
        }
        catch (Throwable th)
        {
            throw new RuntimeException(
            "Error performing 'RedPlaneServiceDao.getAllCustomers()' --> " + th,
            th);
        }
    }

    /**
     * Performs the core logic for {@link #getAllCustomers()}
     * @return My010CustomerVO[]
     * @throws Exception
     */
    protected abstract My010CustomerVO[] handleGetAllCustomers()
        throws Exception;

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>RedPlaneServiceDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     * <p>
     * This method will return instances of these types:
     * <ul>
     *   <li>{@link RedPlaneService} - {@link #TRANSFORM_NONE}</li>
     *   <li>{@link RedPlaneServiceVO} - {@link #TRANSFORM_REDPLANESERVICEVO}</li>
     * </ul>
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link RedPlaneServiceDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see RedPlaneServiceDao#transformEntity(int, RedPlaneService)
     */
    public Object transformEntity(final int transform, final RedPlaneService entity)
    {
        Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_REDPLANESERVICEVO :
                    target = toRedPlaneServiceVO(entity);
                    break;
                case RedPlaneServiceDao.TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void transformEntities(final int transform, final Collection<?> entities)
    {
        switch (transform)
        {
            case TRANSFORM_REDPLANESERVICEVO :
                toRedPlaneServiceVOCollection(entities);
                break;
            case RedPlaneServiceDao.TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see RedPlaneServiceDao#toEntities(Collection)
     */
    public void toEntities(final Collection<?> results)
    {
        if (results != null)
        {
            CollectionUtils.transform(results, this.ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link RedPlaneService}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer ENTITYTRANSFORMER =
        new Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof Object[])
                {
                    result = toEntity((Object[])input);
                }
                else if (input instanceof RedPlaneService)
                {
                    result = input;
                }
                return result;
            }
        };

    /**
     * @param row
     * @return RedPlaneService
     */
    protected RedPlaneService toEntity(Object[] row)
    {
        RedPlaneService target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final Object object = row[ctr];
                if (object instanceof RedPlaneService)
                {
                    target = (RedPlaneService)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final Collection toRedPlaneServiceVOCollection(Collection<?> entities)
    {
        Collection result = new ArrayList<RedPlaneServiceVO>();
        if (entities != null)
        {
            CollectionUtils.transform(entities, this.REDPLANESERVICEVO_TRANSFORMER);
            result.addAll((Collection) entities);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public final RedPlaneServiceVO[] toRedPlaneServiceVOArray(Collection<?> entities)
    {
        RedPlaneServiceVO[] result = null;
        if (entities != null)
        {
            // Unchecked transformation: reuses entities Collection
            final Collection collection = new ArrayList(entities);
            this.toRedPlaneServiceVOCollection(collection);
            result = (RedPlaneServiceVO[]) collection.toArray(new RedPlaneServiceVO[collection.size()]);
        }
        return result;
    }

    /**
     * Default implementation for transforming the results of a report query into a value object. This
     * implementation exists for convenience reasons only. It needs only be overridden in the
     * {@link RedPlaneServiceDaoImpl} class if you intend to use reporting queries.
     * @param row
     * @return toRedPlaneServiceVO(this.toEntity(row))
     * @see RedPlaneServiceDao#toRedPlaneServiceVO(RedPlaneService)
     */
    protected RedPlaneServiceVO toRedPlaneServiceVO(Object[] row)
    {
        return this.toRedPlaneServiceVO(this.toEntity(row));
    }

    /**
     * This anonymous transformer is designed to transform entities or report query results
     * (which result in an array of objects) to {@link RedPlaneServiceVO}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private Transformer REDPLANESERVICEVO_TRANSFORMER =
        new Transformer()
        {
            public Object transform(Object input)
            {
                Object result = null;
                if (input instanceof RedPlaneService)
                {
                    result = toRedPlaneServiceVO((RedPlaneService)input);
                }
                else if (input instanceof Object[])
                {
                    result = toRedPlaneServiceVO((Object[])input);
                }
                return result;
            }
        };

    /**
     * {@inheritDoc}
     */
    @Override
    public final void redPlaneServiceVOToEntityCollection(Collection<?> instances)
    {
        if (instances != null)
        {
            for (final Iterator<?> iterator = instances.iterator(); iterator.hasNext();)
            {
                // - remove an objects that are null or not of the correct instance
                if (!(iterator.next() instanceof RedPlaneServiceVO))
                {
                    iterator.remove();
                }
            }
            CollectionUtils.transform(instances, this.RedPlaneServiceVOToEntityTransformer);
        }
    }

    private final Transformer RedPlaneServiceVOToEntityTransformer =
        new Transformer()
        {
            public Object transform(Object input)
            {
                return redPlaneServiceVOToEntity((RedPlaneServiceVO)input);
            }
        };


    /**
     * {@inheritDoc}
     */
    @Override
    public void toRedPlaneServiceVO(
        RedPlaneService source,
        RedPlaneServiceVO target)
    {
        target.setId(source.getId());
        target.setMsisdn(source.getMsisdn());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedPlaneServiceVO toRedPlaneServiceVO(final RedPlaneService entity)
    {
        RedPlaneServiceVO target = null;
        if (entity != null)
        {
            target =  new RedPlaneServiceVO();
            this.toRedPlaneServiceVO(entity, target);
        }
        return target;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void redPlaneServiceVOToEntity(
        RedPlaneServiceVO source,
        RedPlaneService target,
        boolean copyIfNull)
    {
        if (copyIfNull || source.getMsisdn() != null)
        {
            target.setMsisdn(source.getMsisdn());
        }
    }

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected Principal getPrincipal()
    {
        return PrincipalStore.get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({ "unchecked" })
    public PaginationResult search(final int transform, final int pageNumber, final int pageSize, final Search search)
    {
        try
        {
            search.setPageNumber(pageNumber);
            search.setPageSize(pageSize);
            final PropertySearch propertySearch = new PropertySearch(
                this.getSession(false), RedPlaneServiceImpl.class, search);
            final List results = propertySearch.executeAsList();
            this.transformEntities(transform, results);
            return new PaginationResult(results.toArray(new Object[results.size()]), propertySearch.getTotalCount());
        }
        catch (HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaginationResult search(final int pageNumber, final int pageSize, final Search search)
    {
        return this.search(RedPlaneServiceDao.TRANSFORM_NONE, pageNumber, pageSize, search);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<?> search(final int transform, final Search search)
    {
        try
        {
            final PropertySearch propertySearch = new PropertySearch(
                this.getSession(false), RedPlaneServiceImpl.class, search);
            final Set<?> results = propertySearch.executeAsSet();
            this.transformEntities(transform, results);
            return results;
        }
        catch (HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public Set<RedPlaneService> search(final Search search)
    {
        return (Set<RedPlaneService>) this.search(RedPlaneServiceDao.TRANSFORM_NONE, search);
    }

    /**
     * Executes and returns the given Hibernate queryObject as a {@link PaginationResult} instance.
     * @param queryObject
     * @param transform
     * @param pageNumber
     * @param pageSize
     * @return PaginationResult
     */
    @SuppressWarnings({ "unchecked" })
    protected PaginationResult getPaginationResult(
        final Query queryObject,
        final int transform, int pageNumber, int pageSize)
    {
        try
        {
            final ScrollableResults scrollableResults = queryObject.scroll();
            scrollableResults.last();
            int totalCount = scrollableResults.getRowNumber();
            totalCount = totalCount >= 0 ? totalCount + 1 : 0;
            if (pageNumber > 0 && pageSize > 0)
            {
                queryObject.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
                queryObject.setMaxResults(pageSize);
            }
            // Unchecked transformation because Set object is reused, cannot be strongly typed.
            Set results = new LinkedHashSet(queryObject.list());
            transformEntities(transform, results);
            return new PaginationResult(results.toArray(new Object[results.size()]), totalCount);
        }
        catch (HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    // spring-hibernate-dao-base merge-point
}