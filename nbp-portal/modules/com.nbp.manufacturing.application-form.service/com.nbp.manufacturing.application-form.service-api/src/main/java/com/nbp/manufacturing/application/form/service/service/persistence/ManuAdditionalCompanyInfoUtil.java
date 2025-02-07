/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuAdditionalCompanyInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu additional company info service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuAdditionalCompanyInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalCompanyInfoPersistence
 * @generated
 */
public class ManuAdditionalCompanyInfoUtil {

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
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		getPersistence().clearCache(manuAdditionalCompanyInfo);
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
	public static Map<Serializable, ManuAdditionalCompanyInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuAdditionalCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuAdditionalCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuAdditionalCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuAdditionalCompanyInfo update(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		return getPersistence().update(manuAdditionalCompanyInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuAdditionalCompanyInfo update(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manuAdditionalCompanyInfo, serviceContext);
	}

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuAdditionalCompanyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu additional company info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu additional company info that was removed
	 */
	public static ManuAdditionalCompanyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional company infos
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_ACI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of matching manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_ACI_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return getPersistence().findBygetMA_ACI_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_ACI_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo findBygetMA_ACI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().findBygetMA_ACI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo fetchBygetMA_ACI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return getPersistence().fetchBygetMA_ACI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo findBygetMA_ACI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().findBygetMA_ACI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public static ManuAdditionalCompanyInfo fetchBygetMA_ACI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return getPersistence().fetchBygetMA_ACI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu additional company infos before and after the current manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the current manu additional company info
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	public static ManuAdditionalCompanyInfo[] findBygetMA_ACI_MAI_PrevAndNext(
			long manuAdditionalCompanyInfoId, long manufacturingApplicationId,
			OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().findBygetMA_ACI_MAI_PrevAndNext(
			manuAdditionalCompanyInfoId, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the manu additional company infos where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_ACI_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_ACI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional company infos
	 */
	public static int countBygetMA_ACI_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_ACI_MAI(
			manufacturingApplicationId);
	}

	/**
	 * Caches the manu additional company info in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalCompanyInfo the manu additional company info
	 */
	public static void cacheResult(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		getPersistence().cacheResult(manuAdditionalCompanyInfo);
	}

	/**
	 * Caches the manu additional company infos in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalCompanyInfos the manu additional company infos
	 */
	public static void cacheResult(
		List<ManuAdditionalCompanyInfo> manuAdditionalCompanyInfos) {

		getPersistence().cacheResult(manuAdditionalCompanyInfos);
	}

	/**
	 * Creates a new manu additional company info with the primary key. Does not add the manu additional company info to the database.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key for the new manu additional company info
	 * @return the new manu additional company info
	 */
	public static ManuAdditionalCompanyInfo create(
		long manuAdditionalCompanyInfoId) {

		return getPersistence().create(manuAdditionalCompanyInfoId);
	}

	/**
	 * Removes the manu additional company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info that was removed
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	public static ManuAdditionalCompanyInfo remove(
			long manuAdditionalCompanyInfoId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().remove(manuAdditionalCompanyInfoId);
	}

	public static ManuAdditionalCompanyInfo updateImpl(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		return getPersistence().updateImpl(manuAdditionalCompanyInfo);
	}

	/**
	 * Returns the manu additional company info with the primary key or throws a <code>NoSuchManuAdditionalCompanyInfoException</code> if it could not be found.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	public static ManuAdditionalCompanyInfo findByPrimaryKey(
			long manuAdditionalCompanyInfoId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalCompanyInfoException {

		return getPersistence().findByPrimaryKey(manuAdditionalCompanyInfoId);
	}

	/**
	 * Returns the manu additional company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info, or <code>null</code> if a manu additional company info with the primary key could not be found
	 */
	public static ManuAdditionalCompanyInfo fetchByPrimaryKey(
		long manuAdditionalCompanyInfoId) {

		return getPersistence().fetchByPrimaryKey(manuAdditionalCompanyInfoId);
	}

	/**
	 * Returns all the manu additional company infos.
	 *
	 * @return the manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu additional company infos
	 */
	public static List<ManuAdditionalCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu additional company infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu additional company infos.
	 *
	 * @return the number of manu additional company infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuAdditionalCompanyInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManuAdditionalCompanyInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManuAdditionalCompanyInfoPersistence _persistence;

}