/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.CompanyDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the company details service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.CompanyDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetailsPersistence
 * @generated
 */
public class CompanyDetailsUtil {

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
	public static void clearCache(CompanyDetails companyDetails) {
		getPersistence().clearCache(companyDetails);
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
	public static Map<Serializable, CompanyDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CompanyDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CompanyDetails update(CompanyDetails companyDetails) {
		return getPersistence().update(companyDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CompanyDetails update(
		CompanyDetails companyDetails, ServiceContext serviceContext) {

		return getPersistence().update(companyDetails, serviceContext);
	}

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyDetailsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company details
	 * @throws NoSuchCompanyDetailsException if a matching company details could not be found
	 */
	public static CompanyDetails findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyDetailsException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company details, or <code>null</code> if a matching company details could not be found
	 */
	public static CompanyDetails fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company details, or <code>null</code> if a matching company details could not be found
	 */
	public static CompanyDetails fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the company details where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company details that was removed
	 */
	public static CompanyDetails removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyDetailsException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of company detailses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company detailses
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the company details in the entity cache if it is enabled.
	 *
	 * @param companyDetails the company details
	 */
	public static void cacheResult(CompanyDetails companyDetails) {
		getPersistence().cacheResult(companyDetails);
	}

	/**
	 * Caches the company detailses in the entity cache if it is enabled.
	 *
	 * @param companyDetailses the company detailses
	 */
	public static void cacheResult(List<CompanyDetails> companyDetailses) {
		getPersistence().cacheResult(companyDetailses);
	}

	/**
	 * Creates a new company details with the primary key. Does not add the company details to the database.
	 *
	 * @param companyDetailsId the primary key for the new company details
	 * @return the new company details
	 */
	public static CompanyDetails create(long companyDetailsId) {
		return getPersistence().create(companyDetailsId);
	}

	/**
	 * Removes the company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details that was removed
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	public static CompanyDetails remove(long companyDetailsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyDetailsException {

		return getPersistence().remove(companyDetailsId);
	}

	public static CompanyDetails updateImpl(CompanyDetails companyDetails) {
		return getPersistence().updateImpl(companyDetails);
	}

	/**
	 * Returns the company details with the primary key or throws a <code>NoSuchCompanyDetailsException</code> if it could not be found.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	public static CompanyDetails findByPrimaryKey(long companyDetailsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyDetailsException {

		return getPersistence().findByPrimaryKey(companyDetailsId);
	}

	/**
	 * Returns the company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details, or <code>null</code> if a company details with the primary key could not be found
	 */
	public static CompanyDetails fetchByPrimaryKey(long companyDetailsId) {
		return getPersistence().fetchByPrimaryKey(companyDetailsId);
	}

	/**
	 * Returns all the company detailses.
	 *
	 * @return the company detailses
	 */
	public static List<CompanyDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @return the range of company detailses
	 */
	public static List<CompanyDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company detailses
	 */
	public static List<CompanyDetails> findAll(
		int start, int end,
		OrderByComparator<CompanyDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company detailses
	 */
	public static List<CompanyDetails> findAll(
		int start, int end, OrderByComparator<CompanyDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the company detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of company detailses.
	 *
	 * @return the number of company detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CompanyDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(CompanyDetailsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile CompanyDetailsPersistence _persistence;

}