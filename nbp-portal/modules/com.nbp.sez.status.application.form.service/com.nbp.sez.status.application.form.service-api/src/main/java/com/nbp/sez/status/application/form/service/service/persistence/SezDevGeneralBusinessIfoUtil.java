/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev general business ifo service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevGeneralBusinessIfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfoPersistence
 * @generated
 */
public class SezDevGeneralBusinessIfoUtil {

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
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		getPersistence().clearCache(sezDevGeneralBusinessIfo);
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
	public static Map<Serializable, SezDevGeneralBusinessIfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevGeneralBusinessIfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevGeneralBusinessIfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevGeneralBusinessIfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevGeneralBusinessIfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevGeneralBusinessIfo update(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		return getPersistence().update(sezDevGeneralBusinessIfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevGeneralBusinessIfo update(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevGeneralBusinessIfo, serviceContext);
	}

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevGeneralBusinessIfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a matching sez dev general business ifo could not be found
	 */
	public static SezDevGeneralBusinessIfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevGeneralBusinessIfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev general business ifo, or <code>null</code> if a matching sez dev general business ifo could not be found
	 */
	public static SezDevGeneralBusinessIfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev general business ifo, or <code>null</code> if a matching sez dev general business ifo could not be found
	 */
	public static SezDevGeneralBusinessIfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev general business ifo where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev general business ifo that was removed
	 */
	public static SezDevGeneralBusinessIfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevGeneralBusinessIfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev general business ifos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev general business ifos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev general business ifo in the entity cache if it is enabled.
	 *
	 * @param sezDevGeneralBusinessIfo the sez dev general business ifo
	 */
	public static void cacheResult(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		getPersistence().cacheResult(sezDevGeneralBusinessIfo);
	}

	/**
	 * Caches the sez dev general business ifos in the entity cache if it is enabled.
	 *
	 * @param sezDevGeneralBusinessIfos the sez dev general business ifos
	 */
	public static void cacheResult(
		List<SezDevGeneralBusinessIfo> sezDevGeneralBusinessIfos) {

		getPersistence().cacheResult(sezDevGeneralBusinessIfos);
	}

	/**
	 * Creates a new sez dev general business ifo with the primary key. Does not add the sez dev general business ifo to the database.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key for the new sez dev general business ifo
	 * @return the new sez dev general business ifo
	 */
	public static SezDevGeneralBusinessIfo create(
		long sezDevGeneralBusinessIfoId) {

		return getPersistence().create(sezDevGeneralBusinessIfoId);
	}

	/**
	 * Removes the sez dev general business ifo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo that was removed
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	public static SezDevGeneralBusinessIfo remove(
			long sezDevGeneralBusinessIfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevGeneralBusinessIfoException {

		return getPersistence().remove(sezDevGeneralBusinessIfoId);
	}

	public static SezDevGeneralBusinessIfo updateImpl(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		return getPersistence().updateImpl(sezDevGeneralBusinessIfo);
	}

	/**
	 * Returns the sez dev general business ifo with the primary key or throws a <code>NoSuchSezDevGeneralBusinessIfoException</code> if it could not be found.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	public static SezDevGeneralBusinessIfo findByPrimaryKey(
			long sezDevGeneralBusinessIfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevGeneralBusinessIfoException {

		return getPersistence().findByPrimaryKey(sezDevGeneralBusinessIfoId);
	}

	/**
	 * Returns the sez dev general business ifo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo, or <code>null</code> if a sez dev general business ifo with the primary key could not be found
	 */
	public static SezDevGeneralBusinessIfo fetchByPrimaryKey(
		long sezDevGeneralBusinessIfoId) {

		return getPersistence().fetchByPrimaryKey(sezDevGeneralBusinessIfoId);
	}

	/**
	 * Returns all the sez dev general business ifos.
	 *
	 * @return the sez dev general business ifos
	 */
	public static List<SezDevGeneralBusinessIfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @return the range of sez dev general business ifos
	 */
	public static List<SezDevGeneralBusinessIfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev general business ifos
	 */
	public static List<SezDevGeneralBusinessIfo> findAll(
		int start, int end,
		OrderByComparator<SezDevGeneralBusinessIfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev general business ifos
	 */
	public static List<SezDevGeneralBusinessIfo> findAll(
		int start, int end,
		OrderByComparator<SezDevGeneralBusinessIfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev general business ifos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev general business ifos.
	 *
	 * @return the number of sez dev general business ifos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevGeneralBusinessIfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevGeneralBusinessIfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevGeneralBusinessIfoPersistence _persistence;

}