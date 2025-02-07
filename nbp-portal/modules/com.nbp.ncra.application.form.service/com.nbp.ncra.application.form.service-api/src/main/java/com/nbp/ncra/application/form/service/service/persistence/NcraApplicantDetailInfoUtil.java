/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra applicant detail info service. This utility wraps <code>com.nbp.ncra.application.form.service.service.persistence.impl.NcraApplicantDetailInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicantDetailInfoPersistence
 * @generated
 */
public class NcraApplicantDetailInfoUtil {

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
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		getPersistence().clearCache(ncraApplicantDetailInfo);
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
	public static Map<Serializable, NcraApplicantDetailInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraApplicantDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraApplicantDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraApplicantDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraApplicantDetailInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraApplicantDetailInfo update(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		return getPersistence().update(ncraApplicantDetailInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraApplicantDetailInfo update(
		NcraApplicantDetailInfo ncraApplicantDetailInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(ncraApplicantDetailInfo, serviceContext);
	}

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or throws a <code>NoSuchNcraApplicantDetailInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a matching ncra applicant detail info could not be found
	 */
	public static NcraApplicantDetailInfo findBygetNcraDetail_By_App_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicantDetailInfoException {

		return getPersistence().findBygetNcraDetail_By_App_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra applicant detail info, or <code>null</code> if a matching ncra applicant detail info could not be found
	 */
	public static NcraApplicantDetailInfo fetchBygetNcraDetail_By_App_Id(
		long ncraApplicationId) {

		return getPersistence().fetchBygetNcraDetail_By_App_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra applicant detail info, or <code>null</code> if a matching ncra applicant detail info could not be found
	 */
	public static NcraApplicantDetailInfo fetchBygetNcraDetail_By_App_Id(
		long ncraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraDetail_By_App_Id(
			ncraApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncra applicant detail info where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra applicant detail info that was removed
	 */
	public static NcraApplicantDetailInfo removeBygetNcraDetail_By_App_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicantDetailInfoException {

		return getPersistence().removeBygetNcraDetail_By_App_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the number of ncra applicant detail infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra applicant detail infos
	 */
	public static int countBygetNcraDetail_By_App_Id(long ncraApplicationId) {
		return getPersistence().countBygetNcraDetail_By_App_Id(
			ncraApplicationId);
	}

	/**
	 * Caches the ncra applicant detail info in the entity cache if it is enabled.
	 *
	 * @param ncraApplicantDetailInfo the ncra applicant detail info
	 */
	public static void cacheResult(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		getPersistence().cacheResult(ncraApplicantDetailInfo);
	}

	/**
	 * Caches the ncra applicant detail infos in the entity cache if it is enabled.
	 *
	 * @param ncraApplicantDetailInfos the ncra applicant detail infos
	 */
	public static void cacheResult(
		List<NcraApplicantDetailInfo> ncraApplicantDetailInfos) {

		getPersistence().cacheResult(ncraApplicantDetailInfos);
	}

	/**
	 * Creates a new ncra applicant detail info with the primary key. Does not add the ncra applicant detail info to the database.
	 *
	 * @param ncraApplicantDetailInfoId the primary key for the new ncra applicant detail info
	 * @return the new ncra applicant detail info
	 */
	public static NcraApplicantDetailInfo create(
		long ncraApplicantDetailInfoId) {

		return getPersistence().create(ncraApplicantDetailInfoId);
	}

	/**
	 * Removes the ncra applicant detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info that was removed
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	public static NcraApplicantDetailInfo remove(long ncraApplicantDetailInfoId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicantDetailInfoException {

		return getPersistence().remove(ncraApplicantDetailInfoId);
	}

	public static NcraApplicantDetailInfo updateImpl(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		return getPersistence().updateImpl(ncraApplicantDetailInfo);
	}

	/**
	 * Returns the ncra applicant detail info with the primary key or throws a <code>NoSuchNcraApplicantDetailInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	public static NcraApplicantDetailInfo findByPrimaryKey(
			long ncraApplicantDetailInfoId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicantDetailInfoException {

		return getPersistence().findByPrimaryKey(ncraApplicantDetailInfoId);
	}

	/**
	 * Returns the ncra applicant detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info, or <code>null</code> if a ncra applicant detail info with the primary key could not be found
	 */
	public static NcraApplicantDetailInfo fetchByPrimaryKey(
		long ncraApplicantDetailInfoId) {

		return getPersistence().fetchByPrimaryKey(ncraApplicantDetailInfoId);
	}

	/**
	 * Returns all the ncra applicant detail infos.
	 *
	 * @return the ncra applicant detail infos
	 */
	public static List<NcraApplicantDetailInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @return the range of ncra applicant detail infos
	 */
	public static List<NcraApplicantDetailInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra applicant detail infos
	 */
	public static List<NcraApplicantDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcraApplicantDetailInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra applicant detail infos
	 */
	public static List<NcraApplicantDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcraApplicantDetailInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra applicant detail infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra applicant detail infos.
	 *
	 * @return the number of ncra applicant detail infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraApplicantDetailInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcraApplicantDetailInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcraApplicantDetailInfoPersistence _persistence;

}