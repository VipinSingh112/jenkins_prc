/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtClaimToProperty;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt claim to property service. This utility wraps <code>com.nbp.ogt.application.form.services.service.persistence.impl.OgtClaimToPropertyPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToPropertyPersistence
 * @generated
 */
public class OgtClaimToPropertyUtil {

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
	public static void clearCache(OgtClaimToProperty ogtClaimToProperty) {
		getPersistence().clearCache(ogtClaimToProperty);
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
	public static Map<Serializable, OgtClaimToProperty> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OgtClaimToProperty> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OgtClaimToProperty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OgtClaimToProperty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OgtClaimToProperty> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OgtClaimToProperty update(
		OgtClaimToProperty ogtClaimToProperty) {

		return getPersistence().update(ogtClaimToProperty);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OgtClaimToProperty update(
		OgtClaimToProperty ogtClaimToProperty, ServiceContext serviceContext) {

		return getPersistence().update(ogtClaimToProperty, serviceContext);
	}

	/**
	 * Returns the ogt claim to property where ogtApplicationId = &#63; or throws a <code>NoSuchOgtClaimToPropertyException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to property
	 * @throws NoSuchOgtClaimToPropertyException if a matching ogt claim to property could not be found
	 */
	public static OgtClaimToProperty findBygetOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToPropertyException {

		return getPersistence().findBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claim to property where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to property, or <code>null</code> if a matching ogt claim to property could not be found
	 */
	public static OgtClaimToProperty fetchBygetOgtById(long ogtApplicationId) {
		return getPersistence().fetchBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claim to property where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt claim to property, or <code>null</code> if a matching ogt claim to property could not be found
	 */
	public static OgtClaimToProperty fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtById(
			ogtApplicationId, useFinderCache);
	}

	/**
	 * Removes the ogt claim to property where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt claim to property that was removed
	 */
	public static OgtClaimToProperty removeBygetOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToPropertyException {

		return getPersistence().removeBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the number of ogt claim to properties where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt claim to properties
	 */
	public static int countBygetOgtById(long ogtApplicationId) {
		return getPersistence().countBygetOgtById(ogtApplicationId);
	}

	/**
	 * Caches the ogt claim to property in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToProperty the ogt claim to property
	 */
	public static void cacheResult(OgtClaimToProperty ogtClaimToProperty) {
		getPersistence().cacheResult(ogtClaimToProperty);
	}

	/**
	 * Caches the ogt claim to properties in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToProperties the ogt claim to properties
	 */
	public static void cacheResult(
		List<OgtClaimToProperty> ogtClaimToProperties) {

		getPersistence().cacheResult(ogtClaimToProperties);
	}

	/**
	 * Creates a new ogt claim to property with the primary key. Does not add the ogt claim to property to the database.
	 *
	 * @param ogtClaimToPropertyId the primary key for the new ogt claim to property
	 * @return the new ogt claim to property
	 */
	public static OgtClaimToProperty create(long ogtClaimToPropertyId) {
		return getPersistence().create(ogtClaimToPropertyId);
	}

	/**
	 * Removes the ogt claim to property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property that was removed
	 * @throws NoSuchOgtClaimToPropertyException if a ogt claim to property with the primary key could not be found
	 */
	public static OgtClaimToProperty remove(long ogtClaimToPropertyId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToPropertyException {

		return getPersistence().remove(ogtClaimToPropertyId);
	}

	public static OgtClaimToProperty updateImpl(
		OgtClaimToProperty ogtClaimToProperty) {

		return getPersistence().updateImpl(ogtClaimToProperty);
	}

	/**
	 * Returns the ogt claim to property with the primary key or throws a <code>NoSuchOgtClaimToPropertyException</code> if it could not be found.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property
	 * @throws NoSuchOgtClaimToPropertyException if a ogt claim to property with the primary key could not be found
	 */
	public static OgtClaimToProperty findByPrimaryKey(long ogtClaimToPropertyId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToPropertyException {

		return getPersistence().findByPrimaryKey(ogtClaimToPropertyId);
	}

	/**
	 * Returns the ogt claim to property with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property, or <code>null</code> if a ogt claim to property with the primary key could not be found
	 */
	public static OgtClaimToProperty fetchByPrimaryKey(
		long ogtClaimToPropertyId) {

		return getPersistence().fetchByPrimaryKey(ogtClaimToPropertyId);
	}

	/**
	 * Returns all the ogt claim to properties.
	 *
	 * @return the ogt claim to properties
	 */
	public static List<OgtClaimToProperty> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @return the range of ogt claim to properties
	 */
	public static List<OgtClaimToProperty> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt claim to properties
	 */
	public static List<OgtClaimToProperty> findAll(
		int start, int end,
		OrderByComparator<OgtClaimToProperty> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt claim to properties
	 */
	public static List<OgtClaimToProperty> findAll(
		int start, int end,
		OrderByComparator<OgtClaimToProperty> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt claim to properties from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt claim to properties.
	 *
	 * @return the number of ogt claim to properties
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OgtClaimToPropertyPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OgtClaimToPropertyPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OgtClaimToPropertyPersistence _persistence;

}