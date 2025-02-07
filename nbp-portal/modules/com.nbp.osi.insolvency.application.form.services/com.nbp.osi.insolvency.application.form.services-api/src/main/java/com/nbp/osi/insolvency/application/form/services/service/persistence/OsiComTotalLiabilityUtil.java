/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiability;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi com total liability service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiComTotalLiabilityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiabilityPersistence
 * @generated
 */
public class OsiComTotalLiabilityUtil {

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
	public static void clearCache(OsiComTotalLiability osiComTotalLiability) {
		getPersistence().clearCache(osiComTotalLiability);
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
	public static Map<Serializable, OsiComTotalLiability> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiComTotalLiability> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiComTotalLiability> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiComTotalLiability> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiComTotalLiability> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiComTotalLiability update(
		OsiComTotalLiability osiComTotalLiability) {

		return getPersistence().update(osiComTotalLiability);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiComTotalLiability update(
		OsiComTotalLiability osiComTotalLiability,
		ServiceContext serviceContext) {

		return getPersistence().update(osiComTotalLiability, serviceContext);
	}

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiComTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a matching osi com total liability could not be found
	 */
	public static OsiComTotalLiability findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComTotalLiabilityException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com total liability, or <code>null</code> if a matching osi com total liability could not be found
	 */
	public static OsiComTotalLiability fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi com total liability, or <code>null</code> if a matching osi com total liability could not be found
	 */
	public static OsiComTotalLiability fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi com total liability where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi com total liability that was removed
	 */
	public static OsiComTotalLiability removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComTotalLiabilityException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi com total liabilities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi com total liabilities
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the osi com total liability in the entity cache if it is enabled.
	 *
	 * @param osiComTotalLiability the osi com total liability
	 */
	public static void cacheResult(OsiComTotalLiability osiComTotalLiability) {
		getPersistence().cacheResult(osiComTotalLiability);
	}

	/**
	 * Caches the osi com total liabilities in the entity cache if it is enabled.
	 *
	 * @param osiComTotalLiabilities the osi com total liabilities
	 */
	public static void cacheResult(
		List<OsiComTotalLiability> osiComTotalLiabilities) {

		getPersistence().cacheResult(osiComTotalLiabilities);
	}

	/**
	 * Creates a new osi com total liability with the primary key. Does not add the osi com total liability to the database.
	 *
	 * @param osiComTotalLiabilityId the primary key for the new osi com total liability
	 * @return the new osi com total liability
	 */
	public static OsiComTotalLiability create(long osiComTotalLiabilityId) {
		return getPersistence().create(osiComTotalLiabilityId);
	}

	/**
	 * Removes the osi com total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability that was removed
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	public static OsiComTotalLiability remove(long osiComTotalLiabilityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComTotalLiabilityException {

		return getPersistence().remove(osiComTotalLiabilityId);
	}

	public static OsiComTotalLiability updateImpl(
		OsiComTotalLiability osiComTotalLiability) {

		return getPersistence().updateImpl(osiComTotalLiability);
	}

	/**
	 * Returns the osi com total liability with the primary key or throws a <code>NoSuchOsiComTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	public static OsiComTotalLiability findByPrimaryKey(
			long osiComTotalLiabilityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComTotalLiabilityException {

		return getPersistence().findByPrimaryKey(osiComTotalLiabilityId);
	}

	/**
	 * Returns the osi com total liability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability, or <code>null</code> if a osi com total liability with the primary key could not be found
	 */
	public static OsiComTotalLiability fetchByPrimaryKey(
		long osiComTotalLiabilityId) {

		return getPersistence().fetchByPrimaryKey(osiComTotalLiabilityId);
	}

	/**
	 * Returns all the osi com total liabilities.
	 *
	 * @return the osi com total liabilities
	 */
	public static List<OsiComTotalLiability> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @return the range of osi com total liabilities
	 */
	public static List<OsiComTotalLiability> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi com total liabilities
	 */
	public static List<OsiComTotalLiability> findAll(
		int start, int end,
		OrderByComparator<OsiComTotalLiability> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi com total liabilities
	 */
	public static List<OsiComTotalLiability> findAll(
		int start, int end,
		OrderByComparator<OsiComTotalLiability> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi com total liabilities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi com total liabilities.
	 *
	 * @return the number of osi com total liabilities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiComTotalLiabilityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiComTotalLiabilityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiComTotalLiabilityPersistence _persistence;

}