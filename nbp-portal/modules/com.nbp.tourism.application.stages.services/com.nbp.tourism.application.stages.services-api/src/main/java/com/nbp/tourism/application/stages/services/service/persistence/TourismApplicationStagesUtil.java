/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism application stages service. This utility wraps <code>com.nbp.tourism.application.stages.services.service.persistence.impl.TourismApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStagesPersistence
 * @generated
 */
public class TourismApplicationStagesUtil {

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
		TourismApplicationStages tourismApplicationStages) {

		getPersistence().clearCache(tourismApplicationStages);
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
	public static Map<Serializable, TourismApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismApplicationStages update(
		TourismApplicationStages tourismApplicationStages) {

		return getPersistence().update(tourismApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismApplicationStages update(
		TourismApplicationStages tourismApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismApplicationStages, serviceContext);
	}

	/**
	 * Returns all the tourism application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages[] findByUuid_PrevAndNext(
			long tourismApplicationStagesId, String uuid,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			tourismApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the tourism application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of tourism application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tourism application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the tourism application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tourism application stages that was removed
	 */
	public static TourismApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of tourism application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tourism application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages[] findByUuid_C_PrevAndNext(
			long tourismApplicationStagesId, String uuid, long companyId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			tourismApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the tourism application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tourism application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_TAI(
			long tourismApplicationId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_TAI(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTAS_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_TAI(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTAS_TAI(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism application stages where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application stages that was removed
	 */
	public static TourismApplicationStages removeBygetTAS_TAI(
			long tourismApplicationId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().removeBygetTAS_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism application stageses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTAS_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetTAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetTAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the tourism application stages that was removed
	 */
	public static TourismApplicationStages removeBygetTAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().removeBygetTAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetTAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the tourism application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName) {

		return getPersistence().findBygetTAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetTAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findBygetTAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_StageName_First(
			String stageName,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_StageName_First(
		String stageName,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetTAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_StageName_Last(
			String stageName,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_StageName_Last(
		String stageName,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetTAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages[] findBygetTAS_StageName_PrevAndNext(
			long tourismApplicationStagesId, String stageName,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_StageName_PrevAndNext(
			tourismApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the tourism application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetTAS_StageName(String stageName) {
		getPersistence().removeBygetTAS_StageName(stageName);
	}

	/**
	 * Returns the number of tourism application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_StageName(String stageName) {
		return getPersistence().countBygetTAS_StageName(stageName);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the tourism application stages that was removed
	 */
	public static TourismApplicationStages removeBygetTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().removeBygetTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetTAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetTAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the tourism application stages that was removed
	 */
	public static TourismApplicationStages removeBygetTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().removeBygetTAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetTAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus) {

		return getPersistence().findBygetTAS_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns a range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetTAS_SNAndSS(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findBygetTAS_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAS_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_SNAndSS_First(
			String stageName, String stageStatus,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_SNAndSS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_SNAndSS_First(
		String stageName, String stageStatus,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetTAS_SNAndSS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_SNAndSS_Last(
			String stageName, String stageStatus,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_SNAndSS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_SNAndSS_Last(
		String stageName, String stageStatus,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetTAS_SNAndSS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages[] findBygetTAS_SNAndSS_PrevAndNext(
			long tourismApplicationStagesId, String stageName,
			String stageStatus,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_SNAndSS_PrevAndNext(
			tourismApplicationStagesId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the tourism application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetTAS_SNAndSS(
		String stageName, String stageStatus) {

		getPersistence().removeBygetTAS_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns the number of tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_SNAndSS(
		String stageName, String stageStatus) {

		return getPersistence().countBygetTAS_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns all the tourism application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId) {

		return getPersistence().findBygetTAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetTAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findBygetTAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public static List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_CaseId_First(
			String caseId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseId_First(
		String caseId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetTAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages findBygetTAS_CaseId_Last(
			String caseId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages fetchBygetTAS_CaseId_Last(
		String caseId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetTAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages[] findBygetTAS_CaseId_PrevAndNext(
			long tourismApplicationStagesId, String caseId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findBygetTAS_CaseId_PrevAndNext(
			tourismApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the tourism application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetTAS_CaseId(String caseId) {
		getPersistence().removeBygetTAS_CaseId(caseId);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism application stageses
	 */
	public static int countBygetTAS_CaseId(String caseId) {
		return getPersistence().countBygetTAS_CaseId(caseId);
	}

	/**
	 * Caches the tourism application stages in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationStages the tourism application stages
	 */
	public static void cacheResult(
		TourismApplicationStages tourismApplicationStages) {

		getPersistence().cacheResult(tourismApplicationStages);
	}

	/**
	 * Caches the tourism application stageses in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationStageses the tourism application stageses
	 */
	public static void cacheResult(
		List<TourismApplicationStages> tourismApplicationStageses) {

		getPersistence().cacheResult(tourismApplicationStageses);
	}

	/**
	 * Creates a new tourism application stages with the primary key. Does not add the tourism application stages to the database.
	 *
	 * @param tourismApplicationStagesId the primary key for the new tourism application stages
	 * @return the new tourism application stages
	 */
	public static TourismApplicationStages create(
		long tourismApplicationStagesId) {

		return getPersistence().create(tourismApplicationStagesId);
	}

	/**
	 * Removes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages remove(
			long tourismApplicationStagesId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().remove(tourismApplicationStagesId);
	}

	public static TourismApplicationStages updateImpl(
		TourismApplicationStages tourismApplicationStages) {

		return getPersistence().updateImpl(tourismApplicationStages);
	}

	/**
	 * Returns the tourism application stages with the primary key or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages findByPrimaryKey(
			long tourismApplicationStagesId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getPersistence().findByPrimaryKey(tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages, or <code>null</code> if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages fetchByPrimaryKey(
		long tourismApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(tourismApplicationStagesId);
	}

	/**
	 * Returns all the tourism application stageses.
	 *
	 * @return the tourism application stageses
	 */
	public static List<TourismApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of tourism application stageses
	 */
	public static List<TourismApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application stageses
	 */
	public static List<TourismApplicationStages> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application stageses
	 */
	public static List<TourismApplicationStages> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism application stageses.
	 *
	 * @return the number of tourism application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismApplicationStagesPersistence _persistence;

}