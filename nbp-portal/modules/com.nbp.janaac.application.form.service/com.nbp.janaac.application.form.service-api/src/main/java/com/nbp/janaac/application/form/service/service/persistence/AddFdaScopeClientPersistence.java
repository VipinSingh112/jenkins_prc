/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaScopeClientException;
import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add fda scope client service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClientUtil
 * @generated
 */
@ProviderType
public interface AddFdaScopeClientPersistence
	extends BasePersistence<AddFdaScopeClient> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddFdaScopeClientUtil} to access the add fda scope client persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @return the range of matching add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a matching add fda scope client could not be found
	 */
	public AddFdaScopeClient findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
				orderByComparator)
		throws NoSuchAddFdaScopeClientException;

	/**
	 * Returns the first add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda scope client, or <code>null</code> if a matching add fda scope client could not be found
	 */
	public AddFdaScopeClient fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
			orderByComparator);

	/**
	 * Returns the last add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a matching add fda scope client could not be found
	 */
	public AddFdaScopeClient findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
				orderByComparator)
		throws NoSuchAddFdaScopeClientException;

	/**
	 * Returns the last add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda scope client, or <code>null</code> if a matching add fda scope client could not be found
	 */
	public AddFdaScopeClient fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
			orderByComparator);

	/**
	 * Returns the add fda scope clients before and after the current add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaScopeClientId the primary key of the current add fda scope client
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	public AddFdaScopeClient[] findBygetJanaacById_PrevAndNext(
			long addFdaScopeClientId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
				orderByComparator)
		throws NoSuchAddFdaScopeClientException;

	/**
	 * Removes all the add fda scope clients where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda scope clients
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add fda scope client in the entity cache if it is enabled.
	 *
	 * @param addFdaScopeClient the add fda scope client
	 */
	public void cacheResult(AddFdaScopeClient addFdaScopeClient);

	/**
	 * Caches the add fda scope clients in the entity cache if it is enabled.
	 *
	 * @param addFdaScopeClients the add fda scope clients
	 */
	public void cacheResult(
		java.util.List<AddFdaScopeClient> addFdaScopeClients);

	/**
	 * Creates a new add fda scope client with the primary key. Does not add the add fda scope client to the database.
	 *
	 * @param addFdaScopeClientId the primary key for the new add fda scope client
	 * @return the new add fda scope client
	 */
	public AddFdaScopeClient create(long addFdaScopeClientId);

	/**
	 * Removes the add fda scope client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client that was removed
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	public AddFdaScopeClient remove(long addFdaScopeClientId)
		throws NoSuchAddFdaScopeClientException;

	public AddFdaScopeClient updateImpl(AddFdaScopeClient addFdaScopeClient);

	/**
	 * Returns the add fda scope client with the primary key or throws a <code>NoSuchAddFdaScopeClientException</code> if it could not be found.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	public AddFdaScopeClient findByPrimaryKey(long addFdaScopeClientId)
		throws NoSuchAddFdaScopeClientException;

	/**
	 * Returns the add fda scope client with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client, or <code>null</code> if a add fda scope client with the primary key could not be found
	 */
	public AddFdaScopeClient fetchByPrimaryKey(long addFdaScopeClientId);

	/**
	 * Returns all the add fda scope clients.
	 *
	 * @return the add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findAll();

	/**
	 * Returns a range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @return the range of add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda scope clients
	 */
	public java.util.List<AddFdaScopeClient> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaScopeClient>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add fda scope clients from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add fda scope clients.
	 *
	 * @return the number of add fda scope clients
	 */
	public int countAll();

}