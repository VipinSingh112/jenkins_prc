/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuEquipment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu equipment service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuEquipmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentPersistence
 * @generated
 */
public class ManuEquipmentUtil {

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
	public static void clearCache(ManuEquipment manuEquipment) {
		getPersistence().clearCache(manuEquipment);
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
	public static Map<Serializable, ManuEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuEquipment update(ManuEquipment manuEquipment) {
		return getPersistence().update(manuEquipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuEquipment update(
		ManuEquipment manuEquipment, ServiceContext serviceContext) {

		return getPersistence().update(manuEquipment, serviceContext);
	}

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuEquipmentException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	public static ManuEquipment findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public static ManuEquipment fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu equipment where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public static ManuEquipment fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu equipment where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu equipment that was removed
	 */
	public static ManuEquipment removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipments
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipments
	 */
	public static List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_ME_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of matching manu equipments
	 */
	public static List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_ME_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipments
	 */
	public static List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return getPersistence().findBygetMA_ME_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipments
	 */
	public static List<ManuEquipment> findBygetMA_ME_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_ME_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	public static ManuEquipment findBygetMA_ME_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipment> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().findBygetMA_ME_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public static ManuEquipment fetchBygetMA_ME_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return getPersistence().fetchBygetMA_ME_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment
	 * @throws NoSuchManuEquipmentException if a matching manu equipment could not be found
	 */
	public static ManuEquipment findBygetMA_ME_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipment> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().findBygetMA_ME_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment, or <code>null</code> if a matching manu equipment could not be found
	 */
	public static ManuEquipment fetchBygetMA_ME_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return getPersistence().fetchBygetMA_ME_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu equipments before and after the current manu equipment in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuEquipmentId the primary key of the current manu equipment
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	public static ManuEquipment[] findBygetMA_ME_MAI_PrevAndNext(
			long manuEquipmentId, long manufacturingApplicationId,
			OrderByComparator<ManuEquipment> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().findBygetMA_ME_MAI_PrevAndNext(
			manuEquipmentId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the manu equipments where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_ME_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_ME_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu equipments where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipments
	 */
	public static int countBygetMA_ME_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_ME_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the manu equipment in the entity cache if it is enabled.
	 *
	 * @param manuEquipment the manu equipment
	 */
	public static void cacheResult(ManuEquipment manuEquipment) {
		getPersistence().cacheResult(manuEquipment);
	}

	/**
	 * Caches the manu equipments in the entity cache if it is enabled.
	 *
	 * @param manuEquipments the manu equipments
	 */
	public static void cacheResult(List<ManuEquipment> manuEquipments) {
		getPersistence().cacheResult(manuEquipments);
	}

	/**
	 * Creates a new manu equipment with the primary key. Does not add the manu equipment to the database.
	 *
	 * @param manuEquipmentId the primary key for the new manu equipment
	 * @return the new manu equipment
	 */
	public static ManuEquipment create(long manuEquipmentId) {
		return getPersistence().create(manuEquipmentId);
	}

	/**
	 * Removes the manu equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment that was removed
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	public static ManuEquipment remove(long manuEquipmentId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().remove(manuEquipmentId);
	}

	public static ManuEquipment updateImpl(ManuEquipment manuEquipment) {
		return getPersistence().updateImpl(manuEquipment);
	}

	/**
	 * Returns the manu equipment with the primary key or throws a <code>NoSuchManuEquipmentException</code> if it could not be found.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment
	 * @throws NoSuchManuEquipmentException if a manu equipment with the primary key could not be found
	 */
	public static ManuEquipment findByPrimaryKey(long manuEquipmentId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentException {

		return getPersistence().findByPrimaryKey(manuEquipmentId);
	}

	/**
	 * Returns the manu equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment, or <code>null</code> if a manu equipment with the primary key could not be found
	 */
	public static ManuEquipment fetchByPrimaryKey(long manuEquipmentId) {
		return getPersistence().fetchByPrimaryKey(manuEquipmentId);
	}

	/**
	 * Returns all the manu equipments.
	 *
	 * @return the manu equipments
	 */
	public static List<ManuEquipment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of manu equipments
	 */
	public static List<ManuEquipment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu equipments
	 */
	public static List<ManuEquipment> findAll(
		int start, int end,
		OrderByComparator<ManuEquipment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu equipments
	 */
	public static List<ManuEquipment> findAll(
		int start, int end, OrderByComparator<ManuEquipment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu equipments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu equipments.
	 *
	 * @return the number of manu equipments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuEquipmentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ManuEquipmentPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ManuEquipmentPersistence _persistence;

}