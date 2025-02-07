/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchQualityApplicantDetailException;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quality applicant detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetailUtil
 * @generated
 */
@ProviderType
public interface QualityApplicantDetailPersistence
	extends BasePersistence<QualityApplicantDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualityApplicantDetailUtil} to access the quality applicant detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or throws a <code>NoSuchQualityApplicantDetailException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a matching quality applicant detail could not be found
	 */
	public QualityApplicantDetail findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityApplicantDetailException;

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality applicant detail, or <code>null</code> if a matching quality applicant detail could not be found
	 */
	public QualityApplicantDetail fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality applicant detail, or <code>null</code> if a matching quality applicant detail could not be found
	 */
	public QualityApplicantDetail fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the quality applicant detail where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality applicant detail that was removed
	 */
	public QualityApplicantDetail removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityApplicantDetailException;

	/**
	 * Returns the number of quality applicant details where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality applicant details
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the quality applicant detail in the entity cache if it is enabled.
	 *
	 * @param qualityApplicantDetail the quality applicant detail
	 */
	public void cacheResult(QualityApplicantDetail qualityApplicantDetail);

	/**
	 * Caches the quality applicant details in the entity cache if it is enabled.
	 *
	 * @param qualityApplicantDetails the quality applicant details
	 */
	public void cacheResult(
		java.util.List<QualityApplicantDetail> qualityApplicantDetails);

	/**
	 * Creates a new quality applicant detail with the primary key. Does not add the quality applicant detail to the database.
	 *
	 * @param qualityApplicantDetailId the primary key for the new quality applicant detail
	 * @return the new quality applicant detail
	 */
	public QualityApplicantDetail create(long qualityApplicantDetailId);

	/**
	 * Removes the quality applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail that was removed
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	public QualityApplicantDetail remove(long qualityApplicantDetailId)
		throws NoSuchQualityApplicantDetailException;

	public QualityApplicantDetail updateImpl(
		QualityApplicantDetail qualityApplicantDetail);

	/**
	 * Returns the quality applicant detail with the primary key or throws a <code>NoSuchQualityApplicantDetailException</code> if it could not be found.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	public QualityApplicantDetail findByPrimaryKey(
			long qualityApplicantDetailId)
		throws NoSuchQualityApplicantDetailException;

	/**
	 * Returns the quality applicant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail, or <code>null</code> if a quality applicant detail with the primary key could not be found
	 */
	public QualityApplicantDetail fetchByPrimaryKey(
		long qualityApplicantDetailId);

	/**
	 * Returns all the quality applicant details.
	 *
	 * @return the quality applicant details
	 */
	public java.util.List<QualityApplicantDetail> findAll();

	/**
	 * Returns a range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @return the range of quality applicant details
	 */
	public java.util.List<QualityApplicantDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality applicant details
	 */
	public java.util.List<QualityApplicantDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualityApplicantDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality applicant details
	 */
	public java.util.List<QualityApplicantDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualityApplicantDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quality applicant details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quality applicant details.
	 *
	 * @return the number of quality applicant details
	 */
	public int countAll();

}