/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoGeneralFormException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new acco general form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralFormUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccoGeneralFormPersistence
	extends BasePersistence<TourismNewAccoGeneralForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccoGeneralFormUtil} to access the tourism new acco general form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoGeneralFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a matching tourism new acco general form could not be found
	 */
	public TourismNewAccoGeneralForm findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoGeneralFormException;

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco general form, or <code>null</code> if a matching tourism new acco general form could not be found
	 */
	public TourismNewAccoGeneralForm fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco general form, or <code>null</code> if a matching tourism new acco general form could not be found
	 */
	public TourismNewAccoGeneralForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new acco general form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco general form that was removed
	 */
	public TourismNewAccoGeneralForm removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoGeneralFormException;

	/**
	 * Returns the number of tourism new acco general forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco general forms
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new acco general form in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoGeneralForm the tourism new acco general form
	 */
	public void cacheResult(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm);

	/**
	 * Caches the tourism new acco general forms in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoGeneralForms the tourism new acco general forms
	 */
	public void cacheResult(
		java.util.List<TourismNewAccoGeneralForm> tourismNewAccoGeneralForms);

	/**
	 * Creates a new tourism new acco general form with the primary key. Does not add the tourism new acco general form to the database.
	 *
	 * @param tourismNewAccoGenFormId the primary key for the new tourism new acco general form
	 * @return the new tourism new acco general form
	 */
	public TourismNewAccoGeneralForm create(long tourismNewAccoGenFormId);

	/**
	 * Removes the tourism new acco general form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form that was removed
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	public TourismNewAccoGeneralForm remove(long tourismNewAccoGenFormId)
		throws NoSuchTourismNewAccoGeneralFormException;

	public TourismNewAccoGeneralForm updateImpl(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm);

	/**
	 * Returns the tourism new acco general form with the primary key or throws a <code>NoSuchTourismNewAccoGeneralFormException</code> if it could not be found.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	public TourismNewAccoGeneralForm findByPrimaryKey(
			long tourismNewAccoGenFormId)
		throws NoSuchTourismNewAccoGeneralFormException;

	/**
	 * Returns the tourism new acco general form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form, or <code>null</code> if a tourism new acco general form with the primary key could not be found
	 */
	public TourismNewAccoGeneralForm fetchByPrimaryKey(
		long tourismNewAccoGenFormId);

	/**
	 * Returns all the tourism new acco general forms.
	 *
	 * @return the tourism new acco general forms
	 */
	public java.util.List<TourismNewAccoGeneralForm> findAll();

	/**
	 * Returns a range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @return the range of tourism new acco general forms
	 */
	public java.util.List<TourismNewAccoGeneralForm> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco general forms
	 */
	public java.util.List<TourismNewAccoGeneralForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccoGeneralForm> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco general forms
	 */
	public java.util.List<TourismNewAccoGeneralForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccoGeneralForm> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new acco general forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new acco general forms.
	 *
	 * @return the number of tourism new acco general forms
	 */
	public int countAll();

}