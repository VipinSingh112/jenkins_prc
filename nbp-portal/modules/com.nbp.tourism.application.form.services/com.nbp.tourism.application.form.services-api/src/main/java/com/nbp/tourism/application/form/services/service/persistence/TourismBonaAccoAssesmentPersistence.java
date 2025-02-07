/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccoAssesmentException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona acco assesment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoAssesmentUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAccoAssesmentPersistence
	extends BasePersistence<TourismBonaAccoAssesment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAccoAssesmentUtil} to access the tourism bona acco assesment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a matching tourism bona acco assesment could not be found
	 */
	public TourismBonaAccoAssesment findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoAssesmentException;

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco assesment, or <code>null</code> if a matching tourism bona acco assesment could not be found
	 */
	public TourismBonaAccoAssesment fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco assesment, or <code>null</code> if a matching tourism bona acco assesment could not be found
	 */
	public TourismBonaAccoAssesment fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona acco assesment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco assesment that was removed
	 */
	public TourismBonaAccoAssesment removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoAssesmentException;

	/**
	 * Returns the number of tourism bona acco assesments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco assesments
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona acco assesment in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoAssesment the tourism bona acco assesment
	 */
	public void cacheResult(TourismBonaAccoAssesment tourismBonaAccoAssesment);

	/**
	 * Caches the tourism bona acco assesments in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoAssesments the tourism bona acco assesments
	 */
	public void cacheResult(
		java.util.List<TourismBonaAccoAssesment> tourismBonaAccoAssesments);

	/**
	 * Creates a new tourism bona acco assesment with the primary key. Does not add the tourism bona acco assesment to the database.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key for the new tourism bona acco assesment
	 * @return the new tourism bona acco assesment
	 */
	public TourismBonaAccoAssesment create(long tourismBonaAccoAssesmentId);

	/**
	 * Removes the tourism bona acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was removed
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	public TourismBonaAccoAssesment remove(long tourismBonaAccoAssesmentId)
		throws NoSuchTourismBonaAccoAssesmentException;

	public TourismBonaAccoAssesment updateImpl(
		TourismBonaAccoAssesment tourismBonaAccoAssesment);

	/**
	 * Returns the tourism bona acco assesment with the primary key or throws a <code>NoSuchTourismBonaAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	public TourismBonaAccoAssesment findByPrimaryKey(
			long tourismBonaAccoAssesmentId)
		throws NoSuchTourismBonaAccoAssesmentException;

	/**
	 * Returns the tourism bona acco assesment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment, or <code>null</code> if a tourism bona acco assesment with the primary key could not be found
	 */
	public TourismBonaAccoAssesment fetchByPrimaryKey(
		long tourismBonaAccoAssesmentId);

	/**
	 * Returns all the tourism bona acco assesments.
	 *
	 * @return the tourism bona acco assesments
	 */
	public java.util.List<TourismBonaAccoAssesment> findAll();

	/**
	 * Returns a range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @return the range of tourism bona acco assesments
	 */
	public java.util.List<TourismBonaAccoAssesment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco assesments
	 */
	public java.util.List<TourismBonaAccoAssesment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccoAssesment> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco assesments
	 */
	public java.util.List<TourismBonaAccoAssesment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccoAssesment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona acco assesments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona acco assesments.
	 *
	 * @return the number of tourism bona acco assesments
	 */
	public int countAll();

}