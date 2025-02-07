/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj app board decision service. This utility wraps <code>com.nbp.ncbj.stages.services.service.persistence.impl.NcbjAppBoardDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecisionPersistence
 * @generated
 */
public class NcbjAppBoardDecisionUtil {

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
	public static void clearCache(NcbjAppBoardDecision ncbjAppBoardDecision) {
		getPersistence().clearCache(ncbjAppBoardDecision);
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
	public static Map<Serializable, NcbjAppBoardDecision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjAppBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjAppBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjAppBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjAppBoardDecision update(
		NcbjAppBoardDecision ncbjAppBoardDecision) {

		return getPersistence().update(ncbjAppBoardDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjAppBoardDecision update(
		NcbjAppBoardDecision ncbjAppBoardDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjAppBoardDecision, serviceContext);
	}

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or throws a <code>NoSuchNcbjAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision findBygetNcbj_CD_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().findBygetNcbj_CD_CI(caseId);
	}

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision fetchBygetNcbj_CD_CI(String caseId) {
		return getPersistence().fetchBygetNcbj_CD_CI(caseId);
	}

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision fetchBygetNcbj_CD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_CD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj app board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj app board decision that was removed
	 */
	public static NcbjAppBoardDecision removeBygetNcbj_CD_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().removeBygetNcbj_CD_CI(caseId);
	}

	/**
	 * Returns the number of ncbj app board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj app board decisions
	 */
	public static int countBygetNcbj_CD_CI(String caseId) {
		return getPersistence().countBygetNcbj_CD_CI(caseId);
	}

	/**
	 * Returns all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision) {

		return getPersistence().findBygetNcbj_By_CD(committeeDecision);
	}

	/**
	 * Returns a range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of matching ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end) {

		return getPersistence().findBygetNcbj_By_CD(
			committeeDecision, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return getPersistence().findBygetNcbj_By_CD(
			committeeDecision, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_By_CD(
			committeeDecision, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision findBygetNcbj_By_CD_First(
			String committeeDecision,
			OrderByComparator<NcbjAppBoardDecision> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().findBygetNcbj_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the first ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision fetchBygetNcbj_By_CD_First(
		String committeeDecision,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return getPersistence().fetchBygetNcbj_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision findBygetNcbj_By_CD_Last(
			String committeeDecision,
			OrderByComparator<NcbjAppBoardDecision> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().findBygetNcbj_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public static NcbjAppBoardDecision fetchBygetNcbj_By_CD_Last(
		String committeeDecision,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return getPersistence().fetchBygetNcbj_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the ncbj app board decisions before and after the current ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the current ncbj app board decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	public static NcbjAppBoardDecision[] findBygetNcbj_By_CD_PrevAndNext(
			long ncbjAppBoardDecisionId, String committeeDecision,
			OrderByComparator<NcbjAppBoardDecision> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().findBygetNcbj_By_CD_PrevAndNext(
			ncbjAppBoardDecisionId, committeeDecision, orderByComparator);
	}

	/**
	 * Removes all the ncbj app board decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public static void removeBygetNcbj_By_CD(String committeeDecision) {
		getPersistence().removeBygetNcbj_By_CD(committeeDecision);
	}

	/**
	 * Returns the number of ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching ncbj app board decisions
	 */
	public static int countBygetNcbj_By_CD(String committeeDecision) {
		return getPersistence().countBygetNcbj_By_CD(committeeDecision);
	}

	/**
	 * Caches the ncbj app board decision in the entity cache if it is enabled.
	 *
	 * @param ncbjAppBoardDecision the ncbj app board decision
	 */
	public static void cacheResult(NcbjAppBoardDecision ncbjAppBoardDecision) {
		getPersistence().cacheResult(ncbjAppBoardDecision);
	}

	/**
	 * Caches the ncbj app board decisions in the entity cache if it is enabled.
	 *
	 * @param ncbjAppBoardDecisions the ncbj app board decisions
	 */
	public static void cacheResult(
		List<NcbjAppBoardDecision> ncbjAppBoardDecisions) {

		getPersistence().cacheResult(ncbjAppBoardDecisions);
	}

	/**
	 * Creates a new ncbj app board decision with the primary key. Does not add the ncbj app board decision to the database.
	 *
	 * @param ncbjAppBoardDecisionId the primary key for the new ncbj app board decision
	 * @return the new ncbj app board decision
	 */
	public static NcbjAppBoardDecision create(long ncbjAppBoardDecisionId) {
		return getPersistence().create(ncbjAppBoardDecisionId);
	}

	/**
	 * Removes the ncbj app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision that was removed
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	public static NcbjAppBoardDecision remove(long ncbjAppBoardDecisionId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().remove(ncbjAppBoardDecisionId);
	}

	public static NcbjAppBoardDecision updateImpl(
		NcbjAppBoardDecision ncbjAppBoardDecision) {

		return getPersistence().updateImpl(ncbjAppBoardDecision);
	}

	/**
	 * Returns the ncbj app board decision with the primary key or throws a <code>NoSuchNcbjAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	public static NcbjAppBoardDecision findByPrimaryKey(
			long ncbjAppBoardDecisionId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjAppBoardDecisionException {

		return getPersistence().findByPrimaryKey(ncbjAppBoardDecisionId);
	}

	/**
	 * Returns the ncbj app board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision, or <code>null</code> if a ncbj app board decision with the primary key could not be found
	 */
	public static NcbjAppBoardDecision fetchByPrimaryKey(
		long ncbjAppBoardDecisionId) {

		return getPersistence().fetchByPrimaryKey(ncbjAppBoardDecisionId);
	}

	/**
	 * Returns all the ncbj app board decisions.
	 *
	 * @return the ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj app board decisions
	 */
	public static List<NcbjAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<NcbjAppBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj app board decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj app board decisions.
	 *
	 * @return the number of ncbj app board decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjAppBoardDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjAppBoardDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjAppBoardDecisionPersistence _persistence;

}