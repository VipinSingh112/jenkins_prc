/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status pre approval conditions service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusPreApprovalConditionsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditionsPersistence
 * @generated
 */
public class SezStatusPreApprovalConditionsUtil {

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
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		getPersistence().clearCache(sezStatusPreApprovalConditions);
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
	public static Map<Serializable, SezStatusPreApprovalConditions>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusPreApprovalConditions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusPreApprovalConditions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusPreApprovalConditions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusPreApprovalConditions> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusPreApprovalConditions update(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return getPersistence().update(sezStatusPreApprovalConditions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusPreApprovalConditions update(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusPreApprovalConditions, serviceContext);
	}

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or throws a <code>NoSuchSezStatusPreApprovalConditionsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a matching sez status pre approval conditions could not be found
	 */
	public static SezStatusPreApprovalConditions
			findBygetPreAPprovalConditionBy_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPreApprovalConditionsException {

		return getPersistence().findBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status pre approval conditions, or <code>null</code> if a matching sez status pre approval conditions could not be found
	 */
	public static SezStatusPreApprovalConditions
		fetchBygetPreAPprovalConditionBy_CI(String caseId) {

		return getPersistence().fetchBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status pre approval conditions, or <code>null</code> if a matching sez status pre approval conditions could not be found
	 */
	public static SezStatusPreApprovalConditions
		fetchBygetPreAPprovalConditionBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPreAPprovalConditionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the sez status pre approval conditions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status pre approval conditions that was removed
	 */
	public static SezStatusPreApprovalConditions
			removeBygetPreAPprovalConditionBy_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPreApprovalConditionsException {

		return getPersistence().removeBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Returns the number of sez status pre approval conditionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status pre approval conditionses
	 */
	public static int countBygetPreAPprovalConditionBy_CI(String caseId) {
		return getPersistence().countBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Caches the sez status pre approval conditions in the entity cache if it is enabled.
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 */
	public static void cacheResult(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		getPersistence().cacheResult(sezStatusPreApprovalConditions);
	}

	/**
	 * Caches the sez status pre approval conditionses in the entity cache if it is enabled.
	 *
	 * @param sezStatusPreApprovalConditionses the sez status pre approval conditionses
	 */
	public static void cacheResult(
		List<SezStatusPreApprovalConditions> sezStatusPreApprovalConditionses) {

		getPersistence().cacheResult(sezStatusPreApprovalConditionses);
	}

	/**
	 * Creates a new sez status pre approval conditions with the primary key. Does not add the sez status pre approval conditions to the database.
	 *
	 * @param preApprovalId the primary key for the new sez status pre approval conditions
	 * @return the new sez status pre approval conditions
	 */
	public static SezStatusPreApprovalConditions create(long preApprovalId) {
		return getPersistence().create(preApprovalId);
	}

	/**
	 * Removes the sez status pre approval conditions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	public static SezStatusPreApprovalConditions remove(long preApprovalId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPreApprovalConditionsException {

		return getPersistence().remove(preApprovalId);
	}

	public static SezStatusPreApprovalConditions updateImpl(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return getPersistence().updateImpl(sezStatusPreApprovalConditions);
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key or throws a <code>NoSuchSezStatusPreApprovalConditionsException</code> if it could not be found.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	public static SezStatusPreApprovalConditions findByPrimaryKey(
			long preApprovalId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPreApprovalConditionsException {

		return getPersistence().findByPrimaryKey(preApprovalId);
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions, or <code>null</code> if a sez status pre approval conditions with the primary key could not be found
	 */
	public static SezStatusPreApprovalConditions fetchByPrimaryKey(
		long preApprovalId) {

		return getPersistence().fetchByPrimaryKey(preApprovalId);
	}

	/**
	 * Returns all the sez status pre approval conditionses.
	 *
	 * @return the sez status pre approval conditionses
	 */
	public static List<SezStatusPreApprovalConditions> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @return the range of sez status pre approval conditionses
	 */
	public static List<SezStatusPreApprovalConditions> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status pre approval conditionses
	 */
	public static List<SezStatusPreApprovalConditions> findAll(
		int start, int end,
		OrderByComparator<SezStatusPreApprovalConditions> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status pre approval conditionses
	 */
	public static List<SezStatusPreApprovalConditions> findAll(
		int start, int end,
		OrderByComparator<SezStatusPreApprovalConditions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status pre approval conditionses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status pre approval conditionses.
	 *
	 * @return the number of sez status pre approval conditionses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusPreApprovalConditionsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusPreApprovalConditionsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusPreApprovalConditionsPersistence
		_persistence;

}