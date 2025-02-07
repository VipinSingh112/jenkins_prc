/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaWaterSportsFormFirstException;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona water sports form first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstUtil
 * @generated
 */
@ProviderType
public interface TourismBonaWaterSportsFormFirstPersistence
	extends BasePersistence<TourismBonaWaterSportsFormFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaWaterSportsFormFirstUtil} to access the tourism bona water sports form first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a matching tourism bona water sports form first could not be found
	 */
	public TourismBonaWaterSportsFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstException;

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first, or <code>null</code> if a matching tourism bona water sports form first could not be found
	 */
	public TourismBonaWaterSportsFormFirst fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first, or <code>null</code> if a matching tourism bona water sports form first could not be found
	 */
	public TourismBonaWaterSportsFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona water sports form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form first that was removed
	 */
	public TourismBonaWaterSportsFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstException;

	/**
	 * Returns the number of tourism bona water sports form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form firsts
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona water sports form first in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirst the tourism bona water sports form first
	 */
	public void cacheResult(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst);

	/**
	 * Caches the tourism bona water sports form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirsts the tourism bona water sports form firsts
	 */
	public void cacheResult(
		java.util.List<TourismBonaWaterSportsFormFirst>
			tourismBonaWaterSportsFormFirsts);

	/**
	 * Creates a new tourism bona water sports form first with the primary key. Does not add the tourism bona water sports form first to the database.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key for the new tourism bona water sports form first
	 * @return the new tourism bona water sports form first
	 */
	public TourismBonaWaterSportsFormFirst create(
		long tourismBonaWaterSFFirstId);

	/**
	 * Removes the tourism bona water sports form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	public TourismBonaWaterSportsFormFirst remove(
			long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstException;

	public TourismBonaWaterSportsFormFirst updateImpl(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst);

	/**
	 * Returns the tourism bona water sports form first with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormFirstException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	public TourismBonaWaterSportsFormFirst findByPrimaryKey(
			long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstException;

	/**
	 * Returns the tourism bona water sports form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first, or <code>null</code> if a tourism bona water sports form first with the primary key could not be found
	 */
	public TourismBonaWaterSportsFormFirst fetchByPrimaryKey(
		long tourismBonaWaterSFFirstId);

	/**
	 * Returns all the tourism bona water sports form firsts.
	 *
	 * @return the tourism bona water sports form firsts
	 */
	public java.util.List<TourismBonaWaterSportsFormFirst> findAll();

	/**
	 * Returns a range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @return the range of tourism bona water sports form firsts
	 */
	public java.util.List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form firsts
	 */
	public java.util.List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaWaterSportsFormFirst> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form firsts
	 */
	public java.util.List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaWaterSportsFormFirst> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona water sports form firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona water sports form firsts.
	 *
	 * @return the number of tourism bona water sports form firsts
	 */
	public int countAll();

}