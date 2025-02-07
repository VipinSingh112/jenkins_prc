/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis supplemental information service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisSupplementalInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupplementalInformationPersistence
 * @generated
 */
public class CannabisSupplementalInformationUtil {

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
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		getPersistence().clearCache(cannabisSupplementalInformation);
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
	public static Map<Serializable, CannabisSupplementalInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisSupplementalInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisSupplementalInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisSupplementalInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisSupplementalInformation update(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		return getPersistence().update(cannabisSupplementalInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisSupplementalInformation update(
		CannabisSupplementalInformation cannabisSupplementalInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisSupplementalInformation, serviceContext);
	}

	/**
	 * Returns all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findByUuid_First(
			String uuid,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public static CannabisSupplementalInformation[] findByUuid_PrevAndNext(
			long cannabisSupplementalInfoId, String uuid,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisSupplementalInfoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis supplemental informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis supplemental informations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisSupplementalInformationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis supplemental information where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis supplemental information that was removed
	 */
	public static CannabisSupplementalInformation removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis supplemental informations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public static CannabisSupplementalInformation[] findByUuid_C_PrevAndNext(
			long cannabisSupplementalInfoId, String uuid, long companyId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisSupplementalInfoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis supplemental informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis supplemental informations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCA_SI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCA_SI_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().findBygetCA_SI_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_SI_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findBygetCA_SI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findBygetCA_SI_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchBygetCA_SI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().fetchBygetCA_SI_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation findBygetCA_SI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisSupplementalInformation>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findBygetCA_SI_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public static CannabisSupplementalInformation fetchBygetCA_SI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().fetchBygetCA_SI_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public static CannabisSupplementalInformation[]
			findBygetCA_SI_CAI_PrevAndNext(
				long cannabisSupplementalInfoId, long cannabisApplicationId,
				OrderByComparator<CannabisSupplementalInformation>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findBygetCA_SI_CAI_PrevAndNext(
			cannabisSupplementalInfoId, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis supplemental informations where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCA_SI_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCA_SI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis supplemental informations
	 */
	public static int countBygetCA_SI_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_SI_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis supplemental information in the entity cache if it is enabled.
	 *
	 * @param cannabisSupplementalInformation the cannabis supplemental information
	 */
	public static void cacheResult(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		getPersistence().cacheResult(cannabisSupplementalInformation);
	}

	/**
	 * Caches the cannabis supplemental informations in the entity cache if it is enabled.
	 *
	 * @param cannabisSupplementalInformations the cannabis supplemental informations
	 */
	public static void cacheResult(
		List<CannabisSupplementalInformation>
			cannabisSupplementalInformations) {

		getPersistence().cacheResult(cannabisSupplementalInformations);
	}

	/**
	 * Creates a new cannabis supplemental information with the primary key. Does not add the cannabis supplemental information to the database.
	 *
	 * @param cannabisSupplementalInfoId the primary key for the new cannabis supplemental information
	 * @return the new cannabis supplemental information
	 */
	public static CannabisSupplementalInformation create(
		long cannabisSupplementalInfoId) {

		return getPersistence().create(cannabisSupplementalInfoId);
	}

	/**
	 * Removes the cannabis supplemental information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information that was removed
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public static CannabisSupplementalInformation remove(
			long cannabisSupplementalInfoId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().remove(cannabisSupplementalInfoId);
	}

	public static CannabisSupplementalInformation updateImpl(
		CannabisSupplementalInformation cannabisSupplementalInformation) {

		return getPersistence().updateImpl(cannabisSupplementalInformation);
	}

	/**
	 * Returns the cannabis supplemental information with the primary key or throws a <code>NoSuchCannabisSupplementalInformationException</code> if it could not be found.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public static CannabisSupplementalInformation findByPrimaryKey(
			long cannabisSupplementalInfoId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupplementalInformationException {

		return getPersistence().findByPrimaryKey(cannabisSupplementalInfoId);
	}

	/**
	 * Returns the cannabis supplemental information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information, or <code>null</code> if a cannabis supplemental information with the primary key could not be found
	 */
	public static CannabisSupplementalInformation fetchByPrimaryKey(
		long cannabisSupplementalInfoId) {

		return getPersistence().fetchByPrimaryKey(cannabisSupplementalInfoId);
	}

	/**
	 * Returns all the cannabis supplemental informations.
	 *
	 * @return the cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findAll(
		int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis supplemental informations
	 */
	public static List<CannabisSupplementalInformation> findAll(
		int start, int end,
		OrderByComparator<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis supplemental informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis supplemental informations.
	 *
	 * @return the number of cannabis supplemental informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisSupplementalInformationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisSupplementalInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisSupplementalInformationPersistence
		_persistence;

}