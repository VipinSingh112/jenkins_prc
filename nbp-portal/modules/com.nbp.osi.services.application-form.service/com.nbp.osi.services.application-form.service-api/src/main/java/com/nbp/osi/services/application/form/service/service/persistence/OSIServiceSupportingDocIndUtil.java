/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi service supporting doc ind service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OSIServiceSupportingDocIndPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocIndPersistence
 * @generated
 */
public class OSIServiceSupportingDocIndUtil {

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
	public static void clearCache(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		getPersistence().clearCache(osiServiceSupportingDocInd);
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
	public static Map<Serializable, OSIServiceSupportingDocInd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OSIServiceSupportingDocInd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OSIServiceSupportingDocInd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OSIServiceSupportingDocInd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OSIServiceSupportingDocInd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OSIServiceSupportingDocInd update(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		return getPersistence().update(osiServiceSupportingDocInd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OSIServiceSupportingDocInd update(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServiceSupportingDocInd, serviceContext);
	}

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceSupportingDocIndException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a matching osi service supporting doc ind could not be found
	 */
	public static OSIServiceSupportingDocInd findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceSupportingDocIndException {

		return getPersistence().findBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service supporting doc ind, or <code>null</code> if a matching osi service supporting doc ind could not be found
	 */
	public static OSIServiceSupportingDocInd fetchBygetOSIService_ById(
		long osiServicesApplicationId) {

		return getPersistence().fetchBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service supporting doc ind, or <code>null</code> if a matching osi service supporting doc ind could not be found
	 */
	public static OSIServiceSupportingDocInd fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIService_ById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi service supporting doc ind where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service supporting doc ind that was removed
	 */
	public static OSIServiceSupportingDocInd removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceSupportingDocIndException {

		return getPersistence().removeBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi service supporting doc inds where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service supporting doc inds
	 */
	public static int countBygetOSIService_ById(long osiServicesApplicationId) {
		return getPersistence().countBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi service supporting doc ind in the entity cache if it is enabled.
	 *
	 * @param osiServiceSupportingDocInd the osi service supporting doc ind
	 */
	public static void cacheResult(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		getPersistence().cacheResult(osiServiceSupportingDocInd);
	}

	/**
	 * Caches the osi service supporting doc inds in the entity cache if it is enabled.
	 *
	 * @param osiServiceSupportingDocInds the osi service supporting doc inds
	 */
	public static void cacheResult(
		List<OSIServiceSupportingDocInd> osiServiceSupportingDocInds) {

		getPersistence().cacheResult(osiServiceSupportingDocInds);
	}

	/**
	 * Creates a new osi service supporting doc ind with the primary key. Does not add the osi service supporting doc ind to the database.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key for the new osi service supporting doc ind
	 * @return the new osi service supporting doc ind
	 */
	public static OSIServiceSupportingDocInd create(
		long oSIServiceSupportingDocIndId) {

		return getPersistence().create(oSIServiceSupportingDocIndId);
	}

	/**
	 * Removes the osi service supporting doc ind with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was removed
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	public static OSIServiceSupportingDocInd remove(
			long oSIServiceSupportingDocIndId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceSupportingDocIndException {

		return getPersistence().remove(oSIServiceSupportingDocIndId);
	}

	public static OSIServiceSupportingDocInd updateImpl(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		return getPersistence().updateImpl(osiServiceSupportingDocInd);
	}

	/**
	 * Returns the osi service supporting doc ind with the primary key or throws a <code>NoSuchOSIServiceSupportingDocIndException</code> if it could not be found.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	public static OSIServiceSupportingDocInd findByPrimaryKey(
			long oSIServiceSupportingDocIndId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceSupportingDocIndException {

		return getPersistence().findByPrimaryKey(oSIServiceSupportingDocIndId);
	}

	/**
	 * Returns the osi service supporting doc ind with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind, or <code>null</code> if a osi service supporting doc ind with the primary key could not be found
	 */
	public static OSIServiceSupportingDocInd fetchByPrimaryKey(
		long oSIServiceSupportingDocIndId) {

		return getPersistence().fetchByPrimaryKey(oSIServiceSupportingDocIndId);
	}

	/**
	 * Returns all the osi service supporting doc inds.
	 *
	 * @return the osi service supporting doc inds
	 */
	public static List<OSIServiceSupportingDocInd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @return the range of osi service supporting doc inds
	 */
	public static List<OSIServiceSupportingDocInd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service supporting doc inds
	 */
	public static List<OSIServiceSupportingDocInd> findAll(
		int start, int end,
		OrderByComparator<OSIServiceSupportingDocInd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service supporting doc inds
	 */
	public static List<OSIServiceSupportingDocInd> findAll(
		int start, int end,
		OrderByComparator<OSIServiceSupportingDocInd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi service supporting doc inds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi service supporting doc inds.
	 *
	 * @return the number of osi service supporting doc inds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OSIServiceSupportingDocIndPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OSIServiceSupportingDocIndPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OSIServiceSupportingDocIndPersistence _persistence;

}