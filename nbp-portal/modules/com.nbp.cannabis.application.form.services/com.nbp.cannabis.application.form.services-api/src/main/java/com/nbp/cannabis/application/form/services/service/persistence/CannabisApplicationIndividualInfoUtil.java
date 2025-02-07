/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application individual info service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationIndividualInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfoPersistence
 * @generated
 */
public class CannabisApplicationIndividualInfoUtil {

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
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo) {

		getPersistence().clearCache(cannabisApplicationIndividualInfo);
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
	public static Map<Serializable, CannabisApplicationIndividualInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationIndividualInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationIndividualInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationIndividualInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationIndividualInfo update(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo) {

		return getPersistence().update(cannabisApplicationIndividualInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationIndividualInfo update(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationIndividualInfo, serviceContext);
	}

	/**
	 * Returns all the cannabis application individual infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis application individual infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis application individual infos before and after the current cannabis application individual info in the ordered set where uuid = &#63;.
	 *
	 * @param individualInformationId the primary key of the current cannabis application individual info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo[] findByUuid_PrevAndNext(
			long individualInformationId, String uuid,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUuid_PrevAndNext(
			individualInformationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis application individual infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis application individual infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application individual infos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis application individual info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application individual info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application individual info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis application individual info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application individual info that was removed
	 */
	public static CannabisApplicationIndividualInfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis application individual infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application individual infos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis application individual infos before and after the current cannabis application individual info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param individualInformationId the primary key of the current cannabis application individual info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo[] findByUuid_C_PrevAndNext(
			long individualInformationId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualInfo>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			individualInformationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application individual infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis application individual infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application individual infos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the cannabis application individual info where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findBygetIA_CI_by_AppNo(
			String applicationNumber)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findBygetIA_CI_by_AppNo(applicationNumber);
	}

	/**
	 * Returns the cannabis application individual info where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchBygetIA_CI_by_AppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetIA_CI_by_AppNo(applicationNumber);
	}

	/**
	 * Returns the cannabis application individual info where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchBygetIA_CI_by_AppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetIA_CI_by_AppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the cannabis application individual info where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis application individual info that was removed
	 */
	public static CannabisApplicationIndividualInfo removeBygetIA_CI_by_AppNo(
			String applicationNumber)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().removeBygetIA_CI_by_AppNo(applicationNumber);
	}

	/**
	 * Returns the number of cannabis application individual infos where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis application individual infos
	 */
	public static int countBygetIA_CI_by_AppNo(String applicationNumber) {
		return getPersistence().countBygetIA_CI_by_AppNo(applicationNumber);
	}

	/**
	 * Returns the cannabis application individual info where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo findBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findBygetCA_CI_by_AppId(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application individual info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCA_CI_by_AppId(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application individual info where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual info, or <code>null</code> if a matching cannabis application individual info could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchBygetCA_CI_by_AppId(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCA_CI_by_AppId(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application individual info where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application individual info that was removed
	 */
	public static CannabisApplicationIndividualInfo removeBygetCA_CI_by_AppId(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().removeBygetCA_CI_by_AppId(
			cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application individual infos where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application individual infos
	 */
	public static int countBygetCA_CI_by_AppId(long cannabisApplicationId) {
		return getPersistence().countBygetCA_CI_by_AppId(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis application individual info in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualInfo the cannabis application individual info
	 */
	public static void cacheResult(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo) {

		getPersistence().cacheResult(cannabisApplicationIndividualInfo);
	}

	/**
	 * Caches the cannabis application individual infos in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualInfos the cannabis application individual infos
	 */
	public static void cacheResult(
		List<CannabisApplicationIndividualInfo>
			cannabisApplicationIndividualInfos) {

		getPersistence().cacheResult(cannabisApplicationIndividualInfos);
	}

	/**
	 * Creates a new cannabis application individual info with the primary key. Does not add the cannabis application individual info to the database.
	 *
	 * @param individualInformationId the primary key for the new cannabis application individual info
	 * @return the new cannabis application individual info
	 */
	public static CannabisApplicationIndividualInfo create(
		long individualInformationId) {

		return getPersistence().create(individualInformationId);
	}

	/**
	 * Removes the cannabis application individual info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info that was removed
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo remove(
			long individualInformationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().remove(individualInformationId);
	}

	public static CannabisApplicationIndividualInfo updateImpl(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo) {

		return getPersistence().updateImpl(cannabisApplicationIndividualInfo);
	}

	/**
	 * Returns the cannabis application individual info with the primary key or throws a <code>NoSuchCannabisApplicationIndividualInfoException</code> if it could not be found.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info
	 * @throws NoSuchCannabisApplicationIndividualInfoException if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo findByPrimaryKey(
			long individualInformationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualInfoException {

		return getPersistence().findByPrimaryKey(individualInformationId);
	}

	/**
	 * Returns the cannabis application individual info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param individualInformationId the primary key of the cannabis application individual info
	 * @return the cannabis application individual info, or <code>null</code> if a cannabis application individual info with the primary key could not be found
	 */
	public static CannabisApplicationIndividualInfo fetchByPrimaryKey(
		long individualInformationId) {

		return getPersistence().fetchByPrimaryKey(individualInformationId);
	}

	/**
	 * Returns all the cannabis application individual infos.
	 *
	 * @return the cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @return the range of cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual infos
	 * @param end the upper bound of the range of cannabis application individual infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application individual infos
	 */
	public static List<CannabisApplicationIndividualInfo> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationIndividualInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application individual infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application individual infos.
	 *
	 * @return the number of cannabis application individual infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationIndividualInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationIndividualInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationIndividualInfoPersistence
		_persistence;

}