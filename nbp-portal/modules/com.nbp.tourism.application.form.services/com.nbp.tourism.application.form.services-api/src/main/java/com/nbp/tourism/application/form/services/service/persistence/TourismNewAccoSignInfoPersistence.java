/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoSignInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new acco sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoSignInfoUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccoSignInfoPersistence
	extends BasePersistence<TourismNewAccoSignInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccoSignInfoUtil} to access the tourism new acco sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new acco sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco sign info
	 * @throws NoSuchTourismNewAccoSignInfoException if a matching tourism new acco sign info could not be found
	 */
	public TourismNewAccoSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoSignInfoException;

	/**
	 * Returns the tourism new acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco sign info, or <code>null</code> if a matching tourism new acco sign info could not be found
	 */
	public TourismNewAccoSignInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco sign info, or <code>null</code> if a matching tourism new acco sign info could not be found
	 */
	public TourismNewAccoSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new acco sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco sign info that was removed
	 */
	public TourismNewAccoSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoSignInfoException;

	/**
	 * Returns the number of tourism new acco sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco sign infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new acco sign info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoSignInfo the tourism new acco sign info
	 */
	public void cacheResult(TourismNewAccoSignInfo tourismNewAccoSignInfo);

	/**
	 * Caches the tourism new acco sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoSignInfos the tourism new acco sign infos
	 */
	public void cacheResult(
		java.util.List<TourismNewAccoSignInfo> tourismNewAccoSignInfos);

	/**
	 * Creates a new tourism new acco sign info with the primary key. Does not add the tourism new acco sign info to the database.
	 *
	 * @param tourismNewAccoSignInfoId the primary key for the new tourism new acco sign info
	 * @return the new tourism new acco sign info
	 */
	public TourismNewAccoSignInfo create(long tourismNewAccoSignInfoId);

	/**
	 * Removes the tourism new acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoSignInfoId the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info that was removed
	 * @throws NoSuchTourismNewAccoSignInfoException if a tourism new acco sign info with the primary key could not be found
	 */
	public TourismNewAccoSignInfo remove(long tourismNewAccoSignInfoId)
		throws NoSuchTourismNewAccoSignInfoException;

	public TourismNewAccoSignInfo updateImpl(
		TourismNewAccoSignInfo tourismNewAccoSignInfo);

	/**
	 * Returns the tourism new acco sign info with the primary key or throws a <code>NoSuchTourismNewAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAccoSignInfoId the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info
	 * @throws NoSuchTourismNewAccoSignInfoException if a tourism new acco sign info with the primary key could not be found
	 */
	public TourismNewAccoSignInfo findByPrimaryKey(
			long tourismNewAccoSignInfoId)
		throws NoSuchTourismNewAccoSignInfoException;

	/**
	 * Returns the tourism new acco sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoSignInfoId the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info, or <code>null</code> if a tourism new acco sign info with the primary key could not be found
	 */
	public TourismNewAccoSignInfo fetchByPrimaryKey(
		long tourismNewAccoSignInfoId);

	/**
	 * Returns all the tourism new acco sign infos.
	 *
	 * @return the tourism new acco sign infos
	 */
	public java.util.List<TourismNewAccoSignInfo> findAll();

	/**
	 * Returns a range of all the tourism new acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco sign infos
	 * @param end the upper bound of the range of tourism new acco sign infos (not inclusive)
	 * @return the range of tourism new acco sign infos
	 */
	public java.util.List<TourismNewAccoSignInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism new acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco sign infos
	 * @param end the upper bound of the range of tourism new acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco sign infos
	 */
	public java.util.List<TourismNewAccoSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismNewAccoSignInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco sign infos
	 * @param end the upper bound of the range of tourism new acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco sign infos
	 */
	public java.util.List<TourismNewAccoSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismNewAccoSignInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new acco sign infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new acco sign infos.
	 *
	 * @return the number of tourism new acco sign infos
	 */
	public int countAll();

}