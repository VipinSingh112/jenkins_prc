/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionEmployeeInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new attraction employee info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfoUtil
 * @generated
 */
@ProviderType
public interface TourismNewAttractionEmployeeInfoPersistence
	extends BasePersistence<TourismNewAttractionEmployeeInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAttractionEmployeeInfoUtil} to access the tourism new attraction employee info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new attraction employee info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction employee info
	 * @throws NoSuchTourismNewAttractionEmployeeInfoException if a matching tourism new attraction employee info could not be found
	 */
	public TourismNewAttractionEmployeeInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionEmployeeInfoException;

	/**
	 * Returns the tourism new attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction employee info, or <code>null</code> if a matching tourism new attraction employee info could not be found
	 */
	public TourismNewAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction employee info, or <code>null</code> if a matching tourism new attraction employee info could not be found
	 */
	public TourismNewAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new attraction employee info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction employee info that was removed
	 */
	public TourismNewAttractionEmployeeInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionEmployeeInfoException;

	/**
	 * Returns the number of tourism new attraction employee infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction employee infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new attraction employee info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionEmployeeInfo the tourism new attraction employee info
	 */
	public void cacheResult(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo);

	/**
	 * Caches the tourism new attraction employee infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionEmployeeInfos the tourism new attraction employee infos
	 */
	public void cacheResult(
		java.util.List<TourismNewAttractionEmployeeInfo>
			tourismNewAttractionEmployeeInfos);

	/**
	 * Creates a new tourism new attraction employee info with the primary key. Does not add the tourism new attraction employee info to the database.
	 *
	 * @param tourismNewAttractionEmploId the primary key for the new tourism new attraction employee info
	 * @return the new tourism new attraction employee info
	 */
	public TourismNewAttractionEmployeeInfo create(
		long tourismNewAttractionEmploId);

	/**
	 * Removes the tourism new attraction employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info that was removed
	 * @throws NoSuchTourismNewAttractionEmployeeInfoException if a tourism new attraction employee info with the primary key could not be found
	 */
	public TourismNewAttractionEmployeeInfo remove(
			long tourismNewAttractionEmploId)
		throws NoSuchTourismNewAttractionEmployeeInfoException;

	public TourismNewAttractionEmployeeInfo updateImpl(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo);

	/**
	 * Returns the tourism new attraction employee info with the primary key or throws a <code>NoSuchTourismNewAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info
	 * @throws NoSuchTourismNewAttractionEmployeeInfoException if a tourism new attraction employee info with the primary key could not be found
	 */
	public TourismNewAttractionEmployeeInfo findByPrimaryKey(
			long tourismNewAttractionEmploId)
		throws NoSuchTourismNewAttractionEmployeeInfoException;

	/**
	 * Returns the tourism new attraction employee info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info, or <code>null</code> if a tourism new attraction employee info with the primary key could not be found
	 */
	public TourismNewAttractionEmployeeInfo fetchByPrimaryKey(
		long tourismNewAttractionEmploId);

	/**
	 * Returns all the tourism new attraction employee infos.
	 *
	 * @return the tourism new attraction employee infos
	 */
	public java.util.List<TourismNewAttractionEmployeeInfo> findAll();

	/**
	 * Returns a range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @return the range of tourism new attraction employee infos
	 */
	public java.util.List<TourismNewAttractionEmployeeInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction employee infos
	 */
	public java.util.List<TourismNewAttractionEmployeeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionEmployeeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction employee infos
	 */
	public java.util.List<TourismNewAttractionEmployeeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionEmployeeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new attraction employee infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new attraction employee infos.
	 *
	 * @return the number of tourism new attraction employee infos
	 */
	public int countAll();

}