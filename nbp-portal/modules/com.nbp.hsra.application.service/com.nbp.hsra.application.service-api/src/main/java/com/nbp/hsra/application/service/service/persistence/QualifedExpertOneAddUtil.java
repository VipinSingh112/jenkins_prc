/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the qualifed expert one add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.QualifedExpertOneAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAddPersistence
 * @generated
 */
public class QualifedExpertOneAddUtil {

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
	public static void clearCache(QualifedExpertOneAdd qualifedExpertOneAdd) {
		getPersistence().clearCache(qualifedExpertOneAdd);
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
	public static Map<Serializable, QualifedExpertOneAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualifedExpertOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualifedExpertOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualifedExpertOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualifedExpertOneAdd update(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		return getPersistence().update(qualifedExpertOneAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualifedExpertOneAdd update(
		QualifedExpertOneAdd qualifedExpertOneAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(qualifedExpertOneAdd, serviceContext);
	}

	/**
	 * Returns all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @return the range of matching qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a matching qualifed expert one add could not be found
	 */
	public static QualifedExpertOneAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertOneAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertOneAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert one add, or <code>null</code> if a matching qualifed expert one add could not be found
	 */
	public static QualifedExpertOneAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a matching qualifed expert one add could not be found
	 */
	public static QualifedExpertOneAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertOneAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertOneAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert one add, or <code>null</code> if a matching qualifed expert one add could not be found
	 */
	public static QualifedExpertOneAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the qualifed expert one adds before and after the current qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param qualifedExpertOneAddId the primary key of the current qualifed expert one add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	public static QualifedExpertOneAdd[] findBygetHsraById_PrevAndNext(
			long qualifedExpertOneAddId, long hsraApplicationId,
			OrderByComparator<QualifedExpertOneAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertOneAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			qualifedExpertOneAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the qualifed expert one adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching qualifed expert one adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the qualifed expert one add in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 */
	public static void cacheResult(QualifedExpertOneAdd qualifedExpertOneAdd) {
		getPersistence().cacheResult(qualifedExpertOneAdd);
	}

	/**
	 * Caches the qualifed expert one adds in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertOneAdds the qualifed expert one adds
	 */
	public static void cacheResult(
		List<QualifedExpertOneAdd> qualifedExpertOneAdds) {

		getPersistence().cacheResult(qualifedExpertOneAdds);
	}

	/**
	 * Creates a new qualifed expert one add with the primary key. Does not add the qualifed expert one add to the database.
	 *
	 * @param qualifedExpertOneAddId the primary key for the new qualifed expert one add
	 * @return the new qualifed expert one add
	 */
	public static QualifedExpertOneAdd create(long qualifedExpertOneAddId) {
		return getPersistence().create(qualifedExpertOneAddId);
	}

	/**
	 * Removes the qualifed expert one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	public static QualifedExpertOneAdd remove(long qualifedExpertOneAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertOneAddException {

		return getPersistence().remove(qualifedExpertOneAddId);
	}

	public static QualifedExpertOneAdd updateImpl(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		return getPersistence().updateImpl(qualifedExpertOneAdd);
	}

	/**
	 * Returns the qualifed expert one add with the primary key or throws a <code>NoSuchQualifedExpertOneAddException</code> if it could not be found.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	public static QualifedExpertOneAdd findByPrimaryKey(
			long qualifedExpertOneAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualifedExpertOneAddException {

		return getPersistence().findByPrimaryKey(qualifedExpertOneAddId);
	}

	/**
	 * Returns the qualifed expert one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add, or <code>null</code> if a qualifed expert one add with the primary key could not be found
	 */
	public static QualifedExpertOneAdd fetchByPrimaryKey(
		long qualifedExpertOneAddId) {

		return getPersistence().fetchByPrimaryKey(qualifedExpertOneAddId);
	}

	/**
	 * Returns all the qualifed expert one adds.
	 *
	 * @return the qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @return the range of qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualifed expert one adds
	 */
	public static List<QualifedExpertOneAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the qualifed expert one adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of qualifed expert one adds.
	 *
	 * @return the number of qualifed expert one adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualifedExpertOneAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualifedExpertOneAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualifedExpertOneAddPersistence _persistence;

}