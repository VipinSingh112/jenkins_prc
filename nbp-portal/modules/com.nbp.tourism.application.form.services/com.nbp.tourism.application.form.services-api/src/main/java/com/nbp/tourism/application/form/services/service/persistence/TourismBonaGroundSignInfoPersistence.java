/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundSignInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundSignInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundSignInfoPersistence
	extends BasePersistence<TourismBonaGroundSignInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundSignInfoUtil} to access the tourism bona ground sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a matching tourism bona ground sign info could not be found
	 */
	public TourismBonaGroundSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundSignInfoException;

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground sign info, or <code>null</code> if a matching tourism bona ground sign info could not be found
	 */
	public TourismBonaGroundSignInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground sign info, or <code>null</code> if a matching tourism bona ground sign info could not be found
	 */
	public TourismBonaGroundSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground sign info that was removed
	 */
	public TourismBonaGroundSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundSignInfoException;

	/**
	 * Returns the number of tourism bona ground sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground sign infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundSignInfo the tourism bona ground sign info
	 */
	public void cacheResult(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo);

	/**
	 * Caches the tourism bona ground sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundSignInfos the tourism bona ground sign infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundSignInfo> tourismBonaGroundSignInfos);

	/**
	 * Creates a new tourism bona ground sign info with the primary key. Does not add the tourism bona ground sign info to the database.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key for the new tourism bona ground sign info
	 * @return the new tourism bona ground sign info
	 */
	public TourismBonaGroundSignInfo create(long tourismBonaGroundSignInfoId);

	/**
	 * Removes the tourism bona ground sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was removed
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	public TourismBonaGroundSignInfo remove(long tourismBonaGroundSignInfoId)
		throws NoSuchTourismBonaGroundSignInfoException;

	public TourismBonaGroundSignInfo updateImpl(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo);

	/**
	 * Returns the tourism bona ground sign info with the primary key or throws a <code>NoSuchTourismBonaGroundSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	public TourismBonaGroundSignInfo findByPrimaryKey(
			long tourismBonaGroundSignInfoId)
		throws NoSuchTourismBonaGroundSignInfoException;

	/**
	 * Returns the tourism bona ground sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info, or <code>null</code> if a tourism bona ground sign info with the primary key could not be found
	 */
	public TourismBonaGroundSignInfo fetchByPrimaryKey(
		long tourismBonaGroundSignInfoId);

	/**
	 * Returns all the tourism bona ground sign infos.
	 *
	 * @return the tourism bona ground sign infos
	 */
	public java.util.List<TourismBonaGroundSignInfo> findAll();

	/**
	 * Returns a range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @return the range of tourism bona ground sign infos
	 */
	public java.util.List<TourismBonaGroundSignInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground sign infos
	 */
	public java.util.List<TourismBonaGroundSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground sign infos
	 */
	public java.util.List<TourismBonaGroundSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground sign infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground sign infos.
	 *
	 * @return the number of tourism bona ground sign infos
	 */
	public int countAll();

}