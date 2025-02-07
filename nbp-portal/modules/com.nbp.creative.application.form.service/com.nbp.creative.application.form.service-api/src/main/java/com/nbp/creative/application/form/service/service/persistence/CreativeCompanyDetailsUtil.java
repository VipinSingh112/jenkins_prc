/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeCompanyDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative company details service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeCompanyDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsPersistence
 * @generated
 */
public class CreativeCompanyDetailsUtil {

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
		CreativeCompanyDetails creativeCompanyDetails) {

		getPersistence().clearCache(creativeCompanyDetails);
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
	public static Map<Serializable, CreativeCompanyDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeCompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeCompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeCompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeCompanyDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeCompanyDetails update(
		CreativeCompanyDetails creativeCompanyDetails) {

		return getPersistence().update(creativeCompanyDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeCompanyDetails update(
		CreativeCompanyDetails creativeCompanyDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(creativeCompanyDetails, serviceContext);
	}

	/**
	 * Returns the creative company details where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDetailsException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company details
	 * @throws NoSuchCreativeCompanyDetailsException if a matching creative company details could not be found
	 */
	public static CreativeCompanyDetails findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company details, or <code>null</code> if a matching creative company details could not be found
	 */
	public static CreativeCompanyDetails fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company details, or <code>null</code> if a matching creative company details could not be found
	 */
	public static CreativeCompanyDetails fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative company details where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company details that was removed
	 */
	public static CreativeCompanyDetails removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative company detailses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company detailses
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Caches the creative company details in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetails the creative company details
	 */
	public static void cacheResult(
		CreativeCompanyDetails creativeCompanyDetails) {

		getPersistence().cacheResult(creativeCompanyDetails);
	}

	/**
	 * Caches the creative company detailses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailses the creative company detailses
	 */
	public static void cacheResult(
		List<CreativeCompanyDetails> creativeCompanyDetailses) {

		getPersistence().cacheResult(creativeCompanyDetailses);
	}

	/**
	 * Creates a new creative company details with the primary key. Does not add the creative company details to the database.
	 *
	 * @param creativeCompanyDetailsId the primary key for the new creative company details
	 * @return the new creative company details
	 */
	public static CreativeCompanyDetails create(long creativeCompanyDetailsId) {
		return getPersistence().create(creativeCompanyDetailsId);
	}

	/**
	 * Removes the creative company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details that was removed
	 * @throws NoSuchCreativeCompanyDetailsException if a creative company details with the primary key could not be found
	 */
	public static CreativeCompanyDetails remove(long creativeCompanyDetailsId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsException {

		return getPersistence().remove(creativeCompanyDetailsId);
	}

	public static CreativeCompanyDetails updateImpl(
		CreativeCompanyDetails creativeCompanyDetails) {

		return getPersistence().updateImpl(creativeCompanyDetails);
	}

	/**
	 * Returns the creative company details with the primary key or throws a <code>NoSuchCreativeCompanyDetailsException</code> if it could not be found.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details
	 * @throws NoSuchCreativeCompanyDetailsException if a creative company details with the primary key could not be found
	 */
	public static CreativeCompanyDetails findByPrimaryKey(
			long creativeCompanyDetailsId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsException {

		return getPersistence().findByPrimaryKey(creativeCompanyDetailsId);
	}

	/**
	 * Returns the creative company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details, or <code>null</code> if a creative company details with the primary key could not be found
	 */
	public static CreativeCompanyDetails fetchByPrimaryKey(
		long creativeCompanyDetailsId) {

		return getPersistence().fetchByPrimaryKey(creativeCompanyDetailsId);
	}

	/**
	 * Returns all the creative company detailses.
	 *
	 * @return the creative company detailses
	 */
	public static List<CreativeCompanyDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @return the range of creative company detailses
	 */
	public static List<CreativeCompanyDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company detailses
	 */
	public static List<CreativeCompanyDetails> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company detailses
	 */
	public static List<CreativeCompanyDetails> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative company detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative company detailses.
	 *
	 * @return the number of creative company detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeCompanyDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeCompanyDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeCompanyDetailsPersistence _persistence;

}