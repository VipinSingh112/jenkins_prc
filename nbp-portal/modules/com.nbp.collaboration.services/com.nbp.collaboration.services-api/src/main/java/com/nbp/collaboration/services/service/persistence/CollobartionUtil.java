/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.collaboration.services.model.Collobartion;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the collobartion service. This utility wraps <code>com.nbp.collaboration.services.service.persistence.impl.CollobartionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CollobartionPersistence
 * @generated
 */
public class CollobartionUtil {

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
	public static void clearCache(Collobartion collobartion) {
		getPersistence().clearCache(collobartion);
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
	public static Map<Serializable, Collobartion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Collobartion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Collobartion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Collobartion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Collobartion update(Collobartion collobartion) {
		return getPersistence().update(collobartion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Collobartion update(
		Collobartion collobartion, ServiceContext serviceContext) {

		return getPersistence().update(collobartion, serviceContext);
	}

	/**
	 * Returns all the collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching collobartions
	 */
	public static List<Collobartion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public static List<Collobartion> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByUuid_First(
			String uuid, OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByUuid_First(
		String uuid, OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByUuid_Last(
			String uuid, OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByUuid_Last(
		String uuid, OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion[] findByUuid_PrevAndNext(
			long collaborationId, String uuid,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUuid_PrevAndNext(
			collaborationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the collobartions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching collobartions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCollobartionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByUUID_G(String uuid, long groupId)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the collobartion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the collobartion that was removed
	 */
	public static Collobartion removeByUUID_G(String uuid, long groupId)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of collobartions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching collobartions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching collobartions
	 */
	public static List<Collobartion> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public static List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion[] findByUuid_C_PrevAndNext(
			long collaborationId, String uuid, long companyId,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			collaborationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the collobartions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching collobartions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching collobartions
	 */
	public static List<Collobartion> findBycaseId(String caseId) {
		return getPersistence().findBycaseId(caseId);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public static List<Collobartion> findBycaseId(
		String caseId, int start, int end) {

		return getPersistence().findBycaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findBycaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBycaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findBycaseId_First(
			String caseId, OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findBycaseId_First(caseId, orderByComparator);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchBycaseId_First(
		String caseId, OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchBycaseId_First(caseId, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findBycaseId_Last(
			String caseId, OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findBycaseId_Last(caseId, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchBycaseId_Last(
		String caseId, OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchBycaseId_Last(caseId, orderByComparator);
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion[] findBycaseId_PrevAndNext(
			long collaborationId, String caseId,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findBycaseId_PrevAndNext(
			collaborationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the collobartions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBycaseId(String caseId) {
		getPersistence().removeBycaseId(caseId);
	}

	/**
	 * Returns the number of collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching collobartions
	 */
	public static int countBycaseId(String caseId) {
		return getPersistence().countBycaseId(caseId);
	}

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching collobartions
	 */
	public static List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName) {

		return getPersistence().findBystageName_CaseId(caseId, stageName);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public static List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end) {

		return getPersistence().findBystageName_CaseId(
			caseId, stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findBystageName_CaseId(
			caseId, stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBystageName_CaseId(
			caseId, stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findBystageName_CaseId_First(
			String caseId, String stageName,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findBystageName_CaseId_First(
			caseId, stageName, orderByComparator);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchBystageName_CaseId_First(
		String caseId, String stageName,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchBystageName_CaseId_First(
			caseId, stageName, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findBystageName_CaseId_Last(
			String caseId, String stageName,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findBystageName_CaseId_Last(
			caseId, stageName, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchBystageName_CaseId_Last(
		String caseId, String stageName,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchBystageName_CaseId_Last(
			caseId, stageName, orderByComparator);
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion[] findBystageName_CaseId_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findBystageName_CaseId_PrevAndNext(
			collaborationId, caseId, stageName, orderByComparator);
	}

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 */
	public static void removeBystageName_CaseId(
		String caseId, String stageName) {

		getPersistence().removeBystageName_CaseId(caseId, stageName);
	}

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching collobartions
	 */
	public static int countBystageName_CaseId(String caseId, String stageName) {
		return getPersistence().countBystageName_CaseId(caseId, stageName);
	}

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @return the matching collobartions
	 */
	public static List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType) {

		return getPersistence().findByStage_CU(caseId, stageName, userType);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public static List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end) {

		return getPersistence().findByStage_CU(
			caseId, stageName, userType, start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findByStage_CU(
			caseId, stageName, userType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end,
		OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStage_CU(
			caseId, stageName, userType, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByStage_CU_First(
			String caseId, String stageName, String userType,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByStage_CU_First(
			caseId, stageName, userType, orderByComparator);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByStage_CU_First(
		String caseId, String stageName, String userType,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByStage_CU_First(
			caseId, stageName, userType, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByStage_CU_Last(
			String caseId, String stageName, String userType,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByStage_CU_Last(
			caseId, stageName, userType, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByStage_CU_Last(
		String caseId, String stageName, String userType,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByStage_CU_Last(
			caseId, stageName, userType, orderByComparator);
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion[] findByStage_CU_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			String userType, OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByStage_CU_PrevAndNext(
			collaborationId, caseId, stageName, userType, orderByComparator);
	}

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 */
	public static void removeByStage_CU(
		String caseId, String stageName, String userType) {

		getPersistence().removeByStage_CU(caseId, stageName, userType);
	}

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @return the number of matching collobartions
	 */
	public static int countByStage_CU(
		String caseId, String stageName, String userType) {

		return getPersistence().countByStage_CU(caseId, stageName, userType);
	}

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @return the matching collobartions
	 */
	public static List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived) {

		return getPersistence().findByStage_CUA(
			caseId, stageName, userType, archived);
	}

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public static List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end) {

		return getPersistence().findByStage_CUA(
			caseId, stageName, userType, archived, start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end, OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findByStage_CUA(
			caseId, stageName, userType, archived, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public static List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end, OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStage_CUA(
			caseId, stageName, userType, archived, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByStage_CUA_First(
			String caseId, String stageName, String userType, int archived,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByStage_CUA_First(
			caseId, stageName, userType, archived, orderByComparator);
	}

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByStage_CUA_First(
		String caseId, String stageName, String userType, int archived,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByStage_CUA_First(
			caseId, stageName, userType, archived, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public static Collobartion findByStage_CUA_Last(
			String caseId, String stageName, String userType, int archived,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByStage_CUA_Last(
			caseId, stageName, userType, archived, orderByComparator);
	}

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchByStage_CUA_Last(
		String caseId, String stageName, String userType, int archived,
		OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().fetchByStage_CUA_Last(
			caseId, stageName, userType, archived, orderByComparator);
	}

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion[] findByStage_CUA_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			String userType, int archived,
			OrderByComparator<Collobartion> orderByComparator)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByStage_CUA_PrevAndNext(
			collaborationId, caseId, stageName, userType, archived,
			orderByComparator);
	}

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 */
	public static void removeByStage_CUA(
		String caseId, String stageName, String userType, int archived) {

		getPersistence().removeByStage_CUA(
			caseId, stageName, userType, archived);
	}

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @return the number of matching collobartions
	 */
	public static int countByStage_CUA(
		String caseId, String stageName, String userType, int archived) {

		return getPersistence().countByStage_CUA(
			caseId, stageName, userType, archived);
	}

	/**
	 * Caches the collobartion in the entity cache if it is enabled.
	 *
	 * @param collobartion the collobartion
	 */
	public static void cacheResult(Collobartion collobartion) {
		getPersistence().cacheResult(collobartion);
	}

	/**
	 * Caches the collobartions in the entity cache if it is enabled.
	 *
	 * @param collobartions the collobartions
	 */
	public static void cacheResult(List<Collobartion> collobartions) {
		getPersistence().cacheResult(collobartions);
	}

	/**
	 * Creates a new collobartion with the primary key. Does not add the collobartion to the database.
	 *
	 * @param collaborationId the primary key for the new collobartion
	 * @return the new collobartion
	 */
	public static Collobartion create(long collaborationId) {
		return getPersistence().create(collaborationId);
	}

	/**
	 * Removes the collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion that was removed
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion remove(long collaborationId)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().remove(collaborationId);
	}

	public static Collobartion updateImpl(Collobartion collobartion) {
		return getPersistence().updateImpl(collobartion);
	}

	/**
	 * Returns the collobartion with the primary key or throws a <code>NoSuchCollobartionException</code> if it could not be found.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public static Collobartion findByPrimaryKey(long collaborationId)
		throws com.nbp.collaboration.services.exception.
			NoSuchCollobartionException {

		return getPersistence().findByPrimaryKey(collaborationId);
	}

	/**
	 * Returns the collobartion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion, or <code>null</code> if a collobartion with the primary key could not be found
	 */
	public static Collobartion fetchByPrimaryKey(long collaborationId) {
		return getPersistence().fetchByPrimaryKey(collaborationId);
	}

	/**
	 * Returns all the collobartions.
	 *
	 * @return the collobartions
	 */
	public static List<Collobartion> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of collobartions
	 */
	public static List<Collobartion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of collobartions
	 */
	public static List<Collobartion> findAll(
		int start, int end, OrderByComparator<Collobartion> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of collobartions
	 */
	public static List<Collobartion> findAll(
		int start, int end, OrderByComparator<Collobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the collobartions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of collobartions.
	 *
	 * @return the number of collobartions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CollobartionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(CollobartionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile CollobartionPersistence _persistence;

}