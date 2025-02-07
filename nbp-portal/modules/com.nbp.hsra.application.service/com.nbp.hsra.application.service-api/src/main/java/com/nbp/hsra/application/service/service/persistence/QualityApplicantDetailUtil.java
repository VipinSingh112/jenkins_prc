/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualityApplicantDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quality applicant detail service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.QualityApplicantDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetailPersistence
 * @generated
 */
public class QualityApplicantDetailUtil {

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
		QualityApplicantDetail qualityApplicantDetail) {

		getPersistence().clearCache(qualityApplicantDetail);
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
	public static Map<Serializable, QualityApplicantDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualityApplicantDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualityApplicantDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualityApplicantDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualityApplicantDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualityApplicantDetail update(
		QualityApplicantDetail qualityApplicantDetail) {

		return getPersistence().update(qualityApplicantDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualityApplicantDetail update(
		QualityApplicantDetail qualityApplicantDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(qualityApplicantDetail, serviceContext);
	}

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or throws a <code>NoSuchQualityApplicantDetailException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a matching quality applicant detail could not be found
	 */
	public static QualityApplicantDetail findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityApplicantDetailException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality applicant detail, or <code>null</code> if a matching quality applicant detail could not be found
	 */
	public static QualityApplicantDetail fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality applicant detail, or <code>null</code> if a matching quality applicant detail could not be found
	 */
	public static QualityApplicantDetail fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the quality applicant detail where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality applicant detail that was removed
	 */
	public static QualityApplicantDetail removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityApplicantDetailException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of quality applicant details where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality applicant details
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the quality applicant detail in the entity cache if it is enabled.
	 *
	 * @param qualityApplicantDetail the quality applicant detail
	 */
	public static void cacheResult(
		QualityApplicantDetail qualityApplicantDetail) {

		getPersistence().cacheResult(qualityApplicantDetail);
	}

	/**
	 * Caches the quality applicant details in the entity cache if it is enabled.
	 *
	 * @param qualityApplicantDetails the quality applicant details
	 */
	public static void cacheResult(
		List<QualityApplicantDetail> qualityApplicantDetails) {

		getPersistence().cacheResult(qualityApplicantDetails);
	}

	/**
	 * Creates a new quality applicant detail with the primary key. Does not add the quality applicant detail to the database.
	 *
	 * @param qualityApplicantDetailId the primary key for the new quality applicant detail
	 * @return the new quality applicant detail
	 */
	public static QualityApplicantDetail create(long qualityApplicantDetailId) {
		return getPersistence().create(qualityApplicantDetailId);
	}

	/**
	 * Removes the quality applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail that was removed
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	public static QualityApplicantDetail remove(long qualityApplicantDetailId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityApplicantDetailException {

		return getPersistence().remove(qualityApplicantDetailId);
	}

	public static QualityApplicantDetail updateImpl(
		QualityApplicantDetail qualityApplicantDetail) {

		return getPersistence().updateImpl(qualityApplicantDetail);
	}

	/**
	 * Returns the quality applicant detail with the primary key or throws a <code>NoSuchQualityApplicantDetailException</code> if it could not be found.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	public static QualityApplicantDetail findByPrimaryKey(
			long qualityApplicantDetailId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityApplicantDetailException {

		return getPersistence().findByPrimaryKey(qualityApplicantDetailId);
	}

	/**
	 * Returns the quality applicant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail, or <code>null</code> if a quality applicant detail with the primary key could not be found
	 */
	public static QualityApplicantDetail fetchByPrimaryKey(
		long qualityApplicantDetailId) {

		return getPersistence().fetchByPrimaryKey(qualityApplicantDetailId);
	}

	/**
	 * Returns all the quality applicant details.
	 *
	 * @return the quality applicant details
	 */
	public static List<QualityApplicantDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @return the range of quality applicant details
	 */
	public static List<QualityApplicantDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality applicant details
	 */
	public static List<QualityApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<QualityApplicantDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality applicant details
	 */
	public static List<QualityApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<QualityApplicantDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quality applicant details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quality applicant details.
	 *
	 * @return the number of quality applicant details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualityApplicantDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualityApplicantDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualityApplicantDetailPersistence _persistence;

}