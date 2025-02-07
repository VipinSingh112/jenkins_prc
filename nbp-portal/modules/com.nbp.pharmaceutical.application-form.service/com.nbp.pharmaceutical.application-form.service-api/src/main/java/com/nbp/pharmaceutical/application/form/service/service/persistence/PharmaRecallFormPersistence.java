/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaRecallFormException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma recall form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaRecallFormUtil
 * @generated
 */
@ProviderType
public interface PharmaRecallFormPersistence
	extends BasePersistence<PharmaRecallForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaRecallFormUtil} to access the pharma recall form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma recall form where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaRecallFormException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma recall form
	 * @throws NoSuchPharmaRecallFormException if a matching pharma recall form could not be found
	 */
	public PharmaRecallForm findBygetCancelById(long pharmaApplicationId)
		throws NoSuchPharmaRecallFormException;

	/**
	 * Returns the pharma recall form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma recall form, or <code>null</code> if a matching pharma recall form could not be found
	 */
	public PharmaRecallForm fetchBygetCancelById(long pharmaApplicationId);

	/**
	 * Returns the pharma recall form where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma recall form, or <code>null</code> if a matching pharma recall form could not be found
	 */
	public PharmaRecallForm fetchBygetCancelById(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma recall form where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma recall form that was removed
	 */
	public PharmaRecallForm removeBygetCancelById(long pharmaApplicationId)
		throws NoSuchPharmaRecallFormException;

	/**
	 * Returns the number of pharma recall forms where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma recall forms
	 */
	public int countBygetCancelById(long pharmaApplicationId);

	/**
	 * Caches the pharma recall form in the entity cache if it is enabled.
	 *
	 * @param pharmaRecallForm the pharma recall form
	 */
	public void cacheResult(PharmaRecallForm pharmaRecallForm);

	/**
	 * Caches the pharma recall forms in the entity cache if it is enabled.
	 *
	 * @param pharmaRecallForms the pharma recall forms
	 */
	public void cacheResult(java.util.List<PharmaRecallForm> pharmaRecallForms);

	/**
	 * Creates a new pharma recall form with the primary key. Does not add the pharma recall form to the database.
	 *
	 * @param pharmaRecallFormId the primary key for the new pharma recall form
	 * @return the new pharma recall form
	 */
	public PharmaRecallForm create(long pharmaRecallFormId);

	/**
	 * Removes the pharma recall form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form that was removed
	 * @throws NoSuchPharmaRecallFormException if a pharma recall form with the primary key could not be found
	 */
	public PharmaRecallForm remove(long pharmaRecallFormId)
		throws NoSuchPharmaRecallFormException;

	public PharmaRecallForm updateImpl(PharmaRecallForm pharmaRecallForm);

	/**
	 * Returns the pharma recall form with the primary key or throws a <code>NoSuchPharmaRecallFormException</code> if it could not be found.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form
	 * @throws NoSuchPharmaRecallFormException if a pharma recall form with the primary key could not be found
	 */
	public PharmaRecallForm findByPrimaryKey(long pharmaRecallFormId)
		throws NoSuchPharmaRecallFormException;

	/**
	 * Returns the pharma recall form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaRecallFormId the primary key of the pharma recall form
	 * @return the pharma recall form, or <code>null</code> if a pharma recall form with the primary key could not be found
	 */
	public PharmaRecallForm fetchByPrimaryKey(long pharmaRecallFormId);

	/**
	 * Returns all the pharma recall forms.
	 *
	 * @return the pharma recall forms
	 */
	public java.util.List<PharmaRecallForm> findAll();

	/**
	 * Returns a range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @return the range of pharma recall forms
	 */
	public java.util.List<PharmaRecallForm> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma recall forms
	 */
	public java.util.List<PharmaRecallForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaRecallForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma recall forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaRecallFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma recall forms
	 * @param end the upper bound of the range of pharma recall forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma recall forms
	 */
	public java.util.List<PharmaRecallForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaRecallForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma recall forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma recall forms.
	 *
	 * @return the number of pharma recall forms
	 */
	public int countAll();

}