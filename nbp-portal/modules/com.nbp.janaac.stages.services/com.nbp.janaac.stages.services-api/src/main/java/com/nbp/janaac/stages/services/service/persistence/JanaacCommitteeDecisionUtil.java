/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacCommitteeDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac committee decision service. This utility wraps <code>com.nbp.janaac.stages.services.service.persistence.impl.JanaacCommitteeDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacCommitteeDecisionPersistence
 * @generated
 */
public class JanaacCommitteeDecisionUtil {

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
		JanaacCommitteeDecision janaacCommitteeDecision) {

		getPersistence().clearCache(janaacCommitteeDecision);
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
	public static Map<Serializable, JanaacCommitteeDecision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacCommitteeDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacCommitteeDecision update(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		return getPersistence().update(janaacCommitteeDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacCommitteeDecision update(
		JanaacCommitteeDecision janaacCommitteeDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(janaacCommitteeDecision, serviceContext);
	}

	/**
	 * Returns the janaac committee decision where caseId = &#63; or throws a <code>NoSuchJanaacCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a matching janaac committee decision could not be found
	 */
	public static JanaacCommitteeDecision findBygetJanaac_by_caseId(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacCommitteeDecisionException {

		return getPersistence().findBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the janaac committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac committee decision, or <code>null</code> if a matching janaac committee decision could not be found
	 */
	public static JanaacCommitteeDecision fetchBygetJanaac_by_caseId(
		String caseId) {

		return getPersistence().fetchBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the janaac committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac committee decision, or <code>null</code> if a matching janaac committee decision could not be found
	 */
	public static JanaacCommitteeDecision fetchBygetJanaac_by_caseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_by_caseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the janaac committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac committee decision that was removed
	 */
	public static JanaacCommitteeDecision removeBygetJanaac_by_caseId(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacCommitteeDecisionException {

		return getPersistence().removeBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the number of janaac committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac committee decisions
	 */
	public static int countBygetJanaac_by_caseId(String caseId) {
		return getPersistence().countBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Caches the janaac committee decision in the entity cache if it is enabled.
	 *
	 * @param janaacCommitteeDecision the janaac committee decision
	 */
	public static void cacheResult(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		getPersistence().cacheResult(janaacCommitteeDecision);
	}

	/**
	 * Caches the janaac committee decisions in the entity cache if it is enabled.
	 *
	 * @param janaacCommitteeDecisions the janaac committee decisions
	 */
	public static void cacheResult(
		List<JanaacCommitteeDecision> janaacCommitteeDecisions) {

		getPersistence().cacheResult(janaacCommitteeDecisions);
	}

	/**
	 * Creates a new janaac committee decision with the primary key. Does not add the janaac committee decision to the database.
	 *
	 * @param janaacCommitteeDecisionId the primary key for the new janaac committee decision
	 * @return the new janaac committee decision
	 */
	public static JanaacCommitteeDecision create(
		long janaacCommitteeDecisionId) {

		return getPersistence().create(janaacCommitteeDecisionId);
	}

	/**
	 * Removes the janaac committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision that was removed
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	public static JanaacCommitteeDecision remove(long janaacCommitteeDecisionId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacCommitteeDecisionException {

		return getPersistence().remove(janaacCommitteeDecisionId);
	}

	public static JanaacCommitteeDecision updateImpl(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		return getPersistence().updateImpl(janaacCommitteeDecision);
	}

	/**
	 * Returns the janaac committee decision with the primary key or throws a <code>NoSuchJanaacCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	public static JanaacCommitteeDecision findByPrimaryKey(
			long janaacCommitteeDecisionId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacCommitteeDecisionException {

		return getPersistence().findByPrimaryKey(janaacCommitteeDecisionId);
	}

	/**
	 * Returns the janaac committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision, or <code>null</code> if a janaac committee decision with the primary key could not be found
	 */
	public static JanaacCommitteeDecision fetchByPrimaryKey(
		long janaacCommitteeDecisionId) {

		return getPersistence().fetchByPrimaryKey(janaacCommitteeDecisionId);
	}

	/**
	 * Returns all the janaac committee decisions.
	 *
	 * @return the janaac committee decisions
	 */
	public static List<JanaacCommitteeDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @return the range of janaac committee decisions
	 */
	public static List<JanaacCommitteeDecision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac committee decisions
	 */
	public static List<JanaacCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<JanaacCommitteeDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac committee decisions
	 */
	public static List<JanaacCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<JanaacCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac committee decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac committee decisions.
	 *
	 * @return the number of janaac committee decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacCommitteeDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JanaacCommitteeDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JanaacCommitteeDecisionPersistence _persistence;

}