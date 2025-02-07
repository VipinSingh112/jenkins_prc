/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi service current stage service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OSIServiceCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStagePersistence
 * @generated
 */
public class OSIServiceCurrentStageUtil {

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
		OSIServiceCurrentStage osiServiceCurrentStage) {

		getPersistence().clearCache(osiServiceCurrentStage);
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
	public static Map<Serializable, OSIServiceCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OSIServiceCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OSIServiceCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OSIServiceCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OSIServiceCurrentStage update(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		return getPersistence().update(osiServiceCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OSIServiceCurrentStage update(
		OSIServiceCurrentStage osiServiceCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(osiServiceCurrentStage, serviceContext);
	}

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceCurrentStageException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().findBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage fetchBygetOSIService_ById(
		long osiServicesApplicationId) {

		return getPersistence().fetchBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIService_ById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi service current stage where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service current stage that was removed
	 */
	public static OSIServiceCurrentStage removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().removeBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service current stages
	 */
	public static int countBygetOSIService_ById(long osiServicesApplicationId) {
		return getPersistence().countBygetOSIService_ById(
			osiServicesApplicationId);
	}

	/**
	 * Returns all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId) {

		return getPersistence().findBygetOSI_CS_OSIAI(osiServicesApplicationId);
	}

	/**
	 * Returns a range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of matching osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end) {

		return getPersistence().findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return getPersistence().findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage findBygetOSI_CS_OSIAI_First(
			long osiServicesApplicationId,
			OrderByComparator<OSIServiceCurrentStage> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().findBygetOSI_CS_OSIAI_First(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the first osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage fetchBygetOSI_CS_OSIAI_First(
		long osiServicesApplicationId,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetOSI_CS_OSIAI_First(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage findBygetOSI_CS_OSIAI_Last(
			long osiServicesApplicationId,
			OrderByComparator<OSIServiceCurrentStage> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().findBygetOSI_CS_OSIAI_Last(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public static OSIServiceCurrentStage fetchBygetOSI_CS_OSIAI_Last(
		long osiServicesApplicationId,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetOSI_CS_OSIAI_Last(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the osi service current stages before and after the current osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiCurrentStageId the primary key of the current osi service current stage
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	public static OSIServiceCurrentStage[] findBygetOSI_CS_OSIAI_PrevAndNext(
			long osiCurrentStageId, long osiServicesApplicationId,
			OrderByComparator<OSIServiceCurrentStage> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().findBygetOSI_CS_OSIAI_PrevAndNext(
			osiCurrentStageId, osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Removes all the osi service current stages where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 */
	public static void removeBygetOSI_CS_OSIAI(long osiServicesApplicationId) {
		getPersistence().removeBygetOSI_CS_OSIAI(osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service current stages
	 */
	public static int countBygetOSI_CS_OSIAI(long osiServicesApplicationId) {
		return getPersistence().countBygetOSI_CS_OSIAI(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi service current stage in the entity cache if it is enabled.
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 */
	public static void cacheResult(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		getPersistence().cacheResult(osiServiceCurrentStage);
	}

	/**
	 * Caches the osi service current stages in the entity cache if it is enabled.
	 *
	 * @param osiServiceCurrentStages the osi service current stages
	 */
	public static void cacheResult(
		List<OSIServiceCurrentStage> osiServiceCurrentStages) {

		getPersistence().cacheResult(osiServiceCurrentStages);
	}

	/**
	 * Creates a new osi service current stage with the primary key. Does not add the osi service current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi service current stage
	 * @return the new osi service current stage
	 */
	public static OSIServiceCurrentStage create(long osiCurrentStageId) {
		return getPersistence().create(osiCurrentStageId);
	}

	/**
	 * Removes the osi service current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage that was removed
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	public static OSIServiceCurrentStage remove(long osiCurrentStageId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().remove(osiCurrentStageId);
	}

	public static OSIServiceCurrentStage updateImpl(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		return getPersistence().updateImpl(osiServiceCurrentStage);
	}

	/**
	 * Returns the osi service current stage with the primary key or throws a <code>NoSuchOSIServiceCurrentStageException</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	public static OSIServiceCurrentStage findByPrimaryKey(
			long osiCurrentStageId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceCurrentStageException {

		return getPersistence().findByPrimaryKey(osiCurrentStageId);
	}

	/**
	 * Returns the osi service current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage, or <code>null</code> if a osi service current stage with the primary key could not be found
	 */
	public static OSIServiceCurrentStage fetchByPrimaryKey(
		long osiCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(osiCurrentStageId);
	}

	/**
	 * Returns all the osi service current stages.
	 *
	 * @return the osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service current stages
	 */
	public static List<OSIServiceCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi service current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi service current stages.
	 *
	 * @return the number of osi service current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OSIServiceCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OSIServiceCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OSIServiceCurrentStagePersistence _persistence;

}