/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaWaterSportSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportSignInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona water sport sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportSignInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaWaterSportSignInfoPersistence
	extends BasePersistence<TourismBonaWaterSportSignInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaWaterSportSignInfoUtil} to access the tourism bona water sport sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona water sport sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sport sign info
	 * @throws NoSuchTourismBonaWaterSportSignInfoException if a matching tourism bona water sport sign info could not be found
	 */
	public TourismBonaWaterSportSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportSignInfoException;

	/**
	 * Returns the tourism bona water sport sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sport sign info, or <code>null</code> if a matching tourism bona water sport sign info could not be found
	 */
	public TourismBonaWaterSportSignInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona water sport sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sport sign info, or <code>null</code> if a matching tourism bona water sport sign info could not be found
	 */
	public TourismBonaWaterSportSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona water sport sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sport sign info that was removed
	 */
	public TourismBonaWaterSportSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportSignInfoException;

	/**
	 * Returns the number of tourism bona water sport sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sport sign infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona water sport sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 */
	public void cacheResult(
		TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo);

	/**
	 * Caches the tourism bona water sport sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportSignInfos the tourism bona water sport sign infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaWaterSportSignInfo>
			tourismBonaWaterSportSignInfos);

	/**
	 * Creates a new tourism bona water sport sign info with the primary key. Does not add the tourism bona water sport sign info to the database.
	 *
	 * @param tourismBonaWSSignId the primary key for the new tourism bona water sport sign info
	 * @return the new tourism bona water sport sign info
	 */
	public TourismBonaWaterSportSignInfo create(long tourismBonaWSSignId);

	/**
	 * Removes the tourism bona water sport sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was removed
	 * @throws NoSuchTourismBonaWaterSportSignInfoException if a tourism bona water sport sign info with the primary key could not be found
	 */
	public TourismBonaWaterSportSignInfo remove(long tourismBonaWSSignId)
		throws NoSuchTourismBonaWaterSportSignInfoException;

	public TourismBonaWaterSportSignInfo updateImpl(
		TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo);

	/**
	 * Returns the tourism bona water sport sign info with the primary key or throws a <code>NoSuchTourismBonaWaterSportSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info
	 * @throws NoSuchTourismBonaWaterSportSignInfoException if a tourism bona water sport sign info with the primary key could not be found
	 */
	public TourismBonaWaterSportSignInfo findByPrimaryKey(
			long tourismBonaWSSignId)
		throws NoSuchTourismBonaWaterSportSignInfoException;

	/**
	 * Returns the tourism bona water sport sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info, or <code>null</code> if a tourism bona water sport sign info with the primary key could not be found
	 */
	public TourismBonaWaterSportSignInfo fetchByPrimaryKey(
		long tourismBonaWSSignId);

	/**
	 * Returns all the tourism bona water sport sign infos.
	 *
	 * @return the tourism bona water sport sign infos
	 */
	public java.util.List<TourismBonaWaterSportSignInfo> findAll();

	/**
	 * Returns a range of all the tourism bona water sport sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sport sign infos
	 * @param end the upper bound of the range of tourism bona water sport sign infos (not inclusive)
	 * @return the range of tourism bona water sport sign infos
	 */
	public java.util.List<TourismBonaWaterSportSignInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona water sport sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sport sign infos
	 * @param end the upper bound of the range of tourism bona water sport sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sport sign infos
	 */
	public java.util.List<TourismBonaWaterSportSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaWaterSportSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona water sport sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sport sign infos
	 * @param end the upper bound of the range of tourism bona water sport sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sport sign infos
	 */
	public java.util.List<TourismBonaWaterSportSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaWaterSportSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona water sport sign infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona water sport sign infos.
	 *
	 * @return the number of tourism bona water sport sign infos
	 */
	public int countAll();

}