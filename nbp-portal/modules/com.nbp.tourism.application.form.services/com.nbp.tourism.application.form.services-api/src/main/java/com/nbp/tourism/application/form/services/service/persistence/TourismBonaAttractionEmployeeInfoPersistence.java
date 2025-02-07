/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionEmployeeInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionEmployeeInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona attraction employee info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionEmployeeInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAttractionEmployeeInfoPersistence
	extends BasePersistence<TourismBonaAttractionEmployeeInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAttractionEmployeeInfoUtil} to access the tourism bona attraction employee info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona attraction employee info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction employee info
	 * @throws NoSuchTourismBonaAttractionEmployeeInfoException if a matching tourism bona attraction employee info could not be found
	 */
	public TourismBonaAttractionEmployeeInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionEmployeeInfoException;

	/**
	 * Returns the tourism bona attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction employee info, or <code>null</code> if a matching tourism bona attraction employee info could not be found
	 */
	public TourismBonaAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction employee info, or <code>null</code> if a matching tourism bona attraction employee info could not be found
	 */
	public TourismBonaAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona attraction employee info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction employee info that was removed
	 */
	public TourismBonaAttractionEmployeeInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionEmployeeInfoException;

	/**
	 * Returns the number of tourism bona attraction employee infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction employee infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona attraction employee info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionEmployeeInfo the tourism bona attraction employee info
	 */
	public void cacheResult(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo);

	/**
	 * Caches the tourism bona attraction employee infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionEmployeeInfos the tourism bona attraction employee infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaAttractionEmployeeInfo>
			tourismBonaAttractionEmployeeInfos);

	/**
	 * Creates a new tourism bona attraction employee info with the primary key. Does not add the tourism bona attraction employee info to the database.
	 *
	 * @param tourismBonaAttrEmpId the primary key for the new tourism bona attraction employee info
	 * @return the new tourism bona attraction employee info
	 */
	public TourismBonaAttractionEmployeeInfo create(long tourismBonaAttrEmpId);

	/**
	 * Removes the tourism bona attraction employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info that was removed
	 * @throws NoSuchTourismBonaAttractionEmployeeInfoException if a tourism bona attraction employee info with the primary key could not be found
	 */
	public TourismBonaAttractionEmployeeInfo remove(long tourismBonaAttrEmpId)
		throws NoSuchTourismBonaAttractionEmployeeInfoException;

	public TourismBonaAttractionEmployeeInfo updateImpl(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo);

	/**
	 * Returns the tourism bona attraction employee info with the primary key or throws a <code>NoSuchTourismBonaAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info
	 * @throws NoSuchTourismBonaAttractionEmployeeInfoException if a tourism bona attraction employee info with the primary key could not be found
	 */
	public TourismBonaAttractionEmployeeInfo findByPrimaryKey(
			long tourismBonaAttrEmpId)
		throws NoSuchTourismBonaAttractionEmployeeInfoException;

	/**
	 * Returns the tourism bona attraction employee info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info, or <code>null</code> if a tourism bona attraction employee info with the primary key could not be found
	 */
	public TourismBonaAttractionEmployeeInfo fetchByPrimaryKey(
		long tourismBonaAttrEmpId);

	/**
	 * Returns all the tourism bona attraction employee infos.
	 *
	 * @return the tourism bona attraction employee infos
	 */
	public java.util.List<TourismBonaAttractionEmployeeInfo> findAll();

	/**
	 * Returns a range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @return the range of tourism bona attraction employee infos
	 */
	public java.util.List<TourismBonaAttractionEmployeeInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction employee infos
	 */
	public java.util.List<TourismBonaAttractionEmployeeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionEmployeeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction employee infos
	 */
	public java.util.List<TourismBonaAttractionEmployeeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionEmployeeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona attraction employee infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona attraction employee infos.
	 *
	 * @return the number of tourism bona attraction employee infos
	 */
	public int countAll();

}