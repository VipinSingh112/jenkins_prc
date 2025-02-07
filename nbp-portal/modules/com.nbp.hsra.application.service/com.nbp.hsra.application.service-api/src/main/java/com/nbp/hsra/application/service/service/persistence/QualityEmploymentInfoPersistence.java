/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchQualityEmploymentInfoException;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quality employment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfoUtil
 * @generated
 */
@ProviderType
public interface QualityEmploymentInfoPersistence
	extends BasePersistence<QualityEmploymentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualityEmploymentInfoUtil} to access the quality employment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or throws a <code>NoSuchQualityEmploymentInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a matching quality employment info could not be found
	 */
	public QualityEmploymentInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityEmploymentInfoException;

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality employment info, or <code>null</code> if a matching quality employment info could not be found
	 */
	public QualityEmploymentInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality employment info, or <code>null</code> if a matching quality employment info could not be found
	 */
	public QualityEmploymentInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the quality employment info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality employment info that was removed
	 */
	public QualityEmploymentInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityEmploymentInfoException;

	/**
	 * Returns the number of quality employment infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality employment infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the quality employment info in the entity cache if it is enabled.
	 *
	 * @param qualityEmploymentInfo the quality employment info
	 */
	public void cacheResult(QualityEmploymentInfo qualityEmploymentInfo);

	/**
	 * Caches the quality employment infos in the entity cache if it is enabled.
	 *
	 * @param qualityEmploymentInfos the quality employment infos
	 */
	public void cacheResult(
		java.util.List<QualityEmploymentInfo> qualityEmploymentInfos);

	/**
	 * Creates a new quality employment info with the primary key. Does not add the quality employment info to the database.
	 *
	 * @param qualityEmploymentInfoId the primary key for the new quality employment info
	 * @return the new quality employment info
	 */
	public QualityEmploymentInfo create(long qualityEmploymentInfoId);

	/**
	 * Removes the quality employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info that was removed
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	public QualityEmploymentInfo remove(long qualityEmploymentInfoId)
		throws NoSuchQualityEmploymentInfoException;

	public QualityEmploymentInfo updateImpl(
		QualityEmploymentInfo qualityEmploymentInfo);

	/**
	 * Returns the quality employment info with the primary key or throws a <code>NoSuchQualityEmploymentInfoException</code> if it could not be found.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	public QualityEmploymentInfo findByPrimaryKey(long qualityEmploymentInfoId)
		throws NoSuchQualityEmploymentInfoException;

	/**
	 * Returns the quality employment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info, or <code>null</code> if a quality employment info with the primary key could not be found
	 */
	public QualityEmploymentInfo fetchByPrimaryKey(
		long qualityEmploymentInfoId);

	/**
	 * Returns all the quality employment infos.
	 *
	 * @return the quality employment infos
	 */
	public java.util.List<QualityEmploymentInfo> findAll();

	/**
	 * Returns a range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @return the range of quality employment infos
	 */
	public java.util.List<QualityEmploymentInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality employment infos
	 */
	public java.util.List<QualityEmploymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualityEmploymentInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality employment infos
	 */
	public java.util.List<QualityEmploymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualityEmploymentInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quality employment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quality employment infos.
	 *
	 * @return the number of quality employment infos
	 */
	public int countAll();

}