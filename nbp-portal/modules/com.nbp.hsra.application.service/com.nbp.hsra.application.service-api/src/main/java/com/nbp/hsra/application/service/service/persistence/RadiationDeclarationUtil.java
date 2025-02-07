/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationDeclaration;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radiation declaration service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadiationDeclarationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDeclarationPersistence
 * @generated
 */
public class RadiationDeclarationUtil {

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
	public static void clearCache(RadiationDeclaration radiationDeclaration) {
		getPersistence().clearCache(radiationDeclaration);
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
	public static Map<Serializable, RadiationDeclaration> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadiationDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadiationDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadiationDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadiationDeclaration> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadiationDeclaration update(
		RadiationDeclaration radiationDeclaration) {

		return getPersistence().update(radiationDeclaration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadiationDeclaration update(
		RadiationDeclaration radiationDeclaration,
		ServiceContext serviceContext) {

		return getPersistence().update(radiationDeclaration, serviceContext);
	}

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationDeclarationException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a matching radiation declaration could not be found
	 */
	public static RadiationDeclaration findBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDeclarationException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation declaration, or <code>null</code> if a matching radiation declaration could not be found
	 */
	public static RadiationDeclaration fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation declaration, or <code>null</code> if a matching radiation declaration could not be found
	 */
	public static RadiationDeclaration fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the radiation declaration where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation declaration that was removed
	 */
	public static RadiationDeclaration removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDeclarationException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radiation declarations where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation declarations
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radiation declaration in the entity cache if it is enabled.
	 *
	 * @param radiationDeclaration the radiation declaration
	 */
	public static void cacheResult(RadiationDeclaration radiationDeclaration) {
		getPersistence().cacheResult(radiationDeclaration);
	}

	/**
	 * Caches the radiation declarations in the entity cache if it is enabled.
	 *
	 * @param radiationDeclarations the radiation declarations
	 */
	public static void cacheResult(
		List<RadiationDeclaration> radiationDeclarations) {

		getPersistence().cacheResult(radiationDeclarations);
	}

	/**
	 * Creates a new radiation declaration with the primary key. Does not add the radiation declaration to the database.
	 *
	 * @param radiationDeclarationId the primary key for the new radiation declaration
	 * @return the new radiation declaration
	 */
	public static RadiationDeclaration create(long radiationDeclarationId) {
		return getPersistence().create(radiationDeclarationId);
	}

	/**
	 * Removes the radiation declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration that was removed
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	public static RadiationDeclaration remove(long radiationDeclarationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDeclarationException {

		return getPersistence().remove(radiationDeclarationId);
	}

	public static RadiationDeclaration updateImpl(
		RadiationDeclaration radiationDeclaration) {

		return getPersistence().updateImpl(radiationDeclaration);
	}

	/**
	 * Returns the radiation declaration with the primary key or throws a <code>NoSuchRadiationDeclarationException</code> if it could not be found.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	public static RadiationDeclaration findByPrimaryKey(
			long radiationDeclarationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDeclarationException {

		return getPersistence().findByPrimaryKey(radiationDeclarationId);
	}

	/**
	 * Returns the radiation declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration, or <code>null</code> if a radiation declaration with the primary key could not be found
	 */
	public static RadiationDeclaration fetchByPrimaryKey(
		long radiationDeclarationId) {

		return getPersistence().fetchByPrimaryKey(radiationDeclarationId);
	}

	/**
	 * Returns all the radiation declarations.
	 *
	 * @return the radiation declarations
	 */
	public static List<RadiationDeclaration> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @return the range of radiation declarations
	 */
	public static List<RadiationDeclaration> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation declarations
	 */
	public static List<RadiationDeclaration> findAll(
		int start, int end,
		OrderByComparator<RadiationDeclaration> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation declarations
	 */
	public static List<RadiationDeclaration> findAll(
		int start, int end,
		OrderByComparator<RadiationDeclaration> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radiation declarations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radiation declarations.
	 *
	 * @return the number of radiation declarations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadiationDeclarationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RadiationDeclarationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RadiationDeclarationPersistence _persistence;

}