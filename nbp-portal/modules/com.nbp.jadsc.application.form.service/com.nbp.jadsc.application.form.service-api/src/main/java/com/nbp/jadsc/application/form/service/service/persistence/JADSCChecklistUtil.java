/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCChecklist;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc checklist service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCChecklistPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistPersistence
 * @generated
 */
public class JADSCChecklistUtil {

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
	public static void clearCache(JADSCChecklist jadscChecklist) {
		getPersistence().clearCache(jadscChecklist);
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
	public static Map<Serializable, JADSCChecklist> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCChecklist> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCChecklist> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCChecklist> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCChecklist update(JADSCChecklist jadscChecklist) {
		return getPersistence().update(jadscChecklist);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCChecklist update(
		JADSCChecklist jadscChecklist, ServiceContext serviceContext) {

		return getPersistence().update(jadscChecklist, serviceContext);
	}

	/**
	 * Returns all the jadsc checklists where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc checklists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByUuid_First(
			String uuid, OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByUuid_First(
		String uuid, OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByUuid_Last(
			String uuid, OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc checklists before and after the current jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param jadscChecklistId the primary key of the current jadsc checklist
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist[] findByUuid_PrevAndNext(
			long jadscChecklistId, String uuid,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscChecklistId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklists where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc checklists where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc checklists
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc checklist where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCChecklistException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc checklist where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc checklist where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc checklist where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc checklist that was removed
	 */
	public static JADSCChecklist removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc checklists where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc checklists
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc checklists before and after the current jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscChecklistId the primary key of the current jadsc checklist
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist[] findByUuid_C_PrevAndNext(
			long jadscChecklistId, String uuid, long companyId,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscChecklistId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklists where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc checklists
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId) {

		return getPersistence().findByJADSC_ByAppId(jadscApplicationId);
	}

	/**
	 * Returns a range of all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId, int start, int end) {

		return getPersistence().findByJADSC_ByAppId(
			jadscApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().findByJADSC_ByAppId(
			jadscApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklists
	 */
	public static List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByJADSC_ByAppId(
			jadscApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByJADSC_ByAppId_First(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByJADSC_ByAppId_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByJADSC_ByAppId_First(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().fetchByJADSC_ByAppId_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist findByJADSC_ByAppId_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByJADSC_ByAppId_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchByJADSC_ByAppId_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().fetchByJADSC_ByAppId_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the jadsc checklists before and after the current jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscChecklistId the primary key of the current jadsc checklist
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist[] findByJADSC_ByAppId_PrevAndNext(
			long jadscChecklistId, long jadscApplicationId,
			OrderByComparator<JADSCChecklist> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByJADSC_ByAppId_PrevAndNext(
			jadscChecklistId, jadscApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklists where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public static void removeByJADSC_ByAppId(long jadscApplicationId) {
		getPersistence().removeByJADSC_ByAppId(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklists
	 */
	public static int countByJADSC_ByAppId(long jadscApplicationId) {
		return getPersistence().countByJADSC_ByAppId(jadscApplicationId);
	}

	/**
	 * Caches the jadsc checklist in the entity cache if it is enabled.
	 *
	 * @param jadscChecklist the jadsc checklist
	 */
	public static void cacheResult(JADSCChecklist jadscChecklist) {
		getPersistence().cacheResult(jadscChecklist);
	}

	/**
	 * Caches the jadsc checklists in the entity cache if it is enabled.
	 *
	 * @param jadscChecklists the jadsc checklists
	 */
	public static void cacheResult(List<JADSCChecklist> jadscChecklists) {
		getPersistence().cacheResult(jadscChecklists);
	}

	/**
	 * Creates a new jadsc checklist with the primary key. Does not add the jadsc checklist to the database.
	 *
	 * @param jadscChecklistId the primary key for the new jadsc checklist
	 * @return the new jadsc checklist
	 */
	public static JADSCChecklist create(long jadscChecklistId) {
		return getPersistence().create(jadscChecklistId);
	}

	/**
	 * Removes the jadsc checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist that was removed
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist remove(long jadscChecklistId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().remove(jadscChecklistId);
	}

	public static JADSCChecklist updateImpl(JADSCChecklist jadscChecklist) {
		return getPersistence().updateImpl(jadscChecklist);
	}

	/**
	 * Returns the jadsc checklist with the primary key or throws a <code>NoSuchJADSCChecklistException</code> if it could not be found.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist findByPrimaryKey(long jadscChecklistId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistException {

		return getPersistence().findByPrimaryKey(jadscChecklistId);
	}

	/**
	 * Returns the jadsc checklist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist, or <code>null</code> if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist fetchByPrimaryKey(long jadscChecklistId) {
		return getPersistence().fetchByPrimaryKey(jadscChecklistId);
	}

	/**
	 * Returns all the jadsc checklists.
	 *
	 * @return the jadsc checklists
	 */
	public static List<JADSCChecklist> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of jadsc checklists
	 */
	public static List<JADSCChecklist> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc checklists
	 */
	public static List<JADSCChecklist> findAll(
		int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc checklists
	 */
	public static List<JADSCChecklist> findAll(
		int start, int end, OrderByComparator<JADSCChecklist> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc checklists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc checklists.
	 *
	 * @return the number of jadsc checklists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCChecklistPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JADSCChecklistPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JADSCChecklistPersistence _persistence;

}