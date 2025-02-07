/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb inspection service. This utility wraps <code>com.nbp.jtb.application.stage.services.service.persistence.impl.JtbInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbInspectionPersistence
 * @generated
 */
public class JtbInspectionUtil {

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
	public static void clearCache(JtbInspection jtbInspection) {
		getPersistence().clearCache(jtbInspection);
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
	public static Map<Serializable, JtbInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbInspection update(JtbInspection jtbInspection) {
		return getPersistence().update(jtbInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbInspection update(
		JtbInspection jtbInspection, ServiceContext serviceContext) {

		return getPersistence().update(jtbInspection, serviceContext);
	}

	/**
	 * Returns the jtb inspection where caseId = &#63; or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtbyInspecBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtbyInspecBy_CI(caseId);
	}

	/**
	 * Returns the jtb inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtbyInspecBy_CI(String caseId) {
		return getPersistence().fetchBygetJtbyInspecBy_CI(caseId);
	}

	/**
	 * Returns the jtb inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtbyInspecBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJtbyInspecBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the jtb inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb inspection that was removed
	 */
	public static JtbInspection removeBygetJtbyInspecBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().removeBygetJtbyInspecBy_CI(caseId);
	}

	/**
	 * Returns the number of jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtbyInspecBy_CI(String caseId) {
		return getPersistence().countBygetJtbyInspecBy_CI(caseId);
	}

	/**
	 * Returns all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_FBAI(long jtbApplicationId) {
		return getPersistence().findBygetJtb_FBAI(jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetJtb_FBAI(jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findBygetJtb_FBAI(
			jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_FBAI(
			jtbApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_FBAI_First(
			long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_FBAI_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_FBAI_First(
		long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_FBAI_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_FBAI_Last(
			long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_FBAI_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_FBAI_Last(
		long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_FBAI_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection[] findBygetJtb_FBAI_PrevAndNext(
			long jtbInspectionId, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_FBAI_PrevAndNext(
			jtbInspectionId, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb inspections where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetJtb_FBAI(long jtbApplicationId) {
		getPersistence().removeBygetJtb_FBAI(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb inspections where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtb_FBAI(long jtbApplicationId) {
		return getPersistence().countBygetJtb_FBAI(jtbApplicationId);
	}

	/**
	 * Returns all the jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseId(String caseId) {
		return getPersistence().findBygetJtb_CaseId(caseId);
	}

	/**
	 * Returns a range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetJtb_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findBygetJtb_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_CaseId_First(
			String caseId, OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_CaseId_First(
		String caseId, OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_CaseId_Last(
			String caseId, OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_CaseId_Last(
		String caseId, OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection[] findBygetJtb_CaseId_PrevAndNext(
			long jtbInspectionId, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CaseId_PrevAndNext(
			jtbInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the jtb inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJtb_CaseId(String caseId) {
		getPersistence().removeBygetJtb_CaseId(caseId);
	}

	/**
	 * Returns the number of jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtb_CaseId(String caseId) {
		return getPersistence().countBygetJtb_CaseId(caseId);
	}

	/**
	 * Returns all the jtb inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_Status(String status) {
		return getPersistence().findBygetJtb_Status(status);
	}

	/**
	 * Returns a range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end) {

		return getPersistence().findBygetJtb_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findBygetJtb_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_Status_First(
			String status, OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_Status_First(
		String status, OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_Status_Last(
			String status, OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_Status_Last(
		String status, OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection[] findBygetJtb_Status_PrevAndNext(
			long jtbInspectionId, String status,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_Status_PrevAndNext(
			jtbInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the jtb inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetJtb_Status(String status) {
		getPersistence().removeBygetJtb_Status(status);
	}

	/**
	 * Returns the number of jtb inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtb_Status(String status) {
		return getPersistence().countBygetJtb_Status(status);
	}

	/**
	 * Returns all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetJtb_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetJtb_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findBygetJtb_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection[] findBygetJtb_CaseIdStatus_PrevAndNext(
			long jtbInspectionId, String status, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CaseIdStatus_PrevAndNext(
			jtbInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the jtb inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetJtb_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetJtb_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtb_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetJtb_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId) {

		return getPersistence().findBygetJtb_CIAppId(status, jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetJtb_CIAppId(
			status, jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findBygetJtb_CIAppId(
			status, jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public static List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_CIAppId(
			status, jtbApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_CIAppId_First(
			String status, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CIAppId_First(
			status, jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_CIAppId_First(
		String status, long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_CIAppId_First(
			status, jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtb_CIAppId_Last(
			String status, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CIAppId_Last(
			status, jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtb_CIAppId_Last(
		String status, long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().fetchBygetJtb_CIAppId_Last(
			status, jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection[] findBygetJtb_CIAppId_PrevAndNext(
			long jtbInspectionId, String status, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtb_CIAppId_PrevAndNext(
			jtbInspectionId, status, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb inspections where status = &#63; and jtbApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetJtb_CIAppId(
		String status, long jtbApplicationId) {

		getPersistence().removeBygetJtb_CIAppId(status, jtbApplicationId);
	}

	/**
	 * Returns the number of jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtb_CIAppId(
		String status, long jtbApplicationId) {

		return getPersistence().countBygetJtb_CIAppId(status, jtbApplicationId);
	}

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public static JtbInspection findBygetJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);
	}

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId) {

		return getPersistence().fetchBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);
	}

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public static JtbInspection fetchBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb inspection that was removed
	 */
	public static JtbInspection removeBygetJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().removeBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);
	}

	/**
	 * Returns the number of jtb inspections where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	public static int countBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId) {

		return getPersistence().countBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);
	}

	/**
	 * Caches the jtb inspection in the entity cache if it is enabled.
	 *
	 * @param jtbInspection the jtb inspection
	 */
	public static void cacheResult(JtbInspection jtbInspection) {
		getPersistence().cacheResult(jtbInspection);
	}

	/**
	 * Caches the jtb inspections in the entity cache if it is enabled.
	 *
	 * @param jtbInspections the jtb inspections
	 */
	public static void cacheResult(List<JtbInspection> jtbInspections) {
		getPersistence().cacheResult(jtbInspections);
	}

	/**
	 * Creates a new jtb inspection with the primary key. Does not add the jtb inspection to the database.
	 *
	 * @param jtbInspectionId the primary key for the new jtb inspection
	 * @return the new jtb inspection
	 */
	public static JtbInspection create(long jtbInspectionId) {
		return getPersistence().create(jtbInspectionId);
	}

	/**
	 * Removes the jtb inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection that was removed
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection remove(long jtbInspectionId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().remove(jtbInspectionId);
	}

	public static JtbInspection updateImpl(JtbInspection jtbInspection) {
		return getPersistence().updateImpl(jtbInspection);
	}

	/**
	 * Returns the jtb inspection with the primary key or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection findByPrimaryKey(long jtbInspectionId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getPersistence().findByPrimaryKey(jtbInspectionId);
	}

	/**
	 * Returns the jtb inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection, or <code>null</code> if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection fetchByPrimaryKey(long jtbInspectionId) {
		return getPersistence().fetchByPrimaryKey(jtbInspectionId);
	}

	/**
	 * Returns all the jtb inspections.
	 *
	 * @return the jtb inspections
	 */
	public static List<JtbInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of jtb inspections
	 */
	public static List<JtbInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb inspections
	 */
	public static List<JtbInspection> findAll(
		int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb inspections
	 */
	public static List<JtbInspection> findAll(
		int start, int end, OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb inspections.
	 *
	 * @return the number of jtb inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JtbInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JtbInspectionPersistence _persistence;

}