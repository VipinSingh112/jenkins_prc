/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCompanyDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj company detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailUtil
 * @generated
 */
@ProviderType
public interface NcbjCompanyDetailPersistence
	extends BasePersistence<NcbjCompanyDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjCompanyDetailUtil} to access the ncbj company detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCompanyDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a matching ncbj company detail could not be found
	 */
	public NcbjCompanyDetail findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailException;

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail, or <code>null</code> if a matching ncbj company detail could not be found
	 */
	public NcbjCompanyDetail fetchBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company detail, or <code>null</code> if a matching ncbj company detail could not be found
	 */
	public NcbjCompanyDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj company detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company detail that was removed
	 */
	public NcbjCompanyDetail removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailException;

	/**
	 * Returns the number of ncbj company details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company details
	 */
	public int countBygetNCBJById(long ncbjApplicationId);

	/**
	 * Caches the ncbj company detail in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 */
	public void cacheResult(NcbjCompanyDetail ncbjCompanyDetail);

	/**
	 * Caches the ncbj company details in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetails the ncbj company details
	 */
	public void cacheResult(
		java.util.List<NcbjCompanyDetail> ncbjCompanyDetails);

	/**
	 * Creates a new ncbj company detail with the primary key. Does not add the ncbj company detail to the database.
	 *
	 * @param ncbjCompanyDetailId the primary key for the new ncbj company detail
	 * @return the new ncbj company detail
	 */
	public NcbjCompanyDetail create(long ncbjCompanyDetailId);

	/**
	 * Removes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	public NcbjCompanyDetail remove(long ncbjCompanyDetailId)
		throws NoSuchNcbjCompanyDetailException;

	public NcbjCompanyDetail updateImpl(NcbjCompanyDetail ncbjCompanyDetail);

	/**
	 * Returns the ncbj company detail with the primary key or throws a <code>NoSuchNcbjCompanyDetailException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	public NcbjCompanyDetail findByPrimaryKey(long ncbjCompanyDetailId)
		throws NoSuchNcbjCompanyDetailException;

	/**
	 * Returns the ncbj company detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail, or <code>null</code> if a ncbj company detail with the primary key could not be found
	 */
	public NcbjCompanyDetail fetchByPrimaryKey(long ncbjCompanyDetailId);

	/**
	 * Returns all the ncbj company details.
	 *
	 * @return the ncbj company details
	 */
	public java.util.List<NcbjCompanyDetail> findAll();

	/**
	 * Returns a range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @return the range of ncbj company details
	 */
	public java.util.List<NcbjCompanyDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company details
	 */
	public java.util.List<NcbjCompanyDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company details
	 */
	public java.util.List<NcbjCompanyDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj company details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj company details.
	 *
	 * @return the number of ncbj company details
	 */
	public int countAll();

}