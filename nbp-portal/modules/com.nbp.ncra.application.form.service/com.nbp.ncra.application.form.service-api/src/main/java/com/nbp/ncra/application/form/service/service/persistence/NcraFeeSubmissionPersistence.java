/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraFeeSubmissionException;
import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra fee submission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraFeeSubmissionUtil
 * @generated
 */
@ProviderType
public interface NcraFeeSubmissionPersistence
	extends BasePersistence<NcraFeeSubmission> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraFeeSubmissionUtil} to access the ncra fee submission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or throws a <code>NoSuchNcraFeeSubmissionException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a matching ncra fee submission could not be found
	 */
	public NcraFeeSubmission findBygetNcraFee_By_NCRA_Id(long ncraApplicationId)
		throws NoSuchNcraFeeSubmissionException;

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra fee submission, or <code>null</code> if a matching ncra fee submission could not be found
	 */
	public NcraFeeSubmission fetchBygetNcraFee_By_NCRA_Id(
		long ncraApplicationId);

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra fee submission, or <code>null</code> if a matching ncra fee submission could not be found
	 */
	public NcraFeeSubmission fetchBygetNcraFee_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncra fee submission where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra fee submission that was removed
	 */
	public NcraFeeSubmission removeBygetNcraFee_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraFeeSubmissionException;

	/**
	 * Returns the number of ncra fee submissions where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra fee submissions
	 */
	public int countBygetNcraFee_By_NCRA_Id(long ncraApplicationId);

	/**
	 * Caches the ncra fee submission in the entity cache if it is enabled.
	 *
	 * @param ncraFeeSubmission the ncra fee submission
	 */
	public void cacheResult(NcraFeeSubmission ncraFeeSubmission);

	/**
	 * Caches the ncra fee submissions in the entity cache if it is enabled.
	 *
	 * @param ncraFeeSubmissions the ncra fee submissions
	 */
	public void cacheResult(
		java.util.List<NcraFeeSubmission> ncraFeeSubmissions);

	/**
	 * Creates a new ncra fee submission with the primary key. Does not add the ncra fee submission to the database.
	 *
	 * @param ncraFeeSubmissionId the primary key for the new ncra fee submission
	 * @return the new ncra fee submission
	 */
	public NcraFeeSubmission create(long ncraFeeSubmissionId);

	/**
	 * Removes the ncra fee submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission that was removed
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	public NcraFeeSubmission remove(long ncraFeeSubmissionId)
		throws NoSuchNcraFeeSubmissionException;

	public NcraFeeSubmission updateImpl(NcraFeeSubmission ncraFeeSubmission);

	/**
	 * Returns the ncra fee submission with the primary key or throws a <code>NoSuchNcraFeeSubmissionException</code> if it could not be found.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	public NcraFeeSubmission findByPrimaryKey(long ncraFeeSubmissionId)
		throws NoSuchNcraFeeSubmissionException;

	/**
	 * Returns the ncra fee submission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission, or <code>null</code> if a ncra fee submission with the primary key could not be found
	 */
	public NcraFeeSubmission fetchByPrimaryKey(long ncraFeeSubmissionId);

	/**
	 * Returns all the ncra fee submissions.
	 *
	 * @return the ncra fee submissions
	 */
	public java.util.List<NcraFeeSubmission> findAll();

	/**
	 * Returns a range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @return the range of ncra fee submissions
	 */
	public java.util.List<NcraFeeSubmission> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra fee submissions
	 */
	public java.util.List<NcraFeeSubmission> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraFeeSubmission>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra fee submissions
	 */
	public java.util.List<NcraFeeSubmission> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraFeeSubmission>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra fee submissions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra fee submissions.
	 *
	 * @return the number of ncra fee submissions
	 */
	public int countAll();

}