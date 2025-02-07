/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaOperatorInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona operator info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaOperatorInfoPersistence
	extends BasePersistence<TourismBonaOperatorInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaOperatorInfoUtil} to access the tourism bona operator info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaOperatorInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a matching tourism bona operator info could not be found
	 */
	public TourismBonaOperatorInfo findBygetTourismById(
			Long tourismApplicationId)
		throws NoSuchTourismBonaOperatorInfoException;

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona operator info, or <code>null</code> if a matching tourism bona operator info could not be found
	 */
	public TourismBonaOperatorInfo fetchBygetTourismById(
		Long tourismApplicationId);

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona operator info, or <code>null</code> if a matching tourism bona operator info could not be found
	 */
	public TourismBonaOperatorInfo fetchBygetTourismById(
		Long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona operator info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona operator info that was removed
	 */
	public TourismBonaOperatorInfo removeBygetTourismById(
			Long tourismApplicationId)
		throws NoSuchTourismBonaOperatorInfoException;

	/**
	 * Returns the number of tourism bona operator infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona operator infos
	 */
	public int countBygetTourismById(Long tourismApplicationId);

	/**
	 * Caches the tourism bona operator info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaOperatorInfo the tourism bona operator info
	 */
	public void cacheResult(TourismBonaOperatorInfo tourismBonaOperatorInfo);

	/**
	 * Caches the tourism bona operator infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaOperatorInfos the tourism bona operator infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaOperatorInfo> tourismBonaOperatorInfos);

	/**
	 * Creates a new tourism bona operator info with the primary key. Does not add the tourism bona operator info to the database.
	 *
	 * @param tourismBonaOperatorInfoId the primary key for the new tourism bona operator info
	 * @return the new tourism bona operator info
	 */
	public TourismBonaOperatorInfo create(long tourismBonaOperatorInfoId);

	/**
	 * Removes the tourism bona operator info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info that was removed
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	public TourismBonaOperatorInfo remove(long tourismBonaOperatorInfoId)
		throws NoSuchTourismBonaOperatorInfoException;

	public TourismBonaOperatorInfo updateImpl(
		TourismBonaOperatorInfo tourismBonaOperatorInfo);

	/**
	 * Returns the tourism bona operator info with the primary key or throws a <code>NoSuchTourismBonaOperatorInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	public TourismBonaOperatorInfo findByPrimaryKey(
			long tourismBonaOperatorInfoId)
		throws NoSuchTourismBonaOperatorInfoException;

	/**
	 * Returns the tourism bona operator info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info, or <code>null</code> if a tourism bona operator info with the primary key could not be found
	 */
	public TourismBonaOperatorInfo fetchByPrimaryKey(
		long tourismBonaOperatorInfoId);

	/**
	 * Returns all the tourism bona operator infos.
	 *
	 * @return the tourism bona operator infos
	 */
	public java.util.List<TourismBonaOperatorInfo> findAll();

	/**
	 * Returns a range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @return the range of tourism bona operator infos
	 */
	public java.util.List<TourismBonaOperatorInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona operator infos
	 */
	public java.util.List<TourismBonaOperatorInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaOperatorInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona operator infos
	 */
	public java.util.List<TourismBonaOperatorInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaOperatorInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona operator infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona operator infos.
	 *
	 * @return the number of tourism bona operator infos
	 */
	public int countAll();

}