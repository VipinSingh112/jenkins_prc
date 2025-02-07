/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundContractTransPaymentInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundContractTransPaymentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground contract trans payment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundContractTransPaymentInfoUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundContractTransPaymentInfoPersistence
	extends BasePersistence<TourismBonaGroundContractTransPaymentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundContractTransPaymentInfoUtil} to access the tourism bona ground contract trans payment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground contract trans payment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundContractTransPaymentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground contract trans payment info
	 * @throws NoSuchTourismBonaGroundContractTransPaymentInfoException if a matching tourism bona ground contract trans payment info could not be found
	 */
	public TourismBonaGroundContractTransPaymentInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundContractTransPaymentInfoException;

	/**
	 * Returns the tourism bona ground contract trans payment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground contract trans payment info, or <code>null</code> if a matching tourism bona ground contract trans payment info could not be found
	 */
	public TourismBonaGroundContractTransPaymentInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground contract trans payment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground contract trans payment info, or <code>null</code> if a matching tourism bona ground contract trans payment info could not be found
	 */
	public TourismBonaGroundContractTransPaymentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground contract trans payment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground contract trans payment info that was removed
	 */
	public TourismBonaGroundContractTransPaymentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundContractTransPaymentInfoException;

	/**
	 * Returns the number of tourism bona ground contract trans payment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground contract trans payment infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground contract trans payment info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundContractTransPaymentInfo the tourism bona ground contract trans payment info
	 */
	public void cacheResult(
		TourismBonaGroundContractTransPaymentInfo
			tourismBonaGroundContractTransPaymentInfo);

	/**
	 * Caches the tourism bona ground contract trans payment infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundContractTransPaymentInfos the tourism bona ground contract trans payment infos
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundContractTransPaymentInfo>
			tourismBonaGroundContractTransPaymentInfos);

	/**
	 * Creates a new tourism bona ground contract trans payment info with the primary key. Does not add the tourism bona ground contract trans payment info to the database.
	 *
	 * @param tourismBonaGroTransPayId the primary key for the new tourism bona ground contract trans payment info
	 * @return the new tourism bona ground contract trans payment info
	 */
	public TourismBonaGroundContractTransPaymentInfo create(
		long tourismBonaGroTransPayId);

	/**
	 * Removes the tourism bona ground contract trans payment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroTransPayId the primary key of the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info that was removed
	 * @throws NoSuchTourismBonaGroundContractTransPaymentInfoException if a tourism bona ground contract trans payment info with the primary key could not be found
	 */
	public TourismBonaGroundContractTransPaymentInfo remove(
			long tourismBonaGroTransPayId)
		throws NoSuchTourismBonaGroundContractTransPaymentInfoException;

	public TourismBonaGroundContractTransPaymentInfo updateImpl(
		TourismBonaGroundContractTransPaymentInfo
			tourismBonaGroundContractTransPaymentInfo);

	/**
	 * Returns the tourism bona ground contract trans payment info with the primary key or throws a <code>NoSuchTourismBonaGroundContractTransPaymentInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaGroTransPayId the primary key of the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info
	 * @throws NoSuchTourismBonaGroundContractTransPaymentInfoException if a tourism bona ground contract trans payment info with the primary key could not be found
	 */
	public TourismBonaGroundContractTransPaymentInfo findByPrimaryKey(
			long tourismBonaGroTransPayId)
		throws NoSuchTourismBonaGroundContractTransPaymentInfoException;

	/**
	 * Returns the tourism bona ground contract trans payment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroTransPayId the primary key of the tourism bona ground contract trans payment info
	 * @return the tourism bona ground contract trans payment info, or <code>null</code> if a tourism bona ground contract trans payment info with the primary key could not be found
	 */
	public TourismBonaGroundContractTransPaymentInfo fetchByPrimaryKey(
		long tourismBonaGroTransPayId);

	/**
	 * Returns all the tourism bona ground contract trans payment infos.
	 *
	 * @return the tourism bona ground contract trans payment infos
	 */
	public java.util.List<TourismBonaGroundContractTransPaymentInfo> findAll();

	/**
	 * Returns a range of all the tourism bona ground contract trans payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundContractTransPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground contract trans payment infos
	 * @param end the upper bound of the range of tourism bona ground contract trans payment infos (not inclusive)
	 * @return the range of tourism bona ground contract trans payment infos
	 */
	public java.util.List<TourismBonaGroundContractTransPaymentInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground contract trans payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundContractTransPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground contract trans payment infos
	 * @param end the upper bound of the range of tourism bona ground contract trans payment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground contract trans payment infos
	 */
	public java.util.List<TourismBonaGroundContractTransPaymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundContractTransPaymentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground contract trans payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundContractTransPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground contract trans payment infos
	 * @param end the upper bound of the range of tourism bona ground contract trans payment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground contract trans payment infos
	 */
	public java.util.List<TourismBonaGroundContractTransPaymentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundContractTransPaymentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground contract trans payment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground contract trans payment infos.
	 *
	 * @return the number of tourism bona ground contract trans payment infos
	 */
	public int countAll();

}