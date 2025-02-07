/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccoGenralInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona acco genral info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoGenralInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAccoGenralInfoPersistence
	extends BasePersistence<TourismBonaAccoGenralInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAccoGenralInfoUtil} to access the tourism bona acco genral info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona acco genral info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoGenralInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco genral info
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a matching tourism bona acco genral info could not be found
	 */
	public TourismBonaAccoGenralInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoGenralInfoException;

	/**
	 * Returns the tourism bona acco genral info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco genral info, or <code>null</code> if a matching tourism bona acco genral info could not be found
	 */
	public TourismBonaAccoGenralInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona acco genral info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco genral info, or <code>null</code> if a matching tourism bona acco genral info could not be found
	 */
	public TourismBonaAccoGenralInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona acco genral info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco genral info that was removed
	 */
	public TourismBonaAccoGenralInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoGenralInfoException;

	/**
	 * Returns the number of tourism bona acco genral infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco genral infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona acco genral info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoGenralInfo the tourism bona acco genral info
	 */
	public void cacheResult(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo);

	/**
	 * Caches the tourism bona acco genral infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoGenralInfos the tourism bona acco genral infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaAccoGenralInfo> tourismBonaAccoGenralInfos);

	/**
	 * Creates a new tourism bona acco genral info with the primary key. Does not add the tourism bona acco genral info to the database.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key for the new tourism bona acco genral info
	 * @return the new tourism bona acco genral info
	 */
	public TourismBonaAccoGenralInfo create(long tourismBonaAccoGenralInfoId);

	/**
	 * Removes the tourism bona acco genral info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was removed
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a tourism bona acco genral info with the primary key could not be found
	 */
	public TourismBonaAccoGenralInfo remove(long tourismBonaAccoGenralInfoId)
		throws NoSuchTourismBonaAccoGenralInfoException;

	public TourismBonaAccoGenralInfo updateImpl(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo);

	/**
	 * Returns the tourism bona acco genral info with the primary key or throws a <code>NoSuchTourismBonaAccoGenralInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a tourism bona acco genral info with the primary key could not be found
	 */
	public TourismBonaAccoGenralInfo findByPrimaryKey(
			long tourismBonaAccoGenralInfoId)
		throws NoSuchTourismBonaAccoGenralInfoException;

	/**
	 * Returns the tourism bona acco genral info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info, or <code>null</code> if a tourism bona acco genral info with the primary key could not be found
	 */
	public TourismBonaAccoGenralInfo fetchByPrimaryKey(
		long tourismBonaAccoGenralInfoId);

	/**
	 * Returns all the tourism bona acco genral infos.
	 *
	 * @return the tourism bona acco genral infos
	 */
	public java.util.List<TourismBonaAccoGenralInfo> findAll();

	/**
	 * Returns a range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @return the range of tourism bona acco genral infos
	 */
	public java.util.List<TourismBonaAccoGenralInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco genral infos
	 */
	public java.util.List<TourismBonaAccoGenralInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccoGenralInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco genral infos
	 */
	public java.util.List<TourismBonaAccoGenralInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccoGenralInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona acco genral infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona acco genral infos.
	 *
	 * @return the number of tourism bona acco genral infos
	 */
	public int countAll();

}