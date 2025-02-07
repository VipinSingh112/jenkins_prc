/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic application service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationPersistence
 * @generated
 */
public class MiicApplicationUtil {

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
	public static void clearCache(MiicApplication miicApplication) {
		getPersistence().clearCache(miicApplication);
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
	public static Map<Serializable, MiicApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicApplication update(MiicApplication miicApplication) {
		return getPersistence().update(miicApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicApplication update(
		MiicApplication miicApplication, ServiceContext serviceContext) {

		return getPersistence().update(miicApplication, serviceContext);
	}

	/**
	 * Returns all the miic applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching miic applications
	 */
	public static List<MiicApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public static List<MiicApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findByUuid_First(
			String uuid, OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchByUuid_First(
		String uuid, OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findByUuid_Last(
			String uuid, OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchByUuid_Last(
		String uuid, OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where uuid = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication[] findByUuid_PrevAndNext(
			long miicApplicationId, String uuid,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			miicApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the miic applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of miic applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching miic applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the miic application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the miic application that was removed
	 */
	public static MiicApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of miic applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching miic applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching miic applications
	 */
	public static List<MiicApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public static List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication[] findByUuid_C_PrevAndNext(
			long miicApplicationId, String uuid, long companyId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miicApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the miic applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching miic applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the miic application where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICById(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICById(miicApplicationId);
	}

	/**
	 * Returns the miic application where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICById(long miicApplicationId) {
		return getPersistence().fetchBygetMIICById(miicApplicationId);
	}

	/**
	 * Returns the miic application where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICById(
		long miicApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMIICById(
			miicApplicationId, useFinderCache);
	}

	/**
	 * Removes the miic application where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application that was removed
	 */
	public static MiicApplication removeBygetMIICById(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().removeBygetMIICById(miicApplicationId);
	}

	/**
	 * Returns the number of miic applications where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICById(long miicApplicationId) {
		return getPersistence().countBygetMIICById(miicApplicationId);
	}

	/**
	 * Returns all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByS_U(
		int status, long userId) {

		return getPersistence().findBygetMIICByS_U(status, userId);
	}

	/**
	 * Returns a range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetMIICByS_U(status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findBygetMIICByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMIICByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByS_U_First(
			int status, long userId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByS_U_First(
		int status, long userId,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByS_U_Last(
			int status, long userId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByS_U_Last(
		int status, long userId,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication[] findBygetMIICByS_U_PrevAndNext(
			long miicApplicationId, int status, long userId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByS_U_PrevAndNext(
			miicApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the miic applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetMIICByS_U(int status, long userId) {
		getPersistence().removeBygetMIICByS_U(status, userId);
	}

	/**
	 * Returns the number of miic applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByS_U(int status, long userId) {
		return getPersistence().countBygetMIICByS_U(status, userId);
	}

	/**
	 * Returns the miic application where caseId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByCaseId(String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByCaseId(caseId);
	}

	/**
	 * Returns the miic application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByCaseId(String caseId) {
		return getPersistence().fetchBygetMIICByCaseId(caseId);
	}

	/**
	 * Returns the miic application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMIICByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the miic application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic application that was removed
	 */
	public static MiicApplication removeBygetMIICByCaseId(String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().removeBygetMIICByCaseId(caseId);
	}

	/**
	 * Returns the number of miic applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByCaseId(String caseId) {
		return getPersistence().countBygetMIICByCaseId(caseId);
	}

	/**
	 * Returns all the miic applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByStatus(int status) {
		return getPersistence().findBygetMIICByStatus(status);
	}

	/**
	 * Returns a range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetMIICByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findBygetMIICByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMIICByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByStatus_First(
			int status, OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByStatus_First(
		int status, OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByStatus_Last(
			int status, OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByStatus_Last(
		int status, OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where status = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication[] findBygetMIICByStatus_PrevAndNext(
			long miicApplicationId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByStatus_PrevAndNext(
			miicApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the miic applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMIICByStatus(int status) {
		getPersistence().removeBygetMIICByStatus(status);
	}

	/**
	 * Returns the number of miic applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByStatus(int status) {
		return getPersistence().countBygetMIICByStatus(status);
	}

	/**
	 * Returns all the miic applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId(
		String entityId) {

		return getPersistence().findBygetMIICByEntityId(entityId);
	}

	/**
	 * Returns a range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetMIICByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findBygetMIICByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMIICByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByEntityId_First(
			String entityId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByEntityId_First(
		String entityId, OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByEntityId_Last(
			String entityId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByEntityId_Last(
		String entityId, OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where entityId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication[] findBygetMIICByEntityId_PrevAndNext(
			long miicApplicationId, String entityId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEntityId_PrevAndNext(
			miicApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the miic applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetMIICByEntityId(String entityId) {
		getPersistence().removeBygetMIICByEntityId(entityId);
	}

	/**
	 * Returns the number of miic applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByEntityId(String entityId) {
		return getPersistence().countBygetMIICByEntityId(entityId);
	}

	/**
	 * Returns all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status) {

		return getPersistence().findBygetMIICByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end) {

		return getPersistence().findBygetMIICByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findBygetMIICByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	public static List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMIICByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().fetchBygetMIICByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication[] findBygetMIICByEntityId_Status_PrevAndNext(
			long miicApplicationId, String entityId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEntityId_Status_PrevAndNext(
			miicApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the miic applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetMIICByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetMIICByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of miic applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetMIICByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByEI_CI(
			String entityId, String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetMIICByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMIICByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the miic application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the miic application that was removed
	 */
	public static MiicApplication removeBygetMIICByEI_CI(
			String entityId, String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().removeBygetMIICByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of miic applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByEI_CI(String entityId, String caseId) {
		return getPersistence().countBygetMIICByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the miic application where applicationNumber = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByAppNo(String applicationNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByAppNo(applicationNumber);
	}

	/**
	 * Returns the miic application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetMIICByAppNo(applicationNumber);
	}

	/**
	 * Returns the miic application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetMIICByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the miic application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the miic application that was removed
	 */
	public static MiicApplication removeBygetMIICByAppNo(
			String applicationNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().removeBygetMIICByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of miic applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByAppNo(String applicationNumber) {
		return getPersistence().countBygetMIICByAppNo(applicationNumber);
	}

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	public static MiicApplication findBygetMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the miic application that was removed
	 */
	public static MiicApplication removeBygetMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().removeBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of miic applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching miic applications
	 */
	public static int countBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the miic application in the entity cache if it is enabled.
	 *
	 * @param miicApplication the miic application
	 */
	public static void cacheResult(MiicApplication miicApplication) {
		getPersistence().cacheResult(miicApplication);
	}

	/**
	 * Caches the miic applications in the entity cache if it is enabled.
	 *
	 * @param miicApplications the miic applications
	 */
	public static void cacheResult(List<MiicApplication> miicApplications) {
		getPersistence().cacheResult(miicApplications);
	}

	/**
	 * Creates a new miic application with the primary key. Does not add the miic application to the database.
	 *
	 * @param miicApplicationId the primary key for the new miic application
	 * @return the new miic application
	 */
	public static MiicApplication create(long miicApplicationId) {
		return getPersistence().create(miicApplicationId);
	}

	/**
	 * Removes the miic application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application that was removed
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication remove(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().remove(miicApplicationId);
	}

	public static MiicApplication updateImpl(MiicApplication miicApplication) {
		return getPersistence().updateImpl(miicApplication);
	}

	/**
	 * Returns the miic application with the primary key or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	public static MiicApplication findByPrimaryKey(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getPersistence().findByPrimaryKey(miicApplicationId);
	}

	/**
	 * Returns the miic application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application, or <code>null</code> if a miic application with the primary key could not be found
	 */
	public static MiicApplication fetchByPrimaryKey(long miicApplicationId) {
		return getPersistence().fetchByPrimaryKey(miicApplicationId);
	}

	/**
	 * Returns all the miic applications.
	 *
	 * @return the miic applications
	 */
	public static List<MiicApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of miic applications
	 */
	public static List<MiicApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic applications
	 */
	public static List<MiicApplication> findAll(
		int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic applications
	 */
	public static List<MiicApplication> findAll(
		int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic applications.
	 *
	 * @return the number of miic applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(MiicApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile MiicApplicationPersistence _persistence;

}