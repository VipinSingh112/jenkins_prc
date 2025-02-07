/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insolvency current stage service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiInsolvencyCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStagePersistence
 * @generated
 */
public class OsiInsolvencyCurrentStageUtil {

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
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		getPersistence().clearCache(osiInsolvencyCurrentStage);
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
	public static Map<Serializable, OsiInsolvencyCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolvencyCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolvencyCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolvencyCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolvencyCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolvencyCurrentStage update(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return getPersistence().update(osiInsolvencyCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolvencyCurrentStage update(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsolvencyCurrentStage, serviceContext);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a matching osi insolvency current stage could not be found
	 */
	public static OsiInsolvencyCurrentStage findBygetOsiInsolvenyById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getPersistence().findBygetOsiInsolvenyById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public static OsiInsolvencyCurrentStage fetchBygetOsiInsolvenyById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiInsolvenyById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public static OsiInsolvencyCurrentStage fetchBygetOsiInsolvenyById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiInsolvenyById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency current stage where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency current stage that was removed
	 */
	public static OsiInsolvencyCurrentStage removeBygetOsiInsolvenyById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getPersistence().removeBygetOsiInsolvenyById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi insolvency current stages where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency current stages
	 */
	public static int countBygetOsiInsolvenyById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiInsolvenyById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a matching osi insolvency current stage could not be found
	 */
	public static OsiInsolvencyCurrentStage findBygetOI_Stage_OII(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getPersistence().findBygetOI_Stage_OII(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public static OsiInsolvencyCurrentStage fetchBygetOI_Stage_OII(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOI_Stage_OII(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public static OsiInsolvencyCurrentStage fetchBygetOI_Stage_OII(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOI_Stage_OII(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency current stage where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency current stage that was removed
	 */
	public static OsiInsolvencyCurrentStage removeBygetOI_Stage_OII(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getPersistence().removeBygetOI_Stage_OII(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi insolvency current stages where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency current stages
	 */
	public static int countBygetOI_Stage_OII(long osiInsolvencyId) {
		return getPersistence().countBygetOI_Stage_OII(osiInsolvencyId);
	}

	/**
	 * Caches the osi insolvency current stage in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 */
	public static void cacheResult(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		getPersistence().cacheResult(osiInsolvencyCurrentStage);
	}

	/**
	 * Caches the osi insolvency current stages in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyCurrentStages the osi insolvency current stages
	 */
	public static void cacheResult(
		List<OsiInsolvencyCurrentStage> osiInsolvencyCurrentStages) {

		getPersistence().cacheResult(osiInsolvencyCurrentStages);
	}

	/**
	 * Creates a new osi insolvency current stage with the primary key. Does not add the osi insolvency current stage to the database.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key for the new osi insolvency current stage
	 * @return the new osi insolvency current stage
	 */
	public static OsiInsolvencyCurrentStage create(
		long osiInsolvencyCurrentStageId) {

		return getPersistence().create(osiInsolvencyCurrentStageId);
	}

	/**
	 * Removes the osi insolvency current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	public static OsiInsolvencyCurrentStage remove(
			long osiInsolvencyCurrentStageId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getPersistence().remove(osiInsolvencyCurrentStageId);
	}

	public static OsiInsolvencyCurrentStage updateImpl(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return getPersistence().updateImpl(osiInsolvencyCurrentStage);
	}

	/**
	 * Returns the osi insolvency current stage with the primary key or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	public static OsiInsolvencyCurrentStage findByPrimaryKey(
			long osiInsolvencyCurrentStageId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getPersistence().findByPrimaryKey(osiInsolvencyCurrentStageId);
	}

	/**
	 * Returns the osi insolvency current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage, or <code>null</code> if a osi insolvency current stage with the primary key could not be found
	 */
	public static OsiInsolvencyCurrentStage fetchByPrimaryKey(
		long osiInsolvencyCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(osiInsolvencyCurrentStageId);
	}

	/**
	 * Returns all the osi insolvency current stages.
	 *
	 * @return the osi insolvency current stages
	 */
	public static List<OsiInsolvencyCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @return the range of osi insolvency current stages
	 */
	public static List<OsiInsolvencyCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency current stages
	 */
	public static List<OsiInsolvencyCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency current stages
	 */
	public static List<OsiInsolvencyCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insolvency current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insolvency current stages.
	 *
	 * @return the number of osi insolvency current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolvencyCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolvencyCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolvencyCurrentStagePersistence _persistence;

}