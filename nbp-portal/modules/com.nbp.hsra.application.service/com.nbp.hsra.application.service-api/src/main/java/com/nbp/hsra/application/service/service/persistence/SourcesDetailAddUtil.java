/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.SourcesDetailAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sources detail add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.SourcesDetailAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAddPersistence
 * @generated
 */
public class SourcesDetailAddUtil {

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
	public static void clearCache(SourcesDetailAdd sourcesDetailAdd) {
		getPersistence().clearCache(sourcesDetailAdd);
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
	public static Map<Serializable, SourcesDetailAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SourcesDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SourcesDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SourcesDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SourcesDetailAdd update(SourcesDetailAdd sourcesDetailAdd) {
		return getPersistence().update(sourcesDetailAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SourcesDetailAdd update(
		SourcesDetailAdd sourcesDetailAdd, ServiceContext serviceContext) {

		return getPersistence().update(sourcesDetailAdd, serviceContext);
	}

	/**
	 * Returns all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching sources detail adds
	 */
	public static List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of matching sources detail adds
	 */
	public static List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sources detail adds
	 */
	public static List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sources detail adds
	 */
	public static List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sources detail add
	 * @throws NoSuchSourcesDetailAddException if a matching sources detail add could not be found
	 */
	public static SourcesDetailAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<SourcesDetailAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSourcesDetailAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sources detail add, or <code>null</code> if a matching sources detail add could not be found
	 */
	public static SourcesDetailAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sources detail add
	 * @throws NoSuchSourcesDetailAddException if a matching sources detail add could not be found
	 */
	public static SourcesDetailAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<SourcesDetailAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSourcesDetailAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sources detail add, or <code>null</code> if a matching sources detail add could not be found
	 */
	public static SourcesDetailAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the sources detail adds before and after the current sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param sourcesDetailAddId the primary key of the current sources detail add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	public static SourcesDetailAdd[] findBygetHsraById_PrevAndNext(
			long sourcesDetailAddId, long hsraApplicationId,
			OrderByComparator<SourcesDetailAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSourcesDetailAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			sourcesDetailAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sources detail adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of sources detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching sources detail adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the sources detail add in the entity cache if it is enabled.
	 *
	 * @param sourcesDetailAdd the sources detail add
	 */
	public static void cacheResult(SourcesDetailAdd sourcesDetailAdd) {
		getPersistence().cacheResult(sourcesDetailAdd);
	}

	/**
	 * Caches the sources detail adds in the entity cache if it is enabled.
	 *
	 * @param sourcesDetailAdds the sources detail adds
	 */
	public static void cacheResult(List<SourcesDetailAdd> sourcesDetailAdds) {
		getPersistence().cacheResult(sourcesDetailAdds);
	}

	/**
	 * Creates a new sources detail add with the primary key. Does not add the sources detail add to the database.
	 *
	 * @param sourcesDetailAddId the primary key for the new sources detail add
	 * @return the new sources detail add
	 */
	public static SourcesDetailAdd create(long sourcesDetailAddId) {
		return getPersistence().create(sourcesDetailAddId);
	}

	/**
	 * Removes the sources detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add that was removed
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	public static SourcesDetailAdd remove(long sourcesDetailAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSourcesDetailAddException {

		return getPersistence().remove(sourcesDetailAddId);
	}

	public static SourcesDetailAdd updateImpl(
		SourcesDetailAdd sourcesDetailAdd) {

		return getPersistence().updateImpl(sourcesDetailAdd);
	}

	/**
	 * Returns the sources detail add with the primary key or throws a <code>NoSuchSourcesDetailAddException</code> if it could not be found.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	public static SourcesDetailAdd findByPrimaryKey(long sourcesDetailAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSourcesDetailAddException {

		return getPersistence().findByPrimaryKey(sourcesDetailAddId);
	}

	/**
	 * Returns the sources detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add, or <code>null</code> if a sources detail add with the primary key could not be found
	 */
	public static SourcesDetailAdd fetchByPrimaryKey(long sourcesDetailAddId) {
		return getPersistence().fetchByPrimaryKey(sourcesDetailAddId);
	}

	/**
	 * Returns all the sources detail adds.
	 *
	 * @return the sources detail adds
	 */
	public static List<SourcesDetailAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of sources detail adds
	 */
	public static List<SourcesDetailAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sources detail adds
	 */
	public static List<SourcesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sources detail adds
	 */
	public static List<SourcesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sources detail adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sources detail adds.
	 *
	 * @return the number of sources detail adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SourcesDetailAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(SourcesDetailAddPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile SourcesDetailAddPersistence _persistence;

}