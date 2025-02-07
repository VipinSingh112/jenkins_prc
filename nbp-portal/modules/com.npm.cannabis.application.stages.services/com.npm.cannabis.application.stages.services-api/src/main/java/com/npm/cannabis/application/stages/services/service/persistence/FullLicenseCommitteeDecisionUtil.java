/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the full license committee decision service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.FullLicenseCommitteeDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecisionPersistence
 * @generated
 */
public class FullLicenseCommitteeDecisionUtil {

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
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		getPersistence().clearCache(fullLicenseCommitteeDecision);
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
	public static Map<Serializable, FullLicenseCommitteeDecision>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FullLicenseCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FullLicenseCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FullLicenseCommitteeDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FullLicenseCommitteeDecision update(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return getPersistence().update(fullLicenseCommitteeDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FullLicenseCommitteeDecision update(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fullLicenseCommitteeDecision, serviceContext);
	}

	/**
	 * Returns all the full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId) {

		return getPersistence().findBygetFLCD_CaseId(caseId);
	}

	/**
	 * Returns a range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetFLCD_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().findBygetFLCD_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFLCD_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision findBygetFLCD_CaseId_First(
			String caseId,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_CaseId_First(
		String caseId,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().fetchBygetFLCD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision findBygetFLCD_CaseId_Last(
			String caseId,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_CaseId_Last(
		String caseId,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().fetchBygetFLCD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the full license committee decisions before and after the current full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the current full license committee decision
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision[]
			findBygetFLCD_CaseId_PrevAndNext(
				long fullLicenseCommitteeDecisionId, String caseId,
				OrderByComparator<FullLicenseCommitteeDecision>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CaseId_PrevAndNext(
			fullLicenseCommitteeDecisionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the full license committee decisions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFLCD_CaseId(String caseId) {
		getPersistence().removeBygetFLCD_CaseId(caseId);
	}

	/**
	 * Returns the number of full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	public static int countBygetFLCD_CaseId(String caseId) {
		return getPersistence().countBygetFLCD_CaseId(caseId);
	}

	/**
	 * Returns the full license committee decision where caseId = &#63; or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision findBygetFLCD_By_CaseId(
			String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_By_CaseId(caseId);
	}

	/**
	 * Returns the full license committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetFLCD_By_CaseId(caseId);
	}

	/**
	 * Returns the full license committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFLCD_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the full license committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the full license committee decision that was removed
	 */
	public static FullLicenseCommitteeDecision removeBygetFLCD_By_CaseId(
			String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().removeBygetFLCD_By_CaseId(caseId);
	}

	/**
	 * Returns the number of full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	public static int countBygetFLCD_By_CaseId(String caseId) {
		return getPersistence().countBygetFLCD_By_CaseId(caseId);
	}

	/**
	 * Returns all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision) {

		return getPersistence().findBygetFLCD_CD(committeeDecision);
	}

	/**
	 * Returns a range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end) {

		return getPersistence().findBygetFLCD_CD(committeeDecision, start, end);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().findBygetFLCD_CD(
			committeeDecision, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFLCD_CD(
			committeeDecision, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision findBygetFLCD_CD_First(
			String committeeDecision,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the first full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_CD_First(
		String committeeDecision,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().fetchBygetFLCD_CD_First(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision findBygetFLCD_CD_Last(
			String committeeDecision,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the last full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_CD_Last(
		String committeeDecision,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().fetchBygetFLCD_CD_Last(
			committeeDecision, orderByComparator);
	}

	/**
	 * Returns the full license committee decisions before and after the current full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the current full license committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision[] findBygetFLCD_CD_PrevAndNext(
			long fullLicenseCommitteeDecisionId, String committeeDecision,
			OrderByComparator<FullLicenseCommitteeDecision> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CD_PrevAndNext(
			fullLicenseCommitteeDecisionId, committeeDecision,
			orderByComparator);
	}

	/**
	 * Removes all the full license committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public static void removeBygetFLCD_CD(String committeeDecision) {
		getPersistence().removeBygetFLCD_CD(committeeDecision);
	}

	/**
	 * Returns the number of full license committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching full license committee decisions
	 */
	public static int countBygetFLCD_CD(String committeeDecision) {
		return getPersistence().countBygetFLCD_CD(committeeDecision);
	}

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision findBygetFLCD_CD_caseId(
			String committeeDecision, String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findBygetFLCD_CD_caseId(
			committeeDecision, caseId);
	}

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_CD_caseId(
		String committeeDecision, String caseId) {

		return getPersistence().fetchBygetFLCD_CD_caseId(
			committeeDecision, caseId);
	}

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public static FullLicenseCommitteeDecision fetchBygetFLCD_CD_caseId(
		String committeeDecision, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFLCD_CD_caseId(
			committeeDecision, caseId, useFinderCache);
	}

	/**
	 * Removes the full license committee decision where committeeDecision = &#63; and caseId = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the full license committee decision that was removed
	 */
	public static FullLicenseCommitteeDecision removeBygetFLCD_CD_caseId(
			String committeeDecision, String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().removeBygetFLCD_CD_caseId(
			committeeDecision, caseId);
	}

	/**
	 * Returns the number of full license committee decisions where committeeDecision = &#63; and caseId = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	public static int countBygetFLCD_CD_caseId(
		String committeeDecision, String caseId) {

		return getPersistence().countBygetFLCD_CD_caseId(
			committeeDecision, caseId);
	}

	/**
	 * Caches the full license committee decision in the entity cache if it is enabled.
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 */
	public static void cacheResult(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		getPersistence().cacheResult(fullLicenseCommitteeDecision);
	}

	/**
	 * Caches the full license committee decisions in the entity cache if it is enabled.
	 *
	 * @param fullLicenseCommitteeDecisions the full license committee decisions
	 */
	public static void cacheResult(
		List<FullLicenseCommitteeDecision> fullLicenseCommitteeDecisions) {

		getPersistence().cacheResult(fullLicenseCommitteeDecisions);
	}

	/**
	 * Creates a new full license committee decision with the primary key. Does not add the full license committee decision to the database.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key for the new full license committee decision
	 * @return the new full license committee decision
	 */
	public static FullLicenseCommitteeDecision create(
		long fullLicenseCommitteeDecisionId) {

		return getPersistence().create(fullLicenseCommitteeDecisionId);
	}

	/**
	 * Removes the full license committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision that was removed
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision remove(
			long fullLicenseCommitteeDecisionId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().remove(fullLicenseCommitteeDecisionId);
	}

	public static FullLicenseCommitteeDecision updateImpl(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return getPersistence().updateImpl(fullLicenseCommitteeDecision);
	}

	/**
	 * Returns the full license committee decision with the primary key or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision findByPrimaryKey(
			long fullLicenseCommitteeDecisionId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getPersistence().findByPrimaryKey(
			fullLicenseCommitteeDecisionId);
	}

	/**
	 * Returns the full license committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision, or <code>null</code> if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision fetchByPrimaryKey(
		long fullLicenseCommitteeDecisionId) {

		return getPersistence().fetchByPrimaryKey(
			fullLicenseCommitteeDecisionId);
	}

	/**
	 * Returns all the full license committee decisions.
	 *
	 * @return the full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the full license committee decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of full license committee decisions.
	 *
	 * @return the number of full license committee decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FullLicenseCommitteeDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FullLicenseCommitteeDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FullLicenseCommitteeDecisionPersistence
		_persistence;

}