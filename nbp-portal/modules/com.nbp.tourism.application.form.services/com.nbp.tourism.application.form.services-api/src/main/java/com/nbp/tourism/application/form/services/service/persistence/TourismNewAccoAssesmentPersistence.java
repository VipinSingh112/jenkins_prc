/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoAssesmentException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new acco assesment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccoAssesmentPersistence
	extends BasePersistence<TourismNewAccoAssesment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccoAssesmentUtil} to access the tourism new acco assesment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a matching tourism new acco assesment could not be found
	 */
	public TourismNewAccoAssesment findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentException;

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment, or <code>null</code> if a matching tourism new acco assesment could not be found
	 */
	public TourismNewAccoAssesment fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco assesment, or <code>null</code> if a matching tourism new acco assesment could not be found
	 */
	public TourismNewAccoAssesment fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new acco assesment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco assesment that was removed
	 */
	public TourismNewAccoAssesment removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentException;

	/**
	 * Returns the number of tourism new acco assesments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco assesments
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new acco assesment in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesment the tourism new acco assesment
	 */
	public void cacheResult(TourismNewAccoAssesment tourismNewAccoAssesment);

	/**
	 * Caches the tourism new acco assesments in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesments the tourism new acco assesments
	 */
	public void cacheResult(
		java.util.List<TourismNewAccoAssesment> tourismNewAccoAssesments);

	/**
	 * Creates a new tourism new acco assesment with the primary key. Does not add the tourism new acco assesment to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment
	 * @return the new tourism new acco assesment
	 */
	public TourismNewAccoAssesment create(long TourismNewAccoAssesmentInfoId);

	/**
	 * Removes the tourism new acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment that was removed
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	public TourismNewAccoAssesment remove(long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentException;

	public TourismNewAccoAssesment updateImpl(
		TourismNewAccoAssesment tourismNewAccoAssesment);

	/**
	 * Returns the tourism new acco assesment with the primary key or throws a <code>NoSuchTourismNewAccoAssesmentException</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	public TourismNewAccoAssesment findByPrimaryKey(
			long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentException;

	/**
	 * Returns the tourism new acco assesment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment, or <code>null</code> if a tourism new acco assesment with the primary key could not be found
	 */
	public TourismNewAccoAssesment fetchByPrimaryKey(
		long TourismNewAccoAssesmentInfoId);

	/**
	 * Returns all the tourism new acco assesments.
	 *
	 * @return the tourism new acco assesments
	 */
	public java.util.List<TourismNewAccoAssesment> findAll();

	/**
	 * Returns a range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @return the range of tourism new acco assesments
	 */
	public java.util.List<TourismNewAccoAssesment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco assesments
	 */
	public java.util.List<TourismNewAccoAssesment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccoAssesment> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco assesments
	 */
	public java.util.List<TourismNewAccoAssesment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccoAssesment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new acco assesments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new acco assesments.
	 *
	 * @return the number of tourism new acco assesments
	 */
	public int countAll();

}