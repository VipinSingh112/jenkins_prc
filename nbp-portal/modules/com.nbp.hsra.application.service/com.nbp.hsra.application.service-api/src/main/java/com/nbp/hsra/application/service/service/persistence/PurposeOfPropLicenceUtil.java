/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.PurposeOfPropLicence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the purpose of prop licence service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.PurposeOfPropLicencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicencePersistence
 * @generated
 */
public class PurposeOfPropLicenceUtil {

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
	public static void clearCache(PurposeOfPropLicence purposeOfPropLicence) {
		getPersistence().clearCache(purposeOfPropLicence);
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
	public static Map<Serializable, PurposeOfPropLicence> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PurposeOfPropLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PurposeOfPropLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PurposeOfPropLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PurposeOfPropLicence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PurposeOfPropLicence update(
		PurposeOfPropLicence purposeOfPropLicence) {

		return getPersistence().update(purposeOfPropLicence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PurposeOfPropLicence update(
		PurposeOfPropLicence purposeOfPropLicence,
		ServiceContext serviceContext) {

		return getPersistence().update(purposeOfPropLicence, serviceContext);
	}

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or throws a <code>NoSuchPurposeOfPropLicenceException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a matching purpose of prop licence could not be found
	 */
	public static PurposeOfPropLicence findBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchPurposeOfPropLicenceException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching purpose of prop licence, or <code>null</code> if a matching purpose of prop licence could not be found
	 */
	public static PurposeOfPropLicence fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching purpose of prop licence, or <code>null</code> if a matching purpose of prop licence could not be found
	 */
	public static PurposeOfPropLicence fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the purpose of prop licence where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the purpose of prop licence that was removed
	 */
	public static PurposeOfPropLicence removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchPurposeOfPropLicenceException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of purpose of prop licences where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching purpose of prop licences
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the purpose of prop licence in the entity cache if it is enabled.
	 *
	 * @param purposeOfPropLicence the purpose of prop licence
	 */
	public static void cacheResult(PurposeOfPropLicence purposeOfPropLicence) {
		getPersistence().cacheResult(purposeOfPropLicence);
	}

	/**
	 * Caches the purpose of prop licences in the entity cache if it is enabled.
	 *
	 * @param purposeOfPropLicences the purpose of prop licences
	 */
	public static void cacheResult(
		List<PurposeOfPropLicence> purposeOfPropLicences) {

		getPersistence().cacheResult(purposeOfPropLicences);
	}

	/**
	 * Creates a new purpose of prop licence with the primary key. Does not add the purpose of prop licence to the database.
	 *
	 * @param purposeOfPropLicenceId the primary key for the new purpose of prop licence
	 * @return the new purpose of prop licence
	 */
	public static PurposeOfPropLicence create(long purposeOfPropLicenceId) {
		return getPersistence().create(purposeOfPropLicenceId);
	}

	/**
	 * Removes the purpose of prop licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence that was removed
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	public static PurposeOfPropLicence remove(long purposeOfPropLicenceId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchPurposeOfPropLicenceException {

		return getPersistence().remove(purposeOfPropLicenceId);
	}

	public static PurposeOfPropLicence updateImpl(
		PurposeOfPropLicence purposeOfPropLicence) {

		return getPersistence().updateImpl(purposeOfPropLicence);
	}

	/**
	 * Returns the purpose of prop licence with the primary key or throws a <code>NoSuchPurposeOfPropLicenceException</code> if it could not be found.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	public static PurposeOfPropLicence findByPrimaryKey(
			long purposeOfPropLicenceId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchPurposeOfPropLicenceException {

		return getPersistence().findByPrimaryKey(purposeOfPropLicenceId);
	}

	/**
	 * Returns the purpose of prop licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence, or <code>null</code> if a purpose of prop licence with the primary key could not be found
	 */
	public static PurposeOfPropLicence fetchByPrimaryKey(
		long purposeOfPropLicenceId) {

		return getPersistence().fetchByPrimaryKey(purposeOfPropLicenceId);
	}

	/**
	 * Returns all the purpose of prop licences.
	 *
	 * @return the purpose of prop licences
	 */
	public static List<PurposeOfPropLicence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @return the range of purpose of prop licences
	 */
	public static List<PurposeOfPropLicence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of purpose of prop licences
	 */
	public static List<PurposeOfPropLicence> findAll(
		int start, int end,
		OrderByComparator<PurposeOfPropLicence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of purpose of prop licences
	 */
	public static List<PurposeOfPropLicence> findAll(
		int start, int end,
		OrderByComparator<PurposeOfPropLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the purpose of prop licences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of purpose of prop licences.
	 *
	 * @return the number of purpose of prop licences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PurposeOfPropLicencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PurposeOfPropLicencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PurposeOfPropLicencePersistence _persistence;

}