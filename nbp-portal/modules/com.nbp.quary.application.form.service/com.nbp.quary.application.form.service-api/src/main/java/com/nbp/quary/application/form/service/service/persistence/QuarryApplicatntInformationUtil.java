/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplicatntInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry applicatnt information service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryApplicatntInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformationPersistence
 * @generated
 */
public class QuarryApplicatntInformationUtil {

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
		QuarryApplicatntInformation quarryApplicatntInformation) {

		getPersistence().clearCache(quarryApplicatntInformation);
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
	public static Map<Serializable, QuarryApplicatntInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryApplicatntInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryApplicatntInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryApplicatntInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryApplicatntInformation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryApplicatntInformation update(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		return getPersistence().update(quarryApplicatntInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryApplicatntInformation update(
		QuarryApplicatntInformation quarryApplicatntInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryApplicatntInformation, serviceContext);
	}

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicatntInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a matching quarry applicatnt information could not be found
	 */
	public static QuarryApplicatntInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicatntInformationException {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry applicatnt information, or <code>null</code> if a matching quarry applicatnt information could not be found
	 */
	public static QuarryApplicatntInformation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry applicatnt information, or <code>null</code> if a matching quarry applicatnt information could not be found
	 */
	public static QuarryApplicatntInformation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_ById(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry applicatnt information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry applicatnt information that was removed
	 */
	public static QuarryApplicatntInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicatntInformationException {

		return getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry applicatnt informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry applicatnt informations
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Caches the quarry applicatnt information in the entity cache if it is enabled.
	 *
	 * @param quarryApplicatntInformation the quarry applicatnt information
	 */
	public static void cacheResult(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		getPersistence().cacheResult(quarryApplicatntInformation);
	}

	/**
	 * Caches the quarry applicatnt informations in the entity cache if it is enabled.
	 *
	 * @param quarryApplicatntInformations the quarry applicatnt informations
	 */
	public static void cacheResult(
		List<QuarryApplicatntInformation> quarryApplicatntInformations) {

		getPersistence().cacheResult(quarryApplicatntInformations);
	}

	/**
	 * Creates a new quarry applicatnt information with the primary key. Does not add the quarry applicatnt information to the database.
	 *
	 * @param auarryApplicantId the primary key for the new quarry applicatnt information
	 * @return the new quarry applicatnt information
	 */
	public static QuarryApplicatntInformation create(long auarryApplicantId) {
		return getPersistence().create(auarryApplicantId);
	}

	/**
	 * Removes the quarry applicatnt information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information that was removed
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	public static QuarryApplicatntInformation remove(long auarryApplicantId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicatntInformationException {

		return getPersistence().remove(auarryApplicantId);
	}

	public static QuarryApplicatntInformation updateImpl(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		return getPersistence().updateImpl(quarryApplicatntInformation);
	}

	/**
	 * Returns the quarry applicatnt information with the primary key or throws a <code>NoSuchQuarryApplicatntInformationException</code> if it could not be found.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	public static QuarryApplicatntInformation findByPrimaryKey(
			long auarryApplicantId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicatntInformationException {

		return getPersistence().findByPrimaryKey(auarryApplicantId);
	}

	/**
	 * Returns the quarry applicatnt information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information, or <code>null</code> if a quarry applicatnt information with the primary key could not be found
	 */
	public static QuarryApplicatntInformation fetchByPrimaryKey(
		long auarryApplicantId) {

		return getPersistence().fetchByPrimaryKey(auarryApplicantId);
	}

	/**
	 * Returns all the quarry applicatnt informations.
	 *
	 * @return the quarry applicatnt informations
	 */
	public static List<QuarryApplicatntInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @return the range of quarry applicatnt informations
	 */
	public static List<QuarryApplicatntInformation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry applicatnt informations
	 */
	public static List<QuarryApplicatntInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicatntInformation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry applicatnt informations
	 */
	public static List<QuarryApplicatntInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicatntInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry applicatnt informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry applicatnt informations.
	 *
	 * @return the number of quarry applicatnt informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryApplicatntInformationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryApplicatntInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryApplicatntInformationPersistence _persistence;

}