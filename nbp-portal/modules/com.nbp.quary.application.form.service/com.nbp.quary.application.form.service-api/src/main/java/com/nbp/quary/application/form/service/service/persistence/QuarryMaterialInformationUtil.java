/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryMaterialInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry material information service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryMaterialInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationPersistence
 * @generated
 */
public class QuarryMaterialInformationUtil {

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
		QuarryMaterialInformation quarryMaterialInformation) {

		getPersistence().clearCache(quarryMaterialInformation);
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
	public static Map<Serializable, QuarryMaterialInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryMaterialInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryMaterialInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryMaterialInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryMaterialInformation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryMaterialInformation update(
		QuarryMaterialInformation quarryMaterialInformation) {

		return getPersistence().update(quarryMaterialInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryMaterialInformation update(
		QuarryMaterialInformation quarryMaterialInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryMaterialInformation, serviceContext);
	}

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryMaterialInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a matching quarry material information could not be found
	 */
	public static QuarryMaterialInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationException {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information, or <code>null</code> if a matching quarry material information could not be found
	 */
	public static QuarryMaterialInformation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry material information, or <code>null</code> if a matching quarry material information could not be found
	 */
	public static QuarryMaterialInformation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_ById(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry material information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry material information that was removed
	 */
	public static QuarryMaterialInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationException {

		return getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry material informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry material informations
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Caches the quarry material information in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformation the quarry material information
	 */
	public static void cacheResult(
		QuarryMaterialInformation quarryMaterialInformation) {

		getPersistence().cacheResult(quarryMaterialInformation);
	}

	/**
	 * Caches the quarry material informations in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformations the quarry material informations
	 */
	public static void cacheResult(
		List<QuarryMaterialInformation> quarryMaterialInformations) {

		getPersistence().cacheResult(quarryMaterialInformations);
	}

	/**
	 * Creates a new quarry material information with the primary key. Does not add the quarry material information to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information
	 * @return the new quarry material information
	 */
	public static QuarryMaterialInformation create(long materialInfoId) {
		return getPersistence().create(materialInfoId);
	}

	/**
	 * Removes the quarry material information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information that was removed
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	public static QuarryMaterialInformation remove(long materialInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationException {

		return getPersistence().remove(materialInfoId);
	}

	public static QuarryMaterialInformation updateImpl(
		QuarryMaterialInformation quarryMaterialInformation) {

		return getPersistence().updateImpl(quarryMaterialInformation);
	}

	/**
	 * Returns the quarry material information with the primary key or throws a <code>NoSuchQuarryMaterialInformationException</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	public static QuarryMaterialInformation findByPrimaryKey(
			long materialInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryMaterialInformationException {

		return getPersistence().findByPrimaryKey(materialInfoId);
	}

	/**
	 * Returns the quarry material information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information, or <code>null</code> if a quarry material information with the primary key could not be found
	 */
	public static QuarryMaterialInformation fetchByPrimaryKey(
		long materialInfoId) {

		return getPersistence().fetchByPrimaryKey(materialInfoId);
	}

	/**
	 * Returns all the quarry material informations.
	 *
	 * @return the quarry material informations
	 */
	public static List<QuarryMaterialInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @return the range of quarry material informations
	 */
	public static List<QuarryMaterialInformation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry material informations
	 */
	public static List<QuarryMaterialInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry material informations
	 */
	public static List<QuarryMaterialInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry material informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry material informations.
	 *
	 * @return the number of quarry material informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryMaterialInformationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryMaterialInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryMaterialInformationPersistence _persistence;

}