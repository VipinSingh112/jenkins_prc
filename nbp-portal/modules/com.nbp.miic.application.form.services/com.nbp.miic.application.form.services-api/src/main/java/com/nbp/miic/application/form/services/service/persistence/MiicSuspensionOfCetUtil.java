/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic suspension of cet service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicSuspensionOfCetPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetPersistence
 * @generated
 */
public class MiicSuspensionOfCetUtil {

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
	public static void clearCache(MiicSuspensionOfCet miicSuspensionOfCet) {
		getPersistence().clearCache(miicSuspensionOfCet);
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
	public static Map<Serializable, MiicSuspensionOfCet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicSuspensionOfCet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicSuspensionOfCet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicSuspensionOfCet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicSuspensionOfCet> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicSuspensionOfCet update(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		return getPersistence().update(miicSuspensionOfCet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicSuspensionOfCet update(
		MiicSuspensionOfCet miicSuspensionOfCet,
		ServiceContext serviceContext) {

		return getPersistence().update(miicSuspensionOfCet, serviceContext);
	}

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or throws a <code>NoSuchMiicSuspensionOfCetException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a matching miic suspension of cet could not be found
	 */
	public static MiicSuspensionOfCet findBygetMiicById(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetException {

		return getPersistence().findBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet, or <code>null</code> if a matching miic suspension of cet could not be found
	 */
	public static MiicSuspensionOfCet fetchBygetMiicById(
		long miicApplicationId) {

		return getPersistence().fetchBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic suspension of cet, or <code>null</code> if a matching miic suspension of cet could not be found
	 */
	public static MiicSuspensionOfCet fetchBygetMiicById(
		long miicApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiicById(
			miicApplicationId, useFinderCache);
	}

	/**
	 * Removes the miic suspension of cet where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic suspension of cet that was removed
	 */
	public static MiicSuspensionOfCet removeBygetMiicById(
			long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetException {

		return getPersistence().removeBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the number of miic suspension of cets where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic suspension of cets
	 */
	public static int countBygetMiicById(long miicApplicationId) {
		return getPersistence().countBygetMiicById(miicApplicationId);
	}

	/**
	 * Caches the miic suspension of cet in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 */
	public static void cacheResult(MiicSuspensionOfCet miicSuspensionOfCet) {
		getPersistence().cacheResult(miicSuspensionOfCet);
	}

	/**
	 * Caches the miic suspension of cets in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCets the miic suspension of cets
	 */
	public static void cacheResult(
		List<MiicSuspensionOfCet> miicSuspensionOfCets) {

		getPersistence().cacheResult(miicSuspensionOfCets);
	}

	/**
	 * Creates a new miic suspension of cet with the primary key. Does not add the miic suspension of cet to the database.
	 *
	 * @param miicSuspensionOfCetId the primary key for the new miic suspension of cet
	 * @return the new miic suspension of cet
	 */
	public static MiicSuspensionOfCet create(long miicSuspensionOfCetId) {
		return getPersistence().create(miicSuspensionOfCetId);
	}

	/**
	 * Removes the miic suspension of cet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	public static MiicSuspensionOfCet remove(long miicSuspensionOfCetId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetException {

		return getPersistence().remove(miicSuspensionOfCetId);
	}

	public static MiicSuspensionOfCet updateImpl(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		return getPersistence().updateImpl(miicSuspensionOfCet);
	}

	/**
	 * Returns the miic suspension of cet with the primary key or throws a <code>NoSuchMiicSuspensionOfCetException</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	public static MiicSuspensionOfCet findByPrimaryKey(
			long miicSuspensionOfCetId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetException {

		return getPersistence().findByPrimaryKey(miicSuspensionOfCetId);
	}

	/**
	 * Returns the miic suspension of cet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet, or <code>null</code> if a miic suspension of cet with the primary key could not be found
	 */
	public static MiicSuspensionOfCet fetchByPrimaryKey(
		long miicSuspensionOfCetId) {

		return getPersistence().fetchByPrimaryKey(miicSuspensionOfCetId);
	}

	/**
	 * Returns all the miic suspension of cets.
	 *
	 * @return the miic suspension of cets
	 */
	public static List<MiicSuspensionOfCet> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @return the range of miic suspension of cets
	 */
	public static List<MiicSuspensionOfCet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic suspension of cets
	 */
	public static List<MiicSuspensionOfCet> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCet> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic suspension of cets
	 */
	public static List<MiicSuspensionOfCet> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCet> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic suspension of cets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic suspension of cets.
	 *
	 * @return the number of miic suspension of cets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicSuspensionOfCetPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicSuspensionOfCetPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicSuspensionOfCetPersistence _persistence;

}