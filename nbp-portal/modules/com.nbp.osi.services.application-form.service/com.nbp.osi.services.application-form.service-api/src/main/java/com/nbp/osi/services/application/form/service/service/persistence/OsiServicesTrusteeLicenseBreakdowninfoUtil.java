/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services trustee license breakdowninfo service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OsiServicesTrusteeLicenseBreakdowninfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfoPersistence
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoUtil {

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
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		getPersistence().clearCache(osiServicesTrusteeLicenseBreakdowninfo);
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
	public static Map<Serializable, OsiServicesTrusteeLicenseBreakdowninfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo update(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		return getPersistence().update(osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo update(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServicesTrusteeLicenseBreakdowninfo, serviceContext);
	}

	/**
	 * Returns all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi services trustee license breakdowninfos before and after the current osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiLicBreakId the primary key of the current osi services trustee license breakdowninfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo[]
			findByUuid_PrevAndNext(
				long osiLicBreakId, String uuid,
				OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUuid_PrevAndNext(
			osiLicBreakId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee license breakdowninfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi services trustee license breakdowninfos before and after the current osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiLicBreakId the primary key of the current osi services trustee license breakdowninfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo[]
			findByUuid_C_PrevAndNext(
				long osiLicBreakId, String uuid, long companyId,
				OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			osiLicBreakId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
			findBygetOsiServicesById(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		fetchBygetOsiServicesById(long osiServicesApplicationId) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
		fetchBygetOsiServicesById(
			long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo
			removeBygetOsiServicesById(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().removeBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	public static int countBygetOsiServicesById(long osiServicesApplicationId) {
		return getPersistence().countBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi services trustee license breakdowninfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 */
	public static void cacheResult(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		getPersistence().cacheResult(osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * Caches the osi services trustee license breakdowninfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfos the osi services trustee license breakdowninfos
	 */
	public static void cacheResult(
		List<OsiServicesTrusteeLicenseBreakdowninfo>
			osiServicesTrusteeLicenseBreakdowninfos) {

		getPersistence().cacheResult(osiServicesTrusteeLicenseBreakdowninfos);
	}

	/**
	 * Creates a new osi services trustee license breakdowninfo with the primary key. Does not add the osi services trustee license breakdowninfo to the database.
	 *
	 * @param osiLicBreakId the primary key for the new osi services trustee license breakdowninfo
	 * @return the new osi services trustee license breakdowninfo
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo create(
		long osiLicBreakId) {

		return getPersistence().create(osiLicBreakId);
	}

	/**
	 * Removes the osi services trustee license breakdowninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo remove(
			long osiLicBreakId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().remove(osiLicBreakId);
	}

	public static OsiServicesTrusteeLicenseBreakdowninfo updateImpl(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		return getPersistence().updateImpl(
			osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo findByPrimaryKey(
			long osiLicBreakId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return getPersistence().findByPrimaryKey(osiLicBreakId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo, or <code>null</code> if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeLicenseBreakdowninfo fetchByPrimaryKey(
		long osiLicBreakId) {

		return getPersistence().fetchByPrimaryKey(osiLicBreakId);
	}

	/**
	 * Returns all the osi services trustee license breakdowninfos.
	 *
	 * @return the osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee license breakdowninfos
	 */
	public static List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services trustee license breakdowninfos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos.
	 *
	 * @return the number of osi services trustee license breakdowninfos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiServicesTrusteeLicenseBreakdowninfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		OsiServicesTrusteeLicenseBreakdowninfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiServicesTrusteeLicenseBreakdowninfoPersistence
		_persistence;

}