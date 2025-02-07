/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.AddMedicalPractitioner;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add medical practitioner service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.AddMedicalPractitionerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddMedicalPractitionerPersistence
 * @generated
 */
public class AddMedicalPractitionerUtil {

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
		AddMedicalPractitioner addMedicalPractitioner) {

		getPersistence().clearCache(addMedicalPractitioner);
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
	public static Map<Serializable, AddMedicalPractitioner> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddMedicalPractitioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddMedicalPractitioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddMedicalPractitioner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddMedicalPractitioner update(
		AddMedicalPractitioner addMedicalPractitioner) {

		return getPersistence().update(addMedicalPractitioner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddMedicalPractitioner update(
		AddMedicalPractitioner addMedicalPractitioner,
		ServiceContext serviceContext) {

		return getPersistence().update(addMedicalPractitioner, serviceContext);
	}

	/**
	 * Returns all the add medical practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findByUuid_First(
			String uuid,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchByUuid_First(
		String uuid,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findByUuid_Last(
			String uuid,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchByUuid_Last(
		String uuid,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner[] findByUuid_PrevAndNext(
			long addMedicalPractitionerId, String uuid,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUuid_PrevAndNext(
			addMedicalPractitionerId, uuid, orderByComparator);
	}

	/**
	 * Removes all the add medical practitioners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of add medical practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching add medical practitioners
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAddMedicalPractitionerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findByUUID_G(String uuid, long groupId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the add medical practitioner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the add medical practitioner that was removed
	 */
	public static AddMedicalPractitioner removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of add medical practitioners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching add medical practitioners
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner[] findByUuid_C_PrevAndNext(
			long addMedicalPractitionerId, String uuid, long companyId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByUuid_C_PrevAndNext(
			addMedicalPractitionerId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the add medical practitioners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching add medical practitioners
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner[] findBygetHsraById_PrevAndNext(
			long addMedicalPractitionerId, long hsraApplicationId,
			OrderByComparator<AddMedicalPractitioner> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			addMedicalPractitionerId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add medical practitioners where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching add medical practitioners
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the add medical practitioner in the entity cache if it is enabled.
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 */
	public static void cacheResult(
		AddMedicalPractitioner addMedicalPractitioner) {

		getPersistence().cacheResult(addMedicalPractitioner);
	}

	/**
	 * Caches the add medical practitioners in the entity cache if it is enabled.
	 *
	 * @param addMedicalPractitioners the add medical practitioners
	 */
	public static void cacheResult(
		List<AddMedicalPractitioner> addMedicalPractitioners) {

		getPersistence().cacheResult(addMedicalPractitioners);
	}

	/**
	 * Creates a new add medical practitioner with the primary key. Does not add the add medical practitioner to the database.
	 *
	 * @param addMedicalPractitionerId the primary key for the new add medical practitioner
	 * @return the new add medical practitioner
	 */
	public static AddMedicalPractitioner create(long addMedicalPractitionerId) {
		return getPersistence().create(addMedicalPractitionerId);
	}

	/**
	 * Removes the add medical practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner that was removed
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner remove(long addMedicalPractitionerId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().remove(addMedicalPractitionerId);
	}

	public static AddMedicalPractitioner updateImpl(
		AddMedicalPractitioner addMedicalPractitioner) {

		return getPersistence().updateImpl(addMedicalPractitioner);
	}

	/**
	 * Returns the add medical practitioner with the primary key or throws a <code>NoSuchAddMedicalPractitionerException</code> if it could not be found.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner findByPrimaryKey(
			long addMedicalPractitionerId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAddMedicalPractitionerException {

		return getPersistence().findByPrimaryKey(addMedicalPractitionerId);
	}

	/**
	 * Returns the add medical practitioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner, or <code>null</code> if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner fetchByPrimaryKey(
		long addMedicalPractitionerId) {

		return getPersistence().fetchByPrimaryKey(addMedicalPractitionerId);
	}

	/**
	 * Returns all the add medical practitioners.
	 *
	 * @return the add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findAll(
		int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add medical practitioners
	 */
	public static List<AddMedicalPractitioner> findAll(
		int start, int end,
		OrderByComparator<AddMedicalPractitioner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add medical practitioners from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add medical practitioners.
	 *
	 * @return the number of add medical practitioners
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddMedicalPractitionerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddMedicalPractitionerPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddMedicalPractitionerPersistence _persistence;

}