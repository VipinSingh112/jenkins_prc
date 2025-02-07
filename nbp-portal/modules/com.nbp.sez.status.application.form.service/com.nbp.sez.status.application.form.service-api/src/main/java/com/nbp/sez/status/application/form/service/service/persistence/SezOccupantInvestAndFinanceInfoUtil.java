/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant invest and finance info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantInvestAndFinanceInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantInvestAndFinanceInfoPersistence
 * @generated
 */
public class SezOccupantInvestAndFinanceInfoUtil {

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
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo) {

		getPersistence().clearCache(sezOccupantInvestAndFinanceInfo);
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
	public static Map<Serializable, SezOccupantInvestAndFinanceInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantInvestAndFinanceInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantInvestAndFinanceInfo update(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo) {

		return getPersistence().update(sezOccupantInvestAndFinanceInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantInvestAndFinanceInfo update(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantInvestAndFinanceInfo, serviceContext);
	}

	/**
	 * Returns the sez occupant invest and finance info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantInvestAndFinanceInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant invest and finance info
	 * @throws NoSuchSezOccupantInvestAndFinanceInfoException if a matching sez occupant invest and finance info could not be found
	 */
	public static SezOccupantInvestAndFinanceInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantInvestAndFinanceInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant invest and finance info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant invest and finance info, or <code>null</code> if a matching sez occupant invest and finance info could not be found
	 */
	public static SezOccupantInvestAndFinanceInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant invest and finance info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant invest and finance info, or <code>null</code> if a matching sez occupant invest and finance info could not be found
	 */
	public static SezOccupantInvestAndFinanceInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant invest and finance info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant invest and finance info that was removed
	 */
	public static SezOccupantInvestAndFinanceInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantInvestAndFinanceInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant invest and finance infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant invest and finance infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant invest and finance info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantInvestAndFinanceInfo the sez occupant invest and finance info
	 */
	public static void cacheResult(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo) {

		getPersistence().cacheResult(sezOccupantInvestAndFinanceInfo);
	}

	/**
	 * Caches the sez occupant invest and finance infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantInvestAndFinanceInfos the sez occupant invest and finance infos
	 */
	public static void cacheResult(
		List<SezOccupantInvestAndFinanceInfo>
			sezOccupantInvestAndFinanceInfos) {

		getPersistence().cacheResult(sezOccupantInvestAndFinanceInfos);
	}

	/**
	 * Creates a new sez occupant invest and finance info with the primary key. Does not add the sez occupant invest and finance info to the database.
	 *
	 * @param sezOccInvestFinancId the primary key for the new sez occupant invest and finance info
	 * @return the new sez occupant invest and finance info
	 */
	public static SezOccupantInvestAndFinanceInfo create(
		long sezOccInvestFinancId) {

		return getPersistence().create(sezOccInvestFinancId);
	}

	/**
	 * Removes the sez occupant invest and finance info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info that was removed
	 * @throws NoSuchSezOccupantInvestAndFinanceInfoException if a sez occupant invest and finance info with the primary key could not be found
	 */
	public static SezOccupantInvestAndFinanceInfo remove(
			long sezOccInvestFinancId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantInvestAndFinanceInfoException {

		return getPersistence().remove(sezOccInvestFinancId);
	}

	public static SezOccupantInvestAndFinanceInfo updateImpl(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo) {

		return getPersistence().updateImpl(sezOccupantInvestAndFinanceInfo);
	}

	/**
	 * Returns the sez occupant invest and finance info with the primary key or throws a <code>NoSuchSezOccupantInvestAndFinanceInfoException</code> if it could not be found.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info
	 * @throws NoSuchSezOccupantInvestAndFinanceInfoException if a sez occupant invest and finance info with the primary key could not be found
	 */
	public static SezOccupantInvestAndFinanceInfo findByPrimaryKey(
			long sezOccInvestFinancId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantInvestAndFinanceInfoException {

		return getPersistence().findByPrimaryKey(sezOccInvestFinancId);
	}

	/**
	 * Returns the sez occupant invest and finance info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info, or <code>null</code> if a sez occupant invest and finance info with the primary key could not be found
	 */
	public static SezOccupantInvestAndFinanceInfo fetchByPrimaryKey(
		long sezOccInvestFinancId) {

		return getPersistence().fetchByPrimaryKey(sezOccInvestFinancId);
	}

	/**
	 * Returns all the sez occupant invest and finance infos.
	 *
	 * @return the sez occupant invest and finance infos
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @return the range of sez occupant invest and finance infos
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant invest and finance infos
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantInvestAndFinanceInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant invest and finance infos
	 */
	public static List<SezOccupantInvestAndFinanceInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantInvestAndFinanceInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant invest and finance infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant invest and finance infos.
	 *
	 * @return the number of sez occupant invest and finance infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantInvestAndFinanceInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantInvestAndFinanceInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantInvestAndFinanceInfoPersistence
		_persistence;

}