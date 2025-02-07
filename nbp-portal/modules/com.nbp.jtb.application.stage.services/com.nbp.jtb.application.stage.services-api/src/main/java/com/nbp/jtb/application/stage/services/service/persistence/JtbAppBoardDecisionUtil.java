/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb app board decision service. This utility wraps <code>com.nbp.jtb.application.stage.services.service.persistence.impl.JtbAppBoardDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAppBoardDecisionPersistence
 * @generated
 */
public class JtbAppBoardDecisionUtil {

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
	public static void clearCache(JtbAppBoardDecision jtbAppBoardDecision) {
		getPersistence().clearCache(jtbAppBoardDecision);
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
	public static Map<Serializable, JtbAppBoardDecision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbAppBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbAppBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbAppBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbAppBoardDecision update(
		JtbAppBoardDecision jtbAppBoardDecision) {

		return getPersistence().update(jtbAppBoardDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbAppBoardDecision update(
		JtbAppBoardDecision jtbAppBoardDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbAppBoardDecision, serviceContext);
	}

	/**
	 * Returns the jtb app board decision where caseId = &#63; or throws a <code>NoSuchJtbAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision findBygetjtb_CD_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().findBygetjtb_CD_CI(caseId);
	}

	/**
	 * Returns the jtb app board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision fetchBygetjtb_CD_CI(String caseId) {
		return getPersistence().fetchBygetjtb_CD_CI(caseId);
	}

	/**
	 * Returns the jtb app board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision fetchBygetjtb_CD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetjtb_CD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jtb app board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb app board decision that was removed
	 */
	public static JtbAppBoardDecision removeBygetjtb_CD_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().removeBygetjtb_CD_CI(caseId);
	}

	/**
	 * Returns the number of jtb app board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb app board decisions
	 */
	public static int countBygetjtb_CD_CI(String caseId) {
		return getPersistence().countBygetjtb_CD_CI(caseId);
	}

	/**
	 * Returns all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision) {

		return getPersistence().findBygetjtb_By_CD(committeeDecision);
	}

	/**
	 * Returns a range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of matching jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end) {

		return getPersistence().findBygetjtb_By_CD(
			committeeDecision, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return getPersistence().findBygetjtb_By_CD(
			committeeDecision, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetjtb_By_CD(
			committeeDecision, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision findBygetjtb_By_CD_First(
			String committeeDecision,
			OrderByComparator<JtbAppBoardDecision> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().findBygetjtb_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the first jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision fetchBygetjtb_By_CD_First(
		String committeeDecision,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return getPersistence().fetchBygetjtb_By_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision findBygetjtb_By_CD_Last(
			String committeeDecision,
			OrderByComparator<JtbAppBoardDecision> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().findBygetjtb_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public static JtbAppBoardDecision fetchBygetjtb_By_CD_Last(
		String committeeDecision,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return getPersistence().fetchBygetjtb_By_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the jtb app board decisions before and after the current jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the current jtb app board decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	public static JtbAppBoardDecision[] findBygetjtb_By_CD_PrevAndNext(
			long jtbAppDeciBoardDecisionId, String committeeDecision,
			OrderByComparator<JtbAppBoardDecision> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().findBygetjtb_By_CD_PrevAndNext(
			jtbAppDeciBoardDecisionId, committeeDecision, orderByComparator);
	}

	/**
	 * Removes all the jtb app board decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public static void removeBygetjtb_By_CD(String committeeDecision) {
		getPersistence().removeBygetjtb_By_CD(committeeDecision);
	}

	/**
	 * Returns the number of jtb app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching jtb app board decisions
	 */
	public static int countBygetjtb_By_CD(String committeeDecision) {
		return getPersistence().countBygetjtb_By_CD(committeeDecision);
	}

	/**
	 * Caches the jtb app board decision in the entity cache if it is enabled.
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 */
	public static void cacheResult(JtbAppBoardDecision jtbAppBoardDecision) {
		getPersistence().cacheResult(jtbAppBoardDecision);
	}

	/**
	 * Caches the jtb app board decisions in the entity cache if it is enabled.
	 *
	 * @param jtbAppBoardDecisions the jtb app board decisions
	 */
	public static void cacheResult(
		List<JtbAppBoardDecision> jtbAppBoardDecisions) {

		getPersistence().cacheResult(jtbAppBoardDecisions);
	}

	/**
	 * Creates a new jtb app board decision with the primary key. Does not add the jtb app board decision to the database.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key for the new jtb app board decision
	 * @return the new jtb app board decision
	 */
	public static JtbAppBoardDecision create(long jtbAppDeciBoardDecisionId) {
		return getPersistence().create(jtbAppDeciBoardDecisionId);
	}

	/**
	 * Removes the jtb app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision that was removed
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	public static JtbAppBoardDecision remove(long jtbAppDeciBoardDecisionId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().remove(jtbAppDeciBoardDecisionId);
	}

	public static JtbAppBoardDecision updateImpl(
		JtbAppBoardDecision jtbAppBoardDecision) {

		return getPersistence().updateImpl(jtbAppBoardDecision);
	}

	/**
	 * Returns the jtb app board decision with the primary key or throws a <code>NoSuchJtbAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	public static JtbAppBoardDecision findByPrimaryKey(
			long jtbAppDeciBoardDecisionId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbAppBoardDecisionException {

		return getPersistence().findByPrimaryKey(jtbAppDeciBoardDecisionId);
	}

	/**
	 * Returns the jtb app board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision, or <code>null</code> if a jtb app board decision with the primary key could not be found
	 */
	public static JtbAppBoardDecision fetchByPrimaryKey(
		long jtbAppDeciBoardDecisionId) {

		return getPersistence().fetchByPrimaryKey(jtbAppDeciBoardDecisionId);
	}

	/**
	 * Returns all the jtb app board decisions.
	 *
	 * @return the jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb app board decisions
	 */
	public static List<JtbAppBoardDecision> findAll(
		int start, int end,
		OrderByComparator<JtbAppBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb app board decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb app board decisions.
	 *
	 * @return the number of jtb app board decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbAppBoardDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbAppBoardDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbAppBoardDecisionPersistence _persistence;

}