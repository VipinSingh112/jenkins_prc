/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireEvaluation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire evaluation service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireEvaluationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluationPersistence
 * @generated
 */
public class AcquireEvaluationUtil {

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
	public static void clearCache(AcquireEvaluation acquireEvaluation) {
		getPersistence().clearCache(acquireEvaluation);
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
	public static Map<Serializable, AcquireEvaluation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireEvaluation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireEvaluation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireEvaluation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireEvaluation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireEvaluation update(
		AcquireEvaluation acquireEvaluation) {

		return getPersistence().update(acquireEvaluation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireEvaluation update(
		AcquireEvaluation acquireEvaluation, ServiceContext serviceContext) {

		return getPersistence().update(acquireEvaluation, serviceContext);
	}

	/**
	 * Returns the acquire evaluation where caseId = &#63; or throws a <code>NoSuchAcquireEvaluationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a matching acquire evaluation could not be found
	 */
	public static AcquireEvaluation findBygetAcquireEvaluationBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireEvaluationException {

		return getPersistence().findBygetAcquireEvaluationBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire evaluation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire evaluation, or <code>null</code> if a matching acquire evaluation could not be found
	 */
	public static AcquireEvaluation fetchBygetAcquireEvaluationBy_CaseId(
		String caseId) {

		return getPersistence().fetchBygetAcquireEvaluationBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire evaluation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire evaluation, or <code>null</code> if a matching acquire evaluation could not be found
	 */
	public static AcquireEvaluation fetchBygetAcquireEvaluationBy_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireEvaluationBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire evaluation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire evaluation that was removed
	 */
	public static AcquireEvaluation removeBygetAcquireEvaluationBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireEvaluationException {

		return getPersistence().removeBygetAcquireEvaluationBy_CaseId(caseId);
	}

	/**
	 * Returns the number of acquire evaluations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire evaluations
	 */
	public static int countBygetAcquireEvaluationBy_CaseId(String caseId) {
		return getPersistence().countBygetAcquireEvaluationBy_CaseId(caseId);
	}

	/**
	 * Caches the acquire evaluation in the entity cache if it is enabled.
	 *
	 * @param acquireEvaluation the acquire evaluation
	 */
	public static void cacheResult(AcquireEvaluation acquireEvaluation) {
		getPersistence().cacheResult(acquireEvaluation);
	}

	/**
	 * Caches the acquire evaluations in the entity cache if it is enabled.
	 *
	 * @param acquireEvaluations the acquire evaluations
	 */
	public static void cacheResult(List<AcquireEvaluation> acquireEvaluations) {
		getPersistence().cacheResult(acquireEvaluations);
	}

	/**
	 * Creates a new acquire evaluation with the primary key. Does not add the acquire evaluation to the database.
	 *
	 * @param acquireEvaluationId the primary key for the new acquire evaluation
	 * @return the new acquire evaluation
	 */
	public static AcquireEvaluation create(long acquireEvaluationId) {
		return getPersistence().create(acquireEvaluationId);
	}

	/**
	 * Removes the acquire evaluation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation that was removed
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	public static AcquireEvaluation remove(long acquireEvaluationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireEvaluationException {

		return getPersistence().remove(acquireEvaluationId);
	}

	public static AcquireEvaluation updateImpl(
		AcquireEvaluation acquireEvaluation) {

		return getPersistence().updateImpl(acquireEvaluation);
	}

	/**
	 * Returns the acquire evaluation with the primary key or throws a <code>NoSuchAcquireEvaluationException</code> if it could not be found.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	public static AcquireEvaluation findByPrimaryKey(long acquireEvaluationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireEvaluationException {

		return getPersistence().findByPrimaryKey(acquireEvaluationId);
	}

	/**
	 * Returns the acquire evaluation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation, or <code>null</code> if a acquire evaluation with the primary key could not be found
	 */
	public static AcquireEvaluation fetchByPrimaryKey(
		long acquireEvaluationId) {

		return getPersistence().fetchByPrimaryKey(acquireEvaluationId);
	}

	/**
	 * Returns all the acquire evaluations.
	 *
	 * @return the acquire evaluations
	 */
	public static List<AcquireEvaluation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @return the range of acquire evaluations
	 */
	public static List<AcquireEvaluation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire evaluations
	 */
	public static List<AcquireEvaluation> findAll(
		int start, int end,
		OrderByComparator<AcquireEvaluation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire evaluations
	 */
	public static List<AcquireEvaluation> findAll(
		int start, int end,
		OrderByComparator<AcquireEvaluation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire evaluations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire evaluations.
	 *
	 * @return the number of acquire evaluations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireEvaluationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireEvaluationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireEvaluationPersistence _persistence;

}