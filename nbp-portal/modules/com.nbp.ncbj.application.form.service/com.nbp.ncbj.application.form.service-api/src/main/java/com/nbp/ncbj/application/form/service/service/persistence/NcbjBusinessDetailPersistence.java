/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjBusinessDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj business detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailUtil
 * @generated
 */
@ProviderType
public interface NcbjBusinessDetailPersistence
	extends BasePersistence<NcbjBusinessDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjBusinessDetailUtil} to access the ncbj business detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @return the range of matching ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a matching ncbj business detail could not be found
	 */
	public NcbjBusinessDetail findBygetByNcbjBusiDetail_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
				orderByComparator)
		throws NoSuchNcbjBusinessDetailException;

	/**
	 * Returns the first ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail, or <code>null</code> if a matching ncbj business detail could not be found
	 */
	public NcbjBusinessDetail fetchBygetByNcbjBusiDetail_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
			orderByComparator);

	/**
	 * Returns the last ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a matching ncbj business detail could not be found
	 */
	public NcbjBusinessDetail findBygetByNcbjBusiDetail_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
				orderByComparator)
		throws NoSuchNcbjBusinessDetailException;

	/**
	 * Returns the last ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail, or <code>null</code> if a matching ncbj business detail could not be found
	 */
	public NcbjBusinessDetail fetchBygetByNcbjBusiDetail_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
			orderByComparator);

	/**
	 * Returns the ncbj business details before and after the current ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjBusinessDetailId the primary key of the current ncbj business detail
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a ncbj business detail with the primary key could not be found
	 */
	public NcbjBusinessDetail[] findBygetByNcbjBusiDetail_PrevAndNext(
			long ncbjBusinessDetailId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
				orderByComparator)
		throws NoSuchNcbjBusinessDetailException;

	/**
	 * Removes all the ncbj business details where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetByNcbjBusiDetail(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj business details
	 */
	public int countBygetByNcbjBusiDetail(long ncbjApplicationId);

	/**
	 * Caches the ncbj business detail in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetail the ncbj business detail
	 */
	public void cacheResult(NcbjBusinessDetail ncbjBusinessDetail);

	/**
	 * Caches the ncbj business details in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetails the ncbj business details
	 */
	public void cacheResult(
		java.util.List<NcbjBusinessDetail> ncbjBusinessDetails);

	/**
	 * Creates a new ncbj business detail with the primary key. Does not add the ncbj business detail to the database.
	 *
	 * @param ncbjBusinessDetailId the primary key for the new ncbj business detail
	 * @return the new ncbj business detail
	 */
	public NcbjBusinessDetail create(long ncbjBusinessDetailId);

	/**
	 * Removes the ncbj business detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail that was removed
	 * @throws NoSuchNcbjBusinessDetailException if a ncbj business detail with the primary key could not be found
	 */
	public NcbjBusinessDetail remove(long ncbjBusinessDetailId)
		throws NoSuchNcbjBusinessDetailException;

	public NcbjBusinessDetail updateImpl(NcbjBusinessDetail ncbjBusinessDetail);

	/**
	 * Returns the ncbj business detail with the primary key or throws a <code>NoSuchNcbjBusinessDetailException</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a ncbj business detail with the primary key could not be found
	 */
	public NcbjBusinessDetail findByPrimaryKey(long ncbjBusinessDetailId)
		throws NoSuchNcbjBusinessDetailException;

	/**
	 * Returns the ncbj business detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail, or <code>null</code> if a ncbj business detail with the primary key could not be found
	 */
	public NcbjBusinessDetail fetchByPrimaryKey(long ncbjBusinessDetailId);

	/**
	 * Returns all the ncbj business details.
	 *
	 * @return the ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findAll();

	/**
	 * Returns a range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @return the range of ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj business details
	 */
	public java.util.List<NcbjBusinessDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj business details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj business details.
	 *
	 * @return the number of ncbj business details
	 */
	public int countAll();

}