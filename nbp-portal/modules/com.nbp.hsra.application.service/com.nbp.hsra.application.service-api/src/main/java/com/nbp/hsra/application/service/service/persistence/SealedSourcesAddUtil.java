/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.SealedSourcesAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sealed sources add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.SealedSourcesAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SealedSourcesAddPersistence
 * @generated
 */
public class SealedSourcesAddUtil {

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
	public static void clearCache(SealedSourcesAdd sealedSourcesAdd) {
		getPersistence().clearCache(sealedSourcesAdd);
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
	public static Map<Serializable, SealedSourcesAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SealedSourcesAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SealedSourcesAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SealedSourcesAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SealedSourcesAdd update(SealedSourcesAdd sealedSourcesAdd) {
		return getPersistence().update(sealedSourcesAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SealedSourcesAdd update(
		SealedSourcesAdd sealedSourcesAdd, ServiceContext serviceContext) {

		return getPersistence().update(sealedSourcesAdd, serviceContext);
	}

	/**
	 * Returns all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching sealed sources adds
	 */
	public static List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of matching sealed sources adds
	 */
	public static List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sealed sources adds
	 */
	public static List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sealed sources adds
	 */
	public static List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a matching sealed sources add could not be found
	 */
	public static SealedSourcesAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<SealedSourcesAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSealedSourcesAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sealed sources add, or <code>null</code> if a matching sealed sources add could not be found
	 */
	public static SealedSourcesAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a matching sealed sources add could not be found
	 */
	public static SealedSourcesAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<SealedSourcesAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSealedSourcesAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sealed sources add, or <code>null</code> if a matching sealed sources add could not be found
	 */
	public static SealedSourcesAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the sealed sources adds before and after the current sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param sealedSourcesAddId the primary key of the current sealed sources add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	public static SealedSourcesAdd[] findBygetHsraById_PrevAndNext(
			long sealedSourcesAddId, long hsraApplicationId,
			OrderByComparator<SealedSourcesAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSealedSourcesAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			sealedSourcesAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sealed sources adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching sealed sources adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the sealed sources add in the entity cache if it is enabled.
	 *
	 * @param sealedSourcesAdd the sealed sources add
	 */
	public static void cacheResult(SealedSourcesAdd sealedSourcesAdd) {
		getPersistence().cacheResult(sealedSourcesAdd);
	}

	/**
	 * Caches the sealed sources adds in the entity cache if it is enabled.
	 *
	 * @param sealedSourcesAdds the sealed sources adds
	 */
	public static void cacheResult(List<SealedSourcesAdd> sealedSourcesAdds) {
		getPersistence().cacheResult(sealedSourcesAdds);
	}

	/**
	 * Creates a new sealed sources add with the primary key. Does not add the sealed sources add to the database.
	 *
	 * @param sealedSourcesAddId the primary key for the new sealed sources add
	 * @return the new sealed sources add
	 */
	public static SealedSourcesAdd create(long sealedSourcesAddId) {
		return getPersistence().create(sealedSourcesAddId);
	}

	/**
	 * Removes the sealed sources add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add that was removed
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	public static SealedSourcesAdd remove(long sealedSourcesAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSealedSourcesAddException {

		return getPersistence().remove(sealedSourcesAddId);
	}

	public static SealedSourcesAdd updateImpl(
		SealedSourcesAdd sealedSourcesAdd) {

		return getPersistence().updateImpl(sealedSourcesAdd);
	}

	/**
	 * Returns the sealed sources add with the primary key or throws a <code>NoSuchSealedSourcesAddException</code> if it could not be found.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	public static SealedSourcesAdd findByPrimaryKey(long sealedSourcesAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSealedSourcesAddException {

		return getPersistence().findByPrimaryKey(sealedSourcesAddId);
	}

	/**
	 * Returns the sealed sources add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add, or <code>null</code> if a sealed sources add with the primary key could not be found
	 */
	public static SealedSourcesAdd fetchByPrimaryKey(long sealedSourcesAddId) {
		return getPersistence().fetchByPrimaryKey(sealedSourcesAddId);
	}

	/**
	 * Returns all the sealed sources adds.
	 *
	 * @return the sealed sources adds
	 */
	public static List<SealedSourcesAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of sealed sources adds
	 */
	public static List<SealedSourcesAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sealed sources adds
	 */
	public static List<SealedSourcesAdd> findAll(
		int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sealed sources adds
	 */
	public static List<SealedSourcesAdd> findAll(
		int start, int end,
		OrderByComparator<SealedSourcesAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sealed sources adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sealed sources adds.
	 *
	 * @return the number of sealed sources adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SealedSourcesAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(SealedSourcesAddPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile SealedSourcesAddPersistence _persistence;

}