/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjProductServiceDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj product service detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetailUtil
 * @generated
 */
@ProviderType
public interface NcbjProductServiceDetailPersistence
	extends BasePersistence<NcbjProductServiceDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjProductServiceDetailUtil} to access the ncbj product service detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjProductServiceDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjProductServiceDetailException;

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail fetchBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj product service detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj product service detail that was removed
	 */
	public NcbjProductServiceDetail removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjProductServiceDetailException;

	/**
	 * Returns the number of ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj product service details
	 */
	public int countBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of matching ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjProductServiceDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjProductServiceDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjProductServiceDetail> orderByComparator)
		throws NoSuchNcbjProductServiceDetailException;

	/**
	 * Returns the first ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjProductServiceDetail> orderByComparator);

	/**
	 * Returns the last ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjProductServiceDetail> orderByComparator)
		throws NoSuchNcbjProductServiceDetailException;

	/**
	 * Returns the last ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public NcbjProductServiceDetail fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjProductServiceDetail> orderByComparator);

	/**
	 * Returns the ncbj product service details before and after the current ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the current ncbj product service detail
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	public NcbjProductServiceDetail[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjProductServiceDetailId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjProductServiceDetail> orderByComparator)
		throws NoSuchNcbjProductServiceDetailException;

	/**
	 * Removes all the ncbj product service details where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj product service details
	 */
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj product service detail in the entity cache if it is enabled.
	 *
	 * @param ncbjProductServiceDetail the ncbj product service detail
	 */
	public void cacheResult(NcbjProductServiceDetail ncbjProductServiceDetail);

	/**
	 * Caches the ncbj product service details in the entity cache if it is enabled.
	 *
	 * @param ncbjProductServiceDetails the ncbj product service details
	 */
	public void cacheResult(
		java.util.List<NcbjProductServiceDetail> ncbjProductServiceDetails);

	/**
	 * Creates a new ncbj product service detail with the primary key. Does not add the ncbj product service detail to the database.
	 *
	 * @param ncbjProductServiceDetailId the primary key for the new ncbj product service detail
	 * @return the new ncbj product service detail
	 */
	public NcbjProductServiceDetail create(long ncbjProductServiceDetailId);

	/**
	 * Removes the ncbj product service detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail that was removed
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	public NcbjProductServiceDetail remove(long ncbjProductServiceDetailId)
		throws NoSuchNcbjProductServiceDetailException;

	public NcbjProductServiceDetail updateImpl(
		NcbjProductServiceDetail ncbjProductServiceDetail);

	/**
	 * Returns the ncbj product service detail with the primary key or throws a <code>NoSuchNcbjProductServiceDetailException</code> if it could not be found.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	public NcbjProductServiceDetail findByPrimaryKey(
			long ncbjProductServiceDetailId)
		throws NoSuchNcbjProductServiceDetailException;

	/**
	 * Returns the ncbj product service detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail, or <code>null</code> if a ncbj product service detail with the primary key could not be found
	 */
	public NcbjProductServiceDetail fetchByPrimaryKey(
		long ncbjProductServiceDetailId);

	/**
	 * Returns all the ncbj product service details.
	 *
	 * @return the ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findAll();

	/**
	 * Returns a range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjProductServiceDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj product service details
	 */
	public java.util.List<NcbjProductServiceDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjProductServiceDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj product service details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj product service details.
	 *
	 * @return the number of ncbj product service details
	 */
	public int countAll();

}