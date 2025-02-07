/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchQualityProficiencyDetailException;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quality proficiency detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityProficiencyDetailUtil
 * @generated
 */
@ProviderType
public interface QualityProficiencyDetailPersistence
	extends BasePersistence<QualityProficiencyDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualityProficiencyDetailUtil} to access the quality proficiency detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or throws a <code>NoSuchQualityProficiencyDetailException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a matching quality proficiency detail could not be found
	 */
	public QualityProficiencyDetail findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityProficiencyDetailException;

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality proficiency detail, or <code>null</code> if a matching quality proficiency detail could not be found
	 */
	public QualityProficiencyDetail fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality proficiency detail, or <code>null</code> if a matching quality proficiency detail could not be found
	 */
	public QualityProficiencyDetail fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the quality proficiency detail where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality proficiency detail that was removed
	 */
	public QualityProficiencyDetail removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityProficiencyDetailException;

	/**
	 * Returns the number of quality proficiency details where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality proficiency details
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the quality proficiency detail in the entity cache if it is enabled.
	 *
	 * @param qualityProficiencyDetail the quality proficiency detail
	 */
	public void cacheResult(QualityProficiencyDetail qualityProficiencyDetail);

	/**
	 * Caches the quality proficiency details in the entity cache if it is enabled.
	 *
	 * @param qualityProficiencyDetails the quality proficiency details
	 */
	public void cacheResult(
		java.util.List<QualityProficiencyDetail> qualityProficiencyDetails);

	/**
	 * Creates a new quality proficiency detail with the primary key. Does not add the quality proficiency detail to the database.
	 *
	 * @param qualityProficiDetailId the primary key for the new quality proficiency detail
	 * @return the new quality proficiency detail
	 */
	public QualityProficiencyDetail create(long qualityProficiDetailId);

	/**
	 * Removes the quality proficiency detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail that was removed
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	public QualityProficiencyDetail remove(long qualityProficiDetailId)
		throws NoSuchQualityProficiencyDetailException;

	public QualityProficiencyDetail updateImpl(
		QualityProficiencyDetail qualityProficiencyDetail);

	/**
	 * Returns the quality proficiency detail with the primary key or throws a <code>NoSuchQualityProficiencyDetailException</code> if it could not be found.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	public QualityProficiencyDetail findByPrimaryKey(
			long qualityProficiDetailId)
		throws NoSuchQualityProficiencyDetailException;

	/**
	 * Returns the quality proficiency detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail, or <code>null</code> if a quality proficiency detail with the primary key could not be found
	 */
	public QualityProficiencyDetail fetchByPrimaryKey(
		long qualityProficiDetailId);

	/**
	 * Returns all the quality proficiency details.
	 *
	 * @return the quality proficiency details
	 */
	public java.util.List<QualityProficiencyDetail> findAll();

	/**
	 * Returns a range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @return the range of quality proficiency details
	 */
	public java.util.List<QualityProficiencyDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality proficiency details
	 */
	public java.util.List<QualityProficiencyDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualityProficiencyDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality proficiency details
	 */
	public java.util.List<QualityProficiencyDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualityProficiencyDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quality proficiency details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quality proficiency details.
	 *
	 * @return the number of quality proficiency details
	 */
	public int countAll();

}