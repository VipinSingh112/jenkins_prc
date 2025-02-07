/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraCertificateIssuance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra certificate issuance service. This utility wraps <code>com.nbp.wra.stage.service.service.persistence.impl.WraCertificateIssuancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraCertificateIssuancePersistence
 * @generated
 */
public class WraCertificateIssuanceUtil {

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
		WraCertificateIssuance wraCertificateIssuance) {

		getPersistence().clearCache(wraCertificateIssuance);
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
	public static Map<Serializable, WraCertificateIssuance> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WraCertificateIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WraCertificateIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WraCertificateIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WraCertificateIssuance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WraCertificateIssuance update(
		WraCertificateIssuance wraCertificateIssuance) {

		return getPersistence().update(wraCertificateIssuance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WraCertificateIssuance update(
		WraCertificateIssuance wraCertificateIssuance,
		ServiceContext serviceContext) {

		return getPersistence().update(wraCertificateIssuance, serviceContext);
	}

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or throws a <code>NoSuchWraCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a matching wra certificate issuance could not be found
	 */
	public static WraCertificateIssuance findBygetWra_Issuance_By_CI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraCertificateIssuanceException {

		return getPersistence().findBygetWra_Issuance_By_CI(caseId);
	}

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra certificate issuance, or <code>null</code> if a matching wra certificate issuance could not be found
	 */
	public static WraCertificateIssuance fetchBygetWra_Issuance_By_CI(
		String caseId) {

		return getPersistence().fetchBygetWra_Issuance_By_CI(caseId);
	}

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra certificate issuance, or <code>null</code> if a matching wra certificate issuance could not be found
	 */
	public static WraCertificateIssuance fetchBygetWra_Issuance_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetWra_Issuance_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the wra certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra certificate issuance that was removed
	 */
	public static WraCertificateIssuance removeBygetWra_Issuance_By_CI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraCertificateIssuanceException {

		return getPersistence().removeBygetWra_Issuance_By_CI(caseId);
	}

	/**
	 * Returns the number of wra certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra certificate issuances
	 */
	public static int countBygetWra_Issuance_By_CI(String caseId) {
		return getPersistence().countBygetWra_Issuance_By_CI(caseId);
	}

	/**
	 * Caches the wra certificate issuance in the entity cache if it is enabled.
	 *
	 * @param wraCertificateIssuance the wra certificate issuance
	 */
	public static void cacheResult(
		WraCertificateIssuance wraCertificateIssuance) {

		getPersistence().cacheResult(wraCertificateIssuance);
	}

	/**
	 * Caches the wra certificate issuances in the entity cache if it is enabled.
	 *
	 * @param wraCertificateIssuances the wra certificate issuances
	 */
	public static void cacheResult(
		List<WraCertificateIssuance> wraCertificateIssuances) {

		getPersistence().cacheResult(wraCertificateIssuances);
	}

	/**
	 * Creates a new wra certificate issuance with the primary key. Does not add the wra certificate issuance to the database.
	 *
	 * @param wraCertificateIssuanceId the primary key for the new wra certificate issuance
	 * @return the new wra certificate issuance
	 */
	public static WraCertificateIssuance create(long wraCertificateIssuanceId) {
		return getPersistence().create(wraCertificateIssuanceId);
	}

	/**
	 * Removes the wra certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance that was removed
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	public static WraCertificateIssuance remove(long wraCertificateIssuanceId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraCertificateIssuanceException {

		return getPersistence().remove(wraCertificateIssuanceId);
	}

	public static WraCertificateIssuance updateImpl(
		WraCertificateIssuance wraCertificateIssuance) {

		return getPersistence().updateImpl(wraCertificateIssuance);
	}

	/**
	 * Returns the wra certificate issuance with the primary key or throws a <code>NoSuchWraCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	public static WraCertificateIssuance findByPrimaryKey(
			long wraCertificateIssuanceId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraCertificateIssuanceException {

		return getPersistence().findByPrimaryKey(wraCertificateIssuanceId);
	}

	/**
	 * Returns the wra certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance, or <code>null</code> if a wra certificate issuance with the primary key could not be found
	 */
	public static WraCertificateIssuance fetchByPrimaryKey(
		long wraCertificateIssuanceId) {

		return getPersistence().fetchByPrimaryKey(wraCertificateIssuanceId);
	}

	/**
	 * Returns all the wra certificate issuances.
	 *
	 * @return the wra certificate issuances
	 */
	public static List<WraCertificateIssuance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @return the range of wra certificate issuances
	 */
	public static List<WraCertificateIssuance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra certificate issuances
	 */
	public static List<WraCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<WraCertificateIssuance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra certificate issuances
	 */
	public static List<WraCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<WraCertificateIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra certificate issuances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra certificate issuances.
	 *
	 * @return the number of wra certificate issuances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WraCertificateIssuancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		WraCertificateIssuancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile WraCertificateIssuancePersistence _persistence;

}