/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status license issuance service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusLicenseIssuancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuancePersistence
 * @generated
 */
public class SezStatusLicenseIssuanceUtil {

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
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		getPersistence().clearCache(sezStatusLicenseIssuance);
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
	public static Map<Serializable, SezStatusLicenseIssuance>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusLicenseIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusLicenseIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusLicenseIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusLicenseIssuance update(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return getPersistence().update(sezStatusLicenseIssuance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusLicenseIssuance update(
		SezStatusLicenseIssuance sezStatusLicenseIssuance,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusLicenseIssuance, serviceContext);
	}

	/**
	 * Returns all the sez status license issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sez status license issuances before and after the current sez status license issuance in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusLicIssuedId the primary key of the current sez status license issuance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance[] findByUuid_PrevAndNext(
			long sezStatusLicIssuedId, String uuid,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUuid_PrevAndNext(
			sezStatusLicIssuedId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sez status license issuances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sez status license issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status license issuances
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status license issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sez status license issuance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status license issuance that was removed
	 */
	public static SezStatusLicenseIssuance removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sez status license issuances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status license issuances
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sez status license issuances before and after the current sez status license issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusLicIssuedId the primary key of the current sez status license issuance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance[] findByUuid_C_PrevAndNext(
			long sezStatusLicIssuedId, String uuid, long companyId,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			sezStatusLicIssuedId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sez status license issuances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sez status license issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status license issuances
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the sez status license issuance where caseId = &#63; or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance
			findBygetSezStatus_License_Issuance_By_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findBygetSezStatus_License_Issuance_By_CI(
			caseId);
	}

	/**
	 * Returns the sez status license issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance
		fetchBygetSezStatus_License_Issuance_By_CI(String caseId) {

		return getPersistence().fetchBygetSezStatus_License_Issuance_By_CI(
			caseId);
	}

	/**
	 * Returns the sez status license issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance
		fetchBygetSezStatus_License_Issuance_By_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatus_License_Issuance_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the sez status license issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status license issuance that was removed
	 */
	public static SezStatusLicenseIssuance
			removeBygetSezStatus_License_Issuance_By_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().removeBygetSezStatus_License_Issuance_By_CI(
			caseId);
	}

	/**
	 * Returns the number of sez status license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status license issuances
	 */
	public static int countBygetSezStatus_License_Issuance_By_CI(
		String caseId) {

		return getPersistence().countBygetSezStatus_License_Issuance_By_CI(
			caseId);
	}

	/**
	 * Caches the sez status license issuance in the entity cache if it is enabled.
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 */
	public static void cacheResult(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		getPersistence().cacheResult(sezStatusLicenseIssuance);
	}

	/**
	 * Caches the sez status license issuances in the entity cache if it is enabled.
	 *
	 * @param sezStatusLicenseIssuances the sez status license issuances
	 */
	public static void cacheResult(
		List<SezStatusLicenseIssuance> sezStatusLicenseIssuances) {

		getPersistence().cacheResult(sezStatusLicenseIssuances);
	}

	/**
	 * Creates a new sez status license issuance with the primary key. Does not add the sez status license issuance to the database.
	 *
	 * @param sezStatusLicIssuedId the primary key for the new sez status license issuance
	 * @return the new sez status license issuance
	 */
	public static SezStatusLicenseIssuance create(long sezStatusLicIssuedId) {
		return getPersistence().create(sezStatusLicIssuedId);
	}

	/**
	 * Removes the sez status license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance that was removed
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance remove(long sezStatusLicIssuedId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().remove(sezStatusLicIssuedId);
	}

	public static SezStatusLicenseIssuance updateImpl(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return getPersistence().updateImpl(sezStatusLicenseIssuance);
	}

	/**
	 * Returns the sez status license issuance with the primary key or throws a <code>NoSuchSezStatusLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance
	 * @throws NoSuchSezStatusLicenseIssuanceException if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance findByPrimaryKey(
			long sezStatusLicIssuedId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getPersistence().findByPrimaryKey(sezStatusLicIssuedId);
	}

	/**
	 * Returns the sez status license issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance, or <code>null</code> if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance fetchByPrimaryKey(
		long sezStatusLicIssuedId) {

		return getPersistence().fetchByPrimaryKey(sezStatusLicIssuedId);
	}

	/**
	 * Returns all the sez status license issuances.
	 *
	 * @return the sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<SezStatusLicenseIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status license issuances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status license issuances.
	 *
	 * @return the number of sez status license issuances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusLicenseIssuancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusLicenseIssuancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusLicenseIssuancePersistence _persistence;

}