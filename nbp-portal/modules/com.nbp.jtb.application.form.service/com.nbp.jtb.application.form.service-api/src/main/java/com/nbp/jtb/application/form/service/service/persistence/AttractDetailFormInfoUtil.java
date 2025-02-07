/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attract detail form info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractDetailFormInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractDetailFormInfoPersistence
 * @generated
 */
public class AttractDetailFormInfoUtil {

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
	public static void clearCache(AttractDetailFormInfo attractDetailFormInfo) {
		getPersistence().clearCache(attractDetailFormInfo);
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
	public static Map<Serializable, AttractDetailFormInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractDetailFormInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractDetailFormInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractDetailFormInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractDetailFormInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractDetailFormInfo update(
		AttractDetailFormInfo attractDetailFormInfo) {

		return getPersistence().update(attractDetailFormInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractDetailFormInfo update(
		AttractDetailFormInfo attractDetailFormInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(attractDetailFormInfo, serviceContext);
	}

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractDetailFormInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a matching attract detail form info could not be found
	 */
	public static AttractDetailFormInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractDetailFormInfoException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attract detail form info, or <code>null</code> if a matching attract detail form info could not be found
	 */
	public static AttractDetailFormInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attract detail form info, or <code>null</code> if a matching attract detail form info could not be found
	 */
	public static AttractDetailFormInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attract detail form info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attract detail form info that was removed
	 */
	public static AttractDetailFormInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractDetailFormInfoException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attract detail form infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attract detail form infos
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attract detail form info in the entity cache if it is enabled.
	 *
	 * @param attractDetailFormInfo the attract detail form info
	 */
	public static void cacheResult(
		AttractDetailFormInfo attractDetailFormInfo) {

		getPersistence().cacheResult(attractDetailFormInfo);
	}

	/**
	 * Caches the attract detail form infos in the entity cache if it is enabled.
	 *
	 * @param attractDetailFormInfos the attract detail form infos
	 */
	public static void cacheResult(
		List<AttractDetailFormInfo> attractDetailFormInfos) {

		getPersistence().cacheResult(attractDetailFormInfos);
	}

	/**
	 * Creates a new attract detail form info with the primary key. Does not add the attract detail form info to the database.
	 *
	 * @param attractDetailFormInfoId the primary key for the new attract detail form info
	 * @return the new attract detail form info
	 */
	public static AttractDetailFormInfo create(long attractDetailFormInfoId) {
		return getPersistence().create(attractDetailFormInfoId);
	}

	/**
	 * Removes the attract detail form info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info that was removed
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	public static AttractDetailFormInfo remove(long attractDetailFormInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractDetailFormInfoException {

		return getPersistence().remove(attractDetailFormInfoId);
	}

	public static AttractDetailFormInfo updateImpl(
		AttractDetailFormInfo attractDetailFormInfo) {

		return getPersistence().updateImpl(attractDetailFormInfo);
	}

	/**
	 * Returns the attract detail form info with the primary key or throws a <code>NoSuchAttractDetailFormInfoException</code> if it could not be found.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	public static AttractDetailFormInfo findByPrimaryKey(
			long attractDetailFormInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractDetailFormInfoException {

		return getPersistence().findByPrimaryKey(attractDetailFormInfoId);
	}

	/**
	 * Returns the attract detail form info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info, or <code>null</code> if a attract detail form info with the primary key could not be found
	 */
	public static AttractDetailFormInfo fetchByPrimaryKey(
		long attractDetailFormInfoId) {

		return getPersistence().fetchByPrimaryKey(attractDetailFormInfoId);
	}

	/**
	 * Returns all the attract detail form infos.
	 *
	 * @return the attract detail form infos
	 */
	public static List<AttractDetailFormInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @return the range of attract detail form infos
	 */
	public static List<AttractDetailFormInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attract detail form infos
	 */
	public static List<AttractDetailFormInfo> findAll(
		int start, int end,
		OrderByComparator<AttractDetailFormInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attract detail form infos
	 */
	public static List<AttractDetailFormInfo> findAll(
		int start, int end,
		OrderByComparator<AttractDetailFormInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attract detail form infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attract detail form infos.
	 *
	 * @return the number of attract detail form infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractDetailFormInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractDetailFormInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractDetailFormInfoPersistence _persistence;

}