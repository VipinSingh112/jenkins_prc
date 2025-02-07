/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JTBCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb current stage service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JTBCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStagePersistence
 * @generated
 */
public class JTBCurrentStageUtil {

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
	public static void clearCache(JTBCurrentStage jtbCurrentStage) {
		getPersistence().clearCache(jtbCurrentStage);
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
	public static Map<Serializable, JTBCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JTBCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JTBCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JTBCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JTBCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JTBCurrentStage update(JTBCurrentStage jtbCurrentStage) {
		return getPersistence().update(jtbCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JTBCurrentStage update(
		JTBCurrentStage jtbCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(jtbCurrentStage, serviceContext);
	}

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or throws a <code>NoSuchJTBCurrentStageException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a matching jtb current stage could not be found
	 */
	public static JTBCurrentStage findBygetByJTB_Stage(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBCurrentStageException {

		return getPersistence().findBygetByJTB_Stage(jtbApplicationId);
	}

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb current stage, or <code>null</code> if a matching jtb current stage could not be found
	 */
	public static JTBCurrentStage fetchBygetByJTB_Stage(long jtbApplicationId) {
		return getPersistence().fetchBygetByJTB_Stage(jtbApplicationId);
	}

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb current stage, or <code>null</code> if a matching jtb current stage could not be found
	 */
	public static JTBCurrentStage fetchBygetByJTB_Stage(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByJTB_Stage(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the jtb current stage where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb current stage that was removed
	 */
	public static JTBCurrentStage removeBygetByJTB_Stage(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBCurrentStageException {

		return getPersistence().removeBygetByJTB_Stage(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb current stages where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb current stages
	 */
	public static int countBygetByJTB_Stage(long jtbApplicationId) {
		return getPersistence().countBygetByJTB_Stage(jtbApplicationId);
	}

	/**
	 * Caches the jtb current stage in the entity cache if it is enabled.
	 *
	 * @param jtbCurrentStage the jtb current stage
	 */
	public static void cacheResult(JTBCurrentStage jtbCurrentStage) {
		getPersistence().cacheResult(jtbCurrentStage);
	}

	/**
	 * Caches the jtb current stages in the entity cache if it is enabled.
	 *
	 * @param jtbCurrentStages the jtb current stages
	 */
	public static void cacheResult(List<JTBCurrentStage> jtbCurrentStages) {
		getPersistence().cacheResult(jtbCurrentStages);
	}

	/**
	 * Creates a new jtb current stage with the primary key. Does not add the jtb current stage to the database.
	 *
	 * @param jTBCurrentStageId the primary key for the new jtb current stage
	 * @return the new jtb current stage
	 */
	public static JTBCurrentStage create(long jTBCurrentStageId) {
		return getPersistence().create(jTBCurrentStageId);
	}

	/**
	 * Removes the jtb current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage that was removed
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	public static JTBCurrentStage remove(long jTBCurrentStageId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBCurrentStageException {

		return getPersistence().remove(jTBCurrentStageId);
	}

	public static JTBCurrentStage updateImpl(JTBCurrentStage jtbCurrentStage) {
		return getPersistence().updateImpl(jtbCurrentStage);
	}

	/**
	 * Returns the jtb current stage with the primary key or throws a <code>NoSuchJTBCurrentStageException</code> if it could not be found.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	public static JTBCurrentStage findByPrimaryKey(long jTBCurrentStageId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBCurrentStageException {

		return getPersistence().findByPrimaryKey(jTBCurrentStageId);
	}

	/**
	 * Returns the jtb current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage, or <code>null</code> if a jtb current stage with the primary key could not be found
	 */
	public static JTBCurrentStage fetchByPrimaryKey(long jTBCurrentStageId) {
		return getPersistence().fetchByPrimaryKey(jTBCurrentStageId);
	}

	/**
	 * Returns all the jtb current stages.
	 *
	 * @return the jtb current stages
	 */
	public static List<JTBCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @return the range of jtb current stages
	 */
	public static List<JTBCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb current stages
	 */
	public static List<JTBCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JTBCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb current stages
	 */
	public static List<JTBCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JTBCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb current stages.
	 *
	 * @return the number of jtb current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JTBCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JTBCurrentStagePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JTBCurrentStagePersistence _persistence;

}