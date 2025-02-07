/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchDirectorsFormException;
import com.nbp.osi.insolvency.application.form.services.model.DirectorsForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the directors form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DirectorsFormUtil
 * @generated
 */
@ProviderType
public interface DirectorsFormPersistence
	extends BasePersistence<DirectorsForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DirectorsFormUtil} to access the directors form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching directors forms
	 */
	public java.util.List<DirectorsForm> findBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns a range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of matching directors forms
	 */
	public java.util.List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching directors forms
	 */
	public java.util.List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching directors forms
	 */
	public java.util.List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching directors form
	 * @throws NoSuchDirectorsFormException if a matching directors form could not be found
	 */
	public DirectorsForm findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
				orderByComparator)
		throws NoSuchDirectorsFormException;

	/**
	 * Returns the first directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching directors form, or <code>null</code> if a matching directors form could not be found
	 */
	public DirectorsForm fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
			orderByComparator);

	/**
	 * Returns the last directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching directors form
	 * @throws NoSuchDirectorsFormException if a matching directors form could not be found
	 */
	public DirectorsForm findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
				orderByComparator)
		throws NoSuchDirectorsFormException;

	/**
	 * Returns the last directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching directors form, or <code>null</code> if a matching directors form could not be found
	 */
	public DirectorsForm fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
			orderByComparator);

	/**
	 * Returns the directors forms before and after the current directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param directorsFormId the primary key of the current directors form
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	public DirectorsForm[] findBygetOsiById_PrevAndNext(
			long directorsFormId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
				orderByComparator)
		throws NoSuchDirectorsFormException;

	/**
	 * Removes all the directors forms where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of directors forms where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching directors forms
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the directors form in the entity cache if it is enabled.
	 *
	 * @param directorsForm the directors form
	 */
	public void cacheResult(DirectorsForm directorsForm);

	/**
	 * Caches the directors forms in the entity cache if it is enabled.
	 *
	 * @param directorsForms the directors forms
	 */
	public void cacheResult(java.util.List<DirectorsForm> directorsForms);

	/**
	 * Creates a new directors form with the primary key. Does not add the directors form to the database.
	 *
	 * @param directorsFormId the primary key for the new directors form
	 * @return the new directors form
	 */
	public DirectorsForm create(long directorsFormId);

	/**
	 * Removes the directors form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form that was removed
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	public DirectorsForm remove(long directorsFormId)
		throws NoSuchDirectorsFormException;

	public DirectorsForm updateImpl(DirectorsForm directorsForm);

	/**
	 * Returns the directors form with the primary key or throws a <code>NoSuchDirectorsFormException</code> if it could not be found.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	public DirectorsForm findByPrimaryKey(long directorsFormId)
		throws NoSuchDirectorsFormException;

	/**
	 * Returns the directors form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form, or <code>null</code> if a directors form with the primary key could not be found
	 */
	public DirectorsForm fetchByPrimaryKey(long directorsFormId);

	/**
	 * Returns all the directors forms.
	 *
	 * @return the directors forms
	 */
	public java.util.List<DirectorsForm> findAll();

	/**
	 * Returns a range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of directors forms
	 */
	public java.util.List<DirectorsForm> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of directors forms
	 */
	public java.util.List<DirectorsForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of directors forms
	 */
	public java.util.List<DirectorsForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorsForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the directors forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of directors forms.
	 *
	 * @return the number of directors forms
	 */
	public int countAll();

}