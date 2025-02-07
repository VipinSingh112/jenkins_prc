/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualityProficiencyDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quality proficiency detail service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.QualityProficiencyDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityProficiencyDetailPersistence
 * @generated
 */
public class QualityProficiencyDetailUtil {

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
		QualityProficiencyDetail qualityProficiencyDetail) {

		getPersistence().clearCache(qualityProficiencyDetail);
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
	public static Map<Serializable, QualityProficiencyDetail>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualityProficiencyDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualityProficiencyDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualityProficiencyDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualityProficiencyDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualityProficiencyDetail update(
		QualityProficiencyDetail qualityProficiencyDetail) {

		return getPersistence().update(qualityProficiencyDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualityProficiencyDetail update(
		QualityProficiencyDetail qualityProficiencyDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(
			qualityProficiencyDetail, serviceContext);
	}

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or throws a <code>NoSuchQualityProficiencyDetailException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a matching quality proficiency detail could not be found
	 */
	public static QualityProficiencyDetail findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityProficiencyDetailException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality proficiency detail, or <code>null</code> if a matching quality proficiency detail could not be found
	 */
	public static QualityProficiencyDetail fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality proficiency detail, or <code>null</code> if a matching quality proficiency detail could not be found
	 */
	public static QualityProficiencyDetail fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the quality proficiency detail where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality proficiency detail that was removed
	 */
	public static QualityProficiencyDetail removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityProficiencyDetailException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of quality proficiency details where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality proficiency details
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the quality proficiency detail in the entity cache if it is enabled.
	 *
	 * @param qualityProficiencyDetail the quality proficiency detail
	 */
	public static void cacheResult(
		QualityProficiencyDetail qualityProficiencyDetail) {

		getPersistence().cacheResult(qualityProficiencyDetail);
	}

	/**
	 * Caches the quality proficiency details in the entity cache if it is enabled.
	 *
	 * @param qualityProficiencyDetails the quality proficiency details
	 */
	public static void cacheResult(
		List<QualityProficiencyDetail> qualityProficiencyDetails) {

		getPersistence().cacheResult(qualityProficiencyDetails);
	}

	/**
	 * Creates a new quality proficiency detail with the primary key. Does not add the quality proficiency detail to the database.
	 *
	 * @param qualityProficiDetailId the primary key for the new quality proficiency detail
	 * @return the new quality proficiency detail
	 */
	public static QualityProficiencyDetail create(long qualityProficiDetailId) {
		return getPersistence().create(qualityProficiDetailId);
	}

	/**
	 * Removes the quality proficiency detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail that was removed
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	public static QualityProficiencyDetail remove(long qualityProficiDetailId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityProficiencyDetailException {

		return getPersistence().remove(qualityProficiDetailId);
	}

	public static QualityProficiencyDetail updateImpl(
		QualityProficiencyDetail qualityProficiencyDetail) {

		return getPersistence().updateImpl(qualityProficiencyDetail);
	}

	/**
	 * Returns the quality proficiency detail with the primary key or throws a <code>NoSuchQualityProficiencyDetailException</code> if it could not be found.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	public static QualityProficiencyDetail findByPrimaryKey(
			long qualityProficiDetailId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityProficiencyDetailException {

		return getPersistence().findByPrimaryKey(qualityProficiDetailId);
	}

	/**
	 * Returns the quality proficiency detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail, or <code>null</code> if a quality proficiency detail with the primary key could not be found
	 */
	public static QualityProficiencyDetail fetchByPrimaryKey(
		long qualityProficiDetailId) {

		return getPersistence().fetchByPrimaryKey(qualityProficiDetailId);
	}

	/**
	 * Returns all the quality proficiency details.
	 *
	 * @return the quality proficiency details
	 */
	public static List<QualityProficiencyDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @return the range of quality proficiency details
	 */
	public static List<QualityProficiencyDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality proficiency details
	 */
	public static List<QualityProficiencyDetail> findAll(
		int start, int end,
		OrderByComparator<QualityProficiencyDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality proficiency details
	 */
	public static List<QualityProficiencyDetail> findAll(
		int start, int end,
		OrderByComparator<QualityProficiencyDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quality proficiency details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quality proficiency details.
	 *
	 * @return the number of quality proficiency details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualityProficiencyDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualityProficiencyDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualityProficiencyDetailPersistence _persistence;

}