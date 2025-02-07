/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services trustee bread down addinfo service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OsiServicesTrusteeBreadDownAddinfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfoPersistence
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoUtil {

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
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		getPersistence().clearCache(osiServicesTrusteeBreadDownAddinfo);
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
	public static Map<Serializable, OsiServicesTrusteeBreadDownAddinfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiServicesTrusteeBreadDownAddinfo update(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		return getPersistence().update(osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiServicesTrusteeBreadDownAddinfo update(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServicesTrusteeBreadDownAddinfo, serviceContext);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo[] findByUuid_PrevAndNext(
			long osiTrusId, String uuid,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUuid_PrevAndNext(
			osiTrusId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee bread down addinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	public static OsiServicesTrusteeBreadDownAddinfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo[] findByUuid_C_PrevAndNext(
			long osiTrusId, String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			osiTrusId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	public static OsiServicesTrusteeBreadDownAddinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().removeBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public static int countBygetOsiServicesById(long osiServicesApplicationId) {
		return getPersistence().countBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(long osiServicesApplicationId) {

		return getPersistence().findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end) {

		return getPersistence().findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		return getPersistence().findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
			findBygetOsiServices_Data_By_Id_First(
				long osiServicesApplicationId,
				OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findBygetOsiServices_Data_By_Id_First(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		fetchBygetOsiServices_Data_By_Id_First(
			long osiServicesApplicationId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		return getPersistence().fetchBygetOsiServices_Data_By_Id_First(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
			findBygetOsiServices_Data_By_Id_Last(
				long osiServicesApplicationId,
				OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findBygetOsiServices_Data_By_Id_Last(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo
		fetchBygetOsiServices_Data_By_Id_Last(
			long osiServicesApplicationId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		return getPersistence().fetchBygetOsiServices_Data_By_Id_Last(
			osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo[]
			findBygetOsiServices_Data_By_Id_PrevAndNext(
				long osiTrusId, long osiServicesApplicationId,
				OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findBygetOsiServices_Data_By_Id_PrevAndNext(
			osiTrusId, osiServicesApplicationId, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 */
	public static void removeBygetOsiServices_Data_By_Id(
		long osiServicesApplicationId) {

		getPersistence().removeBygetOsiServices_Data_By_Id(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	public static int countBygetOsiServices_Data_By_Id(
		long osiServicesApplicationId) {

		return getPersistence().countBygetOsiServices_Data_By_Id(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi services trustee bread down addinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 */
	public static void cacheResult(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		getPersistence().cacheResult(osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Caches the osi services trustee bread down addinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeBreadDownAddinfos the osi services trustee bread down addinfos
	 */
	public static void cacheResult(
		List<OsiServicesTrusteeBreadDownAddinfo>
			osiServicesTrusteeBreadDownAddinfos) {

		getPersistence().cacheResult(osiServicesTrusteeBreadDownAddinfos);
	}

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	public static OsiServicesTrusteeBreadDownAddinfo create(long osiTrusId) {
		return getPersistence().create(osiTrusId);
	}

	/**
	 * Removes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo remove(long osiTrusId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().remove(osiTrusId);
	}

	public static OsiServicesTrusteeBreadDownAddinfo updateImpl(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		return getPersistence().updateImpl(osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo findByPrimaryKey(
			long osiTrusId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return getPersistence().findByPrimaryKey(osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo, or <code>null</code> if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeBreadDownAddinfo fetchByPrimaryKey(
		long osiTrusId) {

		return getPersistence().fetchByPrimaryKey(osiTrusId);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos.
	 *
	 * @return the osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee bread down addinfos
	 */
	public static List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services trustee bread down addinfos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiServicesTrusteeBreadDownAddinfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		OsiServicesTrusteeBreadDownAddinfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiServicesTrusteeBreadDownAddinfoPersistence
		_persistence;

}