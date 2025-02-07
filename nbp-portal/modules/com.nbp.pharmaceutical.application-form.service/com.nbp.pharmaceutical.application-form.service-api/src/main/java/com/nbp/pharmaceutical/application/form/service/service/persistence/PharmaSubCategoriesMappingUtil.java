/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMapping;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma sub categories mapping service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaSubCategoriesMappingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMappingPersistence
 * @generated
 */
public class PharmaSubCategoriesMappingUtil {

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
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		getPersistence().clearCache(pharmaSubCategoriesMapping);
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
	public static Map<Serializable, PharmaSubCategoriesMapping>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaSubCategoriesMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaSubCategoriesMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaSubCategoriesMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaSubCategoriesMapping update(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return getPersistence().update(pharmaSubCategoriesMapping);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaSubCategoriesMapping update(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pharmaSubCategoriesMapping, serviceContext);
	}

	/**
	 * Returns all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @return the matching pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory) {

		return getPersistence().findBygetPharmSubCategory(pharmaSubCategory);
	}

	/**
	 * Returns a range of all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @return the range of matching pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end) {

		return getPersistence().findBygetPharmSubCategory(
			pharmaSubCategory, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return getPersistence().findBygetPharmSubCategory(
			pharmaSubCategory, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPharmSubCategory(
			pharmaSubCategory, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a matching pharma sub categories mapping could not be found
	 */
	public static PharmaSubCategoriesMapping findBygetPharmSubCategory_First(
			String pharmaSubCategory,
			OrderByComparator<PharmaSubCategoriesMapping> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaSubCategoriesMappingException {

		return getPersistence().findBygetPharmSubCategory_First(
			pharmaSubCategory, orderByComparator);
	}

	/**
	 * Returns the first pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma sub categories mapping, or <code>null</code> if a matching pharma sub categories mapping could not be found
	 */
	public static PharmaSubCategoriesMapping fetchBygetPharmSubCategory_First(
		String pharmaSubCategory,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return getPersistence().fetchBygetPharmSubCategory_First(
			pharmaSubCategory, orderByComparator);
	}

	/**
	 * Returns the last pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a matching pharma sub categories mapping could not be found
	 */
	public static PharmaSubCategoriesMapping findBygetPharmSubCategory_Last(
			String pharmaSubCategory,
			OrderByComparator<PharmaSubCategoriesMapping> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaSubCategoriesMappingException {

		return getPersistence().findBygetPharmSubCategory_Last(
			pharmaSubCategory, orderByComparator);
	}

	/**
	 * Returns the last pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma sub categories mapping, or <code>null</code> if a matching pharma sub categories mapping could not be found
	 */
	public static PharmaSubCategoriesMapping fetchBygetPharmSubCategory_Last(
		String pharmaSubCategory,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return getPersistence().fetchBygetPharmSubCategory_Last(
			pharmaSubCategory, orderByComparator);
	}

	/**
	 * Returns the pharma sub categories mappings before and after the current pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the current pharma sub categories mapping
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	public static PharmaSubCategoriesMapping[]
			findBygetPharmSubCategory_PrevAndNext(
				long pharmaSubCategoriesMappingId, String pharmaSubCategory,
				OrderByComparator<PharmaSubCategoriesMapping> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaSubCategoriesMappingException {

		return getPersistence().findBygetPharmSubCategory_PrevAndNext(
			pharmaSubCategoriesMappingId, pharmaSubCategory, orderByComparator);
	}

	/**
	 * Removes all the pharma sub categories mappings where pharmaSubCategory = &#63; from the database.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 */
	public static void removeBygetPharmSubCategory(String pharmaSubCategory) {
		getPersistence().removeBygetPharmSubCategory(pharmaSubCategory);
	}

	/**
	 * Returns the number of pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @return the number of matching pharma sub categories mappings
	 */
	public static int countBygetPharmSubCategory(String pharmaSubCategory) {
		return getPersistence().countBygetPharmSubCategory(pharmaSubCategory);
	}

	/**
	 * Caches the pharma sub categories mapping in the entity cache if it is enabled.
	 *
	 * @param pharmaSubCategoriesMapping the pharma sub categories mapping
	 */
	public static void cacheResult(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		getPersistence().cacheResult(pharmaSubCategoriesMapping);
	}

	/**
	 * Caches the pharma sub categories mappings in the entity cache if it is enabled.
	 *
	 * @param pharmaSubCategoriesMappings the pharma sub categories mappings
	 */
	public static void cacheResult(
		List<PharmaSubCategoriesMapping> pharmaSubCategoriesMappings) {

		getPersistence().cacheResult(pharmaSubCategoriesMappings);
	}

	/**
	 * Creates a new pharma sub categories mapping with the primary key. Does not add the pharma sub categories mapping to the database.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key for the new pharma sub categories mapping
	 * @return the new pharma sub categories mapping
	 */
	public static PharmaSubCategoriesMapping create(
		long pharmaSubCategoriesMappingId) {

		return getPersistence().create(pharmaSubCategoriesMappingId);
	}

	/**
	 * Removes the pharma sub categories mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was removed
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	public static PharmaSubCategoriesMapping remove(
			long pharmaSubCategoriesMappingId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaSubCategoriesMappingException {

		return getPersistence().remove(pharmaSubCategoriesMappingId);
	}

	public static PharmaSubCategoriesMapping updateImpl(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		return getPersistence().updateImpl(pharmaSubCategoriesMapping);
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key or throws a <code>NoSuchPharmaSubCategoriesMappingException</code> if it could not be found.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	public static PharmaSubCategoriesMapping findByPrimaryKey(
			long pharmaSubCategoriesMappingId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaSubCategoriesMappingException {

		return getPersistence().findByPrimaryKey(pharmaSubCategoriesMappingId);
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping, or <code>null</code> if a pharma sub categories mapping with the primary key could not be found
	 */
	public static PharmaSubCategoriesMapping fetchByPrimaryKey(
		long pharmaSubCategoriesMappingId) {

		return getPersistence().fetchByPrimaryKey(pharmaSubCategoriesMappingId);
	}

	/**
	 * Returns all the pharma sub categories mappings.
	 *
	 * @return the pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @return the range of pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findAll(
		int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma sub categories mappings
	 */
	public static List<PharmaSubCategoriesMapping> findAll(
		int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma sub categories mappings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma sub categories mappings.
	 *
	 * @return the number of pharma sub categories mappings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaSubCategoriesMappingPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaSubCategoriesMappingPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaSubCategoriesMappingPersistence _persistence;

}