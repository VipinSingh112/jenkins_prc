/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundPaymentInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundPaymentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground payment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundPaymentInfoPersistence
	extends BasePersistence<TourismBonaGroundPaymentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundPaymentInfoUtil} to access the tourism bona ground payment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground payment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundPaymentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground payment info
	 * @throws NoSuchTourismBonaGroundPaymentInfoException if a matching tourism bona ground payment info could not be found
	 */
	public TourismBonaGroundPaymentInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundPaymentInfoException;

	/**
	 * Returns the tourism bona ground payment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground payment info, or <code>null</code> if a matching tourism bona ground payment info could not be found
	 */
	public TourismBonaGroundPaymentInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground payment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground payment info, or <code>null</code> if a matching tourism bona ground payment info could not be found
	 */
	public TourismBonaGroundPaymentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground payment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground payment info that was removed
	 */
	public TourismBonaGroundPaymentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundPaymentInfoException;

	/**
	 * Returns the number of tourism bona ground payment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground payment infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground payment info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 */
	public void cacheResult(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo);

	/**
	 * Caches the tourism bona ground payment infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundPaymentInfos the tourism bona ground payment infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundPaymentInfo>
			tourismBonaGroundPaymentInfos);

	/**
	 * Creates a new tourism bona ground payment info with the primary key. Does not add the tourism bona ground payment info to the database.
	 *
	 * @param tourismBonaGroundPayId the primary key for the new tourism bona ground payment info
	 * @return the new tourism bona ground payment info
	 */
	public TourismBonaGroundPaymentInfo create(long tourismBonaGroundPayId);

	/**
	 * Removes the tourism bona ground payment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was removed
	 * @throws NoSuchTourismBonaGroundPaymentInfoException if a tourism bona ground payment info with the primary key could not be found
	 */
	public TourismBonaGroundPaymentInfo remove(long tourismBonaGroundPayId)
		throws NoSuchTourismBonaGroundPaymentInfoException;

	public TourismBonaGroundPaymentInfo updateImpl(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo);

	/**
	 * Returns the tourism bona ground payment info with the primary key or throws a <code>NoSuchTourismBonaGroundPaymentInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info
	 * @throws NoSuchTourismBonaGroundPaymentInfoException if a tourism bona ground payment info with the primary key could not be found
	 */
	public TourismBonaGroundPaymentInfo findByPrimaryKey(
			long tourismBonaGroundPayId)
		throws NoSuchTourismBonaGroundPaymentInfoException;

	/**
	 * Returns the tourism bona ground payment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info, or <code>null</code> if a tourism bona ground payment info with the primary key could not be found
	 */
	public TourismBonaGroundPaymentInfo fetchByPrimaryKey(
		long tourismBonaGroundPayId);

	/**
	 * Returns all the tourism bona ground payment infos.
	 *
	 * @return the tourism bona ground payment infos
	 */
	public java.util.List<TourismBonaGroundPaymentInfo> findAll();

	/**
	 * Returns a range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @return the range of tourism bona ground payment infos
	 */
	public java.util.List<TourismBonaGroundPaymentInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground payment infos
	 */
	public java.util.List<TourismBonaGroundPaymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundPaymentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground payment infos
	 */
	public java.util.List<TourismBonaGroundPaymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundPaymentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground payment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground payment infos.
	 *
	 * @return the number of tourism bona ground payment infos
	 */
	public int countAll();

}