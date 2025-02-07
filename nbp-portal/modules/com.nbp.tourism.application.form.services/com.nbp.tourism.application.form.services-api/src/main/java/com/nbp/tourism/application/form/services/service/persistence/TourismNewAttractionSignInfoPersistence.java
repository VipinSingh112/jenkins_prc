/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionSignInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new attraction sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionSignInfoUtil
 * @generated
 */
@ProviderType
public interface TourismNewAttractionSignInfoPersistence
	extends BasePersistence<TourismNewAttractionSignInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAttractionSignInfoUtil} to access the tourism new attraction sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new attraction sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction sign info
	 * @throws NoSuchTourismNewAttractionSignInfoException if a matching tourism new attraction sign info could not be found
	 */
	public TourismNewAttractionSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionSignInfoException;

	/**
	 * Returns the tourism new attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction sign info, or <code>null</code> if a matching tourism new attraction sign info could not be found
	 */
	public TourismNewAttractionSignInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction sign info, or <code>null</code> if a matching tourism new attraction sign info could not be found
	 */
	public TourismNewAttractionSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new attraction sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction sign info that was removed
	 */
	public TourismNewAttractionSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionSignInfoException;

	/**
	 * Returns the number of tourism new attraction sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction sign infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new attraction sign info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionSignInfo the tourism new attraction sign info
	 */
	public void cacheResult(
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo);

	/**
	 * Caches the tourism new attraction sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionSignInfos the tourism new attraction sign infos
	 */
	public void cacheResult(
		java.util.List<TourismNewAttractionSignInfo>
			tourismNewAttractionSignInfos);

	/**
	 * Creates a new tourism new attraction sign info with the primary key. Does not add the tourism new attraction sign info to the database.
	 *
	 * @param tourismNewAttraSignInfoId the primary key for the new tourism new attraction sign info
	 * @return the new tourism new attraction sign info
	 */
	public TourismNewAttractionSignInfo create(long tourismNewAttraSignInfoId);

	/**
	 * Removes the tourism new attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was removed
	 * @throws NoSuchTourismNewAttractionSignInfoException if a tourism new attraction sign info with the primary key could not be found
	 */
	public TourismNewAttractionSignInfo remove(long tourismNewAttraSignInfoId)
		throws NoSuchTourismNewAttractionSignInfoException;

	public TourismNewAttractionSignInfo updateImpl(
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo);

	/**
	 * Returns the tourism new attraction sign info with the primary key or throws a <code>NoSuchTourismNewAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info
	 * @throws NoSuchTourismNewAttractionSignInfoException if a tourism new attraction sign info with the primary key could not be found
	 */
	public TourismNewAttractionSignInfo findByPrimaryKey(
			long tourismNewAttraSignInfoId)
		throws NoSuchTourismNewAttractionSignInfoException;

	/**
	 * Returns the tourism new attraction sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info, or <code>null</code> if a tourism new attraction sign info with the primary key could not be found
	 */
	public TourismNewAttractionSignInfo fetchByPrimaryKey(
		long tourismNewAttraSignInfoId);

	/**
	 * Returns all the tourism new attraction sign infos.
	 *
	 * @return the tourism new attraction sign infos
	 */
	public java.util.List<TourismNewAttractionSignInfo> findAll();

	/**
	 * Returns a range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @return the range of tourism new attraction sign infos
	 */
	public java.util.List<TourismNewAttractionSignInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction sign infos
	 */
	public java.util.List<TourismNewAttractionSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction sign infos
	 */
	public java.util.List<TourismNewAttractionSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new attraction sign infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new attraction sign infos.
	 *
	 * @return the number of tourism new attraction sign infos
	 */
	public int countAll();

}