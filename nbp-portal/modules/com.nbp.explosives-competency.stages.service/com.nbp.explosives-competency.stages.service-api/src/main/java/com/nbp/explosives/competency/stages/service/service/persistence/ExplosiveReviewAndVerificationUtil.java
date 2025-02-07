/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosive review and verification service. This utility wraps <code>com.nbp.explosives.competency.stages.service.service.persistence.impl.ExplosiveReviewAndVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerificationPersistence
 * @generated
 */
public class ExplosiveReviewAndVerificationUtil {

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
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		getPersistence().clearCache(explosiveReviewAndVerification);
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
	public static Map<Serializable, ExplosiveReviewAndVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosiveReviewAndVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosiveReviewAndVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosiveReviewAndVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosiveReviewAndVerification update(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return getPersistence().update(explosiveReviewAndVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosiveReviewAndVerification update(
		ExplosiveReviewAndVerification explosiveReviewAndVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			explosiveReviewAndVerification, serviceContext);
	}

	/**
	 * Returns all the explosive review and verifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification[] findByUuid_PrevAndNext(
			long issuanceId, String uuid,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUuid_PrevAndNext(
			issuanceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the explosive review and verifications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive review and verifications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the explosive review and verification where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive review and verification that was removed
	 */
	public static ExplosiveReviewAndVerification removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive review and verifications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification[] findByUuid_C_PrevAndNext(
			long issuanceId, String uuid, long companyId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			issuanceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the explosive review and verifications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive review and verifications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the explosive review and verification where caseId = &#63; or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findBygetEXP_RV_CI(
			String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findBygetEXP_RV_CI(caseId);
	}

	/**
	 * Returns the explosive review and verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchBygetEXP_RV_CI(
		String caseId) {

		return getPersistence().fetchBygetEXP_RV_CI(caseId);
	}

	/**
	 * Returns the explosive review and verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchBygetEXP_RV_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_RV_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the explosive review and verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive review and verification that was removed
	 */
	public static ExplosiveReviewAndVerification removeBygetEXP_RV_CI(
			String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().removeBygetEXP_RV_CI(caseId);
	}

	/**
	 * Returns the number of explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive review and verifications
	 */
	public static int countBygetEXP_RV_CI(String caseId) {
		return getPersistence().countBygetEXP_RV_CI(caseId);
	}

	/**
	 * Returns all the explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId) {

		return getPersistence().findBygetEXP_RV_List_CI(caseId);
	}

	/**
	 * Returns a range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetEXP_RV_List_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().findBygetEXP_RV_List_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findBygetEXP_RV_List_CI(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetEXP_RV_List_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findBygetEXP_RV_List_CI_First(
			String caseId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findBygetEXP_RV_List_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchBygetEXP_RV_List_CI_First(
		String caseId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().fetchBygetEXP_RV_List_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification findBygetEXP_RV_List_CI_Last(
			String caseId,
			OrderByComparator<ExplosiveReviewAndVerification> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findBygetEXP_RV_List_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification fetchBygetEXP_RV_List_CI_Last(
		String caseId,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().fetchBygetEXP_RV_List_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification[]
			findBygetEXP_RV_List_CI_PrevAndNext(
				long issuanceId, String caseId,
				OrderByComparator<ExplosiveReviewAndVerification>
					orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findBygetEXP_RV_List_CI_PrevAndNext(
			issuanceId, caseId, orderByComparator);
	}

	/**
	 * Removes all the explosive review and verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetEXP_RV_List_CI(String caseId) {
		getPersistence().removeBygetEXP_RV_List_CI(caseId);
	}

	/**
	 * Returns the number of explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive review and verifications
	 */
	public static int countBygetEXP_RV_List_CI(String caseId) {
		return getPersistence().countBygetEXP_RV_List_CI(caseId);
	}

	/**
	 * Caches the explosive review and verification in the entity cache if it is enabled.
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 */
	public static void cacheResult(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		getPersistence().cacheResult(explosiveReviewAndVerification);
	}

	/**
	 * Caches the explosive review and verifications in the entity cache if it is enabled.
	 *
	 * @param explosiveReviewAndVerifications the explosive review and verifications
	 */
	public static void cacheResult(
		List<ExplosiveReviewAndVerification> explosiveReviewAndVerifications) {

		getPersistence().cacheResult(explosiveReviewAndVerifications);
	}

	/**
	 * Creates a new explosive review and verification with the primary key. Does not add the explosive review and verification to the database.
	 *
	 * @param issuanceId the primary key for the new explosive review and verification
	 * @return the new explosive review and verification
	 */
	public static ExplosiveReviewAndVerification create(long issuanceId) {
		return getPersistence().create(issuanceId);
	}

	/**
	 * Removes the explosive review and verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification that was removed
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification remove(long issuanceId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().remove(issuanceId);
	}

	public static ExplosiveReviewAndVerification updateImpl(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return getPersistence().updateImpl(explosiveReviewAndVerification);
	}

	/**
	 * Returns the explosive review and verification with the primary key or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification findByPrimaryKey(
			long issuanceId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getPersistence().findByPrimaryKey(issuanceId);
	}

	/**
	 * Returns the explosive review and verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification, or <code>null</code> if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification fetchByPrimaryKey(
		long issuanceId) {

		return getPersistence().fetchByPrimaryKey(issuanceId);
	}

	/**
	 * Returns all the explosive review and verifications.
	 *
	 * @return the explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findAll(
		int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification> findAll(
		int start, int end,
		OrderByComparator<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosive review and verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosive review and verifications.
	 *
	 * @return the number of explosive review and verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosiveReviewAndVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosiveReviewAndVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosiveReviewAndVerificationPersistence
		_persistence;

}