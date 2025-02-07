/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.FinancialPosition;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the financial position service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.FinancialPositionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FinancialPositionPersistence
 * @generated
 */
public class FinancialPositionUtil {

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
	public static void clearCache(FinancialPosition financialPosition) {
		getPersistence().clearCache(financialPosition);
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
	public static Map<Serializable, FinancialPosition> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FinancialPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FinancialPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FinancialPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FinancialPosition> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FinancialPosition update(
		FinancialPosition financialPosition) {

		return getPersistence().update(financialPosition);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FinancialPosition update(
		FinancialPosition financialPosition, ServiceContext serviceContext) {

		return getPersistence().update(financialPosition, serviceContext);
	}

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or throws a <code>NoSuchFinancialPositionException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching financial position
	 * @throws NoSuchFinancialPositionException if a matching financial position could not be found
	 */
	public static FinancialPosition findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchFinancialPositionException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching financial position, or <code>null</code> if a matching financial position could not be found
	 */
	public static FinancialPosition fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching financial position, or <code>null</code> if a matching financial position could not be found
	 */
	public static FinancialPosition fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the financial position where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the financial position that was removed
	 */
	public static FinancialPosition removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchFinancialPositionException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of financial positions where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching financial positions
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the financial position in the entity cache if it is enabled.
	 *
	 * @param financialPosition the financial position
	 */
	public static void cacheResult(FinancialPosition financialPosition) {
		getPersistence().cacheResult(financialPosition);
	}

	/**
	 * Caches the financial positions in the entity cache if it is enabled.
	 *
	 * @param financialPositions the financial positions
	 */
	public static void cacheResult(List<FinancialPosition> financialPositions) {
		getPersistence().cacheResult(financialPositions);
	}

	/**
	 * Creates a new financial position with the primary key. Does not add the financial position to the database.
	 *
	 * @param financialPositionId the primary key for the new financial position
	 * @return the new financial position
	 */
	public static FinancialPosition create(long financialPositionId) {
		return getPersistence().create(financialPositionId);
	}

	/**
	 * Removes the financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position that was removed
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	public static FinancialPosition remove(long financialPositionId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchFinancialPositionException {

		return getPersistence().remove(financialPositionId);
	}

	public static FinancialPosition updateImpl(
		FinancialPosition financialPosition) {

		return getPersistence().updateImpl(financialPosition);
	}

	/**
	 * Returns the financial position with the primary key or throws a <code>NoSuchFinancialPositionException</code> if it could not be found.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	public static FinancialPosition findByPrimaryKey(long financialPositionId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchFinancialPositionException {

		return getPersistence().findByPrimaryKey(financialPositionId);
	}

	/**
	 * Returns the financial position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position, or <code>null</code> if a financial position with the primary key could not be found
	 */
	public static FinancialPosition fetchByPrimaryKey(
		long financialPositionId) {

		return getPersistence().fetchByPrimaryKey(financialPositionId);
	}

	/**
	 * Returns all the financial positions.
	 *
	 * @return the financial positions
	 */
	public static List<FinancialPosition> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @return the range of financial positions
	 */
	public static List<FinancialPosition> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of financial positions
	 */
	public static List<FinancialPosition> findAll(
		int start, int end,
		OrderByComparator<FinancialPosition> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of financial positions
	 */
	public static List<FinancialPosition> findAll(
		int start, int end,
		OrderByComparator<FinancialPosition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the financial positions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of financial positions.
	 *
	 * @return the number of financial positions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FinancialPositionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FinancialPositionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FinancialPositionPersistence _persistence;

}