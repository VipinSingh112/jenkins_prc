/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerScopeServiceException;
import com.nbp.janaac.application.form.service.model.AddCerScopeService;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add cer scope service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceUtil
 * @generated
 */
@ProviderType
public interface AddCerScopeServicePersistence
	extends BasePersistence<AddCerScopeService> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddCerScopeServiceUtil} to access the add cer scope service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer scope services
	 */
	public java.util.List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @return the range of matching add cer scope services
	 */
	public java.util.List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer scope services
	 */
	public java.util.List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer scope services
	 */
	public java.util.List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a matching add cer scope service could not be found
	 */
	public AddCerScopeService findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
				orderByComparator)
		throws NoSuchAddCerScopeServiceException;

	/**
	 * Returns the first add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service, or <code>null</code> if a matching add cer scope service could not be found
	 */
	public AddCerScopeService fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
			orderByComparator);

	/**
	 * Returns the last add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a matching add cer scope service could not be found
	 */
	public AddCerScopeService findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
				orderByComparator)
		throws NoSuchAddCerScopeServiceException;

	/**
	 * Returns the last add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service, or <code>null</code> if a matching add cer scope service could not be found
	 */
	public AddCerScopeService fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
			orderByComparator);

	/**
	 * Returns the add cer scope services before and after the current add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerScopeServiceId the primary key of the current add cer scope service
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	public AddCerScopeService[] findBygetJanaacById_PrevAndNext(
			long addCerScopeServiceId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
				orderByComparator)
		throws NoSuchAddCerScopeServiceException;

	/**
	 * Removes all the add cer scope services where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add cer scope services where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer scope services
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add cer scope service in the entity cache if it is enabled.
	 *
	 * @param addCerScopeService the add cer scope service
	 */
	public void cacheResult(AddCerScopeService addCerScopeService);

	/**
	 * Caches the add cer scope services in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServices the add cer scope services
	 */
	public void cacheResult(
		java.util.List<AddCerScopeService> addCerScopeServices);

	/**
	 * Creates a new add cer scope service with the primary key. Does not add the add cer scope service to the database.
	 *
	 * @param addCerScopeServiceId the primary key for the new add cer scope service
	 * @return the new add cer scope service
	 */
	public AddCerScopeService create(long addCerScopeServiceId);

	/**
	 * Removes the add cer scope service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service that was removed
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	public AddCerScopeService remove(long addCerScopeServiceId)
		throws NoSuchAddCerScopeServiceException;

	public AddCerScopeService updateImpl(AddCerScopeService addCerScopeService);

	/**
	 * Returns the add cer scope service with the primary key or throws a <code>NoSuchAddCerScopeServiceException</code> if it could not be found.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	public AddCerScopeService findByPrimaryKey(long addCerScopeServiceId)
		throws NoSuchAddCerScopeServiceException;

	/**
	 * Returns the add cer scope service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service, or <code>null</code> if a add cer scope service with the primary key could not be found
	 */
	public AddCerScopeService fetchByPrimaryKey(long addCerScopeServiceId);

	/**
	 * Returns all the add cer scope services.
	 *
	 * @return the add cer scope services
	 */
	public java.util.List<AddCerScopeService> findAll();

	/**
	 * Returns a range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @return the range of add cer scope services
	 */
	public java.util.List<AddCerScopeService> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer scope services
	 */
	public java.util.List<AddCerScopeService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer scope services
	 */
	public java.util.List<AddCerScopeService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerScopeService>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add cer scope services from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add cer scope services.
	 *
	 * @return the number of add cer scope services
	 */
	public int countAll();

}