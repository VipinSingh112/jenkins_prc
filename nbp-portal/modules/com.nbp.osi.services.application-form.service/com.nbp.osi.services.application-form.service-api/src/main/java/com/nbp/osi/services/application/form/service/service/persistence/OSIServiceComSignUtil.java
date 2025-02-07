/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi service com sign service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OSIServiceComSignPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSignPersistence
 * @generated
 */
public class OSIServiceComSignUtil {

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
	public static void clearCache(OSIServiceComSign osiServiceComSign) {
		getPersistence().clearCache(osiServiceComSign);
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
	public static Map<Serializable, OSIServiceComSign> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OSIServiceComSign> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OSIServiceComSign> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OSIServiceComSign> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OSIServiceComSign> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OSIServiceComSign update(
		OSIServiceComSign osiServiceComSign) {

		return getPersistence().update(osiServiceComSign);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OSIServiceComSign update(
		OSIServiceComSign osiServiceComSign, ServiceContext serviceContext) {

		return getPersistence().update(osiServiceComSign, serviceContext);
	}

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceComSignException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a matching osi service com sign could not be found
	 */
	public static OSIServiceComSign findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceComSignException {

		return getPersistence().findBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service com sign, or <code>null</code> if a matching osi service com sign could not be found
	 */
	public static OSIServiceComSign fetchBygetOSIService_ById(
		long osiServicesApplicationId) {

		return getPersistence().fetchBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service com sign, or <code>null</code> if a matching osi service com sign could not be found
	 */
	public static OSIServiceComSign fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIService_ById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi service com sign where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service com sign that was removed
	 */
	public static OSIServiceComSign removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceComSignException {

		return getPersistence().removeBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi service com signs where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service com signs
	 */
	public static int countBygetOSIService_ById(long osiServicesApplicationId) {
		return getPersistence().countBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi service com sign in the entity cache if it is enabled.
	 *
	 * @param osiServiceComSign the osi service com sign
	 */
	public static void cacheResult(OSIServiceComSign osiServiceComSign) {
		getPersistence().cacheResult(osiServiceComSign);
	}

	/**
	 * Caches the osi service com signs in the entity cache if it is enabled.
	 *
	 * @param osiServiceComSigns the osi service com signs
	 */
	public static void cacheResult(List<OSIServiceComSign> osiServiceComSigns) {
		getPersistence().cacheResult(osiServiceComSigns);
	}

	/**
	 * Creates a new osi service com sign with the primary key. Does not add the osi service com sign to the database.
	 *
	 * @param osiComSignId the primary key for the new osi service com sign
	 * @return the new osi service com sign
	 */
	public static OSIServiceComSign create(long osiComSignId) {
		return getPersistence().create(osiComSignId);
	}

	/**
	 * Removes the osi service com sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign that was removed
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	public static OSIServiceComSign remove(long osiComSignId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceComSignException {

		return getPersistence().remove(osiComSignId);
	}

	public static OSIServiceComSign updateImpl(
		OSIServiceComSign osiServiceComSign) {

		return getPersistence().updateImpl(osiServiceComSign);
	}

	/**
	 * Returns the osi service com sign with the primary key or throws a <code>NoSuchOSIServiceComSignException</code> if it could not be found.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	public static OSIServiceComSign findByPrimaryKey(long osiComSignId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceComSignException {

		return getPersistence().findByPrimaryKey(osiComSignId);
	}

	/**
	 * Returns the osi service com sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign, or <code>null</code> if a osi service com sign with the primary key could not be found
	 */
	public static OSIServiceComSign fetchByPrimaryKey(long osiComSignId) {
		return getPersistence().fetchByPrimaryKey(osiComSignId);
	}

	/**
	 * Returns all the osi service com signs.
	 *
	 * @return the osi service com signs
	 */
	public static List<OSIServiceComSign> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @return the range of osi service com signs
	 */
	public static List<OSIServiceComSign> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service com signs
	 */
	public static List<OSIServiceComSign> findAll(
		int start, int end,
		OrderByComparator<OSIServiceComSign> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service com signs
	 */
	public static List<OSIServiceComSign> findAll(
		int start, int end,
		OrderByComparator<OSIServiceComSign> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi service com signs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi service com signs.
	 *
	 * @return the number of osi service com signs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OSIServiceComSignPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OSIServiceComSignPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OSIServiceComSignPersistence _persistence;

}