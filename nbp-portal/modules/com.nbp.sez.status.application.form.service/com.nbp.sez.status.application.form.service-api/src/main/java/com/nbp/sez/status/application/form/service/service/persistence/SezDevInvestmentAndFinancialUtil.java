/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev investment and financial service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevInvestmentAndFinancialPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevInvestmentAndFinancialPersistence
 * @generated
 */
public class SezDevInvestmentAndFinancialUtil {

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
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		getPersistence().clearCache(sezDevInvestmentAndFinancial);
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
	public static Map<Serializable, SezDevInvestmentAndFinancial>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevInvestmentAndFinancial> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevInvestmentAndFinancial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevInvestmentAndFinancial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevInvestmentAndFinancial> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevInvestmentAndFinancial update(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		return getPersistence().update(sezDevInvestmentAndFinancial);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevInvestmentAndFinancial update(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevInvestmentAndFinancial, serviceContext);
	}

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevInvestmentAndFinancialException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a matching sez dev investment and financial could not be found
	 */
	public static SezDevInvestmentAndFinancial findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevInvestmentAndFinancialException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev investment and financial, or <code>null</code> if a matching sez dev investment and financial could not be found
	 */
	public static SezDevInvestmentAndFinancial fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev investment and financial, or <code>null</code> if a matching sez dev investment and financial could not be found
	 */
	public static SezDevInvestmentAndFinancial fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev investment and financial where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev investment and financial that was removed
	 */
	public static SezDevInvestmentAndFinancial removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevInvestmentAndFinancialException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev investment and financials where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev investment and financials
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev investment and financial in the entity cache if it is enabled.
	 *
	 * @param sezDevInvestmentAndFinancial the sez dev investment and financial
	 */
	public static void cacheResult(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		getPersistence().cacheResult(sezDevInvestmentAndFinancial);
	}

	/**
	 * Caches the sez dev investment and financials in the entity cache if it is enabled.
	 *
	 * @param sezDevInvestmentAndFinancials the sez dev investment and financials
	 */
	public static void cacheResult(
		List<SezDevInvestmentAndFinancial> sezDevInvestmentAndFinancials) {

		getPersistence().cacheResult(sezDevInvestmentAndFinancials);
	}

	/**
	 * Creates a new sez dev investment and financial with the primary key. Does not add the sez dev investment and financial to the database.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key for the new sez dev investment and financial
	 * @return the new sez dev investment and financial
	 */
	public static SezDevInvestmentAndFinancial create(
		long sezDevInvestmentAndFinancialId) {

		return getPersistence().create(sezDevInvestmentAndFinancialId);
	}

	/**
	 * Removes the sez dev investment and financial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial that was removed
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	public static SezDevInvestmentAndFinancial remove(
			long sezDevInvestmentAndFinancialId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevInvestmentAndFinancialException {

		return getPersistence().remove(sezDevInvestmentAndFinancialId);
	}

	public static SezDevInvestmentAndFinancial updateImpl(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		return getPersistence().updateImpl(sezDevInvestmentAndFinancial);
	}

	/**
	 * Returns the sez dev investment and financial with the primary key or throws a <code>NoSuchSezDevInvestmentAndFinancialException</code> if it could not be found.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	public static SezDevInvestmentAndFinancial findByPrimaryKey(
			long sezDevInvestmentAndFinancialId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevInvestmentAndFinancialException {

		return getPersistence().findByPrimaryKey(
			sezDevInvestmentAndFinancialId);
	}

	/**
	 * Returns the sez dev investment and financial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial, or <code>null</code> if a sez dev investment and financial with the primary key could not be found
	 */
	public static SezDevInvestmentAndFinancial fetchByPrimaryKey(
		long sezDevInvestmentAndFinancialId) {

		return getPersistence().fetchByPrimaryKey(
			sezDevInvestmentAndFinancialId);
	}

	/**
	 * Returns all the sez dev investment and financials.
	 *
	 * @return the sez dev investment and financials
	 */
	public static List<SezDevInvestmentAndFinancial> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @return the range of sez dev investment and financials
	 */
	public static List<SezDevInvestmentAndFinancial> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev investment and financials
	 */
	public static List<SezDevInvestmentAndFinancial> findAll(
		int start, int end,
		OrderByComparator<SezDevInvestmentAndFinancial> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev investment and financials
	 */
	public static List<SezDevInvestmentAndFinancial> findAll(
		int start, int end,
		OrderByComparator<SezDevInvestmentAndFinancial> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev investment and financials from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev investment and financials.
	 *
	 * @return the number of sez dev investment and financials
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevInvestmentAndFinancialPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevInvestmentAndFinancialPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevInvestmentAndFinancialPersistence
		_persistence;

}