/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeDirectorListinAddBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative director listin add box service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeDirectorListinAddBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBoxPersistence
 * @generated
 */
public class CreativeDirectorListinAddBoxUtil {

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
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		getPersistence().clearCache(creativeDirectorListinAddBox);
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
	public static Map<Serializable, CreativeDirectorListinAddBox>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeDirectorListinAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeDirectorListinAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeDirectorListinAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeDirectorListinAddBox update(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		return getPersistence().update(creativeDirectorListinAddBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeDirectorListinAddBox update(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeDirectorListinAddBox, serviceContext);
	}

	/**
	 * Returns all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId) {

		return getPersistence().findBygetCA_DLB_CAI(CreativeApplicationId);
	}

	/**
	 * Returns a range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of matching creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end) {

		return getPersistence().findBygetCA_DLB_CAI(
			CreativeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return getPersistence().findBygetCA_DLB_CAI(
			CreativeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_DLB_CAI(
			CreativeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a matching creative director listin add box could not be found
	 */
	public static CreativeDirectorListinAddBox findBygetCA_DLB_CAI_First(
			long CreativeApplicationId,
			OrderByComparator<CreativeDirectorListinAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeDirectorListinAddBoxException {

		return getPersistence().findBygetCA_DLB_CAI_First(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative director listin add box, or <code>null</code> if a matching creative director listin add box could not be found
	 */
	public static CreativeDirectorListinAddBox fetchBygetCA_DLB_CAI_First(
		long CreativeApplicationId,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return getPersistence().fetchBygetCA_DLB_CAI_First(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a matching creative director listin add box could not be found
	 */
	public static CreativeDirectorListinAddBox findBygetCA_DLB_CAI_Last(
			long CreativeApplicationId,
			OrderByComparator<CreativeDirectorListinAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeDirectorListinAddBoxException {

		return getPersistence().findBygetCA_DLB_CAI_Last(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative director listin add box, or <code>null</code> if a matching creative director listin add box could not be found
	 */
	public static CreativeDirectorListinAddBox fetchBygetCA_DLB_CAI_Last(
		long CreativeApplicationId,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return getPersistence().fetchBygetCA_DLB_CAI_Last(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the creative director listin add boxes before and after the current creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeDirectorBoxId the primary key of the current creative director listin add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	public static CreativeDirectorListinAddBox[]
			findBygetCA_DLB_CAI_PrevAndNext(
				long creativeDirectorBoxId, long CreativeApplicationId,
				OrderByComparator<CreativeDirectorListinAddBox>
					orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeDirectorListinAddBoxException {

		return getPersistence().findBygetCA_DLB_CAI_PrevAndNext(
			creativeDirectorBoxId, CreativeApplicationId, orderByComparator);
	}

	/**
	 * Removes all the creative director listin add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	public static void removeBygetCA_DLB_CAI(long CreativeApplicationId) {
		getPersistence().removeBygetCA_DLB_CAI(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative director listin add boxes
	 */
	public static int countBygetCA_DLB_CAI(long CreativeApplicationId) {
		return getPersistence().countBygetCA_DLB_CAI(CreativeApplicationId);
	}

	/**
	 * Caches the creative director listin add box in the entity cache if it is enabled.
	 *
	 * @param creativeDirectorListinAddBox the creative director listin add box
	 */
	public static void cacheResult(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		getPersistence().cacheResult(creativeDirectorListinAddBox);
	}

	/**
	 * Caches the creative director listin add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeDirectorListinAddBoxes the creative director listin add boxes
	 */
	public static void cacheResult(
		List<CreativeDirectorListinAddBox> creativeDirectorListinAddBoxes) {

		getPersistence().cacheResult(creativeDirectorListinAddBoxes);
	}

	/**
	 * Creates a new creative director listin add box with the primary key. Does not add the creative director listin add box to the database.
	 *
	 * @param creativeDirectorBoxId the primary key for the new creative director listin add box
	 * @return the new creative director listin add box
	 */
	public static CreativeDirectorListinAddBox create(
		long creativeDirectorBoxId) {

		return getPersistence().create(creativeDirectorBoxId);
	}

	/**
	 * Removes the creative director listin add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box that was removed
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	public static CreativeDirectorListinAddBox remove(
			long creativeDirectorBoxId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeDirectorListinAddBoxException {

		return getPersistence().remove(creativeDirectorBoxId);
	}

	public static CreativeDirectorListinAddBox updateImpl(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		return getPersistence().updateImpl(creativeDirectorListinAddBox);
	}

	/**
	 * Returns the creative director listin add box with the primary key or throws a <code>NoSuchCreativeDirectorListinAddBoxException</code> if it could not be found.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	public static CreativeDirectorListinAddBox findByPrimaryKey(
			long creativeDirectorBoxId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeDirectorListinAddBoxException {

		return getPersistence().findByPrimaryKey(creativeDirectorBoxId);
	}

	/**
	 * Returns the creative director listin add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box, or <code>null</code> if a creative director listin add box with the primary key could not be found
	 */
	public static CreativeDirectorListinAddBox fetchByPrimaryKey(
		long creativeDirectorBoxId) {

		return getPersistence().fetchByPrimaryKey(creativeDirectorBoxId);
	}

	/**
	 * Returns all the creative director listin add boxes.
	 *
	 * @return the creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative director listin add boxes
	 */
	public static List<CreativeDirectorListinAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative director listin add boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative director listin add boxes.
	 *
	 * @return the number of creative director listin add boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeDirectorListinAddBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeDirectorListinAddBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeDirectorListinAddBoxPersistence
		_persistence;

}