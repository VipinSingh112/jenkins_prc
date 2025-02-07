/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry general information service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryGeneralInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformationPersistence
 * @generated
 */
public class QuarryGeneralInformationUtil {

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
		QuarryGeneralInformation quarryGeneralInformation) {

		getPersistence().clearCache(quarryGeneralInformation);
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
	public static Map<Serializable, QuarryGeneralInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryGeneralInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryGeneralInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryGeneralInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryGeneralInformation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryGeneralInformation update(
		QuarryGeneralInformation quarryGeneralInformation) {

		return getPersistence().update(quarryGeneralInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryGeneralInformation update(
		QuarryGeneralInformation quarryGeneralInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryGeneralInformation, serviceContext);
	}

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryGeneralInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a matching quarry general information could not be found
	 */
	public static QuarryGeneralInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryGeneralInformationException {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry general information, or <code>null</code> if a matching quarry general information could not be found
	 */
	public static QuarryGeneralInformation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry general information, or <code>null</code> if a matching quarry general information could not be found
	 */
	public static QuarryGeneralInformation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_ById(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry general information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry general information that was removed
	 */
	public static QuarryGeneralInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryGeneralInformationException {

		return getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry general informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry general informations
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Caches the quarry general information in the entity cache if it is enabled.
	 *
	 * @param quarryGeneralInformation the quarry general information
	 */
	public static void cacheResult(
		QuarryGeneralInformation quarryGeneralInformation) {

		getPersistence().cacheResult(quarryGeneralInformation);
	}

	/**
	 * Caches the quarry general informations in the entity cache if it is enabled.
	 *
	 * @param quarryGeneralInformations the quarry general informations
	 */
	public static void cacheResult(
		List<QuarryGeneralInformation> quarryGeneralInformations) {

		getPersistence().cacheResult(quarryGeneralInformations);
	}

	/**
	 * Creates a new quarry general information with the primary key. Does not add the quarry general information to the database.
	 *
	 * @param generalInfoId the primary key for the new quarry general information
	 * @return the new quarry general information
	 */
	public static QuarryGeneralInformation create(long generalInfoId) {
		return getPersistence().create(generalInfoId);
	}

	/**
	 * Removes the quarry general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information that was removed
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	public static QuarryGeneralInformation remove(long generalInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryGeneralInformationException {

		return getPersistence().remove(generalInfoId);
	}

	public static QuarryGeneralInformation updateImpl(
		QuarryGeneralInformation quarryGeneralInformation) {

		return getPersistence().updateImpl(quarryGeneralInformation);
	}

	/**
	 * Returns the quarry general information with the primary key or throws a <code>NoSuchQuarryGeneralInformationException</code> if it could not be found.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	public static QuarryGeneralInformation findByPrimaryKey(long generalInfoId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryGeneralInformationException {

		return getPersistence().findByPrimaryKey(generalInfoId);
	}

	/**
	 * Returns the quarry general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information, or <code>null</code> if a quarry general information with the primary key could not be found
	 */
	public static QuarryGeneralInformation fetchByPrimaryKey(
		long generalInfoId) {

		return getPersistence().fetchByPrimaryKey(generalInfoId);
	}

	/**
	 * Returns all the quarry general informations.
	 *
	 * @return the quarry general informations
	 */
	public static List<QuarryGeneralInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @return the range of quarry general informations
	 */
	public static List<QuarryGeneralInformation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry general informations
	 */
	public static List<QuarryGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryGeneralInformation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry general informations
	 */
	public static List<QuarryGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryGeneralInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry general informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry general informations.
	 *
	 * @return the number of quarry general informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryGeneralInformationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryGeneralInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryGeneralInformationPersistence _persistence;

}