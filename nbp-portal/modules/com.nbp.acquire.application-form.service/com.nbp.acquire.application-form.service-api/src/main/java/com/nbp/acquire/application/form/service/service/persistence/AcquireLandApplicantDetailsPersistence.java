/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandApplicantDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire land applicant details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetailsUtil
 * @generated
 */
@ProviderType
public interface AcquireLandApplicantDetailsPersistence
	extends BasePersistence<AcquireLandApplicantDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireLandApplicantDetailsUtil} to access the acquire land applicant details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandApplicantDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a matching acquire land applicant details could not be found
	 */
	public AcquireLandApplicantDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandApplicantDetailsException;

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land applicant details, or <code>null</code> if a matching acquire land applicant details could not be found
	 */
	public AcquireLandApplicantDetails fetchBygetAcquireById(
		long acquireApplicationId);

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land applicant details, or <code>null</code> if a matching acquire land applicant details could not be found
	 */
	public AcquireLandApplicantDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire land applicant details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land applicant details that was removed
	 */
	public AcquireLandApplicantDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandApplicantDetailsException;

	/**
	 * Returns the number of acquire land applicant detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land applicant detailses
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire land applicant details in the entity cache if it is enabled.
	 *
	 * @param acquireLandApplicantDetails the acquire land applicant details
	 */
	public void cacheResult(
		AcquireLandApplicantDetails acquireLandApplicantDetails);

	/**
	 * Caches the acquire land applicant detailses in the entity cache if it is enabled.
	 *
	 * @param acquireLandApplicantDetailses the acquire land applicant detailses
	 */
	public void cacheResult(
		java.util.List<AcquireLandApplicantDetails>
			acquireLandApplicantDetailses);

	/**
	 * Creates a new acquire land applicant details with the primary key. Does not add the acquire land applicant details to the database.
	 *
	 * @param acquireLandApplicantDetailsId the primary key for the new acquire land applicant details
	 * @return the new acquire land applicant details
	 */
	public AcquireLandApplicantDetails create(
		long acquireLandApplicantDetailsId);

	/**
	 * Removes the acquire land applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details that was removed
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	public AcquireLandApplicantDetails remove(
			long acquireLandApplicantDetailsId)
		throws NoSuchAcquireLandApplicantDetailsException;

	public AcquireLandApplicantDetails updateImpl(
		AcquireLandApplicantDetails acquireLandApplicantDetails);

	/**
	 * Returns the acquire land applicant details with the primary key or throws a <code>NoSuchAcquireLandApplicantDetailsException</code> if it could not be found.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	public AcquireLandApplicantDetails findByPrimaryKey(
			long acquireLandApplicantDetailsId)
		throws NoSuchAcquireLandApplicantDetailsException;

	/**
	 * Returns the acquire land applicant details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details, or <code>null</code> if a acquire land applicant details with the primary key could not be found
	 */
	public AcquireLandApplicantDetails fetchByPrimaryKey(
		long acquireLandApplicantDetailsId);

	/**
	 * Returns all the acquire land applicant detailses.
	 *
	 * @return the acquire land applicant detailses
	 */
	public java.util.List<AcquireLandApplicantDetails> findAll();

	/**
	 * Returns a range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @return the range of acquire land applicant detailses
	 */
	public java.util.List<AcquireLandApplicantDetails> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land applicant detailses
	 */
	public java.util.List<AcquireLandApplicantDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireLandApplicantDetails> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land applicant detailses
	 */
	public java.util.List<AcquireLandApplicantDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireLandApplicantDetails> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire land applicant detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire land applicant detailses.
	 *
	 * @return the number of acquire land applicant detailses
	 */
	public int countAll();

}