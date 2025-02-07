/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu equipment add service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuEquipmentAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAddPersistence
 * @generated
 */
public class ManuEquipmentAddUtil {

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
	public static void clearCache(ManuEquipmentAdd manuEquipmentAdd) {
		getPersistence().clearCache(manuEquipmentAdd);
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
	public static Map<Serializable, ManuEquipmentAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuEquipmentAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuEquipmentAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuEquipmentAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuEquipmentAdd update(ManuEquipmentAdd manuEquipmentAdd) {
		return getPersistence().update(manuEquipmentAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuEquipmentAdd update(
		ManuEquipmentAdd manuEquipmentAdd, ServiceContext serviceContext) {

		return getPersistence().update(manuEquipmentAdd, serviceContext);
	}

	/**
	 * Returns all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_EAF(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_EAF(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().findBygetMA_EAF(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_EAF(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd findBygetMA_EAF_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findBygetMA_EAF_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd fetchBygetMA_EAF_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_EAF_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd findBygetMA_EAF_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findBygetMA_EAF_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd fetchBygetMA_EAF_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_EAF_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu equipment adds before and after the current manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuEquipmentAddId the primary key of the current manu equipment add
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public static ManuEquipmentAdd[] findBygetMA_EAF_PrevAndNext(
			long manuEquipmentAddId, long manufacturingApplicationId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findBygetMA_EAF_PrevAndNext(
			manuEquipmentAddId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the manu equipment adds where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_EAF(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_EAF(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipment adds
	 */
	public static int countBygetMA_EAF(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_EAF(manufacturingApplicationId);
	}

	/**
	 * Returns all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @return the matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAI(long manuEquipmentId) {
		return getPersistence().findBygetMA_EAI(manuEquipmentId);
	}

	/**
	 * Returns a range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end) {

		return getPersistence().findBygetMA_EAI(manuEquipmentId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().findBygetMA_EAI(
			manuEquipmentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_EAI(
			manuEquipmentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd findBygetMA_EAI_First(
			long manuEquipmentId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findBygetMA_EAI_First(
			manuEquipmentId, orderByComparator);
	}

	/**
	 * Returns the first manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd fetchBygetMA_EAI_First(
		long manuEquipmentId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_EAI_First(
			manuEquipmentId, orderByComparator);
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd findBygetMA_EAI_Last(
			long manuEquipmentId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findBygetMA_EAI_Last(
			manuEquipmentId, orderByComparator);
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	public static ManuEquipmentAdd fetchBygetMA_EAI_Last(
		long manuEquipmentId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_EAI_Last(
			manuEquipmentId, orderByComparator);
	}

	/**
	 * Returns the manu equipment adds before and after the current manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentAddId the primary key of the current manu equipment add
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public static ManuEquipmentAdd[] findBygetMA_EAI_PrevAndNext(
			long manuEquipmentAddId, long manuEquipmentId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findBygetMA_EAI_PrevAndNext(
			manuEquipmentAddId, manuEquipmentId, orderByComparator);
	}

	/**
	 * Removes all the manu equipment adds where manuEquipmentId = &#63; from the database.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 */
	public static void removeBygetMA_EAI(long manuEquipmentId) {
		getPersistence().removeBygetMA_EAI(manuEquipmentId);
	}

	/**
	 * Returns the number of manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @return the number of matching manu equipment adds
	 */
	public static int countBygetMA_EAI(long manuEquipmentId) {
		return getPersistence().countBygetMA_EAI(manuEquipmentId);
	}

	/**
	 * Caches the manu equipment add in the entity cache if it is enabled.
	 *
	 * @param manuEquipmentAdd the manu equipment add
	 */
	public static void cacheResult(ManuEquipmentAdd manuEquipmentAdd) {
		getPersistence().cacheResult(manuEquipmentAdd);
	}

	/**
	 * Caches the manu equipment adds in the entity cache if it is enabled.
	 *
	 * @param manuEquipmentAdds the manu equipment adds
	 */
	public static void cacheResult(List<ManuEquipmentAdd> manuEquipmentAdds) {
		getPersistence().cacheResult(manuEquipmentAdds);
	}

	/**
	 * Creates a new manu equipment add with the primary key. Does not add the manu equipment add to the database.
	 *
	 * @param manuEquipmentAddId the primary key for the new manu equipment add
	 * @return the new manu equipment add
	 */
	public static ManuEquipmentAdd create(long manuEquipmentAddId) {
		return getPersistence().create(manuEquipmentAddId);
	}

	/**
	 * Removes the manu equipment add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add that was removed
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public static ManuEquipmentAdd remove(long manuEquipmentAddId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().remove(manuEquipmentAddId);
	}

	public static ManuEquipmentAdd updateImpl(
		ManuEquipmentAdd manuEquipmentAdd) {

		return getPersistence().updateImpl(manuEquipmentAdd);
	}

	/**
	 * Returns the manu equipment add with the primary key or throws a <code>NoSuchManuEquipmentAddException</code> if it could not be found.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	public static ManuEquipmentAdd findByPrimaryKey(long manuEquipmentAddId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuEquipmentAddException {

		return getPersistence().findByPrimaryKey(manuEquipmentAddId);
	}

	/**
	 * Returns the manu equipment add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add, or <code>null</code> if a manu equipment add with the primary key could not be found
	 */
	public static ManuEquipmentAdd fetchByPrimaryKey(long manuEquipmentAddId) {
		return getPersistence().fetchByPrimaryKey(manuEquipmentAddId);
	}

	/**
	 * Returns all the manu equipment adds.
	 *
	 * @return the manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findAll(
		int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu equipment adds
	 */
	public static List<ManuEquipmentAdd> findAll(
		int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu equipment adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu equipment adds.
	 *
	 * @return the number of manu equipment adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuEquipmentAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ManuEquipmentAddPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ManuEquipmentAddPersistence _persistence;

}