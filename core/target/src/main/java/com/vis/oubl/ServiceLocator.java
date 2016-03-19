// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceLocator.vsl in andromda-spring-cartridge.
//
package com.vis.oubl;

import com.vis.oubl.service.My010CustomerService;
import com.vis.oubl.service.RedPlaneService;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Locates and provides all available application services.
 */
public class ServiceLocator
{
    private ServiceLocator()
    {
        // shouldn't be instantiated
    }

    /**
     * The prefix used for all bean ids.
     */
    public static final String BEAN_PREFIX = "";

    /**
     * The shared instance of this ServiceLocator.
     */
    private static final ServiceLocator instance = new ServiceLocator();

    /**
     * Gets the shared instance of this Class
     *
     * @return the shared service locator instance.
     */
    public static final ServiceLocator instance()
    {
        return instance;
    }

    /**
     * The bean factory reference instance.
     */
    private BeanFactoryReference beanFactoryReference;

    /**
     * The bean factory reference location.
     */
    private String beanFactoryReferenceLocation;

    /**
     * The bean factory reference id.
     */
    private String beanRefFactoryReferenceId;

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocationIn the location of the beanRefFactory reference.
     * @param beanRefFactoryReferenceIdIn the id of the beanRefFactory reference.
     */
    public synchronized void init(final String beanFactoryReferenceLocationIn, final String beanRefFactoryReferenceIdIn)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocationIn;
        this.beanRefFactoryReferenceId = beanRefFactoryReferenceIdIn;
        this.beanFactoryReference = null;
    }

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocationIn the location of the beanRefFactory reference.
     */
    public synchronized void init(final String beanFactoryReferenceLocationIn)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocationIn;
        this.beanFactoryReference = null;
    }

    /**
     * The default bean reference factory location.
     */
    private final String DEFAULT_BEAN_REFERENCE_LOCATION = "beanRefFactory.xml";

    /**
     * The default bean reference factory ID, referencing beanRefFactory.
     */
    private final String DEFAULT_BEAN_REFERENCE_ID = "beanRefFactory";

    /**
     * Gets the Spring ApplicationContext.
     * @return beanFactoryReference.getFactory()
     */
    public synchronized ApplicationContext getContext()
    {
        if (this.beanFactoryReference == null)
        {
            if (this.beanFactoryReferenceLocation == null)
            {
                this.beanFactoryReferenceLocation = this.DEFAULT_BEAN_REFERENCE_LOCATION;
            }
            if (this.beanRefFactoryReferenceId == null)
            {
                this.beanRefFactoryReferenceId = this.DEFAULT_BEAN_REFERENCE_ID;
            }
            BeanFactoryLocator beanFactoryLocator =
                ContextSingletonBeanFactoryLocator.getInstance(
                    this.beanFactoryReferenceLocation);
            this.beanFactoryReference = beanFactoryLocator.useBeanFactory(this.beanRefFactoryReferenceId);
        }
        return (ApplicationContext)this.beanFactoryReference.getFactory();
    }

    /**
     * Shuts down the ServiceLocator and releases any used resources.
     */
    public synchronized void shutdown()
    {
        ((AbstractApplicationContext)this.getContext()).close();
        if (this.beanFactoryReference != null)
        {
            this.beanFactoryReference.release();
            this.beanFactoryReference = null;
        }
    }

    /**
     * Gets an instance of {@link My010CustomerService}.
     * @return My010CustomerService from getContext().getBean("my010CustomerService")
     */
    public final My010CustomerService getMy010CustomerService()
    {
        return (My010CustomerService)
            getContext().getBean("my010CustomerService");
    }

    /**
     * Gets an instance of {@link RedPlaneService}.
     * @return RedPlaneService from getContext().getBean("redPlaneService")
     */
    public final RedPlaneService getRedPlaneService()
    {
        return (RedPlaneService)
            getContext().getBean("redPlaneService");
    }

    /**
     * Gets an instance of the given service.
     * @param serviceName
     * @return getContext().getBean(BEAN_PREFIX + serviceName)
     */
    public final Object getService(String serviceName)
    {
        return getContext().getBean(BEAN_PREFIX + serviceName);
    }
}