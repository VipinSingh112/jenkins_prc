/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjApplicantDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj applicant detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicantDetailUtil
 * @generated
 */
@ProviderType
public interface NcbjApplicantDetailPersistence
	extends BasePersistence<NcbjApplicantDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjApplicantDetailUtil} to access the ncbj applicant detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjApplicantDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a matching ncbj applicant detail could not be found
	 */
	public NcbjApplicantDetail findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjApplicantDetailException;

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj applicant detail, or <code>null</code> if a matching ncbj applicant detail could not be found
	 */
	public NcbjApplicantDetail fetchBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj applicant detail, or <code>null</code> if a matching ncbj applicant detail could not be found
	 */
	public NcbjApplicantDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj applicant detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj applicant detail that was removed
	 */
	public NcbjApplicantDetail removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjApplicantDetailException;

	/**
	 * Returns the number of ncbj applicant details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj applicant details
	 */
	public int countBygetNCBJById(long ncbjApplicationId);

	/**
	 * Caches the ncbj applicant detail in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicantDetail the ncbj applicant detail
	 */
	public void cacheResult(NcbjApplicantDetail ncbjApplicantDetail);

	/**
	 * Caches the ncbj applicant details in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicantDetails the ncbj applicant details
	 */
	public void cacheResult(
		java.util.List<NcbjApplicantDetail> ncbjApplicantDetails);

	/**
	 * Creates a new ncbj applicant detail with the primary key. Does not add the ncbj applicant detail to the database.
	 *
	 * @param ncbjApplicantDetailId the primary key for the new ncbj applicant detail
	 * @return the new ncbj applicant detail
	 */
	public NcbjApplicantDetail create(long ncbjApplicantDetailId);

	/**
	 * Removes the ncbj applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail that was removed
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	public NcbjApplicantDetail remove(long ncbjApplicantDetailId)
		throws NoSuchNcbjApplicantDetailException;

	public NcbjApplicantDetail updateImpl(
		NcbjApplicantDetail ncbjApplicantDetail);

	/**
	 * Returns the ncbj applicant detail with the primary key or throws a <code>NoSuchNcbjApplicantDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	public NcbjApplicantDetail findByPrimaryKey(long ncbjApplicantDetailId)
		throws NoSuchNcbjApplicantDetailException;

	/**
	 * Returns the ncbj applicant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail, or <code>null</code> if a ncbj applicant detail with the primary key could not be found
	 */
	public NcbjApplicantDetail fetchByPrimaryKey(long ncbjApplicantDetailId);

	/**
	 * Returns all the ncbj applicant details.
	 *
	 * @return the ncbj applicant details
	 */
	public java.util.List<NcbjApplicantDetail> findAll();

	/**
	 * Returns a range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @return the range of ncbj applicant details
	 */
	public java.util.List<NcbjApplicantDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj applicant details
	 */
	public java.util.List<NcbjApplicantDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicantDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj applicant details
	 */
	public java.util.List<NcbjApplicantDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicantDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj applicant details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj applicant details.
	 *
	 * @return the number of ncbj applicant details
	 */
	public int countAll();

}