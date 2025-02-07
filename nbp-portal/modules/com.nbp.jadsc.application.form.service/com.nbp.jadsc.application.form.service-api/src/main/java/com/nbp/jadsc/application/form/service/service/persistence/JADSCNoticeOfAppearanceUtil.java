/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc notice of appearance service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCNoticeOfAppearancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearancePersistence
 * @generated
 */
public class JADSCNoticeOfAppearanceUtil {

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
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		getPersistence().clearCache(jadscNoticeOfAppearance);
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
	public static Map<Serializable, JADSCNoticeOfAppearance> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCNoticeOfAppearance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCNoticeOfAppearance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCNoticeOfAppearance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCNoticeOfAppearance update(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		return getPersistence().update(jadscNoticeOfAppearance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCNoticeOfAppearance update(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance,
		ServiceContext serviceContext) {

		return getPersistence().update(jadscNoticeOfAppearance, serviceContext);
	}

	/**
	 * Returns all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance findByUuid_First(
			String uuid,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc notice of appearances before and after the current jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param jadscNOAId the primary key of the current jadsc notice of appearance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance[] findByUuid_PrevAndNext(
			long jadscNOAId, String uuid,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscNOAId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc notice of appearances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc notice of appearances
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc notice of appearance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc notice of appearance that was removed
	 */
	public static JADSCNoticeOfAppearance removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc notice of appearances
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc notice of appearances before and after the current jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscNOAId the primary key of the current jadsc notice of appearance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance[] findByUuid_C_PrevAndNext(
			long jadscNOAId, String uuid, long companyId,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscNOAId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc notice of appearances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc notice of appearances
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance findBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCById(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc notice of appearance where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc notice of appearance that was removed
	 */
	public static JADSCNoticeOfAppearance removeBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc notice of appearances where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc notice of appearances
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Caches the jadsc notice of appearance in the entity cache if it is enabled.
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 */
	public static void cacheResult(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		getPersistence().cacheResult(jadscNoticeOfAppearance);
	}

	/**
	 * Caches the jadsc notice of appearances in the entity cache if it is enabled.
	 *
	 * @param jadscNoticeOfAppearances the jadsc notice of appearances
	 */
	public static void cacheResult(
		List<JADSCNoticeOfAppearance> jadscNoticeOfAppearances) {

		getPersistence().cacheResult(jadscNoticeOfAppearances);
	}

	/**
	 * Creates a new jadsc notice of appearance with the primary key. Does not add the jadsc notice of appearance to the database.
	 *
	 * @param jadscNOAId the primary key for the new jadsc notice of appearance
	 * @return the new jadsc notice of appearance
	 */
	public static JADSCNoticeOfAppearance create(long jadscNOAId) {
		return getPersistence().create(jadscNOAId);
	}

	/**
	 * Removes the jadsc notice of appearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance remove(long jadscNOAId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().remove(jadscNOAId);
	}

	public static JADSCNoticeOfAppearance updateImpl(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		return getPersistence().updateImpl(jadscNoticeOfAppearance);
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance findByPrimaryKey(long jadscNOAId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getPersistence().findByPrimaryKey(jadscNOAId);
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance, or <code>null</code> if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance fetchByPrimaryKey(long jadscNOAId) {
		return getPersistence().fetchByPrimaryKey(jadscNOAId);
	}

	/**
	 * Returns all the jadsc notice of appearances.
	 *
	 * @return the jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findAll(
		int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> findAll(
		int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc notice of appearances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc notice of appearances.
	 *
	 * @return the number of jadsc notice of appearances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCNoticeOfAppearancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCNoticeOfAppearancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCNoticeOfAppearancePersistence _persistence;

}