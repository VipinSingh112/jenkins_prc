/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.entity.information.services.model.EntityInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the entity information service. This utility wraps <code>com.nbp.entity.information.services.service.persistence.impl.EntityInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformationPersistence
 * @generated
 */
public class EntityInformationUtil {

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
	public static void clearCache(EntityInformation entityInformation) {
		getPersistence().clearCache(entityInformation);
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
	public static Map<Serializable, EntityInformation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EntityInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EntityInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EntityInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EntityInformation update(
		EntityInformation entityInformation) {

		return getPersistence().update(entityInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EntityInformation update(
		EntityInformation entityInformation, ServiceContext serviceContext) {

		return getPersistence().update(entityInformation, serviceContext);
	}

	/**
	 * Returns all the entity informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entity informations
	 */
	public static List<EntityInformation> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the entity informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of matching entity informations
	 */
	public static List<EntityInformation> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity informations
	 */
	public static List<EntityInformation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity informations
	 */
	public static List<EntityInformation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EntityInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public static EntityInformation findByUuid_First(
			String uuid, OrderByComparator<EntityInformation> orderByComparator)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByUuid_First(
		String uuid, OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public static EntityInformation findByUuid_Last(
			String uuid, OrderByComparator<EntityInformation> orderByComparator)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByUuid_Last(
		String uuid, OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the entity informations before and after the current entity information in the ordered set where uuid = &#63;.
	 *
	 * @param entityInfoId the primary key of the current entity information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity information
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public static EntityInformation[] findByUuid_PrevAndNext(
			long entityInfoId, String uuid,
			OrderByComparator<EntityInformation> orderByComparator)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUuid_PrevAndNext(
			entityInfoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the entity informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of entity informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entity informations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the entity information where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntityInformationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public static EntityInformation findByUUID_G(String uuid, long groupId)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the entity information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the entity information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the entity information where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the entity information that was removed
	 */
	public static EntityInformation removeByUUID_G(String uuid, long groupId)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of entity informations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching entity informations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching entity informations
	 */
	public static List<EntityInformation> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of matching entity informations
	 */
	public static List<EntityInformation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entity informations
	 */
	public static List<EntityInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entity informations
	 */
	public static List<EntityInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EntityInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public static EntityInformation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EntityInformation> orderByComparator)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public static EntityInformation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EntityInformation> orderByComparator)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the entity informations before and after the current entity information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param entityInfoId the primary key of the current entity information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entity information
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public static EntityInformation[] findByUuid_C_PrevAndNext(
			long entityInfoId, String uuid, long companyId,
			OrderByComparator<EntityInformation> orderByComparator)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			entityInfoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the entity informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of entity informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching entity informations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the entity information where entityNumber = &#63; or throws a <code>NoSuchEntityInformationException</code> if it could not be found.
	 *
	 * @param entityNumber the entity number
	 * @return the matching entity information
	 * @throws NoSuchEntityInformationException if a matching entity information could not be found
	 */
	public static EntityInformation findByentityNumber(String entityNumber)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByentityNumber(entityNumber);
	}

	/**
	 * Returns the entity information where entityNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityNumber the entity number
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByentityNumber(String entityNumber) {
		return getPersistence().fetchByentityNumber(entityNumber);
	}

	/**
	 * Returns the entity information where entityNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityNumber the entity number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchByentityNumber(
		String entityNumber, boolean useFinderCache) {

		return getPersistence().fetchByentityNumber(
			entityNumber, useFinderCache);
	}

	/**
	 * Removes the entity information where entityNumber = &#63; from the database.
	 *
	 * @param entityNumber the entity number
	 * @return the entity information that was removed
	 */
	public static EntityInformation removeByentityNumber(String entityNumber)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().removeByentityNumber(entityNumber);
	}

	/**
	 * Returns the number of entity informations where entityNumber = &#63;.
	 *
	 * @param entityNumber the entity number
	 * @return the number of matching entity informations
	 */
	public static int countByentityNumber(String entityNumber) {
		return getPersistence().countByentityNumber(entityNumber);
	}

	/**
	 * Caches the entity information in the entity cache if it is enabled.
	 *
	 * @param entityInformation the entity information
	 */
	public static void cacheResult(EntityInformation entityInformation) {
		getPersistence().cacheResult(entityInformation);
	}

	/**
	 * Caches the entity informations in the entity cache if it is enabled.
	 *
	 * @param entityInformations the entity informations
	 */
	public static void cacheResult(List<EntityInformation> entityInformations) {
		getPersistence().cacheResult(entityInformations);
	}

	/**
	 * Creates a new entity information with the primary key. Does not add the entity information to the database.
	 *
	 * @param entityInfoId the primary key for the new entity information
	 * @return the new entity information
	 */
	public static EntityInformation create(long entityInfoId) {
		return getPersistence().create(entityInfoId);
	}

	/**
	 * Removes the entity information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information that was removed
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public static EntityInformation remove(long entityInfoId)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().remove(entityInfoId);
	}

	public static EntityInformation updateImpl(
		EntityInformation entityInformation) {

		return getPersistence().updateImpl(entityInformation);
	}

	/**
	 * Returns the entity information with the primary key or throws a <code>NoSuchEntityInformationException</code> if it could not be found.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information
	 * @throws NoSuchEntityInformationException if a entity information with the primary key could not be found
	 */
	public static EntityInformation findByPrimaryKey(long entityInfoId)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getPersistence().findByPrimaryKey(entityInfoId);
	}

	/**
	 * Returns the entity information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information, or <code>null</code> if a entity information with the primary key could not be found
	 */
	public static EntityInformation fetchByPrimaryKey(long entityInfoId) {
		return getPersistence().fetchByPrimaryKey(entityInfoId);
	}

	/**
	 * Returns all the entity informations.
	 *
	 * @return the entity informations
	 */
	public static List<EntityInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of entity informations
	 */
	public static List<EntityInformation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entity informations
	 */
	public static List<EntityInformation> findAll(
		int start, int end,
		OrderByComparator<EntityInformation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entity informations
	 */
	public static List<EntityInformation> findAll(
		int start, int end,
		OrderByComparator<EntityInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the entity informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of entity informations.
	 *
	 * @return the number of entity informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EntityInformationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		EntityInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile EntityInformationPersistence _persistence;

}