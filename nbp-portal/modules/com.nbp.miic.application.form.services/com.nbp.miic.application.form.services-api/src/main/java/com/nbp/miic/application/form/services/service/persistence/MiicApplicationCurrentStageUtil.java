/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic application current stage service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationCurrentStagePersistence
 * @generated
 */
public class MiicApplicationCurrentStageUtil {

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
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		getPersistence().clearCache(miicApplicationCurrentStage);
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
	public static Map<Serializable, MiicApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicApplicationCurrentStage update(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		return getPersistence().update(miicApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicApplicationCurrentStage update(
		MiicApplicationCurrentStage miicApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miicApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the miic application current stage where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application current stage
	 * @throws NoSuchMiicApplicationCurrentStageException if a matching miic application current stage could not be found
	 */
	public static MiicApplicationCurrentStage findBygetMIIC_Stage_MIIC_AI(
			long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationCurrentStageException {

		return getPersistence().findBygetMIIC_Stage_MIIC_AI(miicApplicationId);
	}

	/**
	 * Returns the miic application current stage where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application current stage, or <code>null</code> if a matching miic application current stage could not be found
	 */
	public static MiicApplicationCurrentStage fetchBygetMIIC_Stage_MIIC_AI(
		long miicApplicationId) {

		return getPersistence().fetchBygetMIIC_Stage_MIIC_AI(miicApplicationId);
	}

	/**
	 * Returns the miic application current stage where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application current stage, or <code>null</code> if a matching miic application current stage could not be found
	 */
	public static MiicApplicationCurrentStage fetchBygetMIIC_Stage_MIIC_AI(
		long miicApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMIIC_Stage_MIIC_AI(
			miicApplicationId, useFinderCache);
	}

	/**
	 * Removes the miic application current stage where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application current stage that was removed
	 */
	public static MiicApplicationCurrentStage removeBygetMIIC_Stage_MIIC_AI(
			long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationCurrentStageException {

		return getPersistence().removeBygetMIIC_Stage_MIIC_AI(
			miicApplicationId);
	}

	/**
	 * Returns the number of miic application current stages where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic application current stages
	 */
	public static int countBygetMIIC_Stage_MIIC_AI(long miicApplicationId) {
		return getPersistence().countBygetMIIC_Stage_MIIC_AI(miicApplicationId);
	}

	/**
	 * Caches the miic application current stage in the entity cache if it is enabled.
	 *
	 * @param miicApplicationCurrentStage the miic application current stage
	 */
	public static void cacheResult(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		getPersistence().cacheResult(miicApplicationCurrentStage);
	}

	/**
	 * Caches the miic application current stages in the entity cache if it is enabled.
	 *
	 * @param miicApplicationCurrentStages the miic application current stages
	 */
	public static void cacheResult(
		List<MiicApplicationCurrentStage> miicApplicationCurrentStages) {

		getPersistence().cacheResult(miicApplicationCurrentStages);
	}

	/**
	 * Creates a new miic application current stage with the primary key. Does not add the miic application current stage to the database.
	 *
	 * @param miicApplicationCurrentStageId the primary key for the new miic application current stage
	 * @return the new miic application current stage
	 */
	public static MiicApplicationCurrentStage create(
		long miicApplicationCurrentStageId) {

		return getPersistence().create(miicApplicationCurrentStageId);
	}

	/**
	 * Removes the miic application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage that was removed
	 * @throws NoSuchMiicApplicationCurrentStageException if a miic application current stage with the primary key could not be found
	 */
	public static MiicApplicationCurrentStage remove(
			long miicApplicationCurrentStageId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationCurrentStageException {

		return getPersistence().remove(miicApplicationCurrentStageId);
	}

	public static MiicApplicationCurrentStage updateImpl(
		MiicApplicationCurrentStage miicApplicationCurrentStage) {

		return getPersistence().updateImpl(miicApplicationCurrentStage);
	}

	/**
	 * Returns the miic application current stage with the primary key or throws a <code>NoSuchMiicApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage
	 * @throws NoSuchMiicApplicationCurrentStageException if a miic application current stage with the primary key could not be found
	 */
	public static MiicApplicationCurrentStage findByPrimaryKey(
			long miicApplicationCurrentStageId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(miicApplicationCurrentStageId);
	}

	/**
	 * Returns the miic application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationCurrentStageId the primary key of the miic application current stage
	 * @return the miic application current stage, or <code>null</code> if a miic application current stage with the primary key could not be found
	 */
	public static MiicApplicationCurrentStage fetchByPrimaryKey(
		long miicApplicationCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(
			miicApplicationCurrentStageId);
	}

	/**
	 * Returns all the miic application current stages.
	 *
	 * @return the miic application current stages
	 */
	public static List<MiicApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @return the range of miic application current stages
	 */
	public static List<MiicApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic application current stages
	 */
	public static List<MiicApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application current stages
	 * @param end the upper bound of the range of miic application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic application current stages
	 */
	public static List<MiicApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic application current stages.
	 *
	 * @return the number of miic application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicApplicationCurrentStagePersistence _persistence;

}