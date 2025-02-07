/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu company info service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuCompanyInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoPersistence
 * @generated
 */
public class ManuCompanyInfoUtil {

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
	public static void clearCache(ManuCompanyInfo manuCompanyInfo) {
		getPersistence().clearCache(manuCompanyInfo);
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
	public static Map<Serializable, ManuCompanyInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuCompanyInfo update(ManuCompanyInfo manuCompanyInfo) {
		return getPersistence().update(manuCompanyInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuCompanyInfo update(
		ManuCompanyInfo manuCompanyInfo, ServiceContext serviceContext) {

		return getPersistence().update(manuCompanyInfo, serviceContext);
	}

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuCompanyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu company info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu company info that was removed
	 */
	public static ManuCompanyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company infos
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company infos
	 */
	public static List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_CI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @return the range of matching manu company infos
	 */
	public static List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_CI_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu company infos
	 */
	public static List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return getPersistence().findBygetMA_CI_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu company infos
	 */
	public static List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_CI_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo findBygetMA_CI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfo> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().findBygetMA_CI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo fetchBygetMA_CI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return getPersistence().fetchBygetMA_CI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo findBygetMA_CI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfo> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().findBygetMA_CI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public static ManuCompanyInfo fetchBygetMA_CI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return getPersistence().fetchBygetMA_CI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu company infos before and after the current manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuCompanyInfoId the primary key of the current manu company info
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	public static ManuCompanyInfo[] findBygetMA_CI_MAI_PrevAndNext(
			long manuCompanyInfoId, long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfo> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().findBygetMA_CI_MAI_PrevAndNext(
			manuCompanyInfoId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the manu company infos where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_CI_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_CI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company infos
	 */
	public static int countBygetMA_CI_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_CI_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the manu company info in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfo the manu company info
	 */
	public static void cacheResult(ManuCompanyInfo manuCompanyInfo) {
		getPersistence().cacheResult(manuCompanyInfo);
	}

	/**
	 * Caches the manu company infos in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfos the manu company infos
	 */
	public static void cacheResult(List<ManuCompanyInfo> manuCompanyInfos) {
		getPersistence().cacheResult(manuCompanyInfos);
	}

	/**
	 * Creates a new manu company info with the primary key. Does not add the manu company info to the database.
	 *
	 * @param manuCompanyInfoId the primary key for the new manu company info
	 * @return the new manu company info
	 */
	public static ManuCompanyInfo create(long manuCompanyInfoId) {
		return getPersistence().create(manuCompanyInfoId);
	}

	/**
	 * Removes the manu company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info that was removed
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	public static ManuCompanyInfo remove(long manuCompanyInfoId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().remove(manuCompanyInfoId);
	}

	public static ManuCompanyInfo updateImpl(ManuCompanyInfo manuCompanyInfo) {
		return getPersistence().updateImpl(manuCompanyInfo);
	}

	/**
	 * Returns the manu company info with the primary key or throws a <code>NoSuchManuCompanyInfoException</code> if it could not be found.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	public static ManuCompanyInfo findByPrimaryKey(long manuCompanyInfoId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoException {

		return getPersistence().findByPrimaryKey(manuCompanyInfoId);
	}

	/**
	 * Returns the manu company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info, or <code>null</code> if a manu company info with the primary key could not be found
	 */
	public static ManuCompanyInfo fetchByPrimaryKey(long manuCompanyInfoId) {
		return getPersistence().fetchByPrimaryKey(manuCompanyInfoId);
	}

	/**
	 * Returns all the manu company infos.
	 *
	 * @return the manu company infos
	 */
	public static List<ManuCompanyInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @return the range of manu company infos
	 */
	public static List<ManuCompanyInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu company infos
	 */
	public static List<ManuCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu company infos
	 */
	public static List<ManuCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu company infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu company infos.
	 *
	 * @return the number of manu company infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuCompanyInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ManuCompanyInfoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ManuCompanyInfoPersistence _persistence;

}