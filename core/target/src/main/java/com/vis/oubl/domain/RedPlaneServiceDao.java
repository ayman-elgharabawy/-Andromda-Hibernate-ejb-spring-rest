// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package com.vis.oubl.domain;

import com.vis.oubl.Search;
import com.vis.oubl.vo.My010CustomerVO;
import com.vis.oubl.vo.RedPlaneServiceVO;
import java.util.Collection;
import java.util.Set;
import org.andromda.spring.PaginationResult;

/**
 *
 * @see RedPlaneService
 */
public interface RedPlaneServiceDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public static final int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link RedPlaneService}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param results the query results.
     */
    public void toEntities(final Collection<?> results);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link RedPlaneServiceVO}.
     */
    public static final int TRANSFORM_REDPLANESERVICEVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toRedPlaneServiceVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     * @param source
     * @param target
     */
    public void toRedPlaneServiceVO(
        RedPlaneService source,
        RedPlaneServiceVO target);

    /**
     * Converts this DAO's entity to an object of type {@link RedPlaneServiceVO}.
     * @param entity
     * @return RedPlaneServiceVO
     */
    public RedPlaneServiceVO toRedPlaneServiceVO(RedPlaneService entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link RedPlaneServiceVO}.
     * @param entities
     */
    public Collection<RedPlaneServiceVO> toRedPlaneServiceVOCollection(Collection<?> entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link RedPlaneServiceVO}.
     * @param entities
     * @return RedPlaneServiceVO[]
     */
    public RedPlaneServiceVO[] toRedPlaneServiceVOArray(Collection<?> entities);

    /**
     * Copies the fields of {@link RedPlaneServiceVO} to the specified entity.
     * @param source
     * @param target
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void redPlaneServiceVOToEntity(
        RedPlaneServiceVO source,
        RedPlaneService target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link RedPlaneServiceVO} to this DAO's entity.
     * @param redPlaneServiceVO
     * @return RedPlaneService
     */
    public RedPlaneService redPlaneServiceVOToEntity(RedPlaneServiceVO redPlaneServiceVO);

    /**
     * Converts a Collection of instances of type {@link RedPlaneServiceVO} to this
     * DAO's entity.
     * @param instances
     */
    public void redPlaneServiceVOToEntityCollection(Collection<?> instances);

    /**
     * Gets an instance of RedPlaneService from the persistent store.
     * @param id
     * @return RedPlaneService
     */
    public RedPlaneService get(Integer id);

    /**
     * <p>
     * Does the same thing as {@link #get(Integer)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform flag to determine transformation type.
     * @param id the identifier of the entity to get.
     * @return either the entity or the object transformed from the entity.
     */
    public Object get(int transform, Integer id);

    /**
     * Loads an instance of RedPlaneService from the persistent store.
     * @param id
     * @return RedPlaneService
     */
    public RedPlaneService load(Integer id);

    /**
     * <p>
     * Does the same thing as {@link #load(Integer)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform flag to determine transformation type.
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, Integer id);

    /**
     * Loads all entities of type {@link RedPlaneService}.
     *
     * @return the loaded entities.
     */
    public Collection<RedPlaneService> loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public Collection<?> loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of RedPlaneService and adds it to the persistent store.
     * @param redPlaneService
     * @return RedPlaneService
     */
    public RedPlaneService create(RedPlaneService redPlaneService);

    /**
     * <p>
     * Does the same thing as {@link #create(RedPlaneService)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param redPlaneService
     * @return Object
     */
    public Object create(int transform, RedPlaneService redPlaneService);

    /**
     * Creates a new instance of RedPlaneService and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of RedPlaneService
     * instances to create.
     *
     * @return the created instances.
     */
    public Collection<RedPlaneService> create(Collection<RedPlaneService> entities);

    /**
     * <p>
     * Does the same thing as {@link #create(RedPlaneService)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param entities
     * @return Collection
     */
    public Collection<?> create(int transform, Collection<RedPlaneService> entities);

    /**
     * <p>
     * Creates a new <code>RedPlaneService</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     * @param msisdn 
     * @return RedPlaneService
     */
    public RedPlaneService create(
        String msisdn);

    /**
     * <p>
     * Does the same thing as {@link #create(String)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     * @param transform
     * @param msisdn 
     * @return RedPlaneService
     */
    public Object create(
        int transform,
        String msisdn);


    /**
     * Updates the <code>redPlaneService</code> instance in the persistent store.
     * @param redPlaneService
     */
    public void update(RedPlaneService redPlaneService);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     * @param entities
     */
    public void update(Collection<RedPlaneService> entities);

    /**
     * Removes the instance of RedPlaneService from the persistent store.
     * @param redPlaneService
     */
    public void remove(RedPlaneService redPlaneService);

    /**
     * Removes the instance of RedPlaneService having the given
     * <code>identifier</code> from the persistent store.
     * @param id
     */
    public void remove(Integer id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     * @param entities
     */
    public void remove(Collection<RedPlaneService> entities);

    /**
     * 
     * @return My010CustomerVO[]
     */
    public My010CustomerVO[] getAllCustomers();


    /**
     * Does the same thing as {@link #search(int, Search)} but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param transform the transformation flag.
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link PaginationResult} instance.
     */
    public PaginationResult search(final int transform, final int pageNumber, final int pageSize, final Search search);

    /**
     * Does the same thing as {@link #search(Search)} but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link PaginationResult} instance.
     */
    public PaginationResult search(final int pageNumber, final int pageSize, final Search search);

    /**
     * Does the same thing as {@link #search(Search)} but with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     *
     * @param transform the transformation flag.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public Set<?> search(final int transform, final Search search);

    /**
     * Performs a search using the parameters specified in the given <code>search</code> object.
     *
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public Set<RedPlaneService> search(final Search search);

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>com.vis.oubl.domain.RedPlaneServiceDao</code>, please note
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
     * @param transform one of the constants declared in {@link com.vis.oubl.domain.RedPlaneServiceDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,Collection)
     */
    public Object transformEntity(final int transform, final RedPlaneService entity);

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,RedPlaneService)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>com.vis.oubl.domain.RedPlaneServiceDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,RedPlaneService)
     */
    public void transformEntities(final int transform, final Collection<?> entities);

    // spring-dao merge-point
}