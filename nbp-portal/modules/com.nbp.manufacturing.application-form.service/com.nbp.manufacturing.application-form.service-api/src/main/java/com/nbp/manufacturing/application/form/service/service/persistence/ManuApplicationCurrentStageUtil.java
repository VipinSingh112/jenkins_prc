/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu application current stage service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuApplicationCurrentStagePersistence
 * @generated
 */
public class ManuApplicationCurrentStageUtil {

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
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		getPersistence().clearCache(manuApplicationCurrentStage);
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
	public static Map<Serializable, ManuApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuApplicationCurrentStage update(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return getPersistence().update(manuApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuApplicationCurrentStage update(
		ManuApplicationCurrentStage manuApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manuApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu application current stage where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu application current stage that was removed
	 */
	public static ManuApplicationCurrentStage removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu application current stages
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_CS_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of matching manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_CS_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return getPersistence().findBygetMA_CS_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_CS_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage findBygetMA_CS_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuApplicationCurrentStage> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().findBygetMA_CS_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage fetchBygetMA_CS_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetMA_CS_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage findBygetMA_CS_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuApplicationCurrentStage> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().findBygetMA_CS_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public static ManuApplicationCurrentStage fetchBygetMA_CS_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetMA_CS_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu application current stages before and after the current manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the current manu application current stage
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	public static ManuApplicationCurrentStage[] findBygetMA_CS_MAI_PrevAndNext(
			long manuApplicationCuurentStageId, long manufacturingApplicationId,
			OrderByComparator<ManuApplicationCurrentStage> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().findBygetMA_CS_MAI_PrevAndNext(
			manuApplicationCuurentStageId, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the manu application current stages where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_CS_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_CS_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu application current stages
	 */
	public static int countBygetMA_CS_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_CS_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the manu application current stage in the entity cache if it is enabled.
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 */
	public static void cacheResult(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		getPersistence().cacheResult(manuApplicationCurrentStage);
	}

	/**
	 * Caches the manu application current stages in the entity cache if it is enabled.
	 *
	 * @param manuApplicationCurrentStages the manu application current stages
	 */
	public static void cacheResult(
		List<ManuApplicationCurrentStage> manuApplicationCurrentStages) {

		getPersistence().cacheResult(manuApplicationCurrentStages);
	}

	/**
	 * Creates a new manu application current stage with the primary key. Does not add the manu application current stage to the database.
	 *
	 * @param manuApplicationCuurentStageId the primary key for the new manu application current stage
	 * @return the new manu application current stage
	 */
	public static ManuApplicationCurrentStage create(
		long manuApplicationCuurentStageId) {

		return getPersistence().create(manuApplicationCuurentStageId);
	}

	/**
	 * Removes the manu application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage that was removed
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	public static ManuApplicationCurrentStage remove(
			long manuApplicationCuurentStageId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().remove(manuApplicationCuurentStageId);
	}

	public static ManuApplicationCurrentStage updateImpl(
		ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return getPersistence().updateImpl(manuApplicationCurrentStage);
	}

	/**
	 * Returns the manu application current stage with the primary key or throws a <code>NoSuchManuApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	public static ManuApplicationCurrentStage findByPrimaryKey(
			long manuApplicationCuurentStageId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(manuApplicationCuurentStageId);
	}

	/**
	 * Returns the manu application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage, or <code>null</code> if a manu application current stage with the primary key could not be found
	 */
	public static ManuApplicationCurrentStage fetchByPrimaryKey(
		long manuApplicationCuurentStageId) {

		return getPersistence().fetchByPrimaryKey(
			manuApplicationCuurentStageId);
	}

	/**
	 * Returns all the manu application current stages.
	 *
	 * @return the manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu application current stages
	 */
	public static List<ManuApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ManuApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu application current stages.
	 *
	 * @return the number of manu application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManuApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManuApplicationCurrentStagePersistence _persistence;

}