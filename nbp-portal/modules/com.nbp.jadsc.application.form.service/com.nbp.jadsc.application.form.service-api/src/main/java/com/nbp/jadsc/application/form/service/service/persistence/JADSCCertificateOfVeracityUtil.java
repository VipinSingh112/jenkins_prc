/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc certificate of veracity service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCCertificateOfVeracityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracityPersistence
 * @generated
 */
public class JADSCCertificateOfVeracityUtil {

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
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		getPersistence().clearCache(jadscCertificateOfVeracity);
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
	public static Map<Serializable, JADSCCertificateOfVeracity>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCCertificateOfVeracity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCCertificateOfVeracity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCCertificateOfVeracity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCCertificateOfVeracity update(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return getPersistence().update(jadscCertificateOfVeracity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCCertificateOfVeracity update(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscCertificateOfVeracity, serviceContext);
	}

	/**
	 * Returns all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity findByUuid_First(
			String uuid,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of veracities before and after the current jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOVId the primary key of the current jadsc certificate of veracity
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity[] findByUuid_PrevAndNext(
			long jadscCOVId, String uuid,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscCOVId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of veracities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of veracities
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of veracity that was removed
	 */
	public static JADSCCertificateOfVeracity removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of veracities before and after the current jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOVId the primary key of the current jadsc certificate of veracity
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity[] findByUuid_C_PrevAndNext(
			long jadscCOVId, String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscCOVId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity findBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	public static JADSCCertificateOfVeracity fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCById(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc certificate of veracity where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc certificate of veracity that was removed
	 */
	public static JADSCCertificateOfVeracity removeBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc certificate of veracities where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Caches the jadsc certificate of veracity in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 */
	public static void cacheResult(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		getPersistence().cacheResult(jadscCertificateOfVeracity);
	}

	/**
	 * Caches the jadsc certificate of veracities in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfVeracities the jadsc certificate of veracities
	 */
	public static void cacheResult(
		List<JADSCCertificateOfVeracity> jadscCertificateOfVeracities) {

		getPersistence().cacheResult(jadscCertificateOfVeracities);
	}

	/**
	 * Creates a new jadsc certificate of veracity with the primary key. Does not add the jadsc certificate of veracity to the database.
	 *
	 * @param jadscCOVId the primary key for the new jadsc certificate of veracity
	 * @return the new jadsc certificate of veracity
	 */
	public static JADSCCertificateOfVeracity create(long jadscCOVId) {
		return getPersistence().create(jadscCOVId);
	}

	/**
	 * Removes the jadsc certificate of veracity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity remove(long jadscCOVId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().remove(jadscCOVId);
	}

	public static JADSCCertificateOfVeracity updateImpl(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return getPersistence().updateImpl(jadscCertificateOfVeracity);
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity findByPrimaryKey(long jadscCOVId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfVeracityException {

		return getPersistence().findByPrimaryKey(jadscCOVId);
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity, or <code>null</code> if a jadsc certificate of veracity with the primary key could not be found
	 */
	public static JADSCCertificateOfVeracity fetchByPrimaryKey(
		long jadscCOVId) {

		return getPersistence().fetchByPrimaryKey(jadscCOVId);
	}

	/**
	 * Returns all the jadsc certificate of veracities.
	 *
	 * @return the jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of veracities
	 */
	public static List<JADSCCertificateOfVeracity> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc certificate of veracities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc certificate of veracities.
	 *
	 * @return the number of jadsc certificate of veracities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCCertificateOfVeracityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCCertificateOfVeracityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCCertificateOfVeracityPersistence _persistence;

}