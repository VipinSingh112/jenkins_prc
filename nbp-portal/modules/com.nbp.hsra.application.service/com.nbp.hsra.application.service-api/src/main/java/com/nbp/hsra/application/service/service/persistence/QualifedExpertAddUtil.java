/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualifedExpertAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the qualifed expert add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.QualifedExpertAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertAddPersistence
 * @generated
 */
public class QualifedExpertAddUtil {

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
	public static void clearCache(QualifedExpertAdd qualifedExpertAdd) {
		getPersistence().clearCache(qualifedExpertAdd);
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
	public static Map<Serializable, QualifedExpertAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualifedExpertAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualifedExpertAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualifedExpertAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualifedExpertAdd update(
		QualifedExpertAdd qualifedExpertAdd) {

		return getPersistence().update(qualifedExpertAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualifedExpertAdd update(
		QualifedExpertAdd qualifedExpertAdd, ServiceContext serviceContext) {

		return getPersistence().update(qualifedExpertAdd, serviceContext);
	}

	/**
	 * Returns all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of matching qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a matching qualifed expert add could not be found
	 */
	public static QualifedExpertAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert add, or <code>null</code> if a matching qualifed expert add could not be found
	 */
	public static QualifedExpertAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a matching qualifed expert add could not be found
	 */
	public static QualifedExpertAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert add, or <code>null</code> if a matching qualifed expert add could not be found
	 */
	public static QualifedExpertAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the qualifed expert adds before and after the current qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param qualifedExpertAddId the primary key of the current qualifed expert add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	public static QualifedExpertAdd[] findBygetHsraById_PrevAndNext(
			long qualifedExpertAddId, long hsraApplicationId,
			OrderByComparator<QualifedExpertAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			qualifedExpertAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the qualifed expert adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching qualifed expert adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the qualifed expert add in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertAdd the qualifed expert add
	 */
	public static void cacheResult(QualifedExpertAdd qualifedExpertAdd) {
		getPersistence().cacheResult(qualifedExpertAdd);
	}

	/**
	 * Caches the qualifed expert adds in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertAdds the qualifed expert adds
	 */
	public static void cacheResult(List<QualifedExpertAdd> qualifedExpertAdds) {
		getPersistence().cacheResult(qualifedExpertAdds);
	}

	/**
	 * Creates a new qualifed expert add with the primary key. Does not add the qualifed expert add to the database.
	 *
	 * @param qualifedExpertAddId the primary key for the new qualifed expert add
	 * @return the new qualifed expert add
	 */
	public static QualifedExpertAdd create(long qualifedExpertAddId) {
		return getPersistence().create(qualifedExpertAddId);
	}

	/**
	 * Removes the qualifed expert add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add that was removed
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	public static QualifedExpertAdd remove(long qualifedExpertAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertAddException {

		return getPersistence().remove(qualifedExpertAddId);
	}

	public static QualifedExpertAdd updateImpl(
		QualifedExpertAdd qualifedExpertAdd) {

		return getPersistence().updateImpl(qualifedExpertAdd);
	}

	/**
	 * Returns the qualifed expert add with the primary key or throws a <code>NoSuchQualifedExpertAddException</code> if it could not be found.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	public static QualifedExpertAdd findByPrimaryKey(long qualifedExpertAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertAddException {

		return getPersistence().findByPrimaryKey(qualifedExpertAddId);
	}

	/**
	 * Returns the qualifed expert add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add, or <code>null</code> if a qualifed expert add with the primary key could not be found
	 */
	public static QualifedExpertAdd fetchByPrimaryKey(
		long qualifedExpertAddId) {

		return getPersistence().fetchByPrimaryKey(qualifedExpertAddId);
	}

	/**
	 * Returns all the qualifed expert adds.
	 *
	 * @return the qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualifed expert adds
	 */
	public static List<QualifedExpertAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the qualifed expert adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of qualifed expert adds.
	 *
	 * @return the number of qualifed expert adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualifedExpertAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualifedExpertAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualifedExpertAddPersistence _persistence;

}