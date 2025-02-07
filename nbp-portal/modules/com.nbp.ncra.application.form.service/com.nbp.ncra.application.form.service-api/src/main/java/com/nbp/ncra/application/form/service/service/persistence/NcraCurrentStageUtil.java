/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra current stage service. This utility wraps <code>com.nbp.ncra.application.form.service.service.persistence.impl.NcraCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStagePersistence
 * @generated
 */
public class NcraCurrentStageUtil {

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
	public static void clearCache(NcraCurrentStage ncraCurrentStage) {
		getPersistence().clearCache(ncraCurrentStage);
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
	public static Map<Serializable, NcraCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraCurrentStage update(NcraCurrentStage ncraCurrentStage) {
		return getPersistence().update(ncraCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraCurrentStage update(
		NcraCurrentStage ncraCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(ncraCurrentStage, serviceContext);
	}

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or throws a <code>NoSuchNcraCurrentStageException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage findBygetNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().findBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage fetchBygetNcraCurrent_By_NCRA_Id(
		long ncraApplicationId) {

		return getPersistence().fetchBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage fetchBygetNcraCurrent_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncra current stage where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra current stage that was removed
	 */
	public static NcraCurrentStage removeBygetNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().removeBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the number of ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra current stages
	 */
	public static int countBygetNcraCurrent_By_NCRA_Id(long ncraApplicationId) {
		return getPersistence().countBygetNcraCurrent_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stages
	 */
	public static List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId) {

		return getPersistence().findBygetNCRA_CS_NAI(ncraApplicationId);
	}

	/**
	 * Returns a range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of matching ncra current stages
	 */
	public static List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end) {

		return getPersistence().findBygetNCRA_CS_NAI(
			ncraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra current stages
	 */
	public static List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return getPersistence().findBygetNCRA_CS_NAI(
			ncraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra current stages
	 */
	public static List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCRA_CS_NAI(
			ncraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage findBygetNCRA_CS_NAI_First(
			long ncraApplicationId,
			OrderByComparator<NcraCurrentStage> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().findBygetNCRA_CS_NAI_First(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage fetchBygetNCRA_CS_NAI_First(
		long ncraApplicationId,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetNCRA_CS_NAI_First(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage findBygetNCRA_CS_NAI_Last(
			long ncraApplicationId,
			OrderByComparator<NcraCurrentStage> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().findBygetNCRA_CS_NAI_Last(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public static NcraCurrentStage fetchBygetNCRA_CS_NAI_Last(
		long ncraApplicationId,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetNCRA_CS_NAI_Last(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncra current stages before and after the current ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraCurrentStageId the primary key of the current ncra current stage
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	public static NcraCurrentStage[] findBygetNCRA_CS_NAI_PrevAndNext(
			long ncraCurrentStageId, long ncraApplicationId,
			OrderByComparator<NcraCurrentStage> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().findBygetNCRA_CS_NAI_PrevAndNext(
			ncraCurrentStageId, ncraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncra current stages where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	public static void removeBygetNCRA_CS_NAI(long ncraApplicationId) {
		getPersistence().removeBygetNCRA_CS_NAI(ncraApplicationId);
	}

	/**
	 * Returns the number of ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra current stages
	 */
	public static int countBygetNCRA_CS_NAI(long ncraApplicationId) {
		return getPersistence().countBygetNCRA_CS_NAI(ncraApplicationId);
	}

	/**
	 * Caches the ncra current stage in the entity cache if it is enabled.
	 *
	 * @param ncraCurrentStage the ncra current stage
	 */
	public static void cacheResult(NcraCurrentStage ncraCurrentStage) {
		getPersistence().cacheResult(ncraCurrentStage);
	}

	/**
	 * Caches the ncra current stages in the entity cache if it is enabled.
	 *
	 * @param ncraCurrentStages the ncra current stages
	 */
	public static void cacheResult(List<NcraCurrentStage> ncraCurrentStages) {
		getPersistence().cacheResult(ncraCurrentStages);
	}

	/**
	 * Creates a new ncra current stage with the primary key. Does not add the ncra current stage to the database.
	 *
	 * @param ncraCurrentStageId the primary key for the new ncra current stage
	 * @return the new ncra current stage
	 */
	public static NcraCurrentStage create(long ncraCurrentStageId) {
		return getPersistence().create(ncraCurrentStageId);
	}

	/**
	 * Removes the ncra current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage that was removed
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	public static NcraCurrentStage remove(long ncraCurrentStageId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().remove(ncraCurrentStageId);
	}

	public static NcraCurrentStage updateImpl(
		NcraCurrentStage ncraCurrentStage) {

		return getPersistence().updateImpl(ncraCurrentStage);
	}

	/**
	 * Returns the ncra current stage with the primary key or throws a <code>NoSuchNcraCurrentStageException</code> if it could not be found.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	public static NcraCurrentStage findByPrimaryKey(long ncraCurrentStageId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getPersistence().findByPrimaryKey(ncraCurrentStageId);
	}

	/**
	 * Returns the ncra current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage, or <code>null</code> if a ncra current stage with the primary key could not be found
	 */
	public static NcraCurrentStage fetchByPrimaryKey(long ncraCurrentStageId) {
		return getPersistence().fetchByPrimaryKey(ncraCurrentStageId);
	}

	/**
	 * Returns all the ncra current stages.
	 *
	 * @return the ncra current stages
	 */
	public static List<NcraCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of ncra current stages
	 */
	public static List<NcraCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra current stages
	 */
	public static List<NcraCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra current stages
	 */
	public static List<NcraCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcraCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra current stages.
	 *
	 * @return the number of ncra current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcraCurrentStagePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcraCurrentStagePersistence _persistence;

}