/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjOrganizationDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj organization detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetailUtil
 * @generated
 */
@ProviderType
public interface NcbjOrganizationDetailPersistence
	extends BasePersistence<NcbjOrganizationDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjOrganizationDetailUtil} to access the ncbj organization detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a matching ncbj organization detail could not be found
	 */
	public NcbjOrganizationDetail findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException;

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public NcbjOrganizationDetail fetchBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public NcbjOrganizationDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj organization detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj organization detail that was removed
	 */
	public NcbjOrganizationDetail removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException;

	/**
	 * Returns the number of ncbj organization details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj organization details
	 */
	public int countBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a matching ncbj organization detail could not be found
	 */
	public NcbjOrganizationDetail findBygetNCBJ_ByAppId(long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException;

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public NcbjOrganizationDetail fetchBygetNCBJ_ByAppId(
		long ncbjApplicationId);

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public NcbjOrganizationDetail fetchBygetNCBJ_ByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj organization detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj organization detail that was removed
	 */
	public NcbjOrganizationDetail removeBygetNCBJ_ByAppId(
			long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException;

	/**
	 * Returns the number of ncbj organization details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj organization details
	 */
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj organization detail in the entity cache if it is enabled.
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 */
	public void cacheResult(NcbjOrganizationDetail ncbjOrganizationDetail);

	/**
	 * Caches the ncbj organization details in the entity cache if it is enabled.
	 *
	 * @param ncbjOrganizationDetails the ncbj organization details
	 */
	public void cacheResult(
		java.util.List<NcbjOrganizationDetail> ncbjOrganizationDetails);

	/**
	 * Creates a new ncbj organization detail with the primary key. Does not add the ncbj organization detail to the database.
	 *
	 * @param ncbjOrganizationDetailId the primary key for the new ncbj organization detail
	 * @return the new ncbj organization detail
	 */
	public NcbjOrganizationDetail create(long ncbjOrganizationDetailId);

	/**
	 * Removes the ncbj organization detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	public NcbjOrganizationDetail remove(long ncbjOrganizationDetailId)
		throws NoSuchNcbjOrganizationDetailException;

	public NcbjOrganizationDetail updateImpl(
		NcbjOrganizationDetail ncbjOrganizationDetail);

	/**
	 * Returns the ncbj organization detail with the primary key or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	public NcbjOrganizationDetail findByPrimaryKey(
			long ncbjOrganizationDetailId)
		throws NoSuchNcbjOrganizationDetailException;

	/**
	 * Returns the ncbj organization detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail, or <code>null</code> if a ncbj organization detail with the primary key could not be found
	 */
	public NcbjOrganizationDetail fetchByPrimaryKey(
		long ncbjOrganizationDetailId);

	/**
	 * Returns all the ncbj organization details.
	 *
	 * @return the ncbj organization details
	 */
	public java.util.List<NcbjOrganizationDetail> findAll();

	/**
	 * Returns a range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @return the range of ncbj organization details
	 */
	public java.util.List<NcbjOrganizationDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj organization details
	 */
	public java.util.List<NcbjOrganizationDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjOrganizationDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj organization details
	 */
	public java.util.List<NcbjOrganizationDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjOrganizationDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj organization details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj organization details.
	 *
	 * @return the number of ncbj organization details
	 */
	public int countAll();

}