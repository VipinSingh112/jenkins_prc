/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative contact info add box service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeContactInfoAddBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBoxPersistence
 * @generated
 */
public class CreativeContactInfoAddBoxUtil {

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
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		getPersistence().clearCache(creativeContactInfoAddBox);
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
	public static Map<Serializable, CreativeContactInfoAddBox>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeContactInfoAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeContactInfoAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeContactInfoAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeContactInfoAddBox update(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return getPersistence().update(creativeContactInfoAddBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeContactInfoAddBox update(
		CreativeContactInfoAddBox creativeContactInfoAddBox,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeContactInfoAddBox, serviceContext);
	}

	/**
	 * Returns all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId) {

		return getPersistence().findBygetCA_CCB_CAI(CreativeApplicationId);
	}

	/**
	 * Returns a range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of matching creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end) {

		return getPersistence().findBygetCA_CCB_CAI(
			CreativeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return getPersistence().findBygetCA_CCB_CAI(
			CreativeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_CCB_CAI(
			CreativeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a matching creative contact info add box could not be found
	 */
	public static CreativeContactInfoAddBox findBygetCA_CCB_CAI_First(
			long CreativeApplicationId,
			OrderByComparator<CreativeContactInfoAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeContactInfoAddBoxException {

		return getPersistence().findBygetCA_CCB_CAI_First(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative contact info add box, or <code>null</code> if a matching creative contact info add box could not be found
	 */
	public static CreativeContactInfoAddBox fetchBygetCA_CCB_CAI_First(
		long CreativeApplicationId,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return getPersistence().fetchBygetCA_CCB_CAI_First(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a matching creative contact info add box could not be found
	 */
	public static CreativeContactInfoAddBox findBygetCA_CCB_CAI_Last(
			long CreativeApplicationId,
			OrderByComparator<CreativeContactInfoAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeContactInfoAddBoxException {

		return getPersistence().findBygetCA_CCB_CAI_Last(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative contact info add box, or <code>null</code> if a matching creative contact info add box could not be found
	 */
	public static CreativeContactInfoAddBox fetchBygetCA_CCB_CAI_Last(
		long CreativeApplicationId,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return getPersistence().fetchBygetCA_CCB_CAI_Last(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the creative contact info add boxes before and after the current creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeContactBoxId the primary key of the current creative contact info add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	public static CreativeContactInfoAddBox[] findBygetCA_CCB_CAI_PrevAndNext(
			long creativeContactBoxId, long CreativeApplicationId,
			OrderByComparator<CreativeContactInfoAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeContactInfoAddBoxException {

		return getPersistence().findBygetCA_CCB_CAI_PrevAndNext(
			creativeContactBoxId, CreativeApplicationId, orderByComparator);
	}

	/**
	 * Removes all the creative contact info add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	public static void removeBygetCA_CCB_CAI(long CreativeApplicationId) {
		getPersistence().removeBygetCA_CCB_CAI(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative contact info add boxes
	 */
	public static int countBygetCA_CCB_CAI(long CreativeApplicationId) {
		return getPersistence().countBygetCA_CCB_CAI(CreativeApplicationId);
	}

	/**
	 * Caches the creative contact info add box in the entity cache if it is enabled.
	 *
	 * @param creativeContactInfoAddBox the creative contact info add box
	 */
	public static void cacheResult(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		getPersistence().cacheResult(creativeContactInfoAddBox);
	}

	/**
	 * Caches the creative contact info add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeContactInfoAddBoxes the creative contact info add boxes
	 */
	public static void cacheResult(
		List<CreativeContactInfoAddBox> creativeContactInfoAddBoxes) {

		getPersistence().cacheResult(creativeContactInfoAddBoxes);
	}

	/**
	 * Creates a new creative contact info add box with the primary key. Does not add the creative contact info add box to the database.
	 *
	 * @param creativeContactBoxId the primary key for the new creative contact info add box
	 * @return the new creative contact info add box
	 */
	public static CreativeContactInfoAddBox create(long creativeContactBoxId) {
		return getPersistence().create(creativeContactBoxId);
	}

	/**
	 * Removes the creative contact info add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box that was removed
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	public static CreativeContactInfoAddBox remove(long creativeContactBoxId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeContactInfoAddBoxException {

		return getPersistence().remove(creativeContactBoxId);
	}

	public static CreativeContactInfoAddBox updateImpl(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		return getPersistence().updateImpl(creativeContactInfoAddBox);
	}

	/**
	 * Returns the creative contact info add box with the primary key or throws a <code>NoSuchCreativeContactInfoAddBoxException</code> if it could not be found.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	public static CreativeContactInfoAddBox findByPrimaryKey(
			long creativeContactBoxId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeContactInfoAddBoxException {

		return getPersistence().findByPrimaryKey(creativeContactBoxId);
	}

	/**
	 * Returns the creative contact info add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box, or <code>null</code> if a creative contact info add box with the primary key could not be found
	 */
	public static CreativeContactInfoAddBox fetchByPrimaryKey(
		long creativeContactBoxId) {

		return getPersistence().fetchByPrimaryKey(creativeContactBoxId);
	}

	/**
	 * Returns all the creative contact info add boxes.
	 *
	 * @return the creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative contact info add boxes
	 */
	public static List<CreativeContactInfoAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative contact info add boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative contact info add boxes.
	 *
	 * @return the number of creative contact info add boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeContactInfoAddBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeContactInfoAddBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeContactInfoAddBoxPersistence _persistence;

}