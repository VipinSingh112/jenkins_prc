/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewNumberOFEmploymentException;
import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmployment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new number of employment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmploymentUtil
 * @generated
 */
@ProviderType
public interface TourismNewNumberOFEmploymentPersistence
	extends BasePersistence<TourismNewNumberOFEmployment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewNumberOFEmploymentUtil} to access the tourism new number of employment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewNumberOFEmploymentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a matching tourism new number of employment could not be found
	 */
	public TourismNewNumberOFEmployment findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewNumberOFEmploymentException;

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new number of employment, or <code>null</code> if a matching tourism new number of employment could not be found
	 */
	public TourismNewNumberOFEmployment fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new number of employment, or <code>null</code> if a matching tourism new number of employment could not be found
	 */
	public TourismNewNumberOFEmployment fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new number of employment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new number of employment that was removed
	 */
	public TourismNewNumberOFEmployment removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewNumberOFEmploymentException;

	/**
	 * Returns the number of tourism new number of employments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new number of employments
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new number of employment in the entity cache if it is enabled.
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 */
	public void cacheResult(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment);

	/**
	 * Caches the tourism new number of employments in the entity cache if it is enabled.
	 *
	 * @param tourismNewNumberOFEmployments the tourism new number of employments
	 */
	public void cacheResult(
		java.util.List<TourismNewNumberOFEmployment>
			tourismNewNumberOFEmployments);

	/**
	 * Creates a new tourism new number of employment with the primary key. Does not add the tourism new number of employment to the database.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key for the new tourism new number of employment
	 * @return the new tourism new number of employment
	 */
	public TourismNewNumberOFEmployment create(
		long tourismNewNumberOFEmploymentId);

	/**
	 * Removes the tourism new number of employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	public TourismNewNumberOFEmployment remove(
			long tourismNewNumberOFEmploymentId)
		throws NoSuchTourismNewNumberOFEmploymentException;

	public TourismNewNumberOFEmployment updateImpl(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment);

	/**
	 * Returns the tourism new number of employment with the primary key or throws a <code>NoSuchTourismNewNumberOFEmploymentException</code> if it could not be found.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	public TourismNewNumberOFEmployment findByPrimaryKey(
			long tourismNewNumberOFEmploymentId)
		throws NoSuchTourismNewNumberOFEmploymentException;

	/**
	 * Returns the tourism new number of employment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment, or <code>null</code> if a tourism new number of employment with the primary key could not be found
	 */
	public TourismNewNumberOFEmployment fetchByPrimaryKey(
		long tourismNewNumberOFEmploymentId);

	/**
	 * Returns all the tourism new number of employments.
	 *
	 * @return the tourism new number of employments
	 */
	public java.util.List<TourismNewNumberOFEmployment> findAll();

	/**
	 * Returns a range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @return the range of tourism new number of employments
	 */
	public java.util.List<TourismNewNumberOFEmployment> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new number of employments
	 */
	public java.util.List<TourismNewNumberOFEmployment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewNumberOFEmployment> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new number of employments
	 */
	public java.util.List<TourismNewNumberOFEmployment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewNumberOFEmployment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new number of employments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new number of employments.
	 *
	 * @return the number of tourism new number of employments
	 */
	public int countAll();

}