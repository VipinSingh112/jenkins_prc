/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative social media add box service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeSocialMediaAddBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBoxPersistence
 * @generated
 */
public class CreativeSocialMediaAddBoxUtil {

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
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		getPersistence().clearCache(creativeSocialMediaAddBox);
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
	public static Map<Serializable, CreativeSocialMediaAddBox>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeSocialMediaAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeSocialMediaAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeSocialMediaAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeSocialMediaAddBox update(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return getPersistence().update(creativeSocialMediaAddBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeSocialMediaAddBox update(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeSocialMediaAddBox, serviceContext);
	}

	/**
	 * Returns all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId) {

		return getPersistence().findBygetCA_CSB_CAI(CreativeApplicationId);
	}

	/**
	 * Returns a range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of matching creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end) {

		return getPersistence().findBygetCA_CSB_CAI(
			CreativeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return getPersistence().findBygetCA_CSB_CAI(
			CreativeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_CSB_CAI(
			CreativeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a matching creative social media add box could not be found
	 */
	public static CreativeSocialMediaAddBox findBygetCA_CSB_CAI_First(
			long CreativeApplicationId,
			OrderByComparator<CreativeSocialMediaAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeSocialMediaAddBoxException {

		return getPersistence().findBygetCA_CSB_CAI_First(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative social media add box, or <code>null</code> if a matching creative social media add box could not be found
	 */
	public static CreativeSocialMediaAddBox fetchBygetCA_CSB_CAI_First(
		long CreativeApplicationId,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return getPersistence().fetchBygetCA_CSB_CAI_First(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a matching creative social media add box could not be found
	 */
	public static CreativeSocialMediaAddBox findBygetCA_CSB_CAI_Last(
			long CreativeApplicationId,
			OrderByComparator<CreativeSocialMediaAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeSocialMediaAddBoxException {

		return getPersistence().findBygetCA_CSB_CAI_Last(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative social media add box, or <code>null</code> if a matching creative social media add box could not be found
	 */
	public static CreativeSocialMediaAddBox fetchBygetCA_CSB_CAI_Last(
		long CreativeApplicationId,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return getPersistence().fetchBygetCA_CSB_CAI_Last(
			CreativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the creative social media add boxes before and after the current creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeSocialBoxId the primary key of the current creative social media add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	public static CreativeSocialMediaAddBox[] findBygetCA_CSB_CAI_PrevAndNext(
			long creativeSocialBoxId, long CreativeApplicationId,
			OrderByComparator<CreativeSocialMediaAddBox> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeSocialMediaAddBoxException {

		return getPersistence().findBygetCA_CSB_CAI_PrevAndNext(
			creativeSocialBoxId, CreativeApplicationId, orderByComparator);
	}

	/**
	 * Removes all the creative social media add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	public static void removeBygetCA_CSB_CAI(long CreativeApplicationId) {
		getPersistence().removeBygetCA_CSB_CAI(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative social media add boxes
	 */
	public static int countBygetCA_CSB_CAI(long CreativeApplicationId) {
		return getPersistence().countBygetCA_CSB_CAI(CreativeApplicationId);
	}

	/**
	 * Caches the creative social media add box in the entity cache if it is enabled.
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 */
	public static void cacheResult(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		getPersistence().cacheResult(creativeSocialMediaAddBox);
	}

	/**
	 * Caches the creative social media add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeSocialMediaAddBoxes the creative social media add boxes
	 */
	public static void cacheResult(
		List<CreativeSocialMediaAddBox> creativeSocialMediaAddBoxes) {

		getPersistence().cacheResult(creativeSocialMediaAddBoxes);
	}

	/**
	 * Creates a new creative social media add box with the primary key. Does not add the creative social media add box to the database.
	 *
	 * @param creativeSocialBoxId the primary key for the new creative social media add box
	 * @return the new creative social media add box
	 */
	public static CreativeSocialMediaAddBox create(long creativeSocialBoxId) {
		return getPersistence().create(creativeSocialBoxId);
	}

	/**
	 * Removes the creative social media add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box that was removed
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	public static CreativeSocialMediaAddBox remove(long creativeSocialBoxId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeSocialMediaAddBoxException {

		return getPersistence().remove(creativeSocialBoxId);
	}

	public static CreativeSocialMediaAddBox updateImpl(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		return getPersistence().updateImpl(creativeSocialMediaAddBox);
	}

	/**
	 * Returns the creative social media add box with the primary key or throws a <code>NoSuchCreativeSocialMediaAddBoxException</code> if it could not be found.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	public static CreativeSocialMediaAddBox findByPrimaryKey(
			long creativeSocialBoxId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeSocialMediaAddBoxException {

		return getPersistence().findByPrimaryKey(creativeSocialBoxId);
	}

	/**
	 * Returns the creative social media add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box, or <code>null</code> if a creative social media add box with the primary key could not be found
	 */
	public static CreativeSocialMediaAddBox fetchByPrimaryKey(
		long creativeSocialBoxId) {

		return getPersistence().fetchByPrimaryKey(creativeSocialBoxId);
	}

	/**
	 * Returns all the creative social media add boxes.
	 *
	 * @return the creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative social media add boxes
	 */
	public static List<CreativeSocialMediaAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative social media add boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative social media add boxes.
	 *
	 * @return the number of creative social media add boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeSocialMediaAddBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeSocialMediaAddBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeSocialMediaAddBoxPersistence _persistence;

}