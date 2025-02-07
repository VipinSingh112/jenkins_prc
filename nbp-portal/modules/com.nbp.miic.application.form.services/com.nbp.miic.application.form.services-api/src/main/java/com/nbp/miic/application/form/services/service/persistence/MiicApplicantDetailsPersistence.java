/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicantDetailsException;
import com.nbp.miic.application.form.services.model.MiicApplicantDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic applicant details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetailsUtil
 * @generated
 */
@ProviderType
public interface MiicApplicantDetailsPersistence
	extends BasePersistence<MiicApplicantDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicApplicantDetailsUtil} to access the miic applicant details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicantDetailsException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a matching miic applicant details could not be found
	 */
	public MiicApplicantDetails findBygetMiicById(long miicApplicationId)
		throws NoSuchMiicApplicantDetailsException;

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic applicant details, or <code>null</code> if a matching miic applicant details could not be found
	 */
	public MiicApplicantDetails fetchBygetMiicById(long miicApplicationId);

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic applicant details, or <code>null</code> if a matching miic applicant details could not be found
	 */
	public MiicApplicantDetails fetchBygetMiicById(
		long miicApplicationId, boolean useFinderCache);

	/**
	 * Removes the miic applicant details where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic applicant details that was removed
	 */
	public MiicApplicantDetails removeBygetMiicById(long miicApplicationId)
		throws NoSuchMiicApplicantDetailsException;

	/**
	 * Returns the number of miic applicant detailses where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic applicant detailses
	 */
	public int countBygetMiicById(long miicApplicationId);

	/**
	 * Caches the miic applicant details in the entity cache if it is enabled.
	 *
	 * @param miicApplicantDetails the miic applicant details
	 */
	public void cacheResult(MiicApplicantDetails miicApplicantDetails);

	/**
	 * Caches the miic applicant detailses in the entity cache if it is enabled.
	 *
	 * @param miicApplicantDetailses the miic applicant detailses
	 */
	public void cacheResult(
		java.util.List<MiicApplicantDetails> miicApplicantDetailses);

	/**
	 * Creates a new miic applicant details with the primary key. Does not add the miic applicant details to the database.
	 *
	 * @param miicApplicantDetailsId the primary key for the new miic applicant details
	 * @return the new miic applicant details
	 */
	public MiicApplicantDetails create(long miicApplicantDetailsId);

	/**
	 * Removes the miic applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details that was removed
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	public MiicApplicantDetails remove(long miicApplicantDetailsId)
		throws NoSuchMiicApplicantDetailsException;

	public MiicApplicantDetails updateImpl(
		MiicApplicantDetails miicApplicantDetails);

	/**
	 * Returns the miic applicant details with the primary key or throws a <code>NoSuchMiicApplicantDetailsException</code> if it could not be found.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	public MiicApplicantDetails findByPrimaryKey(long miicApplicantDetailsId)
		throws NoSuchMiicApplicantDetailsException;

	/**
	 * Returns the miic applicant details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details, or <code>null</code> if a miic applicant details with the primary key could not be found
	 */
	public MiicApplicantDetails fetchByPrimaryKey(long miicApplicantDetailsId);

	/**
	 * Returns all the miic applicant detailses.
	 *
	 * @return the miic applicant detailses
	 */
	public java.util.List<MiicApplicantDetails> findAll();

	/**
	 * Returns a range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @return the range of miic applicant detailses
	 */
	public java.util.List<MiicApplicantDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic applicant detailses
	 */
	public java.util.List<MiicApplicantDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicantDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic applicant detailses
	 */
	public java.util.List<MiicApplicantDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicantDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic applicant detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic applicant detailses.
	 *
	 * @return the number of miic applicant detailses
	 */
	public int countAll();

}