/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic certificate of issuance service. This utility wraps <code>com.nbp.miic.stages.service.service.persistence.impl.MiicCertificateOfIssuancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuancePersistence
 * @generated
 */
public class MiicCertificateOfIssuanceUtil {

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
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		getPersistence().clearCache(miicCertificateOfIssuance);
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
	public static Map<Serializable, MiicCertificateOfIssuance>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicCertificateOfIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicCertificateOfIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicCertificateOfIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicCertificateOfIssuance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicCertificateOfIssuance update(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return getPersistence().update(miicCertificateOfIssuance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicCertificateOfIssuance update(
		MiicCertificateOfIssuance miicCertificateOfIssuance,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miicCertificateOfIssuance, serviceContext);
	}

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or throws a <code>NoSuchMiicCertificateOfIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a matching miic certificate of issuance could not be found
	 */
	public static MiicCertificateOfIssuance findBygetMiic_CI_by_CI(
			String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicCertificateOfIssuanceException {

		return getPersistence().findBygetMiic_CI_by_CI(caseId);
	}

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic certificate of issuance, or <code>null</code> if a matching miic certificate of issuance could not be found
	 */
	public static MiicCertificateOfIssuance fetchBygetMiic_CI_by_CI(
		String caseId) {

		return getPersistence().fetchBygetMiic_CI_by_CI(caseId);
	}

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic certificate of issuance, or <code>null</code> if a matching miic certificate of issuance could not be found
	 */
	public static MiicCertificateOfIssuance fetchBygetMiic_CI_by_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiic_CI_by_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the miic certificate of issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic certificate of issuance that was removed
	 */
	public static MiicCertificateOfIssuance removeBygetMiic_CI_by_CI(
			String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicCertificateOfIssuanceException {

		return getPersistence().removeBygetMiic_CI_by_CI(caseId);
	}

	/**
	 * Returns the number of miic certificate of issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic certificate of issuances
	 */
	public static int countBygetMiic_CI_by_CI(String caseId) {
		return getPersistence().countBygetMiic_CI_by_CI(caseId);
	}

	/**
	 * Caches the miic certificate of issuance in the entity cache if it is enabled.
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 */
	public static void cacheResult(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		getPersistence().cacheResult(miicCertificateOfIssuance);
	}

	/**
	 * Caches the miic certificate of issuances in the entity cache if it is enabled.
	 *
	 * @param miicCertificateOfIssuances the miic certificate of issuances
	 */
	public static void cacheResult(
		List<MiicCertificateOfIssuance> miicCertificateOfIssuances) {

		getPersistence().cacheResult(miicCertificateOfIssuances);
	}

	/**
	 * Creates a new miic certificate of issuance with the primary key. Does not add the miic certificate of issuance to the database.
	 *
	 * @param miicCertificateOfIssuanceId the primary key for the new miic certificate of issuance
	 * @return the new miic certificate of issuance
	 */
	public static MiicCertificateOfIssuance create(
		long miicCertificateOfIssuanceId) {

		return getPersistence().create(miicCertificateOfIssuanceId);
	}

	/**
	 * Removes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	public static MiicCertificateOfIssuance remove(
			long miicCertificateOfIssuanceId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicCertificateOfIssuanceException {

		return getPersistence().remove(miicCertificateOfIssuanceId);
	}

	public static MiicCertificateOfIssuance updateImpl(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return getPersistence().updateImpl(miicCertificateOfIssuance);
	}

	/**
	 * Returns the miic certificate of issuance with the primary key or throws a <code>NoSuchMiicCertificateOfIssuanceException</code> if it could not be found.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	public static MiicCertificateOfIssuance findByPrimaryKey(
			long miicCertificateOfIssuanceId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicCertificateOfIssuanceException {

		return getPersistence().findByPrimaryKey(miicCertificateOfIssuanceId);
	}

	/**
	 * Returns the miic certificate of issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance, or <code>null</code> if a miic certificate of issuance with the primary key could not be found
	 */
	public static MiicCertificateOfIssuance fetchByPrimaryKey(
		long miicCertificateOfIssuanceId) {

		return getPersistence().fetchByPrimaryKey(miicCertificateOfIssuanceId);
	}

	/**
	 * Returns all the miic certificate of issuances.
	 *
	 * @return the miic certificate of issuances
	 */
	public static List<MiicCertificateOfIssuance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @return the range of miic certificate of issuances
	 */
	public static List<MiicCertificateOfIssuance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic certificate of issuances
	 */
	public static List<MiicCertificateOfIssuance> findAll(
		int start, int end,
		OrderByComparator<MiicCertificateOfIssuance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic certificate of issuances
	 */
	public static List<MiicCertificateOfIssuance> findAll(
		int start, int end,
		OrderByComparator<MiicCertificateOfIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic certificate of issuances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic certificate of issuances.
	 *
	 * @return the number of miic certificate of issuances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicCertificateOfIssuancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicCertificateOfIssuancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicCertificateOfIssuancePersistence _persistence;

}