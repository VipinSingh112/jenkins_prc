/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant location add box service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantLocationAddBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBoxPersistence
 * @generated
 */
public class SezOccupantLocationAddBoxUtil {

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
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		getPersistence().clearCache(sezOccupantLocationAddBox);
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
	public static Map<Serializable, SezOccupantLocationAddBox>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantLocationAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantLocationAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantLocationAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantLocationAddBox update(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		return getPersistence().update(sezOccupantLocationAddBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantLocationAddBox update(
		SezOccupantLocationAddBox sezOccupantLocationAddBox,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantLocationAddBox, serviceContext);
	}

	/**
	 * Returns all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of matching sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a matching sez occupant location add box could not be found
	 */
	public static SezOccupantLocationAddBox findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantLocationAddBox> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantLocationAddBoxException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant location add box, or <code>null</code> if a matching sez occupant location add box could not be found
	 */
	public static SezOccupantLocationAddBox fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a matching sez occupant location add box could not be found
	 */
	public static SezOccupantLocationAddBox findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantLocationAddBox> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantLocationAddBoxException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant location add box, or <code>null</code> if a matching sez occupant location add box could not be found
	 */
	public static SezOccupantLocationAddBox fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occupant location add boxes before and after the current sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccLocationId the primary key of the current sez occupant location add box
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	public static SezOccupantLocationAddBox[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezOccLocationId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantLocationAddBox> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantLocationAddBoxException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezOccLocationId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occupant location add boxes where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant location add boxes
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant location add box in the entity cache if it is enabled.
	 *
	 * @param sezOccupantLocationAddBox the sez occupant location add box
	 */
	public static void cacheResult(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		getPersistence().cacheResult(sezOccupantLocationAddBox);
	}

	/**
	 * Caches the sez occupant location add boxes in the entity cache if it is enabled.
	 *
	 * @param sezOccupantLocationAddBoxes the sez occupant location add boxes
	 */
	public static void cacheResult(
		List<SezOccupantLocationAddBox> sezOccupantLocationAddBoxes) {

		getPersistence().cacheResult(sezOccupantLocationAddBoxes);
	}

	/**
	 * Creates a new sez occupant location add box with the primary key. Does not add the sez occupant location add box to the database.
	 *
	 * @param sezOccLocationId the primary key for the new sez occupant location add box
	 * @return the new sez occupant location add box
	 */
	public static SezOccupantLocationAddBox create(long sezOccLocationId) {
		return getPersistence().create(sezOccLocationId);
	}

	/**
	 * Removes the sez occupant location add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box that was removed
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	public static SezOccupantLocationAddBox remove(long sezOccLocationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantLocationAddBoxException {

		return getPersistence().remove(sezOccLocationId);
	}

	public static SezOccupantLocationAddBox updateImpl(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		return getPersistence().updateImpl(sezOccupantLocationAddBox);
	}

	/**
	 * Returns the sez occupant location add box with the primary key or throws a <code>NoSuchSezOccupantLocationAddBoxException</code> if it could not be found.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	public static SezOccupantLocationAddBox findByPrimaryKey(
			long sezOccLocationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantLocationAddBoxException {

		return getPersistence().findByPrimaryKey(sezOccLocationId);
	}

	/**
	 * Returns the sez occupant location add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box, or <code>null</code> if a sez occupant location add box with the primary key could not be found
	 */
	public static SezOccupantLocationAddBox fetchByPrimaryKey(
		long sezOccLocationId) {

		return getPersistence().fetchByPrimaryKey(sezOccLocationId);
	}

	/**
	 * Returns all the sez occupant location add boxes.
	 *
	 * @return the sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findAll(
		int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant location add boxes
	 */
	public static List<SezOccupantLocationAddBox> findAll(
		int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant location add boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant location add boxes.
	 *
	 * @return the number of sez occupant location add boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantLocationAddBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantLocationAddBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantLocationAddBoxPersistence _persistence;

}