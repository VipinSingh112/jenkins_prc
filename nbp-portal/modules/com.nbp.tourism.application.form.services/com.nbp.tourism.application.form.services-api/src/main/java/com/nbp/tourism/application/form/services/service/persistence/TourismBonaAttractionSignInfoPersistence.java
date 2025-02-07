/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionSignInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona attraction sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionSignInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAttractionSignInfoPersistence
	extends BasePersistence<TourismBonaAttractionSignInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAttractionSignInfoUtil} to access the tourism bona attraction sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona attraction sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction sign info
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a matching tourism bona attraction sign info could not be found
	 */
	public TourismBonaAttractionSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionSignInfoException;

	/**
	 * Returns the tourism bona attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction sign info, or <code>null</code> if a matching tourism bona attraction sign info could not be found
	 */
	public TourismBonaAttractionSignInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction sign info, or <code>null</code> if a matching tourism bona attraction sign info could not be found
	 */
	public TourismBonaAttractionSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona attraction sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction sign info that was removed
	 */
	public TourismBonaAttractionSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionSignInfoException;

	/**
	 * Returns the number of tourism bona attraction sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction sign infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona attraction sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionSignInfo the tourism bona attraction sign info
	 */
	public void cacheResult(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo);

	/**
	 * Caches the tourism bona attraction sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionSignInfos the tourism bona attraction sign infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaAttractionSignInfo>
			tourismBonaAttractionSignInfos);

	/**
	 * Creates a new tourism bona attraction sign info with the primary key. Does not add the tourism bona attraction sign info to the database.
	 *
	 * @param tourismBonAttrSignId the primary key for the new tourism bona attraction sign info
	 * @return the new tourism bona attraction sign info
	 */
	public TourismBonaAttractionSignInfo create(long tourismBonAttrSignId);

	/**
	 * Removes the tourism bona attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was removed
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a tourism bona attraction sign info with the primary key could not be found
	 */
	public TourismBonaAttractionSignInfo remove(long tourismBonAttrSignId)
		throws NoSuchTourismBonaAttractionSignInfoException;

	public TourismBonaAttractionSignInfo updateImpl(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo);

	/**
	 * Returns the tourism bona attraction sign info with the primary key or throws a <code>NoSuchTourismBonaAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a tourism bona attraction sign info with the primary key could not be found
	 */
	public TourismBonaAttractionSignInfo findByPrimaryKey(
			long tourismBonAttrSignId)
		throws NoSuchTourismBonaAttractionSignInfoException;

	/**
	 * Returns the tourism bona attraction sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info, or <code>null</code> if a tourism bona attraction sign info with the primary key could not be found
	 */
	public TourismBonaAttractionSignInfo fetchByPrimaryKey(
		long tourismBonAttrSignId);

	/**
	 * Returns all the tourism bona attraction sign infos.
	 *
	 * @return the tourism bona attraction sign infos
	 */
	public java.util.List<TourismBonaAttractionSignInfo> findAll();

	/**
	 * Returns a range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @return the range of tourism bona attraction sign infos
	 */
	public java.util.List<TourismBonaAttractionSignInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction sign infos
	 */
	public java.util.List<TourismBonaAttractionSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction sign infos
	 */
	public java.util.List<TourismBonaAttractionSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona attraction sign infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona attraction sign infos.
	 *
	 * @return the number of tourism bona attraction sign infos
	 */
	public int countAll();

}