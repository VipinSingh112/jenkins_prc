/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccommodationFormException;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new accommodation form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationFormUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccommodationFormPersistence
	extends BasePersistence<TourismNewAccommodationForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccommodationFormUtil} to access the tourism new accommodation form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a matching tourism new accommodation form could not be found
	 */
	public TourismNewAccommodationForm findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationFormException;

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation form, or <code>null</code> if a matching tourism new accommodation form could not be found
	 */
	public TourismNewAccommodationForm fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation form, or <code>null</code> if a matching tourism new accommodation form could not be found
	 */
	public TourismNewAccommodationForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new accommodation form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accommodation form that was removed
	 */
	public TourismNewAccommodationForm removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationFormException;

	/**
	 * Returns the number of tourism new accommodation forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accommodation forms
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new accommodation form in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationForm the tourism new accommodation form
	 */
	public void cacheResult(
		TourismNewAccommodationForm tourismNewAccommodationForm);

	/**
	 * Caches the tourism new accommodation forms in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationForms the tourism new accommodation forms
	 */
	public void cacheResult(
		java.util.List<TourismNewAccommodationForm>
			tourismNewAccommodationForms);

	/**
	 * Creates a new tourism new accommodation form with the primary key. Does not add the tourism new accommodation form to the database.
	 *
	 * @param tourismNewAccoFormId the primary key for the new tourism new accommodation form
	 * @return the new tourism new accommodation form
	 */
	public TourismNewAccommodationForm create(long tourismNewAccoFormId);

	/**
	 * Removes the tourism new accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form that was removed
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	public TourismNewAccommodationForm remove(long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationFormException;

	public TourismNewAccommodationForm updateImpl(
		TourismNewAccommodationForm tourismNewAccommodationForm);

	/**
	 * Returns the tourism new accommodation form with the primary key or throws a <code>NoSuchTourismNewAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	public TourismNewAccommodationForm findByPrimaryKey(
			long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationFormException;

	/**
	 * Returns the tourism new accommodation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form, or <code>null</code> if a tourism new accommodation form with the primary key could not be found
	 */
	public TourismNewAccommodationForm fetchByPrimaryKey(
		long tourismNewAccoFormId);

	/**
	 * Returns all the tourism new accommodation forms.
	 *
	 * @return the tourism new accommodation forms
	 */
	public java.util.List<TourismNewAccommodationForm> findAll();

	/**
	 * Returns a range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @return the range of tourism new accommodation forms
	 */
	public java.util.List<TourismNewAccommodationForm> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accommodation forms
	 */
	public java.util.List<TourismNewAccommodationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccommodationForm> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accommodation forms
	 */
	public java.util.List<TourismNewAccommodationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccommodationForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new accommodation forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new accommodation forms.
	 *
	 * @return the number of tourism new accommodation forms
	 */
	public int countAll();

}