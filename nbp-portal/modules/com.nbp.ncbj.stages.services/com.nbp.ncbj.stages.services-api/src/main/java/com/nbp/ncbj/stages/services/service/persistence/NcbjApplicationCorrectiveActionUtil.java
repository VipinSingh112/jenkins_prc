/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj application corrective action service. This utility wraps <code>com.nbp.ncbj.stages.services.service.persistence.impl.NcbjApplicationCorrectiveActionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveActionPersistence
 * @generated
 */
public class NcbjApplicationCorrectiveActionUtil {

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
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		getPersistence().clearCache(ncbjApplicationCorrectiveAction);
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
	public static Map<Serializable, NcbjApplicationCorrectiveAction>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjApplicationCorrectiveAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjApplicationCorrectiveAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjApplicationCorrectiveAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjApplicationCorrectiveAction> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjApplicationCorrectiveAction update(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		return getPersistence().update(ncbjApplicationCorrectiveAction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjApplicationCorrectiveAction update(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction,
		ServiceContext serviceContext) {

		return getPersistence().update(
			ncbjApplicationCorrectiveAction, serviceContext);
	}

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or throws a <code>NoSuchNcbjApplicationCorrectiveActionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a matching ncbj application corrective action could not be found
	 */
	public static NcbjApplicationCorrectiveAction
			findBygetPreAPprovalConditionBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationCorrectiveActionException {

		return getPersistence().findBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application corrective action, or <code>null</code> if a matching ncbj application corrective action could not be found
	 */
	public static NcbjApplicationCorrectiveAction
		fetchBygetPreAPprovalConditionBy_CI(String caseId) {

		return getPersistence().fetchBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application corrective action, or <code>null</code> if a matching ncbj application corrective action could not be found
	 */
	public static NcbjApplicationCorrectiveAction
		fetchBygetPreAPprovalConditionBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPreAPprovalConditionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj application corrective action where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application corrective action that was removed
	 */
	public static NcbjApplicationCorrectiveAction
			removeBygetPreAPprovalConditionBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationCorrectiveActionException {

		return getPersistence().removeBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Returns the number of ncbj application corrective actions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application corrective actions
	 */
	public static int countBygetPreAPprovalConditionBy_CI(String caseId) {
		return getPersistence().countBygetPreAPprovalConditionBy_CI(caseId);
	}

	/**
	 * Caches the ncbj application corrective action in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 */
	public static void cacheResult(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		getPersistence().cacheResult(ncbjApplicationCorrectiveAction);
	}

	/**
	 * Caches the ncbj application corrective actions in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationCorrectiveActions the ncbj application corrective actions
	 */
	public static void cacheResult(
		List<NcbjApplicationCorrectiveAction>
			ncbjApplicationCorrectiveActions) {

		getPersistence().cacheResult(ncbjApplicationCorrectiveActions);
	}

	/**
	 * Creates a new ncbj application corrective action with the primary key. Does not add the ncbj application corrective action to the database.
	 *
	 * @param ncbjAppCorrActionId the primary key for the new ncbj application corrective action
	 * @return the new ncbj application corrective action
	 */
	public static NcbjApplicationCorrectiveAction create(
		long ncbjAppCorrActionId) {

		return getPersistence().create(ncbjAppCorrActionId);
	}

	/**
	 * Removes the ncbj application corrective action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	public static NcbjApplicationCorrectiveAction remove(
			long ncbjAppCorrActionId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationCorrectiveActionException {

		return getPersistence().remove(ncbjAppCorrActionId);
	}

	public static NcbjApplicationCorrectiveAction updateImpl(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		return getPersistence().updateImpl(ncbjApplicationCorrectiveAction);
	}

	/**
	 * Returns the ncbj application corrective action with the primary key or throws a <code>NoSuchNcbjApplicationCorrectiveActionException</code> if it could not be found.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	public static NcbjApplicationCorrectiveAction findByPrimaryKey(
			long ncbjAppCorrActionId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationCorrectiveActionException {

		return getPersistence().findByPrimaryKey(ncbjAppCorrActionId);
	}

	/**
	 * Returns the ncbj application corrective action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action, or <code>null</code> if a ncbj application corrective action with the primary key could not be found
	 */
	public static NcbjApplicationCorrectiveAction fetchByPrimaryKey(
		long ncbjAppCorrActionId) {

		return getPersistence().fetchByPrimaryKey(ncbjAppCorrActionId);
	}

	/**
	 * Returns all the ncbj application corrective actions.
	 *
	 * @return the ncbj application corrective actions
	 */
	public static List<NcbjApplicationCorrectiveAction> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @return the range of ncbj application corrective actions
	 */
	public static List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj application corrective actions
	 */
	public static List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationCorrectiveAction> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj application corrective actions
	 */
	public static List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationCorrectiveAction> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj application corrective actions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj application corrective actions.
	 *
	 * @return the number of ncbj application corrective actions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjApplicationCorrectiveActionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjApplicationCorrectiveActionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjApplicationCorrectiveActionPersistence
		_persistence;

}