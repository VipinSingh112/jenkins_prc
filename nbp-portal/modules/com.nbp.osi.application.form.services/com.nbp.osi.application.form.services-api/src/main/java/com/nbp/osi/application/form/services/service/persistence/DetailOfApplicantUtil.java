/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.DetailOfApplicant;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the detail of applicant service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.DetailOfApplicantPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantPersistence
 * @generated
 */
public class DetailOfApplicantUtil {

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
	public static void clearCache(DetailOfApplicant detailOfApplicant) {
		getPersistence().clearCache(detailOfApplicant);
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
	public static Map<Serializable, DetailOfApplicant> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DetailOfApplicant> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DetailOfApplicant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DetailOfApplicant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DetailOfApplicant update(
		DetailOfApplicant detailOfApplicant) {

		return getPersistence().update(detailOfApplicant);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DetailOfApplicant update(
		DetailOfApplicant detailOfApplicant, ServiceContext serviceContext) {

		return getPersistence().update(detailOfApplicant, serviceContext);
	}

	/**
	 * Returns all the detail of applicants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant findByUuid_First(
			String uuid, OrderByComparator<DetailOfApplicant> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchByUuid_First(
		String uuid, OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant findByUuid_Last(
			String uuid, OrderByComparator<DetailOfApplicant> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchByUuid_Last(
		String uuid, OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the detail of applicants before and after the current detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param detailOfApplicantId the primary key of the current detail of applicant
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant[] findByUuid_PrevAndNext(
			long detailOfApplicantId, String uuid,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUuid_PrevAndNext(
			detailOfApplicantId, uuid, orderByComparator);
	}

	/**
	 * Removes all the detail of applicants where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of detail of applicants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching detail of applicants
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant findByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the detail of applicant where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the detail of applicant that was removed
	 */
	public static DetailOfApplicant removeByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of detail of applicants where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching detail of applicants
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detail of applicants
	 */
	public static List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the detail of applicants before and after the current detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param detailOfApplicantId the primary key of the current detail of applicant
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant[] findByUuid_C_PrevAndNext(
			long detailOfApplicantId, String uuid, long companyId,
			OrderByComparator<DetailOfApplicant> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByUuid_C_PrevAndNext(
			detailOfApplicantId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the detail of applicants where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching detail of applicants
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant findBygetOsiById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchBygetOsiById(long osiApplicationId) {
		return getPersistence().fetchBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiApplicationId, useFinderCache);
	}

	/**
	 * Removes the detail of applicant where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the detail of applicant that was removed
	 */
	public static DetailOfApplicant removeBygetOsiById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().removeBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of detail of applicants where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching detail of applicants
	 */
	public static int countBygetOsiById(long osiApplicationId) {
		return getPersistence().countBygetOsiById(osiApplicationId);
	}

	/**
	 * Caches the detail of applicant in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicant the detail of applicant
	 */
	public static void cacheResult(DetailOfApplicant detailOfApplicant) {
		getPersistence().cacheResult(detailOfApplicant);
	}

	/**
	 * Caches the detail of applicants in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicants the detail of applicants
	 */
	public static void cacheResult(List<DetailOfApplicant> detailOfApplicants) {
		getPersistence().cacheResult(detailOfApplicants);
	}

	/**
	 * Creates a new detail of applicant with the primary key. Does not add the detail of applicant to the database.
	 *
	 * @param detailOfApplicantId the primary key for the new detail of applicant
	 * @return the new detail of applicant
	 */
	public static DetailOfApplicant create(long detailOfApplicantId) {
		return getPersistence().create(detailOfApplicantId);
	}

	/**
	 * Removes the detail of applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant that was removed
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant remove(long detailOfApplicantId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().remove(detailOfApplicantId);
	}

	public static DetailOfApplicant updateImpl(
		DetailOfApplicant detailOfApplicant) {

		return getPersistence().updateImpl(detailOfApplicant);
	}

	/**
	 * Returns the detail of applicant with the primary key or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant findByPrimaryKey(long detailOfApplicantId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getPersistence().findByPrimaryKey(detailOfApplicantId);
	}

	/**
	 * Returns the detail of applicant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant, or <code>null</code> if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant fetchByPrimaryKey(
		long detailOfApplicantId) {

		return getPersistence().fetchByPrimaryKey(detailOfApplicantId);
	}

	/**
	 * Returns all the detail of applicants.
	 *
	 * @return the detail of applicants
	 */
	public static List<DetailOfApplicant> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of detail of applicants
	 */
	public static List<DetailOfApplicant> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of applicants
	 */
	public static List<DetailOfApplicant> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of applicants
	 */
	public static List<DetailOfApplicant> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicant> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the detail of applicants from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of detail of applicants.
	 *
	 * @return the number of detail of applicants
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DetailOfApplicantPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DetailOfApplicantPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DetailOfApplicantPersistence _persistence;

}