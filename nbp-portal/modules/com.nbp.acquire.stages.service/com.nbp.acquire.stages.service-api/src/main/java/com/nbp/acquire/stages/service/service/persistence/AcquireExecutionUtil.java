/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireExecution;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire execution service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireExecutionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecutionPersistence
 * @generated
 */
public class AcquireExecutionUtil {

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
	public static void clearCache(AcquireExecution acquireExecution) {
		getPersistence().clearCache(acquireExecution);
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
	public static Map<Serializable, AcquireExecution> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireExecution> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireExecution> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireExecution> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireExecution> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireExecution update(AcquireExecution acquireExecution) {
		return getPersistence().update(acquireExecution);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireExecution update(
		AcquireExecution acquireExecution, ServiceContext serviceContext) {

		return getPersistence().update(acquireExecution, serviceContext);
	}

	/**
	 * Returns the acquire execution where caseId = &#63; or throws a <code>NoSuchAcquireExecutionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire execution
	 * @throws NoSuchAcquireExecutionException if a matching acquire execution could not be found
	 */
	public static AcquireExecution findBygetAcquireExecutionBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireExecutionException {

		return getPersistence().findBygetAcquireExecutionBy_CI(caseId);
	}

	/**
	 * Returns the acquire execution where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire execution, or <code>null</code> if a matching acquire execution could not be found
	 */
	public static AcquireExecution fetchBygetAcquireExecutionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetAcquireExecutionBy_CI(caseId);
	}

	/**
	 * Returns the acquire execution where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire execution, or <code>null</code> if a matching acquire execution could not be found
	 */
	public static AcquireExecution fetchBygetAcquireExecutionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireExecutionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire execution where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire execution that was removed
	 */
	public static AcquireExecution removeBygetAcquireExecutionBy_CI(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireExecutionException {

		return getPersistence().removeBygetAcquireExecutionBy_CI(caseId);
	}

	/**
	 * Returns the number of acquire executions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire executions
	 */
	public static int countBygetAcquireExecutionBy_CI(String caseId) {
		return getPersistence().countBygetAcquireExecutionBy_CI(caseId);
	}

	/**
	 * Caches the acquire execution in the entity cache if it is enabled.
	 *
	 * @param acquireExecution the acquire execution
	 */
	public static void cacheResult(AcquireExecution acquireExecution) {
		getPersistence().cacheResult(acquireExecution);
	}

	/**
	 * Caches the acquire executions in the entity cache if it is enabled.
	 *
	 * @param acquireExecutions the acquire executions
	 */
	public static void cacheResult(List<AcquireExecution> acquireExecutions) {
		getPersistence().cacheResult(acquireExecutions);
	}

	/**
	 * Creates a new acquire execution with the primary key. Does not add the acquire execution to the database.
	 *
	 * @param acquireExecutionId the primary key for the new acquire execution
	 * @return the new acquire execution
	 */
	public static AcquireExecution create(long acquireExecutionId) {
		return getPersistence().create(acquireExecutionId);
	}

	/**
	 * Removes the acquire execution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution that was removed
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	public static AcquireExecution remove(long acquireExecutionId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireExecutionException {

		return getPersistence().remove(acquireExecutionId);
	}

	public static AcquireExecution updateImpl(
		AcquireExecution acquireExecution) {

		return getPersistence().updateImpl(acquireExecution);
	}

	/**
	 * Returns the acquire execution with the primary key or throws a <code>NoSuchAcquireExecutionException</code> if it could not be found.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	public static AcquireExecution findByPrimaryKey(long acquireExecutionId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireExecutionException {

		return getPersistence().findByPrimaryKey(acquireExecutionId);
	}

	/**
	 * Returns the acquire execution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution, or <code>null</code> if a acquire execution with the primary key could not be found
	 */
	public static AcquireExecution fetchByPrimaryKey(long acquireExecutionId) {
		return getPersistence().fetchByPrimaryKey(acquireExecutionId);
	}

	/**
	 * Returns all the acquire executions.
	 *
	 * @return the acquire executions
	 */
	public static List<AcquireExecution> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @return the range of acquire executions
	 */
	public static List<AcquireExecution> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire executions
	 */
	public static List<AcquireExecution> findAll(
		int start, int end,
		OrderByComparator<AcquireExecution> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire executions
	 */
	public static List<AcquireExecution> findAll(
		int start, int end,
		OrderByComparator<AcquireExecution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire executions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire executions.
	 *
	 * @return the number of acquire executions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireExecutionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AcquireExecutionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AcquireExecutionPersistence _persistence;

}