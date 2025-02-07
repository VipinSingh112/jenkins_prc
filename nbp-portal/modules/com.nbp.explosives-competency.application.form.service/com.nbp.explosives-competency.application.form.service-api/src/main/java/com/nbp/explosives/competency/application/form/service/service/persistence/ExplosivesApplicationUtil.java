/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosives application service. This utility wraps <code>com.nbp.explosives.competency.application.form.service.service.persistence.impl.ExplosivesApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationPersistence
 * @generated
 */
public class ExplosivesApplicationUtil {

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
	public static void clearCache(ExplosivesApplication explosivesApplication) {
		getPersistence().clearCache(explosivesApplication);
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
	public static Map<Serializable, ExplosivesApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosivesApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosivesApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosivesApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosivesApplication update(
		ExplosivesApplication explosivesApplication) {

		return getPersistence().update(explosivesApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosivesApplication update(
		ExplosivesApplication explosivesApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(explosivesApplication, serviceContext);
	}

	/**
	 * Returns all the explosives applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findByUuid_First(
			String uuid,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication[] findByUuid_PrevAndNext(
			long explosivesApplicationId, String uuid,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			explosivesApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the explosives applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of explosives applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosives applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the explosives application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of explosives applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosives applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication[] findByUuid_C_PrevAndNext(
			long explosivesApplicationId, String uuid, long companyId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			explosivesApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the explosives applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosives applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveById(explosivesApplicationId);
	}

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId, useFinderCache);
	}

	/**
	 * Removes the explosives application where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication removeBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().removeBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the number of explosives applications where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveById(long explosivesApplicationId) {
		return getPersistence().countBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId) {

		return getPersistence().findBygetExplosiveAppByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetExplosiveAppByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().findBygetExplosiveAppByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveAppByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetExplosiveAppByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveAppByStatusUser_First(
			int status, long userId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveAppByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication
		fetchBygetExplosiveAppByStatusUser_First(
			int status, long userId,
			OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchBygetExplosiveAppByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveAppByStatusUser_Last(
			int status, long userId,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveAppByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveAppByStatusUser_Last(
		int status, long userId,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchBygetExplosiveAppByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication[]
			findBygetExplosiveAppByStatusUser_PrevAndNext(
				long explosivesApplicationId, int status, long userId,
				OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveAppByStatusUser_PrevAndNext(
			explosivesApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the explosives applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetExplosiveAppByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetExplosiveAppByStatusUser(status, userId);
	}

	/**
	 * Returns the number of explosives applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveAppByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetExplosiveAppByStatusUser(
			status, userId);
	}

	/**
	 * Returns all the explosives applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status) {

		return getPersistence().findBygetExplosiveByStatus(status);
	}

	/**
	 * Returns a range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetExplosiveByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().findBygetExplosiveByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public static List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetExplosiveByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveByStatus_First(
			int status,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveByStatus_First(
		int status,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchBygetExplosiveByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveByStatus_Last(
			int status,
			OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveByStatus_Last(
		int status,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().fetchBygetExplosiveByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where status = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication[]
			findBygetExplosiveByStatus_PrevAndNext(
				long explosivesApplicationId, int status,
				OrderByComparator<ExplosivesApplication> orderByComparator)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveByStatus_PrevAndNext(
			explosivesApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the explosives applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetExplosiveByStatus(int status) {
		getPersistence().removeBygetExplosiveByStatus(status);
	}

	/**
	 * Returns the number of explosives applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveByStatus(int status) {
		return getPersistence().countBygetExplosiveByStatus(status);
	}

	/**
	 * Returns the explosives application where applicationNumber = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveByAppNo(
			String applicationNumber)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveByAppNo(applicationNumber);
	}

	/**
	 * Returns the explosives application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetExplosiveByAppNo(applicationNumber);
	}

	/**
	 * Returns the explosives application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the explosives application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication removeBygetExplosiveByAppNo(
			String applicationNumber)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().removeBygetExplosiveByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of explosives applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveByAppNo(String applicationNumber) {
		return getPersistence().countBygetExplosiveByAppNo(applicationNumber);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveByCaseId(
			String caseId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveByCaseId(caseId);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveByCaseId(
		String caseId) {

		return getPersistence().fetchBygetExplosiveByCaseId(caseId);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the explosives application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication removeBygetExplosiveByCaseId(
			String caseId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().removeBygetExplosiveByCaseId(caseId);
	}

	/**
	 * Returns the number of explosives applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveByCaseId(String caseId) {
		return getPersistence().countBygetExplosiveByCaseId(caseId);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveRegstBy_CaseId(
			String caseId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveRegstBy_CaseId(
		String caseId) {

		return getPersistence().fetchBygetExplosiveRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveRegstBy_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveRegstBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the explosives application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication removeBygetExplosiveRegstBy_CaseId(
			String caseId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().removeBygetExplosiveRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the number of explosives applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveRegstBy_CaseId(String caseId) {
		return getPersistence().countBygetExplosiveRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication findBygetExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findBygetExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication fetchBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication removeBygetExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().removeBygetExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of explosives applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching explosives applications
	 */
	public static int countBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the explosives application in the entity cache if it is enabled.
	 *
	 * @param explosivesApplication the explosives application
	 */
	public static void cacheResult(
		ExplosivesApplication explosivesApplication) {

		getPersistence().cacheResult(explosivesApplication);
	}

	/**
	 * Caches the explosives applications in the entity cache if it is enabled.
	 *
	 * @param explosivesApplications the explosives applications
	 */
	public static void cacheResult(
		List<ExplosivesApplication> explosivesApplications) {

		getPersistence().cacheResult(explosivesApplications);
	}

	/**
	 * Creates a new explosives application with the primary key. Does not add the explosives application to the database.
	 *
	 * @param explosivesApplicationId the primary key for the new explosives application
	 * @return the new explosives application
	 */
	public static ExplosivesApplication create(long explosivesApplicationId) {
		return getPersistence().create(explosivesApplicationId);
	}

	/**
	 * Removes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication remove(long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().remove(explosivesApplicationId);
	}

	public static ExplosivesApplication updateImpl(
		ExplosivesApplication explosivesApplication) {

		return getPersistence().updateImpl(explosivesApplication);
	}

	/**
	 * Returns the explosives application with the primary key or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication findByPrimaryKey(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getPersistence().findByPrimaryKey(explosivesApplicationId);
	}

	/**
	 * Returns the explosives application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application, or <code>null</code> if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication fetchByPrimaryKey(
		long explosivesApplicationId) {

		return getPersistence().fetchByPrimaryKey(explosivesApplicationId);
	}

	/**
	 * Returns all the explosives applications.
	 *
	 * @return the explosives applications
	 */
	public static List<ExplosivesApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of explosives applications
	 */
	public static List<ExplosivesApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosives applications
	 */
	public static List<ExplosivesApplication> findAll(
		int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosives applications
	 */
	public static List<ExplosivesApplication> findAll(
		int start, int end,
		OrderByComparator<ExplosivesApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosives applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosives applications.
	 *
	 * @return the number of explosives applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosivesApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosivesApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosivesApplicationPersistence _persistence;

}