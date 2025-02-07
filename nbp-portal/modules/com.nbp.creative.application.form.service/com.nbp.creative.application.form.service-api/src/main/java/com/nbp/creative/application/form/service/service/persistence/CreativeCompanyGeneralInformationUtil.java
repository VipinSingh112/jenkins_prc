/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeCompanyGeneralInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative company general information service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeCompanyGeneralInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyGeneralInformationPersistence
 * @generated
 */
public class CreativeCompanyGeneralInformationUtil {

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
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		getPersistence().clearCache(creativeCompanyGeneralInformation);
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
	public static Map<Serializable, CreativeCompanyGeneralInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeCompanyGeneralInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeCompanyGeneralInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeCompanyGeneralInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeCompanyGeneralInformation>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeCompanyGeneralInformation update(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		return getPersistence().update(creativeCompanyGeneralInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeCompanyGeneralInformation update(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeCompanyGeneralInformation, serviceContext);
	}

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyGeneralInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a matching creative company general information could not be found
	 */
	public static CreativeCompanyGeneralInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyGeneralInformationException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company general information, or <code>null</code> if a matching creative company general information could not be found
	 */
	public static CreativeCompanyGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company general information, or <code>null</code> if a matching creative company general information could not be found
	 */
	public static CreativeCompanyGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative company general information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company general information that was removed
	 */
	public static CreativeCompanyGeneralInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyGeneralInformationException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative company general informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company general informations
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Caches the creative company general information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyGeneralInformation the creative company general information
	 */
	public static void cacheResult(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		getPersistence().cacheResult(creativeCompanyGeneralInformation);
	}

	/**
	 * Caches the creative company general informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyGeneralInformations the creative company general informations
	 */
	public static void cacheResult(
		List<CreativeCompanyGeneralInformation>
			creativeCompanyGeneralInformations) {

		getPersistence().cacheResult(creativeCompanyGeneralInformations);
	}

	/**
	 * Creates a new creative company general information with the primary key. Does not add the creative company general information to the database.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key for the new creative company general information
	 * @return the new creative company general information
	 */
	public static CreativeCompanyGeneralInformation create(
		long creativeCompanyGeneralInfoId) {

		return getPersistence().create(creativeCompanyGeneralInfoId);
	}

	/**
	 * Removes the creative company general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information that was removed
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	public static CreativeCompanyGeneralInformation remove(
			long creativeCompanyGeneralInfoId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyGeneralInformationException {

		return getPersistence().remove(creativeCompanyGeneralInfoId);
	}

	public static CreativeCompanyGeneralInformation updateImpl(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		return getPersistence().updateImpl(creativeCompanyGeneralInformation);
	}

	/**
	 * Returns the creative company general information with the primary key or throws a <code>NoSuchCreativeCompanyGeneralInformationException</code> if it could not be found.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	public static CreativeCompanyGeneralInformation findByPrimaryKey(
			long creativeCompanyGeneralInfoId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyGeneralInformationException {

		return getPersistence().findByPrimaryKey(creativeCompanyGeneralInfoId);
	}

	/**
	 * Returns the creative company general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information, or <code>null</code> if a creative company general information with the primary key could not be found
	 */
	public static CreativeCompanyGeneralInformation fetchByPrimaryKey(
		long creativeCompanyGeneralInfoId) {

		return getPersistence().fetchByPrimaryKey(creativeCompanyGeneralInfoId);
	}

	/**
	 * Returns all the creative company general informations.
	 *
	 * @return the creative company general informations
	 */
	public static List<CreativeCompanyGeneralInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @return the range of creative company general informations
	 */
	public static List<CreativeCompanyGeneralInformation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company general informations
	 */
	public static List<CreativeCompanyGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyGeneralInformation>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company general informations
	 */
	public static List<CreativeCompanyGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyGeneralInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative company general informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative company general informations.
	 *
	 * @return the number of creative company general informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeCompanyGeneralInformationPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CreativeCompanyGeneralInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeCompanyGeneralInformationPersistence
		_persistence;

}