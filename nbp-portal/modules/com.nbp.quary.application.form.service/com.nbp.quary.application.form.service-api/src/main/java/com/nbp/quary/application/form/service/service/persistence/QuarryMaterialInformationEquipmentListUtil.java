/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry material information equipment list service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryMaterialInformationEquipmentListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentListPersistence
 * @generated
 */
public class QuarryMaterialInformationEquipmentListUtil {

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
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		getPersistence().clearCache(quarryMaterialInformationEquipmentList);
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
	public static Map<Serializable, QuarryMaterialInformationEquipmentList>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryMaterialInformationEquipmentList update(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		return getPersistence().update(quarryMaterialInformationEquipmentList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryMaterialInformationEquipmentList update(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryMaterialInformationEquipmentList, serviceContext);
	}

	/**
	 * Returns all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(long quarryApplicationId) {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(long quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarry_ById(
			quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(
			long quarryApplicationId, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().findBygetQuarry_ById(
			quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(
			long quarryApplicationId, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetQuarry_ById(
			quarryApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
			findBygetQuarry_ById_First(
				long quarryApplicationId,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().findBygetQuarry_ById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_ById_First(
			long quarryApplicationId,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().fetchBygetQuarry_ById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
			findBygetQuarry_ById_Last(
				long quarryApplicationId,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().findBygetQuarry_ById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_ById_Last(
			long quarryApplicationId,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().fetchBygetQuarry_ById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the quarry material information equipment lists before and after the current quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param materialInfoId the primary key of the current quarry material information equipment list
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public static QuarryMaterialInformationEquipmentList[]
			findBygetQuarry_ById_PrevAndNext(
				long materialInfoId, long quarryApplicationId,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().findBygetQuarry_ById_PrevAndNext(
			materialInfoId, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the quarry material information equipment lists where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarry_ById(long quarryApplicationId) {
		getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry material information equipment lists
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @return the matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName) {

		return getPersistence().findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName);
	}

	/**
	 * Returns a range of all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end) {

		return getPersistence().findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
			findBygetQuarry_By_MachineName_AppId_First(
				long quarryApplicationId, String machineName,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().findBygetQuarry_By_MachineName_AppId_First(
			quarryApplicationId, machineName, orderByComparator);
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_By_MachineName_AppId_First(
			long quarryApplicationId, String machineName,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_MachineName_AppId_First(
			quarryApplicationId, machineName, orderByComparator);
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
			findBygetQuarry_By_MachineName_AppId_Last(
				long quarryApplicationId, String machineName,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().findBygetQuarry_By_MachineName_AppId_Last(
			quarryApplicationId, machineName, orderByComparator);
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public static QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_By_MachineName_AppId_Last(
			long quarryApplicationId, String machineName,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_MachineName_AppId_Last(
			quarryApplicationId, machineName, orderByComparator);
	}

	/**
	 * Returns the quarry material information equipment lists before and after the current quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param materialInfoId the primary key of the current quarry material information equipment list
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public static QuarryMaterialInformationEquipmentList[]
			findBygetQuarry_By_MachineName_AppId_PrevAndNext(
				long materialInfoId, long quarryApplicationId,
				String machineName,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().
			findBygetQuarry_By_MachineName_AppId_PrevAndNext(
				materialInfoId, quarryApplicationId, machineName,
				orderByComparator);
	}

	/**
	 * Removes all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 */
	public static void removeBygetQuarry_By_MachineName_AppId(
		long quarryApplicationId, String machineName) {

		getPersistence().removeBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName);
	}

	/**
	 * Returns the number of quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @return the number of matching quarry material information equipment lists
	 */
	public static int countBygetQuarry_By_MachineName_AppId(
		long quarryApplicationId, String machineName) {

		return getPersistence().countBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName);
	}

	/**
	 * Caches the quarry material information equipment list in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 */
	public static void cacheResult(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		getPersistence().cacheResult(quarryMaterialInformationEquipmentList);
	}

	/**
	 * Caches the quarry material information equipment lists in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformationEquipmentLists the quarry material information equipment lists
	 */
	public static void cacheResult(
		List<QuarryMaterialInformationEquipmentList>
			quarryMaterialInformationEquipmentLists) {

		getPersistence().cacheResult(quarryMaterialInformationEquipmentLists);
	}

	/**
	 * Creates a new quarry material information equipment list with the primary key. Does not add the quarry material information equipment list to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information equipment list
	 * @return the new quarry material information equipment list
	 */
	public static QuarryMaterialInformationEquipmentList create(
		long materialInfoId) {

		return getPersistence().create(materialInfoId);
	}

	/**
	 * Removes the quarry material information equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public static QuarryMaterialInformationEquipmentList remove(
			long materialInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().remove(materialInfoId);
	}

	public static QuarryMaterialInformationEquipmentList updateImpl(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		return getPersistence().updateImpl(
			quarryMaterialInformationEquipmentList);
	}

	/**
	 * Returns the quarry material information equipment list with the primary key or throws a <code>NoSuchQuarryMaterialInformationEquipmentListException</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public static QuarryMaterialInformationEquipmentList findByPrimaryKey(
			long materialInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationEquipmentListException {

		return getPersistence().findByPrimaryKey(materialInfoId);
	}

	/**
	 * Returns the quarry material information equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list, or <code>null</code> if a quarry material information equipment list with the primary key could not be found
	 */
	public static QuarryMaterialInformationEquipmentList fetchByPrimaryKey(
		long materialInfoId) {

		return getPersistence().fetchByPrimaryKey(materialInfoId);
	}

	/**
	 * Returns all the quarry material information equipment lists.
	 *
	 * @return the quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry material information equipment lists
	 */
	public static List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry material information equipment lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry material information equipment lists.
	 *
	 * @return the number of quarry material information equipment lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryMaterialInformationEquipmentListPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		QuarryMaterialInformationEquipmentListPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryMaterialInformationEquipmentListPersistence
		_persistence;

}