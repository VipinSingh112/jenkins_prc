/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchDetailOfApplicantSecTwoException;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the detail of applicant sec two service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwoUtil
 * @generated
 */
@ProviderType
public interface DetailOfApplicantSecTwoPersistence
	extends BasePersistence<DetailOfApplicantSecTwo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetailOfApplicantSecTwoUtil} to access the detail of applicant sec two persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfApplicantSecTwoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a matching detail of applicant sec two could not be found
	 */
	public DetailOfApplicantSecTwo findBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfApplicantSecTwoException;

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of applicant sec two, or <code>null</code> if a matching detail of applicant sec two could not be found
	 */
	public DetailOfApplicantSecTwo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant sec two, or <code>null</code> if a matching detail of applicant sec two could not be found
	 */
	public DetailOfApplicantSecTwo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the detail of applicant sec two where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of applicant sec two that was removed
	 */
	public DetailOfApplicantSecTwo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfApplicantSecTwoException;

	/**
	 * Returns the number of detail of applicant sec twos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of applicant sec twos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the detail of applicant sec two in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 */
	public void cacheResult(DetailOfApplicantSecTwo detailOfApplicantSecTwo);

	/**
	 * Caches the detail of applicant sec twos in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicantSecTwos the detail of applicant sec twos
	 */
	public void cacheResult(
		java.util.List<DetailOfApplicantSecTwo> detailOfApplicantSecTwos);

	/**
	 * Creates a new detail of applicant sec two with the primary key. Does not add the detail of applicant sec two to the database.
	 *
	 * @param detailOfAppliSecTwoId the primary key for the new detail of applicant sec two
	 * @return the new detail of applicant sec two
	 */
	public DetailOfApplicantSecTwo create(long detailOfAppliSecTwoId);

	/**
	 * Removes the detail of applicant sec two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	public DetailOfApplicantSecTwo remove(long detailOfAppliSecTwoId)
		throws NoSuchDetailOfApplicantSecTwoException;

	public DetailOfApplicantSecTwo updateImpl(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo);

	/**
	 * Returns the detail of applicant sec two with the primary key or throws a <code>NoSuchDetailOfApplicantSecTwoException</code> if it could not be found.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	public DetailOfApplicantSecTwo findByPrimaryKey(long detailOfAppliSecTwoId)
		throws NoSuchDetailOfApplicantSecTwoException;

	/**
	 * Returns the detail of applicant sec two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two, or <code>null</code> if a detail of applicant sec two with the primary key could not be found
	 */
	public DetailOfApplicantSecTwo fetchByPrimaryKey(
		long detailOfAppliSecTwoId);

	/**
	 * Returns all the detail of applicant sec twos.
	 *
	 * @return the detail of applicant sec twos
	 */
	public java.util.List<DetailOfApplicantSecTwo> findAll();

	/**
	 * Returns a range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @return the range of detail of applicant sec twos
	 */
	public java.util.List<DetailOfApplicantSecTwo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of applicant sec twos
	 */
	public java.util.List<DetailOfApplicantSecTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DetailOfApplicantSecTwo> orderByComparator);

	/**
	 * Returns an ordered range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of applicant sec twos
	 */
	public java.util.List<DetailOfApplicantSecTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DetailOfApplicantSecTwo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the detail of applicant sec twos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of detail of applicant sec twos.
	 *
	 * @return the number of detail of applicant sec twos
	 */
	public int countAll();

}