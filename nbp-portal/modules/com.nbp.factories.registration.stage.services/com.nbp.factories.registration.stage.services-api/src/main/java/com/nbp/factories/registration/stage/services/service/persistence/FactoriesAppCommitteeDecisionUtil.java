/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories app committee decision service. This utility wraps <code>com.nbp.factories.registration.stage.services.service.persistence.impl.FactoriesAppCommitteeDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppCommitteeDecisionPersistence
 * @generated
 */
public class FactoriesAppCommitteeDecisionUtil {

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
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		getPersistence().clearCache(factoriesAppCommitteeDecision);
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
	public static Map<Serializable, FactoriesAppCommitteeDecision>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesAppCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesAppCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesAppCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesAppCommitteeDecision update(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return getPersistence().update(factoriesAppCommitteeDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesAppCommitteeDecision update(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesAppCommitteeDecision, serviceContext);
	}

	/**
	 * Returns the factories app committee decision where caseId = &#63; or throws a <code>NoSuchFactoriesAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision findBygetFactory_CD_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().findBygetFactory_CD_CI(caseId);
	}

	/**
	 * Returns the factories app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision fetchBygetFactory_CD_CI(
		String caseId) {

		return getPersistence().fetchBygetFactory_CD_CI(caseId);
	}

	/**
	 * Returns the factories app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision fetchBygetFactory_CD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactory_CD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the factories app committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories app committee decision that was removed
	 */
	public static FactoriesAppCommitteeDecision removeBygetFactory_CD_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().removeBygetFactory_CD_CI(caseId);
	}

	/**
	 * Returns the number of factories app committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories app committee decisions
	 */
	public static int countBygetFactory_CD_CI(String caseId) {
		return getPersistence().countBygetFactory_CD_CI(caseId);
	}

	/**
	 * Returns all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision) {

		return getPersistence().findBygetFactory_By_CD(committeeDecision);
	}

	/**
	 * Returns a range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of matching factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end) {

		return getPersistence().findBygetFactory_By_CD(
			committeeDecision, start, end);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return getPersistence().findBygetFactory_By_CD(
			committeeDecision, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFactory_By_CD(
			committeeDecision, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision findBygetFactory_By_CD_First(
			String committeeDecision,
			OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().findBygetFactory_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the first factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision fetchBygetFactory_By_CD_First(
		String committeeDecision,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return getPersistence().fetchBygetFactory_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision findBygetFactory_By_CD_Last(
			String committeeDecision,
			OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().findBygetFactory_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public static FactoriesAppCommitteeDecision fetchBygetFactory_By_CD_Last(
		String committeeDecision,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return getPersistence().fetchBygetFactory_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the factories app committee decisions before and after the current factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param factoriesAppCommiDecId the primary key of the current factories app committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	public static FactoriesAppCommitteeDecision[]
			findBygetFactory_By_CD_PrevAndNext(
				long factoriesAppCommiDecId, String committeeDecision,
				OrderByComparator<FactoriesAppCommitteeDecision>
					orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().findBygetFactory_By_CD_PrevAndNext(
			factoriesAppCommiDecId, committeeDecision, orderByComparator);
	}

	/**
	 * Removes all the factories app committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public static void removeBygetFactory_By_CD(String committeeDecision) {
		getPersistence().removeBygetFactory_By_CD(committeeDecision);
	}

	/**
	 * Returns the number of factories app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching factories app committee decisions
	 */
	public static int countBygetFactory_By_CD(String committeeDecision) {
		return getPersistence().countBygetFactory_By_CD(committeeDecision);
	}

	/**
	 * Caches the factories app committee decision in the entity cache if it is enabled.
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 */
	public static void cacheResult(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		getPersistence().cacheResult(factoriesAppCommitteeDecision);
	}

	/**
	 * Caches the factories app committee decisions in the entity cache if it is enabled.
	 *
	 * @param factoriesAppCommitteeDecisions the factories app committee decisions
	 */
	public static void cacheResult(
		List<FactoriesAppCommitteeDecision> factoriesAppCommitteeDecisions) {

		getPersistence().cacheResult(factoriesAppCommitteeDecisions);
	}

	/**
	 * Creates a new factories app committee decision with the primary key. Does not add the factories app committee decision to the database.
	 *
	 * @param factoriesAppCommiDecId the primary key for the new factories app committee decision
	 * @return the new factories app committee decision
	 */
	public static FactoriesAppCommitteeDecision create(
		long factoriesAppCommiDecId) {

		return getPersistence().create(factoriesAppCommiDecId);
	}

	/**
	 * Removes the factories app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision that was removed
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	public static FactoriesAppCommitteeDecision remove(
			long factoriesAppCommiDecId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().remove(factoriesAppCommiDecId);
	}

	public static FactoriesAppCommitteeDecision updateImpl(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return getPersistence().updateImpl(factoriesAppCommitteeDecision);
	}

	/**
	 * Returns the factories app committee decision with the primary key or throws a <code>NoSuchFactoriesAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	public static FactoriesAppCommitteeDecision findByPrimaryKey(
			long factoriesAppCommiDecId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getPersistence().findByPrimaryKey(factoriesAppCommiDecId);
	}

	/**
	 * Returns the factories app committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision, or <code>null</code> if a factories app committee decision with the primary key could not be found
	 */
	public static FactoriesAppCommitteeDecision fetchByPrimaryKey(
		long factoriesAppCommiDecId) {

		return getPersistence().fetchByPrimaryKey(factoriesAppCommiDecId);
	}

	/**
	 * Returns all the factories app committee decisions.
	 *
	 * @return the factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FactoriesAppCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories app committee decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories app committee decisions.
	 *
	 * @return the number of factories app committee decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesAppCommitteeDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesAppCommitteeDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesAppCommitteeDecisionPersistence
		_persistence;

}