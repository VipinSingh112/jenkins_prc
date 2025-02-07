/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.AddApplicantPractitioner;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add applicant practitioner service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.AddApplicantPractitionerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitionerPersistence
 * @generated
 */
public class AddApplicantPractitionerUtil {

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
		AddApplicantPractitioner addApplicantPractitioner) {

		getPersistence().clearCache(addApplicantPractitioner);
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
	public static Map<Serializable, AddApplicantPractitioner>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddApplicantPractitioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddApplicantPractitioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddApplicantPractitioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddApplicantPractitioner update(
		AddApplicantPractitioner addApplicantPractitioner) {

		return getPersistence().update(addApplicantPractitioner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddApplicantPractitioner update(
		AddApplicantPractitioner addApplicantPractitioner,
		ServiceContext serviceContext) {

		return getPersistence().update(
			addApplicantPractitioner, serviceContext);
	}

	/**
	 * Returns all the add applicant practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the add applicant practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findByUuid_First(
			String uuid,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchByUuid_First(
		String uuid,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findByUuid_Last(
			String uuid,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchByUuid_Last(
		String uuid,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the add applicant practitioners before and after the current add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param addApplicantPractitionerId the primary key of the current add applicant practitioner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner[] findByUuid_PrevAndNext(
			long addApplicantPractitionerId, String uuid,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUuid_PrevAndNext(
			addApplicantPractitionerId, uuid, orderByComparator);
	}

	/**
	 * Removes all the add applicant practitioners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of add applicant practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching add applicant practitioners
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the add applicant practitioner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAddApplicantPractitionerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the add applicant practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the add applicant practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the add applicant practitioner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the add applicant practitioner that was removed
	 */
	public static AddApplicantPractitioner removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of add applicant practitioners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching add applicant practitioners
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the add applicant practitioners before and after the current add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addApplicantPractitionerId the primary key of the current add applicant practitioner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner[] findByUuid_C_PrevAndNext(
			long addApplicantPractitionerId, String uuid, long companyId,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByUuid_C_PrevAndNext(
			addApplicantPractitionerId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the add applicant practitioners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching add applicant practitioners
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the add applicant practitioners before and after the current add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param addApplicantPractitionerId the primary key of the current add applicant practitioner
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner[] findBygetHsraById_PrevAndNext(
			long addApplicantPractitionerId, long hsraApplicationId,
			OrderByComparator<AddApplicantPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			addApplicantPractitionerId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add applicant practitioners where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching add applicant practitioners
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the add applicant practitioner in the entity cache if it is enabled.
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 */
	public static void cacheResult(
		AddApplicantPractitioner addApplicantPractitioner) {

		getPersistence().cacheResult(addApplicantPractitioner);
	}

	/**
	 * Caches the add applicant practitioners in the entity cache if it is enabled.
	 *
	 * @param addApplicantPractitioners the add applicant practitioners
	 */
	public static void cacheResult(
		List<AddApplicantPractitioner> addApplicantPractitioners) {

		getPersistence().cacheResult(addApplicantPractitioners);
	}

	/**
	 * Creates a new add applicant practitioner with the primary key. Does not add the add applicant practitioner to the database.
	 *
	 * @param addApplicantPractitionerId the primary key for the new add applicant practitioner
	 * @return the new add applicant practitioner
	 */
	public static AddApplicantPractitioner create(
		long addApplicantPractitionerId) {

		return getPersistence().create(addApplicantPractitionerId);
	}

	/**
	 * Removes the add applicant practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner that was removed
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner remove(
			long addApplicantPractitionerId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().remove(addApplicantPractitionerId);
	}

	public static AddApplicantPractitioner updateImpl(
		AddApplicantPractitioner addApplicantPractitioner) {

		return getPersistence().updateImpl(addApplicantPractitioner);
	}

	/**
	 * Returns the add applicant practitioner with the primary key or throws a <code>NoSuchAddApplicantPractitionerException</code> if it could not be found.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner findByPrimaryKey(
			long addApplicantPractitionerId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddApplicantPractitionerException {

		return getPersistence().findByPrimaryKey(addApplicantPractitionerId);
	}

	/**
	 * Returns the add applicant practitioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner, or <code>null</code> if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner fetchByPrimaryKey(
		long addApplicantPractitionerId) {

		return getPersistence().fetchByPrimaryKey(addApplicantPractitionerId);
	}

	/**
	 * Returns all the add applicant practitioners.
	 *
	 * @return the add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findAll(
		int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> findAll(
		int start, int end,
		OrderByComparator<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add applicant practitioners from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add applicant practitioners.
	 *
	 * @return the number of add applicant practitioners
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddApplicantPractitionerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddApplicantPractitionerPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddApplicantPractitionerPersistence _persistence;

}