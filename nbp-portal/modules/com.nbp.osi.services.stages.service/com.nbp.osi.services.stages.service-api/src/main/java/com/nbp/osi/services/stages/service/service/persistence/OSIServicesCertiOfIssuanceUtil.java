/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services certi of issuance service. This utility wraps <code>com.nbp.osi.services.stages.service.service.persistence.impl.OSIServicesCertiOfIssuancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuancePersistence
 * @generated
 */
public class OSIServicesCertiOfIssuanceUtil {

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
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		getPersistence().clearCache(osiServicesCertiOfIssuance);
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
	public static Map<Serializable, OSIServicesCertiOfIssuance>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OSIServicesCertiOfIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OSIServicesCertiOfIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OSIServicesCertiOfIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OSIServicesCertiOfIssuance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OSIServicesCertiOfIssuance update(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		return getPersistence().update(osiServicesCertiOfIssuance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OSIServicesCertiOfIssuance update(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServicesCertiOfIssuance, serviceContext);
	}

	/**
	 * Returns the osi services certi of issuance where caseId = &#63; or throws a <code>NoSuchOSIServicesCertiOfIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services certi of issuance
	 * @throws NoSuchOSIServicesCertiOfIssuanceException if a matching osi services certi of issuance could not be found
	 */
	public static OSIServicesCertiOfIssuance
			findBygetOsiServicesCertiOfIssuanceServicesByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesCertiOfIssuanceException {

		return getPersistence().
			findBygetOsiServicesCertiOfIssuanceServicesByCaseId(caseId);
	}

	/**
	 * Returns the osi services certi of issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services certi of issuance, or <code>null</code> if a matching osi services certi of issuance could not be found
	 */
	public static OSIServicesCertiOfIssuance
		fetchBygetOsiServicesCertiOfIssuanceServicesByCaseId(String caseId) {

		return getPersistence().
			fetchBygetOsiServicesCertiOfIssuanceServicesByCaseId(caseId);
	}

	/**
	 * Returns the osi services certi of issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services certi of issuance, or <code>null</code> if a matching osi services certi of issuance could not be found
	 */
	public static OSIServicesCertiOfIssuance
		fetchBygetOsiServicesCertiOfIssuanceServicesByCaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().
			fetchBygetOsiServicesCertiOfIssuanceServicesByCaseId(
				caseId, useFinderCache);
	}

	/**
	 * Removes the osi services certi of issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services certi of issuance that was removed
	 */
	public static OSIServicesCertiOfIssuance
			removeBygetOsiServicesCertiOfIssuanceServicesByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesCertiOfIssuanceException {

		return getPersistence().
			removeBygetOsiServicesCertiOfIssuanceServicesByCaseId(caseId);
	}

	/**
	 * Returns the number of osi services certi of issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services certi of issuances
	 */
	public static int countBygetOsiServicesCertiOfIssuanceServicesByCaseId(
		String caseId) {

		return getPersistence().
			countBygetOsiServicesCertiOfIssuanceServicesByCaseId(caseId);
	}

	/**
	 * Caches the osi services certi of issuance in the entity cache if it is enabled.
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 */
	public static void cacheResult(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		getPersistence().cacheResult(osiServicesCertiOfIssuance);
	}

	/**
	 * Caches the osi services certi of issuances in the entity cache if it is enabled.
	 *
	 * @param osiServicesCertiOfIssuances the osi services certi of issuances
	 */
	public static void cacheResult(
		List<OSIServicesCertiOfIssuance> osiServicesCertiOfIssuances) {

		getPersistence().cacheResult(osiServicesCertiOfIssuances);
	}

	/**
	 * Creates a new osi services certi of issuance with the primary key. Does not add the osi services certi of issuance to the database.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key for the new osi services certi of issuance
	 * @return the new osi services certi of issuance
	 */
	public static OSIServicesCertiOfIssuance create(
		long oSIServicesCertiOfIssuanceId) {

		return getPersistence().create(oSIServicesCertiOfIssuanceId);
	}

	/**
	 * Removes the osi services certi of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance that was removed
	 * @throws NoSuchOSIServicesCertiOfIssuanceException if a osi services certi of issuance with the primary key could not be found
	 */
	public static OSIServicesCertiOfIssuance remove(
			long oSIServicesCertiOfIssuanceId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesCertiOfIssuanceException {

		return getPersistence().remove(oSIServicesCertiOfIssuanceId);
	}

	public static OSIServicesCertiOfIssuance updateImpl(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		return getPersistence().updateImpl(osiServicesCertiOfIssuance);
	}

	/**
	 * Returns the osi services certi of issuance with the primary key or throws a <code>NoSuchOSIServicesCertiOfIssuanceException</code> if it could not be found.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance
	 * @throws NoSuchOSIServicesCertiOfIssuanceException if a osi services certi of issuance with the primary key could not be found
	 */
	public static OSIServicesCertiOfIssuance findByPrimaryKey(
			long oSIServicesCertiOfIssuanceId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesCertiOfIssuanceException {

		return getPersistence().findByPrimaryKey(oSIServicesCertiOfIssuanceId);
	}

	/**
	 * Returns the osi services certi of issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance, or <code>null</code> if a osi services certi of issuance with the primary key could not be found
	 */
	public static OSIServicesCertiOfIssuance fetchByPrimaryKey(
		long oSIServicesCertiOfIssuanceId) {

		return getPersistence().fetchByPrimaryKey(oSIServicesCertiOfIssuanceId);
	}

	/**
	 * Returns all the osi services certi of issuances.
	 *
	 * @return the osi services certi of issuances
	 */
	public static List<OSIServicesCertiOfIssuance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @return the range of osi services certi of issuances
	 */
	public static List<OSIServicesCertiOfIssuance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services certi of issuances
	 */
	public static List<OSIServicesCertiOfIssuance> findAll(
		int start, int end,
		OrderByComparator<OSIServicesCertiOfIssuance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services certi of issuances
	 */
	public static List<OSIServicesCertiOfIssuance> findAll(
		int start, int end,
		OrderByComparator<OSIServicesCertiOfIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services certi of issuances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services certi of issuances.
	 *
	 * @return the number of osi services certi of issuances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OSIServicesCertiOfIssuancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OSIServicesCertiOfIssuancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OSIServicesCertiOfIssuancePersistence _persistence;

}