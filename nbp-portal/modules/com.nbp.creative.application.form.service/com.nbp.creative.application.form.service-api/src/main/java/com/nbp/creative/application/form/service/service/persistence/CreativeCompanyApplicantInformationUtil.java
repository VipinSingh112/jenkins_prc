/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative company applicant information service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeCompanyApplicantInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationPersistence
 * @generated
 */
public class CreativeCompanyApplicantInformationUtil {

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
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		getPersistence().clearCache(creativeCompanyApplicantInformation);
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
	public static Map<Serializable, CreativeCompanyApplicantInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeCompanyApplicantInformation>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeCompanyApplicantInformation>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeCompanyApplicantInformation>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<CreativeCompanyApplicantInformation>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeCompanyApplicantInformation update(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		return getPersistence().update(creativeCompanyApplicantInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeCompanyApplicantInformation update(
		CreativeCompanyApplicantInformation creativeCompanyApplicantInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeCompanyApplicantInformation, serviceContext);
	}

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyApplicantInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a matching creative company applicant information could not be found
	 */
	public static CreativeCompanyApplicantInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyApplicantInformationException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company applicant information, or <code>null</code> if a matching creative company applicant information could not be found
	 */
	public static CreativeCompanyApplicantInformation fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company applicant information, or <code>null</code> if a matching creative company applicant information could not be found
	 */
	public static CreativeCompanyApplicantInformation fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative company applicant information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company applicant information that was removed
	 */
	public static CreativeCompanyApplicantInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyApplicantInformationException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative company applicant informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company applicant informations
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Caches the creative company applicant information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 */
	public static void cacheResult(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		getPersistence().cacheResult(creativeCompanyApplicantInformation);
	}

	/**
	 * Caches the creative company applicant informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyApplicantInformations the creative company applicant informations
	 */
	public static void cacheResult(
		List<CreativeCompanyApplicantInformation>
			creativeCompanyApplicantInformations) {

		getPersistence().cacheResult(creativeCompanyApplicantInformations);
	}

	/**
	 * Creates a new creative company applicant information with the primary key. Does not add the creative company applicant information to the database.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key for the new creative company applicant information
	 * @return the new creative company applicant information
	 */
	public static CreativeCompanyApplicantInformation create(
		long creativeCompanyApplicantInfoId) {

		return getPersistence().create(creativeCompanyApplicantInfoId);
	}

	/**
	 * Removes the creative company applicant information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information that was removed
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	public static CreativeCompanyApplicantInformation remove(
			long creativeCompanyApplicantInfoId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyApplicantInformationException {

		return getPersistence().remove(creativeCompanyApplicantInfoId);
	}

	public static CreativeCompanyApplicantInformation updateImpl(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		return getPersistence().updateImpl(creativeCompanyApplicantInformation);
	}

	/**
	 * Returns the creative company applicant information with the primary key or throws a <code>NoSuchCreativeCompanyApplicantInformationException</code> if it could not be found.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	public static CreativeCompanyApplicantInformation findByPrimaryKey(
			long creativeCompanyApplicantInfoId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyApplicantInformationException {

		return getPersistence().findByPrimaryKey(
			creativeCompanyApplicantInfoId);
	}

	/**
	 * Returns the creative company applicant information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information, or <code>null</code> if a creative company applicant information with the primary key could not be found
	 */
	public static CreativeCompanyApplicantInformation fetchByPrimaryKey(
		long creativeCompanyApplicantInfoId) {

		return getPersistence().fetchByPrimaryKey(
			creativeCompanyApplicantInfoId);
	}

	/**
	 * Returns all the creative company applicant informations.
	 *
	 * @return the creative company applicant informations
	 */
	public static List<CreativeCompanyApplicantInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @return the range of creative company applicant informations
	 */
	public static List<CreativeCompanyApplicantInformation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company applicant informations
	 */
	public static List<CreativeCompanyApplicantInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyApplicantInformation>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company applicant informations
	 */
	public static List<CreativeCompanyApplicantInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyApplicantInformation>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative company applicant informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative company applicant informations.
	 *
	 * @return the number of creative company applicant informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeCompanyApplicantInformationPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CreativeCompanyApplicantInformationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeCompanyApplicantInformationPersistence
		_persistence;

}