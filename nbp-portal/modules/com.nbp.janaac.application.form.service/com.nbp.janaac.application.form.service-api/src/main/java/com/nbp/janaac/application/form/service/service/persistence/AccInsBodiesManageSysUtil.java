/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc ins bodies manage sys service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccInsBodiesManageSysPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesManageSysPersistence
 * @generated
 */
public class AccInsBodiesManageSysUtil {

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
	public static void clearCache(AccInsBodiesManageSys accInsBodiesManageSys) {
		getPersistence().clearCache(accInsBodiesManageSys);
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
	public static Map<Serializable, AccInsBodiesManageSys> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccInsBodiesManageSys> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccInsBodiesManageSys> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccInsBodiesManageSys> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccInsBodiesManageSys update(
		AccInsBodiesManageSys accInsBodiesManageSys) {

		return getPersistence().update(accInsBodiesManageSys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccInsBodiesManageSys update(
		AccInsBodiesManageSys accInsBodiesManageSys,
		ServiceContext serviceContext) {

		return getPersistence().update(accInsBodiesManageSys, serviceContext);
	}

	/**
	 * Returns all the acc ins bodies manage syses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc ins bodies manage syses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @return the range of matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies manage syses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies manage syses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc ins bodies manage sys in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys findByUuid_First(
			String uuid,
			OrderByComparator<AccInsBodiesManageSys> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc ins bodies manage sys in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchByUuid_First(
		String uuid,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies manage sys in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys findByUuid_Last(
			String uuid,
			OrderByComparator<AccInsBodiesManageSys> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies manage sys in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc ins bodies manage syses before and after the current acc ins bodies manage sys in the ordered set where uuid = &#63;.
	 *
	 * @param accInsBodiesManageSysId the primary key of the current acc ins bodies manage sys
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a acc ins bodies manage sys with the primary key could not be found
	 */
	public static AccInsBodiesManageSys[] findByUuid_PrevAndNext(
			long accInsBodiesManageSysId, String uuid,
			OrderByComparator<AccInsBodiesManageSys> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUuid_PrevAndNext(
			accInsBodiesManageSysId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc ins bodies manage syses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc ins bodies manage syses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc ins bodies manage syses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc ins bodies manage sys where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccInsBodiesManageSysException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys findByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies manage sys where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies manage sys where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc ins bodies manage sys where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc ins bodies manage sys that was removed
	 */
	public static AccInsBodiesManageSys removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc ins bodies manage syses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc ins bodies manage syses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc ins bodies manage syses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc ins bodies manage syses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @return the range of matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies manage syses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies manage syses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc ins bodies manage sys in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccInsBodiesManageSys> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc ins bodies manage sys in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies manage sys in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccInsBodiesManageSys> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies manage sys in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc ins bodies manage syses before and after the current acc ins bodies manage sys in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accInsBodiesManageSysId the primary key of the current acc ins bodies manage sys
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a acc ins bodies manage sys with the primary key could not be found
	 */
	public static AccInsBodiesManageSys[] findByUuid_C_PrevAndNext(
			long accInsBodiesManageSysId, String uuid, long companyId,
			OrderByComparator<AccInsBodiesManageSys> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accInsBodiesManageSysId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc ins bodies manage syses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc ins bodies manage syses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc ins bodies manage syses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc ins bodies manage sys where janaacApplicationId = &#63; or throws a <code>NoSuchAccInsBodiesManageSysException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc ins bodies manage sys where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc ins bodies manage sys where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	public static AccInsBodiesManageSys fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc ins bodies manage sys where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc ins bodies manage sys that was removed
	 */
	public static AccInsBodiesManageSys removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc ins bodies manage syses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc ins bodies manage syses
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc ins bodies manage sys in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesManageSys the acc ins bodies manage sys
	 */
	public static void cacheResult(
		AccInsBodiesManageSys accInsBodiesManageSys) {

		getPersistence().cacheResult(accInsBodiesManageSys);
	}

	/**
	 * Caches the acc ins bodies manage syses in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesManageSyses the acc ins bodies manage syses
	 */
	public static void cacheResult(
		List<AccInsBodiesManageSys> accInsBodiesManageSyses) {

		getPersistence().cacheResult(accInsBodiesManageSyses);
	}

	/**
	 * Creates a new acc ins bodies manage sys with the primary key. Does not add the acc ins bodies manage sys to the database.
	 *
	 * @param accInsBodiesManageSysId the primary key for the new acc ins bodies manage sys
	 * @return the new acc ins bodies manage sys
	 */
	public static AccInsBodiesManageSys create(long accInsBodiesManageSysId) {
		return getPersistence().create(accInsBodiesManageSysId);
	}

	/**
	 * Removes the acc ins bodies manage sys with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accInsBodiesManageSysId the primary key of the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys that was removed
	 * @throws NoSuchAccInsBodiesManageSysException if a acc ins bodies manage sys with the primary key could not be found
	 */
	public static AccInsBodiesManageSys remove(long accInsBodiesManageSysId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().remove(accInsBodiesManageSysId);
	}

	public static AccInsBodiesManageSys updateImpl(
		AccInsBodiesManageSys accInsBodiesManageSys) {

		return getPersistence().updateImpl(accInsBodiesManageSys);
	}

	/**
	 * Returns the acc ins bodies manage sys with the primary key or throws a <code>NoSuchAccInsBodiesManageSysException</code> if it could not be found.
	 *
	 * @param accInsBodiesManageSysId the primary key of the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys
	 * @throws NoSuchAccInsBodiesManageSysException if a acc ins bodies manage sys with the primary key could not be found
	 */
	public static AccInsBodiesManageSys findByPrimaryKey(
			long accInsBodiesManageSysId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return getPersistence().findByPrimaryKey(accInsBodiesManageSysId);
	}

	/**
	 * Returns the acc ins bodies manage sys with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accInsBodiesManageSysId the primary key of the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys, or <code>null</code> if a acc ins bodies manage sys with the primary key could not be found
	 */
	public static AccInsBodiesManageSys fetchByPrimaryKey(
		long accInsBodiesManageSysId) {

		return getPersistence().fetchByPrimaryKey(accInsBodiesManageSysId);
	}

	/**
	 * Returns all the acc ins bodies manage syses.
	 *
	 * @return the acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc ins bodies manage syses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @return the range of acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies manage syses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findAll(
		int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies manage syses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc ins bodies manage syses
	 */
	public static List<AccInsBodiesManageSys> findAll(
		int start, int end,
		OrderByComparator<AccInsBodiesManageSys> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc ins bodies manage syses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc ins bodies manage syses.
	 *
	 * @return the number of acc ins bodies manage syses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccInsBodiesManageSysPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccInsBodiesManageSysPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccInsBodiesManageSysPersistence _persistence;

}