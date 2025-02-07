/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchFitPropDeclareApplicantException;
import com.nbp.hsra.application.service.model.FitPropDeclareApplicant;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fit prop declare applicant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropDeclareApplicantUtil
 * @generated
 */
@ProviderType
public interface FitPropDeclareApplicantPersistence
	extends BasePersistence<FitPropDeclareApplicant> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FitPropDeclareApplicantUtil} to access the fit prop declare applicant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropDeclareApplicantException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a matching fit prop declare applicant could not be found
	 */
	public FitPropDeclareApplicant findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropDeclareApplicantException;

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop declare applicant, or <code>null</code> if a matching fit prop declare applicant could not be found
	 */
	public FitPropDeclareApplicant fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop declare applicant, or <code>null</code> if a matching fit prop declare applicant could not be found
	 */
	public FitPropDeclareApplicant fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the fit prop declare applicant where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop declare applicant that was removed
	 */
	public FitPropDeclareApplicant removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropDeclareApplicantException;

	/**
	 * Returns the number of fit prop declare applicants where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop declare applicants
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the fit prop declare applicant in the entity cache if it is enabled.
	 *
	 * @param fitPropDeclareApplicant the fit prop declare applicant
	 */
	public void cacheResult(FitPropDeclareApplicant fitPropDeclareApplicant);

	/**
	 * Caches the fit prop declare applicants in the entity cache if it is enabled.
	 *
	 * @param fitPropDeclareApplicants the fit prop declare applicants
	 */
	public void cacheResult(
		java.util.List<FitPropDeclareApplicant> fitPropDeclareApplicants);

	/**
	 * Creates a new fit prop declare applicant with the primary key. Does not add the fit prop declare applicant to the database.
	 *
	 * @param fitPropDeclareApplicantId the primary key for the new fit prop declare applicant
	 * @return the new fit prop declare applicant
	 */
	public FitPropDeclareApplicant create(long fitPropDeclareApplicantId);

	/**
	 * Removes the fit prop declare applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant that was removed
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	public FitPropDeclareApplicant remove(long fitPropDeclareApplicantId)
		throws NoSuchFitPropDeclareApplicantException;

	public FitPropDeclareApplicant updateImpl(
		FitPropDeclareApplicant fitPropDeclareApplicant);

	/**
	 * Returns the fit prop declare applicant with the primary key or throws a <code>NoSuchFitPropDeclareApplicantException</code> if it could not be found.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	public FitPropDeclareApplicant findByPrimaryKey(
			long fitPropDeclareApplicantId)
		throws NoSuchFitPropDeclareApplicantException;

	/**
	 * Returns the fit prop declare applicant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant, or <code>null</code> if a fit prop declare applicant with the primary key could not be found
	 */
	public FitPropDeclareApplicant fetchByPrimaryKey(
		long fitPropDeclareApplicantId);

	/**
	 * Returns all the fit prop declare applicants.
	 *
	 * @return the fit prop declare applicants
	 */
	public java.util.List<FitPropDeclareApplicant> findAll();

	/**
	 * Returns a range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @return the range of fit prop declare applicants
	 */
	public java.util.List<FitPropDeclareApplicant> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop declare applicants
	 */
	public java.util.List<FitPropDeclareApplicant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FitPropDeclareApplicant> orderByComparator);

	/**
	 * Returns an ordered range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop declare applicants
	 */
	public java.util.List<FitPropDeclareApplicant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FitPropDeclareApplicant> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fit prop declare applicants from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fit prop declare applicants.
	 *
	 * @return the number of fit prop declare applicants
	 */
	public int countAll();

}