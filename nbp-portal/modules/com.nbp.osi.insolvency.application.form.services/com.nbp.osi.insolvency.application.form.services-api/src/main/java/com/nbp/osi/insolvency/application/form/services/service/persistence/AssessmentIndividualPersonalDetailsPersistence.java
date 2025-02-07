/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssessmentIndividualPersonalDetailsException;
import com.nbp.osi.insolvency.application.form.services.model.AssessmentIndividualPersonalDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the assessment individual personal details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetailsUtil
 * @generated
 */
@ProviderType
public interface AssessmentIndividualPersonalDetailsPersistence
	extends BasePersistence<AssessmentIndividualPersonalDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentIndividualPersonalDetailsUtil} to access the assessment individual personal details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or throws a <code>NoSuchAssessmentIndividualPersonalDetailsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a matching assessment individual personal details could not be found
	 */
	public AssessmentIndividualPersonalDetails findBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchAssessmentIndividualPersonalDetailsException;

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assessment individual personal details, or <code>null</code> if a matching assessment individual personal details could not be found
	 */
	public AssessmentIndividualPersonalDetails fetchBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assessment individual personal details, or <code>null</code> if a matching assessment individual personal details could not be found
	 */
	public AssessmentIndividualPersonalDetails fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the assessment individual personal details where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the assessment individual personal details that was removed
	 */
	public AssessmentIndividualPersonalDetails removeBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchAssessmentIndividualPersonalDetailsException;

	/**
	 * Returns the number of assessment individual personal detailses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assessment individual personal detailses
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the assessment individual personal details in the entity cache if it is enabled.
	 *
	 * @param assessmentIndividualPersonalDetails the assessment individual personal details
	 */
	public void cacheResult(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails);

	/**
	 * Caches the assessment individual personal detailses in the entity cache if it is enabled.
	 *
	 * @param assessmentIndividualPersonalDetailses the assessment individual personal detailses
	 */
	public void cacheResult(
		java.util.List<AssessmentIndividualPersonalDetails>
			assessmentIndividualPersonalDetailses);

	/**
	 * Creates a new assessment individual personal details with the primary key. Does not add the assessment individual personal details to the database.
	 *
	 * @param assessmentDetailsId the primary key for the new assessment individual personal details
	 * @return the new assessment individual personal details
	 */
	public AssessmentIndividualPersonalDetails create(long assessmentDetailsId);

	/**
	 * Removes the assessment individual personal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details that was removed
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	public AssessmentIndividualPersonalDetails remove(long assessmentDetailsId)
		throws NoSuchAssessmentIndividualPersonalDetailsException;

	public AssessmentIndividualPersonalDetails updateImpl(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails);

	/**
	 * Returns the assessment individual personal details with the primary key or throws a <code>NoSuchAssessmentIndividualPersonalDetailsException</code> if it could not be found.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	public AssessmentIndividualPersonalDetails findByPrimaryKey(
			long assessmentDetailsId)
		throws NoSuchAssessmentIndividualPersonalDetailsException;

	/**
	 * Returns the assessment individual personal details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details, or <code>null</code> if a assessment individual personal details with the primary key could not be found
	 */
	public AssessmentIndividualPersonalDetails fetchByPrimaryKey(
		long assessmentDetailsId);

	/**
	 * Returns all the assessment individual personal detailses.
	 *
	 * @return the assessment individual personal detailses
	 */
	public java.util.List<AssessmentIndividualPersonalDetails> findAll();

	/**
	 * Returns a range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @return the range of assessment individual personal detailses
	 */
	public java.util.List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment individual personal detailses
	 */
	public java.util.List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssessmentIndividualPersonalDetails> orderByComparator);

	/**
	 * Returns an ordered range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assessment individual personal detailses
	 */
	public java.util.List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssessmentIndividualPersonalDetails> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assessment individual personal detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assessment individual personal detailses.
	 *
	 * @return the number of assessment individual personal detailses
	 */
	public int countAll();

}