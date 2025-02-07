/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuExportData;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu export data service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuExportDataPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuExportDataPersistence
 * @generated
 */
public class ManuExportDataUtil {

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
	public static void clearCache(ManuExportData manuExportData) {
		getPersistence().clearCache(manuExportData);
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
	public static Map<Serializable, ManuExportData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuExportData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuExportData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuExportData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuExportData> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuExportData update(ManuExportData manuExportData) {
		return getPersistence().update(manuExportData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuExportData update(
		ManuExportData manuExportData, ServiceContext serviceContext) {

		return getPersistence().update(manuExportData, serviceContext);
	}

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuExportDataException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	public static ManuExportData findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public static ManuExportData fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu export data where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public static ManuExportData fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu export data where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu export data that was removed
	 */
	public static ManuExportData removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu export datas
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu export datas
	 */
	public static List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_ED_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @return the range of matching manu export datas
	 */
	public static List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_ED_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu export datas
	 */
	public static List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuExportData> orderByComparator) {

		return getPersistence().findBygetMA_ED_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu export datas
	 */
	public static List<ManuExportData> findBygetMA_ED_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuExportData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_ED_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	public static ManuExportData findBygetMA_ED_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuExportData> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().findBygetMA_ED_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public static ManuExportData fetchBygetMA_ED_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuExportData> orderByComparator) {

		return getPersistence().fetchBygetMA_ED_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu export data
	 * @throws NoSuchManuExportDataException if a matching manu export data could not be found
	 */
	public static ManuExportData findBygetMA_ED_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuExportData> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().findBygetMA_ED_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu export data, or <code>null</code> if a matching manu export data could not be found
	 */
	public static ManuExportData fetchBygetMA_ED_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuExportData> orderByComparator) {

		return getPersistence().fetchBygetMA_ED_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu export datas before and after the current manu export data in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuExportDataId the primary key of the current manu export data
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	public static ManuExportData[] findBygetMA_ED_MAI_PrevAndNext(
			long manuExportDataId, long manufacturingApplicationId,
			OrderByComparator<ManuExportData> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().findBygetMA_ED_MAI_PrevAndNext(
			manuExportDataId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the manu export datas where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_ED_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_ED_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu export datas where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu export datas
	 */
	public static int countBygetMA_ED_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_ED_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the manu export data in the entity cache if it is enabled.
	 *
	 * @param manuExportData the manu export data
	 */
	public static void cacheResult(ManuExportData manuExportData) {
		getPersistence().cacheResult(manuExportData);
	}

	/**
	 * Caches the manu export datas in the entity cache if it is enabled.
	 *
	 * @param manuExportDatas the manu export datas
	 */
	public static void cacheResult(List<ManuExportData> manuExportDatas) {
		getPersistence().cacheResult(manuExportDatas);
	}

	/**
	 * Creates a new manu export data with the primary key. Does not add the manu export data to the database.
	 *
	 * @param manuExportDataId the primary key for the new manu export data
	 * @return the new manu export data
	 */
	public static ManuExportData create(long manuExportDataId) {
		return getPersistence().create(manuExportDataId);
	}

	/**
	 * Removes the manu export data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data that was removed
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	public static ManuExportData remove(long manuExportDataId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().remove(manuExportDataId);
	}

	public static ManuExportData updateImpl(ManuExportData manuExportData) {
		return getPersistence().updateImpl(manuExportData);
	}

	/**
	 * Returns the manu export data with the primary key or throws a <code>NoSuchManuExportDataException</code> if it could not be found.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data
	 * @throws NoSuchManuExportDataException if a manu export data with the primary key could not be found
	 */
	public static ManuExportData findByPrimaryKey(long manuExportDataId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuExportDataException {

		return getPersistence().findByPrimaryKey(manuExportDataId);
	}

	/**
	 * Returns the manu export data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data, or <code>null</code> if a manu export data with the primary key could not be found
	 */
	public static ManuExportData fetchByPrimaryKey(long manuExportDataId) {
		return getPersistence().fetchByPrimaryKey(manuExportDataId);
	}

	/**
	 * Returns all the manu export datas.
	 *
	 * @return the manu export datas
	 */
	public static List<ManuExportData> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @return the range of manu export datas
	 */
	public static List<ManuExportData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu export datas
	 */
	public static List<ManuExportData> findAll(
		int start, int end,
		OrderByComparator<ManuExportData> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu export datas
	 */
	public static List<ManuExportData> findAll(
		int start, int end, OrderByComparator<ManuExportData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu export datas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu export datas.
	 *
	 * @return the number of manu export datas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuExportDataPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ManuExportDataPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ManuExportDataPersistence _persistence;

}