/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaSubCategoriesMappingException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMapping;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma sub categories mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMappingUtil
 * @generated
 */
@ProviderType
public interface PharmaSubCategoriesMappingPersistence
	extends BasePersistence<PharmaSubCategoriesMapping> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaSubCategoriesMappingUtil} to access the pharma sub categories mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @return the matching pharma sub categories mappings
	 */
	public java.util.List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory);

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
	public java.util.List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end);

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
	public java.util.List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaSubCategoriesMapping> orderByComparator);

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
	public java.util.List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaSubCategoriesMapping> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a matching pharma sub categories mapping could not be found
	 */
	public PharmaSubCategoriesMapping findBygetPharmSubCategory_First(
			String pharmaSubCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaSubCategoriesMapping> orderByComparator)
		throws NoSuchPharmaSubCategoriesMappingException;

	/**
	 * Returns the first pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma sub categories mapping, or <code>null</code> if a matching pharma sub categories mapping could not be found
	 */
	public PharmaSubCategoriesMapping fetchBygetPharmSubCategory_First(
		String pharmaSubCategory,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaSubCategoriesMapping> orderByComparator);

	/**
	 * Returns the last pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a matching pharma sub categories mapping could not be found
	 */
	public PharmaSubCategoriesMapping findBygetPharmSubCategory_Last(
			String pharmaSubCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaSubCategoriesMapping> orderByComparator)
		throws NoSuchPharmaSubCategoriesMappingException;

	/**
	 * Returns the last pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma sub categories mapping, or <code>null</code> if a matching pharma sub categories mapping could not be found
	 */
	public PharmaSubCategoriesMapping fetchBygetPharmSubCategory_Last(
		String pharmaSubCategory,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaSubCategoriesMapping> orderByComparator);

	/**
	 * Returns the pharma sub categories mappings before and after the current pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the current pharma sub categories mapping
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	public PharmaSubCategoriesMapping[] findBygetPharmSubCategory_PrevAndNext(
			long pharmaSubCategoriesMappingId, String pharmaSubCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaSubCategoriesMapping> orderByComparator)
		throws NoSuchPharmaSubCategoriesMappingException;

	/**
	 * Removes all the pharma sub categories mappings where pharmaSubCategory = &#63; from the database.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 */
	public void removeBygetPharmSubCategory(String pharmaSubCategory);

	/**
	 * Returns the number of pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @return the number of matching pharma sub categories mappings
	 */
	public int countBygetPharmSubCategory(String pharmaSubCategory);

	/**
	 * Caches the pharma sub categories mapping in the entity cache if it is enabled.
	 *
	 * @param pharmaSubCategoriesMapping the pharma sub categories mapping
	 */
	public void cacheResult(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping);

	/**
	 * Caches the pharma sub categories mappings in the entity cache if it is enabled.
	 *
	 * @param pharmaSubCategoriesMappings the pharma sub categories mappings
	 */
	public void cacheResult(
		java.util.List<PharmaSubCategoriesMapping> pharmaSubCategoriesMappings);

	/**
	 * Creates a new pharma sub categories mapping with the primary key. Does not add the pharma sub categories mapping to the database.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key for the new pharma sub categories mapping
	 * @return the new pharma sub categories mapping
	 */
	public PharmaSubCategoriesMapping create(long pharmaSubCategoriesMappingId);

	/**
	 * Removes the pharma sub categories mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was removed
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	public PharmaSubCategoriesMapping remove(long pharmaSubCategoriesMappingId)
		throws NoSuchPharmaSubCategoriesMappingException;

	public PharmaSubCategoriesMapping updateImpl(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping);

	/**
	 * Returns the pharma sub categories mapping with the primary key or throws a <code>NoSuchPharmaSubCategoriesMappingException</code> if it could not be found.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	public PharmaSubCategoriesMapping findByPrimaryKey(
			long pharmaSubCategoriesMappingId)
		throws NoSuchPharmaSubCategoriesMappingException;

	/**
	 * Returns the pharma sub categories mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping, or <code>null</code> if a pharma sub categories mapping with the primary key could not be found
	 */
	public PharmaSubCategoriesMapping fetchByPrimaryKey(
		long pharmaSubCategoriesMappingId);

	/**
	 * Returns all the pharma sub categories mappings.
	 *
	 * @return the pharma sub categories mappings
	 */
	public java.util.List<PharmaSubCategoriesMapping> findAll();

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
	public java.util.List<PharmaSubCategoriesMapping> findAll(
		int start, int end);

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
	public java.util.List<PharmaSubCategoriesMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaSubCategoriesMapping> orderByComparator);

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
	public java.util.List<PharmaSubCategoriesMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaSubCategoriesMapping> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma sub categories mappings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma sub categories mappings.
	 *
	 * @return the number of pharma sub categories mappings
	 */
	public int countAll();

}