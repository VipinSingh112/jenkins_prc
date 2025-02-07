/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaCancellationFormException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaCancellationForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma cancellation form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCancellationFormUtil
 * @generated
 */
@ProviderType
public interface PharmaCancellationFormPersistence
	extends BasePersistence<PharmaCancellationForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaCancellationFormUtil} to access the pharma cancellation form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCancellationFormException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a matching pharma cancellation form could not be found
	 */
	public PharmaCancellationForm findBygetCancelById(long pharmaApplicationId)
		throws NoSuchPharmaCancellationFormException;

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma cancellation form, or <code>null</code> if a matching pharma cancellation form could not be found
	 */
	public PharmaCancellationForm fetchBygetCancelById(
		long pharmaApplicationId);

	/**
	 * Returns the pharma cancellation form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma cancellation form, or <code>null</code> if a matching pharma cancellation form could not be found
	 */
	public PharmaCancellationForm fetchBygetCancelById(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma cancellation form where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma cancellation form that was removed
	 */
	public PharmaCancellationForm removeBygetCancelById(
			long pharmaApplicationId)
		throws NoSuchPharmaCancellationFormException;

	/**
	 * Returns the number of pharma cancellation forms where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma cancellation forms
	 */
	public int countBygetCancelById(long pharmaApplicationId);

	/**
	 * Caches the pharma cancellation form in the entity cache if it is enabled.
	 *
	 * @param pharmaCancellationForm the pharma cancellation form
	 */
	public void cacheResult(PharmaCancellationForm pharmaCancellationForm);

	/**
	 * Caches the pharma cancellation forms in the entity cache if it is enabled.
	 *
	 * @param pharmaCancellationForms the pharma cancellation forms
	 */
	public void cacheResult(
		java.util.List<PharmaCancellationForm> pharmaCancellationForms);

	/**
	 * Creates a new pharma cancellation form with the primary key. Does not add the pharma cancellation form to the database.
	 *
	 * @param pharmaCancellationFormId the primary key for the new pharma cancellation form
	 * @return the new pharma cancellation form
	 */
	public PharmaCancellationForm create(long pharmaCancellationFormId);

	/**
	 * Removes the pharma cancellation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form that was removed
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	public PharmaCancellationForm remove(long pharmaCancellationFormId)
		throws NoSuchPharmaCancellationFormException;

	public PharmaCancellationForm updateImpl(
		PharmaCancellationForm pharmaCancellationForm);

	/**
	 * Returns the pharma cancellation form with the primary key or throws a <code>NoSuchPharmaCancellationFormException</code> if it could not be found.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form
	 * @throws NoSuchPharmaCancellationFormException if a pharma cancellation form with the primary key could not be found
	 */
	public PharmaCancellationForm findByPrimaryKey(
			long pharmaCancellationFormId)
		throws NoSuchPharmaCancellationFormException;

	/**
	 * Returns the pharma cancellation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCancellationFormId the primary key of the pharma cancellation form
	 * @return the pharma cancellation form, or <code>null</code> if a pharma cancellation form with the primary key could not be found
	 */
	public PharmaCancellationForm fetchByPrimaryKey(
		long pharmaCancellationFormId);

	/**
	 * Returns all the pharma cancellation forms.
	 *
	 * @return the pharma cancellation forms
	 */
	public java.util.List<PharmaCancellationForm> findAll();

	/**
	 * Returns a range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @return the range of pharma cancellation forms
	 */
	public java.util.List<PharmaCancellationForm> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma cancellation forms
	 */
	public java.util.List<PharmaCancellationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaCancellationForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma cancellation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCancellationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma cancellation forms
	 * @param end the upper bound of the range of pharma cancellation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma cancellation forms
	 */
	public java.util.List<PharmaCancellationForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaCancellationForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma cancellation forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma cancellation forms.
	 *
	 * @return the number of pharma cancellation forms
	 */
	public int countAll();

}