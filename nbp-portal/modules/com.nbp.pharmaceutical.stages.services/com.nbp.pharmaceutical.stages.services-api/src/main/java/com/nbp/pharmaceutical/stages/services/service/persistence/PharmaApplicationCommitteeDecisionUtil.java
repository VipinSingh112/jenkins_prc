/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma application committee decision service. This utility wraps <code>com.nbp.pharmaceutical.stages.services.service.persistence.impl.PharmaApplicationCommitteeDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecisionPersistence
 * @generated
 */
public class PharmaApplicationCommitteeDecisionUtil {

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
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		getPersistence().clearCache(pharmaApplicationCommitteeDecision);
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
	public static Map<Serializable, PharmaApplicationCommitteeDecision>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaApplicationCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaApplicationCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaApplicationCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaApplicationCommitteeDecision update(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		return getPersistence().update(pharmaApplicationCommitteeDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaApplicationCommitteeDecision update(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pharmaApplicationCommitteeDecision, serviceContext);
	}

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or throws a <code>NoSuchPharmaApplicationCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision findBygetPharma_CD_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().findBygetPharma_CD_CI(caseId);
	}

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision fetchBygetPharma_CD_CI(
		String caseId) {

		return getPersistence().fetchBygetPharma_CD_CI(caseId);
	}

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision fetchBygetPharma_CD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPharma_CD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the pharma application committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma application committee decision that was removed
	 */
	public static PharmaApplicationCommitteeDecision removeBygetPharma_CD_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().removeBygetPharma_CD_CI(caseId);
	}

	/**
	 * Returns the number of pharma application committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application committee decisions
	 */
	public static int countBygetPharma_CD_CI(String caseId) {
		return getPersistence().countBygetPharma_CD_CI(caseId);
	}

	/**
	 * Returns all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(String committeeDecision) {

		return getPersistence().findBygetPharma_By_CD(committeeDecision);
	}

	/**
	 * Returns a range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of matching pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(String committeeDecision, int start, int end) {

		return getPersistence().findBygetPharma_By_CD(
			committeeDecision, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(
			String committeeDecision, int start, int end,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator) {

		return getPersistence().findBygetPharma_By_CD(
			committeeDecision, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(
			String committeeDecision, int start, int end,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPharma_By_CD(
			committeeDecision, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision
			findBygetPharma_By_CD_First(
				String committeeDecision,
				OrderByComparator<PharmaApplicationCommitteeDecision>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().findBygetPharma_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the first pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision
		fetchBygetPharma_By_CD_First(
			String committeeDecision,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator) {

		return getPersistence().fetchBygetPharma_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision findBygetPharma_By_CD_Last(
			String committeeDecision,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().findBygetPharma_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public static PharmaApplicationCommitteeDecision
		fetchBygetPharma_By_CD_Last(
			String committeeDecision,
			OrderByComparator<PharmaApplicationCommitteeDecision>
				orderByComparator) {

		return getPersistence().fetchBygetPharma_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the pharma application committee decisions before and after the current pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the current pharma application committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	public static PharmaApplicationCommitteeDecision[]
			findBygetPharma_By_CD_PrevAndNext(
				long pharmaCommitteeDecisionId, String committeeDecision,
				OrderByComparator<PharmaApplicationCommitteeDecision>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().findBygetPharma_By_CD_PrevAndNext(
			pharmaCommitteeDecisionId, committeeDecision, orderByComparator);
	}

	/**
	 * Removes all the pharma application committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public static void removeBygetPharma_By_CD(String committeeDecision) {
		getPersistence().removeBygetPharma_By_CD(committeeDecision);
	}

	/**
	 * Returns the number of pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching pharma application committee decisions
	 */
	public static int countBygetPharma_By_CD(String committeeDecision) {
		return getPersistence().countBygetPharma_By_CD(committeeDecision);
	}

	/**
	 * Caches the pharma application committee decision in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 */
	public static void cacheResult(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		getPersistence().cacheResult(pharmaApplicationCommitteeDecision);
	}

	/**
	 * Caches the pharma application committee decisions in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationCommitteeDecisions the pharma application committee decisions
	 */
	public static void cacheResult(
		List<PharmaApplicationCommitteeDecision>
			pharmaApplicationCommitteeDecisions) {

		getPersistence().cacheResult(pharmaApplicationCommitteeDecisions);
	}

	/**
	 * Creates a new pharma application committee decision with the primary key. Does not add the pharma application committee decision to the database.
	 *
	 * @param pharmaCommitteeDecisionId the primary key for the new pharma application committee decision
	 * @return the new pharma application committee decision
	 */
	public static PharmaApplicationCommitteeDecision create(
		long pharmaCommitteeDecisionId) {

		return getPersistence().create(pharmaCommitteeDecisionId);
	}

	/**
	 * Removes the pharma application committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	public static PharmaApplicationCommitteeDecision remove(
			long pharmaCommitteeDecisionId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().remove(pharmaCommitteeDecisionId);
	}

	public static PharmaApplicationCommitteeDecision updateImpl(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision) {

		return getPersistence().updateImpl(pharmaApplicationCommitteeDecision);
	}

	/**
	 * Returns the pharma application committee decision with the primary key or throws a <code>NoSuchPharmaApplicationCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	public static PharmaApplicationCommitteeDecision findByPrimaryKey(
			long pharmaCommitteeDecisionId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getPersistence().findByPrimaryKey(pharmaCommitteeDecisionId);
	}

	/**
	 * Returns the pharma application committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision, or <code>null</code> if a pharma application committee decision with the primary key could not be found
	 */
	public static PharmaApplicationCommitteeDecision fetchByPrimaryKey(
		long pharmaCommitteeDecisionId) {

		return getPersistence().fetchByPrimaryKey(pharmaCommitteeDecisionId);
	}

	/**
	 * Returns all the pharma application committee decisions.
	 *
	 * @return the pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma application committee decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma application committee decisions.
	 *
	 * @return the number of pharma application committee decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaApplicationCommitteeDecisionPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		PharmaApplicationCommitteeDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaApplicationCommitteeDecisionPersistence
		_persistence;

}