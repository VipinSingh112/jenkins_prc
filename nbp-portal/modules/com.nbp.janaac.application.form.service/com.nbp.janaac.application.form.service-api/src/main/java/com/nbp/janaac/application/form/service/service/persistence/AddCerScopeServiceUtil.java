/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddCerScopeService;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add cer scope service service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddCerScopeServicePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServicePersistence
 * @generated
 */
public class AddCerScopeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AddCerScopeService addCerScopeService) {
		getPersistence().clearCache(addCerScopeService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, AddCerScopeService> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddCerScopeService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddCerScopeService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddCerScopeService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddCerScopeService update(
		AddCerScopeService addCerScopeService) {

		return getPersistence().update(addCerScopeService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddCerScopeService update(
		AddCerScopeService addCerScopeService, ServiceContext serviceContext) {

		return getPersistence().update(addCerScopeService, serviceContext);
	}

	/**
	 * Returns all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer scope services
	 */
	public static List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

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
	public static List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

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
	public static List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

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
	public static List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a matching add cer scope service could not be found
	 */
	public static AddCerScopeService findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeService> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service, or <code>null</code> if a matching add cer scope service could not be found
	 */
	public static AddCerScopeService fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a matching add cer scope service could not be found
	 */
	public static AddCerScopeService findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeService> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service, or <code>null</code> if a matching add cer scope service could not be found
	 */
	public static AddCerScopeService fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add cer scope services before and after the current add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerScopeServiceId the primary key of the current add cer scope service
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	public static AddCerScopeService[] findBygetJanaacById_PrevAndNext(
			long addCerScopeServiceId, long janaacApplicationId,
			OrderByComparator<AddCerScopeService> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addCerScopeServiceId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add cer scope services where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add cer scope services where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer scope services
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add cer scope service in the entity cache if it is enabled.
	 *
	 * @param addCerScopeService the add cer scope service
	 */
	public static void cacheResult(AddCerScopeService addCerScopeService) {
		getPersistence().cacheResult(addCerScopeService);
	}

	/**
	 * Caches the add cer scope services in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServices the add cer scope services
	 */
	public static void cacheResult(
		List<AddCerScopeService> addCerScopeServices) {

		getPersistence().cacheResult(addCerScopeServices);
	}

	/**
	 * Creates a new add cer scope service with the primary key. Does not add the add cer scope service to the database.
	 *
	 * @param addCerScopeServiceId the primary key for the new add cer scope service
	 * @return the new add cer scope service
	 */
	public static AddCerScopeService create(long addCerScopeServiceId) {
		return getPersistence().create(addCerScopeServiceId);
	}

	/**
	 * Removes the add cer scope service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service that was removed
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	public static AddCerScopeService remove(long addCerScopeServiceId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceException {

		return getPersistence().remove(addCerScopeServiceId);
	}

	public static AddCerScopeService updateImpl(
		AddCerScopeService addCerScopeService) {

		return getPersistence().updateImpl(addCerScopeService);
	}

	/**
	 * Returns the add cer scope service with the primary key or throws a <code>NoSuchAddCerScopeServiceException</code> if it could not be found.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	public static AddCerScopeService findByPrimaryKey(long addCerScopeServiceId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceException {

		return getPersistence().findByPrimaryKey(addCerScopeServiceId);
	}

	/**
	 * Returns the add cer scope service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service, or <code>null</code> if a add cer scope service with the primary key could not be found
	 */
	public static AddCerScopeService fetchByPrimaryKey(
		long addCerScopeServiceId) {

		return getPersistence().fetchByPrimaryKey(addCerScopeServiceId);
	}

	/**
	 * Returns all the add cer scope services.
	 *
	 * @return the add cer scope services
	 */
	public static List<AddCerScopeService> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<AddCerScopeService> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<AddCerScopeService> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<AddCerScopeService> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add cer scope services from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add cer scope services.
	 *
	 * @return the number of add cer scope services
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddCerScopeServicePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddCerScopeServicePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddCerScopeServicePersistence _persistence;

}