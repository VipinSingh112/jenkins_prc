/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiability;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the company total liability service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.CompanyTotalLiabilityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityPersistence
 * @generated
 */
public class CompanyTotalLiabilityUtil {

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
	public static void clearCache(CompanyTotalLiability companyTotalLiability) {
		getPersistence().clearCache(companyTotalLiability);
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
	public static Map<Serializable, CompanyTotalLiability> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompanyTotalLiability> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanyTotalLiability> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanyTotalLiability> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CompanyTotalLiability> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CompanyTotalLiability update(
		CompanyTotalLiability companyTotalLiability) {

		return getPersistence().update(companyTotalLiability);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CompanyTotalLiability update(
		CompanyTotalLiability companyTotalLiability,
		ServiceContext serviceContext) {

		return getPersistence().update(companyTotalLiability, serviceContext);
	}

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a matching company total liability could not be found
	 */
	public static CompanyTotalLiability findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyTotalLiabilityException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company total liability, or <code>null</code> if a matching company total liability could not be found
	 */
	public static CompanyTotalLiability fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company total liability, or <code>null</code> if a matching company total liability could not be found
	 */
	public static CompanyTotalLiability fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the company total liability where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company total liability that was removed
	 */
	public static CompanyTotalLiability removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyTotalLiabilityException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of company total liabilities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company total liabilities
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the company total liability in the entity cache if it is enabled.
	 *
	 * @param companyTotalLiability the company total liability
	 */
	public static void cacheResult(
		CompanyTotalLiability companyTotalLiability) {

		getPersistence().cacheResult(companyTotalLiability);
	}

	/**
	 * Caches the company total liabilities in the entity cache if it is enabled.
	 *
	 * @param companyTotalLiabilities the company total liabilities
	 */
	public static void cacheResult(
		List<CompanyTotalLiability> companyTotalLiabilities) {

		getPersistence().cacheResult(companyTotalLiabilities);
	}

	/**
	 * Creates a new company total liability with the primary key. Does not add the company total liability to the database.
	 *
	 * @param companyTotalLiabilityId the primary key for the new company total liability
	 * @return the new company total liability
	 */
	public static CompanyTotalLiability create(long companyTotalLiabilityId) {
		return getPersistence().create(companyTotalLiabilityId);
	}

	/**
	 * Removes the company total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability that was removed
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	public static CompanyTotalLiability remove(long companyTotalLiabilityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyTotalLiabilityException {

		return getPersistence().remove(companyTotalLiabilityId);
	}

	public static CompanyTotalLiability updateImpl(
		CompanyTotalLiability companyTotalLiability) {

		return getPersistence().updateImpl(companyTotalLiability);
	}

	/**
	 * Returns the company total liability with the primary key or throws a <code>NoSuchCompanyTotalLiabilityException</code> if it could not be found.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	public static CompanyTotalLiability findByPrimaryKey(
			long companyTotalLiabilityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyTotalLiabilityException {

		return getPersistence().findByPrimaryKey(companyTotalLiabilityId);
	}

	/**
	 * Returns the company total liability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability, or <code>null</code> if a company total liability with the primary key could not be found
	 */
	public static CompanyTotalLiability fetchByPrimaryKey(
		long companyTotalLiabilityId) {

		return getPersistence().fetchByPrimaryKey(companyTotalLiabilityId);
	}

	/**
	 * Returns all the company total liabilities.
	 *
	 * @return the company total liabilities
	 */
	public static List<CompanyTotalLiability> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @return the range of company total liabilities
	 */
	public static List<CompanyTotalLiability> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company total liabilities
	 */
	public static List<CompanyTotalLiability> findAll(
		int start, int end,
		OrderByComparator<CompanyTotalLiability> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company total liabilities
	 */
	public static List<CompanyTotalLiability> findAll(
		int start, int end,
		OrderByComparator<CompanyTotalLiability> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the company total liabilities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of company total liabilities.
	 *
	 * @return the number of company total liabilities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CompanyTotalLiabilityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CompanyTotalLiabilityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CompanyTotalLiabilityPersistence _persistence;

}