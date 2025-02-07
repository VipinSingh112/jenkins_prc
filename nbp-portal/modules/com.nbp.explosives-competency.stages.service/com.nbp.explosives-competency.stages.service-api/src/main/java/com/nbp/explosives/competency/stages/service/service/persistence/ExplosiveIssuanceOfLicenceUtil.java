/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosive issuance of licence service. This utility wraps <code>com.nbp.explosives.competency.stages.service.service.persistence.impl.ExplosiveIssuanceOfLicencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicencePersistence
 * @generated
 */
public class ExplosiveIssuanceOfLicenceUtil {

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
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		getPersistence().clearCache(explosiveIssuanceOfLicence);
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
	public static Map<Serializable, ExplosiveIssuanceOfLicence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosiveIssuanceOfLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosiveIssuanceOfLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosiveIssuanceOfLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosiveIssuanceOfLicence update(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return getPersistence().update(explosiveIssuanceOfLicence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosiveIssuanceOfLicence update(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			explosiveIssuanceOfLicence, serviceContext);
	}

	/**
	 * Returns all the explosive issuance of licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence[] findByUuid_PrevAndNext(
			long issuanceId, String uuid,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUuid_PrevAndNext(
			issuanceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the explosive issuance of licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive issuance of licences
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the explosive issuance of licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive issuance of licence that was removed
	 */
	public static ExplosiveIssuanceOfLicence removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive issuance of licences
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence[] findByUuid_C_PrevAndNext(
			long issuanceId, String uuid, long companyId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			issuanceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the explosive issuance of licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive issuance of licences
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findBygetEXP_CD_CI(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchBygetEXP_CD_CI(
		String caseId) {

		return getPersistence().fetchBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchBygetEXP_CD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_CD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the explosive issuance of licence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive issuance of licence that was removed
	 */
	public static ExplosiveIssuanceOfLicence removeBygetEXP_CD_CI(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().removeBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns the number of explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive issuance of licences
	 */
	public static int countBygetEXP_CD_CI(String caseId) {
		return getPersistence().countBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns all the explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId) {

		return getPersistence().findBygetEXP_CD_List_CI(caseId);
	}

	/**
	 * Returns a range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetEXP_CD_List_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().findBygetEXP_CD_List_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetEXP_CD_List_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findBygetEXP_CD_List_CI_First(
			String caseId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findBygetEXP_CD_List_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchBygetEXP_CD_List_CI_First(
		String caseId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().fetchBygetEXP_CD_List_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence findBygetEXP_CD_List_CI_Last(
			String caseId,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findBygetEXP_CD_List_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchBygetEXP_CD_List_CI_Last(
		String caseId,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().fetchBygetEXP_CD_List_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence[]
			findBygetEXP_CD_List_CI_PrevAndNext(
				long issuanceId, String caseId,
				OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findBygetEXP_CD_List_CI_PrevAndNext(
			issuanceId, caseId, orderByComparator);
	}

	/**
	 * Removes all the explosive issuance of licences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetEXP_CD_List_CI(String caseId) {
		getPersistence().removeBygetEXP_CD_List_CI(caseId);
	}

	/**
	 * Returns the number of explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive issuance of licences
	 */
	public static int countBygetEXP_CD_List_CI(String caseId) {
		return getPersistence().countBygetEXP_CD_List_CI(caseId);
	}

	/**
	 * Caches the explosive issuance of licence in the entity cache if it is enabled.
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 */
	public static void cacheResult(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		getPersistence().cacheResult(explosiveIssuanceOfLicence);
	}

	/**
	 * Caches the explosive issuance of licences in the entity cache if it is enabled.
	 *
	 * @param explosiveIssuanceOfLicences the explosive issuance of licences
	 */
	public static void cacheResult(
		List<ExplosiveIssuanceOfLicence> explosiveIssuanceOfLicences) {

		getPersistence().cacheResult(explosiveIssuanceOfLicences);
	}

	/**
	 * Creates a new explosive issuance of licence with the primary key. Does not add the explosive issuance of licence to the database.
	 *
	 * @param issuanceId the primary key for the new explosive issuance of licence
	 * @return the new explosive issuance of licence
	 */
	public static ExplosiveIssuanceOfLicence create(long issuanceId) {
		return getPersistence().create(issuanceId);
	}

	/**
	 * Removes the explosive issuance of licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence remove(long issuanceId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().remove(issuanceId);
	}

	public static ExplosiveIssuanceOfLicence updateImpl(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return getPersistence().updateImpl(explosiveIssuanceOfLicence);
	}

	/**
	 * Returns the explosive issuance of licence with the primary key or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence findByPrimaryKey(long issuanceId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getPersistence().findByPrimaryKey(issuanceId);
	}

	/**
	 * Returns the explosive issuance of licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence, or <code>null</code> if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence fetchByPrimaryKey(
		long issuanceId) {

		return getPersistence().fetchByPrimaryKey(issuanceId);
	}

	/**
	 * Returns all the explosive issuance of licences.
	 *
	 * @return the explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end,
		OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosive issuance of licences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosive issuance of licences.
	 *
	 * @return the number of explosive issuance of licences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosiveIssuanceOfLicencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosiveIssuanceOfLicencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosiveIssuanceOfLicencePersistence _persistence;

}