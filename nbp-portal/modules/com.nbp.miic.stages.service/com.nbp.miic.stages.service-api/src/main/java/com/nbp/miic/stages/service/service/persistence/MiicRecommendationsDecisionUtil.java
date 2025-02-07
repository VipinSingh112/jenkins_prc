/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.stages.service.model.MiicRecommendationsDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic recommendations decision service. This utility wraps <code>com.nbp.miic.stages.service.service.persistence.impl.MiicRecommendationsDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecisionPersistence
 * @generated
 */
public class MiicRecommendationsDecisionUtil {

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
		MiicRecommendationsDecision miicRecommendationsDecision) {

		getPersistence().clearCache(miicRecommendationsDecision);
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
	public static Map<Serializable, MiicRecommendationsDecision>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicRecommendationsDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicRecommendationsDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicRecommendationsDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicRecommendationsDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicRecommendationsDecision update(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		return getPersistence().update(miicRecommendationsDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicRecommendationsDecision update(
		MiicRecommendationsDecision miicRecommendationsDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miicRecommendationsDecision, serviceContext);
	}

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or throws a <code>NoSuchMiicRecommendationsDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a matching miic recommendations decision could not be found
	 */
	public static MiicRecommendationsDecision findBygetMiic_RD_by_CI(
			String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicRecommendationsDecisionException {

		return getPersistence().findBygetMiic_RD_by_CI(caseId);
	}

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic recommendations decision, or <code>null</code> if a matching miic recommendations decision could not be found
	 */
	public static MiicRecommendationsDecision fetchBygetMiic_RD_by_CI(
		String caseId) {

		return getPersistence().fetchBygetMiic_RD_by_CI(caseId);
	}

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic recommendations decision, or <code>null</code> if a matching miic recommendations decision could not be found
	 */
	public static MiicRecommendationsDecision fetchBygetMiic_RD_by_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiic_RD_by_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the miic recommendations decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic recommendations decision that was removed
	 */
	public static MiicRecommendationsDecision removeBygetMiic_RD_by_CI(
			String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicRecommendationsDecisionException {

		return getPersistence().removeBygetMiic_RD_by_CI(caseId);
	}

	/**
	 * Returns the number of miic recommendations decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic recommendations decisions
	 */
	public static int countBygetMiic_RD_by_CI(String caseId) {
		return getPersistence().countBygetMiic_RD_by_CI(caseId);
	}

	/**
	 * Caches the miic recommendations decision in the entity cache if it is enabled.
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 */
	public static void cacheResult(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		getPersistence().cacheResult(miicRecommendationsDecision);
	}

	/**
	 * Caches the miic recommendations decisions in the entity cache if it is enabled.
	 *
	 * @param miicRecommendationsDecisions the miic recommendations decisions
	 */
	public static void cacheResult(
		List<MiicRecommendationsDecision> miicRecommendationsDecisions) {

		getPersistence().cacheResult(miicRecommendationsDecisions);
	}

	/**
	 * Creates a new miic recommendations decision with the primary key. Does not add the miic recommendations decision to the database.
	 *
	 * @param miicRecommendationsDecisionId the primary key for the new miic recommendations decision
	 * @return the new miic recommendations decision
	 */
	public static MiicRecommendationsDecision create(
		long miicRecommendationsDecisionId) {

		return getPersistence().create(miicRecommendationsDecisionId);
	}

	/**
	 * Removes the miic recommendations decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	public static MiicRecommendationsDecision remove(
			long miicRecommendationsDecisionId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicRecommendationsDecisionException {

		return getPersistence().remove(miicRecommendationsDecisionId);
	}

	public static MiicRecommendationsDecision updateImpl(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		return getPersistence().updateImpl(miicRecommendationsDecision);
	}

	/**
	 * Returns the miic recommendations decision with the primary key or throws a <code>NoSuchMiicRecommendationsDecisionException</code> if it could not be found.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	public static MiicRecommendationsDecision findByPrimaryKey(
			long miicRecommendationsDecisionId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicRecommendationsDecisionException {

		return getPersistence().findByPrimaryKey(miicRecommendationsDecisionId);
	}

	/**
	 * Returns the miic recommendations decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision, or <code>null</code> if a miic recommendations decision with the primary key could not be found
	 */
	public static MiicRecommendationsDecision fetchByPrimaryKey(
		long miicRecommendationsDecisionId) {

		return getPersistence().fetchByPrimaryKey(
			miicRecommendationsDecisionId);
	}

	/**
	 * Returns all the miic recommendations decisions.
	 *
	 * @return the miic recommendations decisions
	 */
	public static List<MiicRecommendationsDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @return the range of miic recommendations decisions
	 */
	public static List<MiicRecommendationsDecision> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic recommendations decisions
	 */
	public static List<MiicRecommendationsDecision> findAll(
		int start, int end,
		OrderByComparator<MiicRecommendationsDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic recommendations decisions
	 */
	public static List<MiicRecommendationsDecision> findAll(
		int start, int end,
		OrderByComparator<MiicRecommendationsDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic recommendations decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic recommendations decisions.
	 *
	 * @return the number of miic recommendations decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicRecommendationsDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicRecommendationsDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicRecommendationsDecisionPersistence _persistence;

}