/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services trustee individual qualificationinfo service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OsiServicesTrusteeIndividualQualificationinfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfoPersistence
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoUtil {

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
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		getPersistence().clearCache(
			osiServicesTrusteeIndividualQualificationinfo);
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
	public static Map
		<Serializable, OsiServicesTrusteeIndividualQualificationinfo>
			fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo update(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		return getPersistence().update(
			osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo update(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServicesTrusteeIndividualQualificationinfo, serviceContext);
	}

	/**
	 * Returns all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(
			String uuid, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid(
			String uuid, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			findByUuid_First(
				String uuid,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfos before and after the current osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osQualificationId the primary key of the current osi services trustee individual qualificationinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo[]
			findByUuid_PrevAndNext(
				long osQualificationId, String uuid,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUuid_PrevAndNext(
			osQualificationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee individual qualificationinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findByUuid_C(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			findByUuid_C_First(
				String uuid, long companyId,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			findByUuid_C_Last(
				String uuid, long companyId,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfos before and after the current osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osQualificationId the primary key of the current osi services trustee individual qualificationinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo[]
			findByUuid_C_PrevAndNext(
				long osQualificationId, String uuid, long companyId,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			osQualificationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			findBygetOsiServicesById(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchBygetOsiServicesById(long osiServicesApplicationId) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchBygetOsiServicesById(
			long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServicesById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			removeBygetOsiServicesById(long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().removeBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	public static int countBygetOsiServicesById(long osiServicesApplicationId) {
		return getPersistence().countBygetOsiServicesById(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi services trustee individual qualificationinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 */
	public static void cacheResult(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		getPersistence().cacheResult(
			osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * Caches the osi services trustee individual qualificationinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfos the osi services trustee individual qualificationinfos
	 */
	public static void cacheResult(
		List<OsiServicesTrusteeIndividualQualificationinfo>
			osiServicesTrusteeIndividualQualificationinfos) {

		getPersistence().cacheResult(
			osiServicesTrusteeIndividualQualificationinfos);
	}

	/**
	 * Creates a new osi services trustee individual qualificationinfo with the primary key. Does not add the osi services trustee individual qualificationinfo to the database.
	 *
	 * @param osQualificationId the primary key for the new osi services trustee individual qualificationinfo
	 * @return the new osi services trustee individual qualificationinfo
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo create(
		long osQualificationId) {

		return getPersistence().create(osQualificationId);
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo remove(
			long osQualificationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().remove(osQualificationId);
	}

	public static OsiServicesTrusteeIndividualQualificationinfo updateImpl(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		return getPersistence().updateImpl(
			osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
			findByPrimaryKey(long osQualificationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return getPersistence().findByPrimaryKey(osQualificationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo, or <code>null</code> if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	public static OsiServicesTrusteeIndividualQualificationinfo
		fetchByPrimaryKey(long osQualificationId) {

		return getPersistence().fetchByPrimaryKey(osQualificationId);
	}

	/**
	 * Returns all the osi services trustee individual qualificationinfos.
	 *
	 * @return the osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo>
		findAll() {

		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee individual qualificationinfos
	 */
	public static List<OsiServicesTrusteeIndividualQualificationinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services trustee individual qualificationinfos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos.
	 *
	 * @return the number of osi services trustee individual qualificationinfos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiServicesTrusteeIndividualQualificationinfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		OsiServicesTrusteeIndividualQualificationinfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile
		OsiServicesTrusteeIndividualQualificationinfoPersistence _persistence;

}