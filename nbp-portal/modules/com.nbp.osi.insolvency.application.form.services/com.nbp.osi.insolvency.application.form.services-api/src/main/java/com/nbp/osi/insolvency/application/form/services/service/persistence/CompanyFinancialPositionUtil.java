/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPosition;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the company financial position service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.CompanyFinancialPositionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPositionPersistence
 * @generated
 */
public class CompanyFinancialPositionUtil {

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
		CompanyFinancialPosition companyFinancialPosition) {

		getPersistence().clearCache(companyFinancialPosition);
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
	public static Map<Serializable, CompanyFinancialPosition>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompanyFinancialPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanyFinancialPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanyFinancialPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CompanyFinancialPosition> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CompanyFinancialPosition update(
		CompanyFinancialPosition companyFinancialPosition) {

		return getPersistence().update(companyFinancialPosition);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CompanyFinancialPosition update(
		CompanyFinancialPosition companyFinancialPosition,
		ServiceContext serviceContext) {

		return getPersistence().update(
			companyFinancialPosition, serviceContext);
	}

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyFinancialPositionException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a matching company financial position could not be found
	 */
	public static CompanyFinancialPosition findBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyFinancialPositionException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company financial position, or <code>null</code> if a matching company financial position could not be found
	 */
	public static CompanyFinancialPosition fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company financial position, or <code>null</code> if a matching company financial position could not be found
	 */
	public static CompanyFinancialPosition fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the company financial position where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company financial position that was removed
	 */
	public static CompanyFinancialPosition removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyFinancialPositionException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of company financial positions where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company financial positions
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the company financial position in the entity cache if it is enabled.
	 *
	 * @param companyFinancialPosition the company financial position
	 */
	public static void cacheResult(
		CompanyFinancialPosition companyFinancialPosition) {

		getPersistence().cacheResult(companyFinancialPosition);
	}

	/**
	 * Caches the company financial positions in the entity cache if it is enabled.
	 *
	 * @param companyFinancialPositions the company financial positions
	 */
	public static void cacheResult(
		List<CompanyFinancialPosition> companyFinancialPositions) {

		getPersistence().cacheResult(companyFinancialPositions);
	}

	/**
	 * Creates a new company financial position with the primary key. Does not add the company financial position to the database.
	 *
	 * @param companyFinancialPositionId the primary key for the new company financial position
	 * @return the new company financial position
	 */
	public static CompanyFinancialPosition create(
		long companyFinancialPositionId) {

		return getPersistence().create(companyFinancialPositionId);
	}

	/**
	 * Removes the company financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position that was removed
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	public static CompanyFinancialPosition remove(
			long companyFinancialPositionId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyFinancialPositionException {

		return getPersistence().remove(companyFinancialPositionId);
	}

	public static CompanyFinancialPosition updateImpl(
		CompanyFinancialPosition companyFinancialPosition) {

		return getPersistence().updateImpl(companyFinancialPosition);
	}

	/**
	 * Returns the company financial position with the primary key or throws a <code>NoSuchCompanyFinancialPositionException</code> if it could not be found.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	public static CompanyFinancialPosition findByPrimaryKey(
			long companyFinancialPositionId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyFinancialPositionException {

		return getPersistence().findByPrimaryKey(companyFinancialPositionId);
	}

	/**
	 * Returns the company financial position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position, or <code>null</code> if a company financial position with the primary key could not be found
	 */
	public static CompanyFinancialPosition fetchByPrimaryKey(
		long companyFinancialPositionId) {

		return getPersistence().fetchByPrimaryKey(companyFinancialPositionId);
	}

	/**
	 * Returns all the company financial positions.
	 *
	 * @return the company financial positions
	 */
	public static List<CompanyFinancialPosition> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @return the range of company financial positions
	 */
	public static List<CompanyFinancialPosition> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company financial positions
	 */
	public static List<CompanyFinancialPosition> findAll(
		int start, int end,
		OrderByComparator<CompanyFinancialPosition> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company financial positions
	 */
	public static List<CompanyFinancialPosition> findAll(
		int start, int end,
		OrderByComparator<CompanyFinancialPosition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the company financial positions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of company financial positions.
	 *
	 * @return the number of company financial positions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CompanyFinancialPositionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CompanyFinancialPositionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CompanyFinancialPositionPersistence _persistence;

}