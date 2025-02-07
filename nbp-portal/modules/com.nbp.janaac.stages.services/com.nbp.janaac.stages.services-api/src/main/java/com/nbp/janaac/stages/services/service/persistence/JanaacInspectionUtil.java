/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac inspection service. This utility wraps <code>com.nbp.janaac.stages.services.service.persistence.impl.JanaacInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspectionPersistence
 * @generated
 */
public class JanaacInspectionUtil {

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
	public static void clearCache(JanaacInspection janaacInspection) {
		getPersistence().clearCache(janaacInspection);
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
	public static Map<Serializable, JanaacInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacInspection update(JanaacInspection janaacInspection) {
		return getPersistence().update(janaacInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacInspection update(
		JanaacInspection janaacInspection, ServiceContext serviceContext) {

		return getPersistence().update(janaacInspection, serviceContext);
	}

	/**
	 * Returns the janaac inspection where caseId = &#63; or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaacInspectionBy_CI(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaacInspectionBy_CI(caseId);
	}

	/**
	 * Returns the janaac inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaacInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetJanaacInspectionBy_CI(caseId);
	}

	/**
	 * Returns the janaac inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaacInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaacInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the janaac inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac inspection that was removed
	 */
	public static JanaacInspection removeBygetJanaacInspectionBy_CI(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().removeBygetJanaacInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetJanaacInspectionBy_CI(String caseId) {
		return getPersistence().countBygetJanaacInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaac_AI(janaacApplicationId);
	}

	/**
	 * Returns a range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaac_AI(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findBygetJanaac_AI(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_AI(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_AI_First(
			long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_AI_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_AI_First(
		long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_AI_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_AI_Last(
			long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_AI_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_AI_Last(
		long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_AI_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection[] findBygetJanaac_AI_PrevAndNext(
			long janaacInspectionId, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_AI_PrevAndNext(
			janaacInspectionId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the janaac inspections where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaac_AI(long janaacApplicationId) {
		getPersistence().removeBygetJanaac_AI(janaacApplicationId);
	}

	/**
	 * Returns the number of janaac inspections where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetJanaac_AI(long janaacApplicationId) {
		return getPersistence().countBygetJanaac_AI(janaacApplicationId);
	}

	/**
	 * Returns all the janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId) {

		return getPersistence().findBygetjanaac_by_CaseId(caseId);
	}

	/**
	 * Returns a range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetjanaac_by_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findBygetjanaac_by_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetjanaac_by_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetjanaac_by_CaseId_First(
			String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetjanaac_by_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetjanaac_by_CaseId_First(
		String caseId, OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetjanaac_by_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetjanaac_by_CaseId_Last(
			String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetjanaac_by_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetjanaac_by_CaseId_Last(
		String caseId, OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetjanaac_by_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection[] findBygetjanaac_by_CaseId_PrevAndNext(
			long janaacInspectionId, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetjanaac_by_CaseId_PrevAndNext(
			janaacInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the janaac inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetjanaac_by_CaseId(String caseId) {
		getPersistence().removeBygetjanaac_by_CaseId(caseId);
	}

	/**
	 * Returns the number of janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetjanaac_by_CaseId(String caseId) {
		return getPersistence().countBygetjanaac_by_CaseId(caseId);
	}

	/**
	 * Returns all the janaac inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_Status(String status) {
		return getPersistence().findBygetJanaac_Status(status);
	}

	/**
	 * Returns a range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end) {

		return getPersistence().findBygetJanaac_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findBygetJanaac_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_Status_First(
			String status,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_Status_First(
		String status, OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_Status_Last(
			String status,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_Status_Last(
		String status, OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection[] findBygetJanaac_Status_PrevAndNext(
			long janaacInspectionId, String status,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_Status_PrevAndNext(
			janaacInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the janaac inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetJanaac_Status(String status) {
		getPersistence().removeBygetJanaac_Status(status);
	}

	/**
	 * Returns the number of janaac inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetJanaac_Status(String status) {
		return getPersistence().countBygetJanaac_Status(status);
	}

	/**
	 * Returns all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetJanaac_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetJanaac_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findBygetJanaac_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection[] findBygetJanaac_CaseIdStatus_PrevAndNext(
			long janaacInspectionId, String status, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_CaseIdStatus_PrevAndNext(
			janaacInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the janaac inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetJanaac_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetJanaac_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetJanaac_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().countBygetJanaac_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		return getPersistence().findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId);
	}

	/**
	 * Returns a range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public static List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_CaseIdApplicationId_First(
			String status, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_CaseIdApplicationId_First(
			status, janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_CaseIdApplicationId_First(
		String status, long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_CaseIdApplicationId_First(
			status, janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection findBygetJanaac_CaseIdApplicationId_Last(
			String status, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_CaseIdApplicationId_Last(
			status, janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection fetchBygetJanaac_CaseIdApplicationId_Last(
		String status, long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().fetchBygetJanaac_CaseIdApplicationId_Last(
			status, janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection[]
			findBygetJanaac_CaseIdApplicationId_PrevAndNext(
				long janaacInspectionId, String status,
				long janaacApplicationId,
				OrderByComparator<JanaacInspection> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findBygetJanaac_CaseIdApplicationId_PrevAndNext(
			janaacInspectionId, status, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the janaac inspections where status = &#63; and janaacApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		getPersistence().removeBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId);
	}

	/**
	 * Returns the number of janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		return getPersistence().countBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId);
	}

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public static JanaacInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long janaacApplicationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId);
	}

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long janaacApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId);
	}

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public static JanaacInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long janaacApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac inspection that was removed
	 */
	public static JanaacInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long janaacApplicationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId);
	}

	/**
	 * Returns the number of janaac inspections where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long janaacApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId);
	}

	/**
	 * Caches the janaac inspection in the entity cache if it is enabled.
	 *
	 * @param janaacInspection the janaac inspection
	 */
	public static void cacheResult(JanaacInspection janaacInspection) {
		getPersistence().cacheResult(janaacInspection);
	}

	/**
	 * Caches the janaac inspections in the entity cache if it is enabled.
	 *
	 * @param janaacInspections the janaac inspections
	 */
	public static void cacheResult(List<JanaacInspection> janaacInspections) {
		getPersistence().cacheResult(janaacInspections);
	}

	/**
	 * Creates a new janaac inspection with the primary key. Does not add the janaac inspection to the database.
	 *
	 * @param janaacInspectionId the primary key for the new janaac inspection
	 * @return the new janaac inspection
	 */
	public static JanaacInspection create(long janaacInspectionId) {
		return getPersistence().create(janaacInspectionId);
	}

	/**
	 * Removes the janaac inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection that was removed
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection remove(long janaacInspectionId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().remove(janaacInspectionId);
	}

	public static JanaacInspection updateImpl(
		JanaacInspection janaacInspection) {

		return getPersistence().updateImpl(janaacInspection);
	}

	/**
	 * Returns the janaac inspection with the primary key or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection findByPrimaryKey(long janaacInspectionId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getPersistence().findByPrimaryKey(janaacInspectionId);
	}

	/**
	 * Returns the janaac inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection, or <code>null</code> if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection fetchByPrimaryKey(long janaacInspectionId) {
		return getPersistence().fetchByPrimaryKey(janaacInspectionId);
	}

	/**
	 * Returns all the janaac inspections.
	 *
	 * @return the janaac inspections
	 */
	public static List<JanaacInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of janaac inspections
	 */
	public static List<JanaacInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac inspections
	 */
	public static List<JanaacInspection> findAll(
		int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac inspections
	 */
	public static List<JanaacInspection> findAll(
		int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac inspections.
	 *
	 * @return the number of janaac inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JanaacInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JanaacInspectionPersistence _persistence;

}