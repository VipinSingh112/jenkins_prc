/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc checklist add service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCChecklistAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAddPersistence
 * @generated
 */
public class JADSCChecklistAddUtil {

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
	public static void clearCache(JADSCChecklistAdd jadscChecklistAdd) {
		getPersistence().clearCache(jadscChecklistAdd);
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
	public static Map<Serializable, JADSCChecklistAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCChecklistAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCChecklistAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCChecklistAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCChecklistAdd update(
		JADSCChecklistAdd jadscChecklistAdd) {

		return getPersistence().update(jadscChecklistAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCChecklistAdd update(
		JADSCChecklistAdd jadscChecklistAdd, ServiceContext serviceContext) {

		return getPersistence().update(jadscChecklistAdd, serviceContext);
	}

	/**
	 * Returns all the jadsc checklist adds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findByUuid_First(
			String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchByUuid_First(
		String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findByUuid_Last(
			String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd[] findByUuid_PrevAndNext(
			long jADSCChecklistAddId, String uuid,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUuid_PrevAndNext(
			jADSCChecklistAddId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklist adds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc checklist adds
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCChecklistAddException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc checklist add where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc checklist add that was removed
	 */
	public static JADSCChecklistAdd removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc checklist adds
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd[] findByUuid_C_PrevAndNext(
			long jADSCChecklistAddId, String uuid, long companyId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jADSCChecklistAddId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklist adds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc checklist adds
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end) {

		return getPersistence().findBygetJADSCById(
			jadscApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().findBygetJADSCById(
			jadscApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJADSCById(
			jadscApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findBygetJADSCById_First(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findBygetJADSCById_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchBygetJADSCById_First(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchBygetJADSCById_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findBygetJADSCById_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findBygetJADSCById_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchBygetJADSCById_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchBygetJADSCById_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd[] findBygetJADSCById_PrevAndNext(
			long jADSCChecklistAddId, long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findBygetJADSCById_PrevAndNext(
			jADSCChecklistAddId, jadscApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklist adds where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public static void removeBygetJADSCById(long jadscApplicationId) {
		getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklist adds
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId) {

		return getPersistence().findBygetAppIdJADSC(jadscApplicationId);
	}

	/**
	 * Returns a range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end) {

		return getPersistence().findBygetAppIdJADSC(
			jadscApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().findBygetAppIdJADSC(
			jadscApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAppIdJADSC(
			jadscApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findBygetAppIdJADSC_First(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findBygetAppIdJADSC_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchBygetAppIdJADSC_First(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchBygetAppIdJADSC_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd findBygetAppIdJADSC_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findBygetAppIdJADSC_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchBygetAppIdJADSC_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().fetchBygetAppIdJADSC_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd[] findBygetAppIdJADSC_PrevAndNext(
			long jADSCChecklistAddId, long jadscApplicationId,
			OrderByComparator<JADSCChecklistAdd> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findBygetAppIdJADSC_PrevAndNext(
			jADSCChecklistAddId, jadscApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jadsc checklist adds where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public static void removeBygetAppIdJADSC(long jadscApplicationId) {
		getPersistence().removeBygetAppIdJADSC(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklist adds
	 */
	public static int countBygetAppIdJADSC(long jadscApplicationId) {
		return getPersistence().countBygetAppIdJADSC(jadscApplicationId);
	}

	/**
	 * Caches the jadsc checklist add in the entity cache if it is enabled.
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 */
	public static void cacheResult(JADSCChecklistAdd jadscChecklistAdd) {
		getPersistence().cacheResult(jadscChecklistAdd);
	}

	/**
	 * Caches the jadsc checklist adds in the entity cache if it is enabled.
	 *
	 * @param jadscChecklistAdds the jadsc checklist adds
	 */
	public static void cacheResult(List<JADSCChecklistAdd> jadscChecklistAdds) {
		getPersistence().cacheResult(jadscChecklistAdds);
	}

	/**
	 * Creates a new jadsc checklist add with the primary key. Does not add the jadsc checklist add to the database.
	 *
	 * @param jADSCChecklistAddId the primary key for the new jadsc checklist add
	 * @return the new jadsc checklist add
	 */
	public static JADSCChecklistAdd create(long jADSCChecklistAddId) {
		return getPersistence().create(jADSCChecklistAddId);
	}

	/**
	 * Removes the jadsc checklist add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd remove(long jADSCChecklistAddId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().remove(jADSCChecklistAddId);
	}

	public static JADSCChecklistAdd updateImpl(
		JADSCChecklistAdd jadscChecklistAdd) {

		return getPersistence().updateImpl(jadscChecklistAdd);
	}

	/**
	 * Returns the jadsc checklist add with the primary key or throws a <code>NoSuchJADSCChecklistAddException</code> if it could not be found.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd findByPrimaryKey(long jADSCChecklistAddId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getPersistence().findByPrimaryKey(jADSCChecklistAddId);
	}

	/**
	 * Returns the jadsc checklist add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add, or <code>null</code> if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd fetchByPrimaryKey(
		long jADSCChecklistAddId) {

		return getPersistence().fetchByPrimaryKey(jADSCChecklistAddId);
	}

	/**
	 * Returns all the jadsc checklist adds.
	 *
	 * @return the jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findAll(
		int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> findAll(
		int start, int end,
		OrderByComparator<JADSCChecklistAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc checklist adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc checklist adds.
	 *
	 * @return the number of jadsc checklist adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCChecklistAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCChecklistAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCChecklistAddPersistence _persistence;

}