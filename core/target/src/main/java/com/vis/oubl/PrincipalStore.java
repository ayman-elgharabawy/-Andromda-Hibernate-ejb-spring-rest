// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringPrincipalStore.vsl in andromda-spring-cartridge.
//
package com.vis.oubl;

import java.security.Principal;

/**
 * Stores the currently logged in Principal. The principal is passed
 * from another tier of the application (i.e. the web application).
 */
public final class PrincipalStore
{
    /**
     * The security realm of this application.
     */
    public static String SECURITY_REALM = "$securityRealm";

    private static final ThreadLocal<Principal> store = new ThreadLocal<Principal>();

    /**
     * Get the user <code>principal</code>
     * for the currently executing thread.
     *
     * @return the current principal.
     */
    public static Principal get()
    {
        return store.get();
    }

    /**
     * Set the <code>principal</code> for the currently executing thread.
     *
     * @param principal the user principal
     */
    public static void set(final Principal principal)
    {
        store.set(principal);
    }
}