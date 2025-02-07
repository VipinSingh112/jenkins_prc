/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccommodationFormException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona accommodation form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAccommodationFormPersistence
	extends BasePersistence<TourismBonaAccommodationForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAccommodationFormUtil} to access the tourism bona accommodation form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona accommodation form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form
	 * @throws NoSuchTourismBonaAccommodationFormException if a matching tourism bona accommodation form could not be found
	 */
	public TourismBonaAccommodationForm findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormException;

	/**
	 * Returns the tourism bona accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form, or <code>null</code> if a matching tourism bona accommodation form could not be found
	 */
	public TourismBonaAccommodationForm fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form, or <code>null</code> if a matching tourism bona accommodation form could not be found
	 */
	public TourismBonaAccommodationForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona accommodation form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona accommodation form that was removed
	 */
	public TourismBonaAccommodationForm removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormException;

	/**
	 * Returns the number of tourism bona accommodation forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona accommodation forms
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona accommodation form in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationForm the tourism bona accommodation form
	 */
	public void cacheResult(
		TourismBonaAccommodationForm tourismBonaAccommodationForm);

	/**
	 * Caches the tourism bona accommodation forms in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationForms the tourism bona accommodation forms
	 */
	public void cacheResult(
		java.util.List<TourismBonaAccommodationForm>
			tourismBonaAccommodationForms);

	/**
	 * Creates a new tourism bona accommodation form with the primary key. Does not add the tourism bona accommodation form to the database.
	 *
	 * @param tourismBonaAFId the primary key for the new tourism bona accommodation form
	 * @return the new tourism bona accommodation form
	 */
	public TourismBonaAccommodationForm create(long tourismBonaAFId);

	/**
	 * Removes the tourism bona accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was removed
	 * @throws NoSuchTourismBonaAccommodationFormException if a tourism bona accommodation form with the primary key could not be found
	 */
	public TourismBonaAccommodationForm remove(long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormException;

	public TourismBonaAccommodationForm updateImpl(
		TourismBonaAccommodationForm tourismBonaAccommodationForm);

	/**
	 * Returns the tourism bona accommodation form with the primary key or throws a <code>NoSuchTourismBonaAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form
	 * @throws NoSuchTourismBonaAccommodationFormException if a tourism bona accommodation form with the primary key could not be found
	 */
	public TourismBonaAccommodationForm findByPrimaryKey(long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormException;

	/**
	 * Returns the tourism bona accommodation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form, or <code>null</code> if a tourism bona accommodation form with the primary key could not be found
	 */
	public TourismBonaAccommodationForm fetchByPrimaryKey(long tourismBonaAFId);

	/**
	 * Returns all the tourism bona accommodation forms.
	 *
	 * @return the tourism bona accommodation forms
	 */
	public java.util.List<TourismBonaAccommodationForm> findAll();

	/**
	 * Returns a range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @return the range of tourism bona accommodation forms
	 */
	public java.util.List<TourismBonaAccommodationForm> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona accommodation forms
	 */
	public java.util.List<TourismBonaAccommodationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccommodationForm> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona accommodation forms
	 */
	public java.util.List<TourismBonaAccommodationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccommodationForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona accommodation forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona accommodation forms.
	 *
	 * @return the number of tourism bona accommodation forms
	 */
	public int countAll();

}