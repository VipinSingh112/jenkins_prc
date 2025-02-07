/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services application service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OsiServicesApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicationPersistence
 * @generated
 */
public class OsiServicesApplicationUtil {

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
		OsiServicesApplication osiServicesApplication) {

		getPersistence().clearCache(osiServicesApplication);
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
	public static Map<Serializable, OsiServicesApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiServicesApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiServicesApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiServicesApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiServicesApplication update(
		OsiServicesApplication osiServicesApplication) {

		return getPersistence().update(osiServicesApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiServicesApplication update(
		OsiServicesApplication osiServicesApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(osiServicesApplication, serviceContext);
	}

	/**
	 * Returns all the osi services applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication[] findByUuid_PrevAndNext(
			long osiServicesApplicationId, String uuid,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			osiServicesApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi services applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi services applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi services application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi services applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication[] findByUuid_C_PrevAndNext(
			long osiServicesApplicationId, String uuid, long companyId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			osiServicesApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi services applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi services application where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().removeBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi services applications where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOsiServicesById(long osiServicesApplicationId) {
		return getPersistence().countBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId) {

		return getPersistence().findBygetOSIServicesByS_U(status, userId);
	}

	/**
	 * Returns a range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetOSIServicesByS_U(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findBygetOSIServicesByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSIServicesByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByS_U_First(
			int status, long userId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByS_U_First(
		int status, long userId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByS_U_Last(
			int status, long userId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByS_U_Last(
		int status, long userId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication[]
			findBygetOSIServicesByS_U_PrevAndNext(
				long osiServicesApplicationId, int status, long userId,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByS_U_PrevAndNext(
			osiServicesApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the osi services applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetOSIServicesByS_U(int status, long userId) {
		getPersistence().removeBygetOSIServicesByS_U(status, userId);
	}

	/**
	 * Returns the number of osi services applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByS_U(int status, long userId) {
		return getPersistence().countBygetOSIServicesByS_U(status, userId);
	}

	/**
	 * Returns the osi services application where caseId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByCaseId(
			String caseId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByCaseId(caseId);
	}

	/**
	 * Returns the osi services application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByCaseId(
		String caseId) {

		return getPersistence().fetchBygetOSIServicesByCaseId(caseId);
	}

	/**
	 * Returns the osi services application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIServicesByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi services application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication removeBygetOSIServicesByCaseId(
			String caseId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().removeBygetOSIServicesByCaseId(caseId);
	}

	/**
	 * Returns the number of osi services applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByCaseId(String caseId) {
		return getPersistence().countBygetOSIServicesByCaseId(caseId);
	}

	/**
	 * Returns all the osi services applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status) {

		return getPersistence().findBygetOSIServicesByStatus(status);
	}

	/**
	 * Returns a range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetOSIServicesByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findBygetOSIServicesByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSIServicesByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByStatus_First(
			int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByStatus_First(
		int status,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByStatus_Last(
			int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByStatus_Last(
		int status,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where status = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication[]
			findBygetOSIServicesByStatus_PrevAndNext(
				long osiServicesApplicationId, int status,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByStatus_PrevAndNext(
			osiServicesApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the osi services applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetOSIServicesByStatus(int status) {
		getPersistence().removeBygetOSIServicesByStatus(status);
	}

	/**
	 * Returns the number of osi services applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByStatus(int status) {
		return getPersistence().countBygetOSIServicesByStatus(status);
	}

	/**
	 * Returns all the osi services applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId) {

		return getPersistence().findBygetOSIServicesByEntityId(entityId);
	}

	/**
	 * Returns a range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId, int start, int end) {

		return getPersistence().findBygetOSIServicesByEntityId(
			entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findBygetOSIServicesByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSIServicesByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByEntityId_First(
			long entityId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByEntityId_First(
		long entityId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByEntityId_Last(
			long entityId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByEntityId_Last(
		long entityId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication[]
			findBygetOSIServicesByEntityId_PrevAndNext(
				long osiServicesApplicationId, long entityId,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByEntityId_PrevAndNext(
			osiServicesApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the osi services applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetOSIServicesByEntityId(long entityId) {
		getPersistence().removeBygetOSIServicesByEntityId(entityId);
	}

	/**
	 * Returns the number of osi services applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByEntityId(long entityId) {
		return getPersistence().countBygetOSIServicesByEntityId(entityId);
	}

	/**
	 * Returns all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching osi services applications
	 */
	public static List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(long entityId, int status) {

		return getPersistence().findBygetOSIServicesByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	public static List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(
			long entityId, int status, int start, int end) {

		return getPersistence().findBygetOSIServicesByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(
			long entityId, int status, int start, int end,
			OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findBygetOSIServicesByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	public static List<OsiServicesApplication>
		findBygetOSIServicesByEntityId_Status(
			long entityId, int status, int start, int end,
			OrderByComparator<OsiServicesApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetOSIServicesByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication
			findBygetOSIServicesByEntityId_Status_First(
				long entityId, int status,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication
		fetchBygetOSIServicesByEntityId_Status_First(
			long entityId, int status,
			OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication
			findBygetOSIServicesByEntityId_Status_Last(
				long entityId, int status,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication
		fetchBygetOSIServicesByEntityId_Status_Last(
			long entityId, int status,
			OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().fetchBygetOSIServicesByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication[]
			findBygetOSIServicesByEntityId_Status_PrevAndNext(
				long osiServicesApplicationId, long entityId, int status,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().
			findBygetOSIServicesByEntityId_Status_PrevAndNext(
				osiServicesApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the osi services applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetOSIServicesByEntityId_Status(
		long entityId, int status) {

		getPersistence().removeBygetOSIServicesByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the number of osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByEntityId_Status(
		long entityId, int status) {

		return getPersistence().countBygetOSIServicesByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByEI_CI(
			long entityId, String caseId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByEI_CI(
		long entityId, String caseId) {

		return getPersistence().fetchBygetOSIServicesByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByEI_CI(
		long entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIServicesByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the osi services application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication removeBygetOSIServicesByEI_CI(
			long entityId, String caseId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().removeBygetOSIServicesByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of osi services applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByEI_CI(
		long entityId, String caseId) {

		return getPersistence().countBygetOSIServicesByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the osi services application where applicationNumber = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOSIServicesByAppNo(
			String applicationNumber)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOSIServicesByAppNo(applicationNumber);
	}

	/**
	 * Returns the osi services application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetOSIServicesByAppNo(applicationNumber);
	}

	/**
	 * Returns the osi services application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOSIServicesByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIServicesByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the osi services application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication removeBygetOSIServicesByAppNo(
			String applicationNumber)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().removeBygetOSIServicesByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of osi services applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOSIServicesByAppNo(String applicationNumber) {
		return getPersistence().countBygetOSIServicesByAppNo(applicationNumber);
	}

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication findBygetOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findBygetOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication fetchBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication removeBygetOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().removeBygetOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of osi services applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching osi services applications
	 */
	public static int countBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the osi services application in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplication the osi services application
	 */
	public static void cacheResult(
		OsiServicesApplication osiServicesApplication) {

		getPersistence().cacheResult(osiServicesApplication);
	}

	/**
	 * Caches the osi services applications in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplications the osi services applications
	 */
	public static void cacheResult(
		List<OsiServicesApplication> osiServicesApplications) {

		getPersistence().cacheResult(osiServicesApplications);
	}

	/**
	 * Creates a new osi services application with the primary key. Does not add the osi services application to the database.
	 *
	 * @param osiServicesApplicationId the primary key for the new osi services application
	 * @return the new osi services application
	 */
	public static OsiServicesApplication create(long osiServicesApplicationId) {
		return getPersistence().create(osiServicesApplicationId);
	}

	/**
	 * Removes the osi services application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application that was removed
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication remove(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().remove(osiServicesApplicationId);
	}

	public static OsiServicesApplication updateImpl(
		OsiServicesApplication osiServicesApplication) {

		return getPersistence().updateImpl(osiServicesApplication);
	}

	/**
	 * Returns the osi services application with the primary key or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication findByPrimaryKey(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getPersistence().findByPrimaryKey(osiServicesApplicationId);
	}

	/**
	 * Returns the osi services application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application, or <code>null</code> if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication fetchByPrimaryKey(
		long osiServicesApplicationId) {

		return getPersistence().fetchByPrimaryKey(osiServicesApplicationId);
	}

	/**
	 * Returns all the osi services applications.
	 *
	 * @return the osi services applications
	 */
	public static List<OsiServicesApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of osi services applications
	 */
	public static List<OsiServicesApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services applications
	 */
	public static List<OsiServicesApplication> findAll(
		int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services applications
	 */
	public static List<OsiServicesApplication> findAll(
		int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services applications.
	 *
	 * @return the number of osi services applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiServicesApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiServicesApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiServicesApplicationPersistence _persistence;

}