/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionFormFirstException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona attraction form first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAttractionFormFirstPersistence
	extends BasePersistence<TourismBonaAttractionFormFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAttractionFormFirstUtil} to access the tourism bona attraction form first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a matching tourism bona attraction form first could not be found
	 */
	public TourismBonaAttractionFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstException;

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first, or <code>null</code> if a matching tourism bona attraction form first could not be found
	 */
	public TourismBonaAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first, or <code>null</code> if a matching tourism bona attraction form first could not be found
	 */
	public TourismBonaAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona attraction form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form first that was removed
	 */
	public TourismBonaAttractionFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstException;

	/**
	 * Returns the number of tourism bona attraction form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form firsts
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona attraction form first in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirst the tourism bona attraction form first
	 */
	public void cacheResult(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst);

	/**
	 * Caches the tourism bona attraction form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirsts the tourism bona attraction form firsts
	 */
	public void cacheResult(
		java.util.List<TourismBonaAttractionFormFirst>
			tourismBonaAttractionFormFirsts);

	/**
	 * Creates a new tourism bona attraction form first with the primary key. Does not add the tourism bona attraction form first to the database.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key for the new tourism bona attraction form first
	 * @return the new tourism bona attraction form first
	 */
	public TourismBonaAttractionFormFirst create(
		long tourismBonaAttractFormFirstId);

	/**
	 * Removes the tourism bona attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	public TourismBonaAttractionFormFirst remove(
			long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstException;

	public TourismBonaAttractionFormFirst updateImpl(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst);

	/**
	 * Returns the tourism bona attraction form first with the primary key or throws a <code>NoSuchTourismBonaAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	public TourismBonaAttractionFormFirst findByPrimaryKey(
			long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstException;

	/**
	 * Returns the tourism bona attraction form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first, or <code>null</code> if a tourism bona attraction form first with the primary key could not be found
	 */
	public TourismBonaAttractionFormFirst fetchByPrimaryKey(
		long tourismBonaAttractFormFirstId);

	/**
	 * Returns all the tourism bona attraction form firsts.
	 *
	 * @return the tourism bona attraction form firsts
	 */
	public java.util.List<TourismBonaAttractionFormFirst> findAll();

	/**
	 * Returns a range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @return the range of tourism bona attraction form firsts
	 */
	public java.util.List<TourismBonaAttractionFormFirst> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form firsts
	 */
	public java.util.List<TourismBonaAttractionFormFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionFormFirst> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form firsts
	 */
	public java.util.List<TourismBonaAttractionFormFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionFormFirst> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona attraction form firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona attraction form firsts.
	 *
	 * @return the number of tourism bona attraction form firsts
	 */
	public int countAll();

}