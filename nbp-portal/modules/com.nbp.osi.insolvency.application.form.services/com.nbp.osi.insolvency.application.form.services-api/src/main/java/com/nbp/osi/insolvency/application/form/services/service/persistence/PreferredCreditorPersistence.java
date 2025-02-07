/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchPreferredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the preferred creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditorUtil
 * @generated
 */
@ProviderType
public interface PreferredCreditorPersistence
	extends BasePersistence<PreferredCreditor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PreferredCreditorUtil} to access the preferred creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching preferred creditors
	 */
	public java.util.List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of matching preferred creditors
	 */
	public java.util.List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching preferred creditors
	 */
	public java.util.List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching preferred creditors
	 */
	public java.util.List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching preferred creditor
	 * @throws NoSuchPreferredCreditorException if a matching preferred creditor could not be found
	 */
	public PreferredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
				orderByComparator)
		throws NoSuchPreferredCreditorException;

	/**
	 * Returns the first preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching preferred creditor, or <code>null</code> if a matching preferred creditor could not be found
	 */
	public PreferredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
			orderByComparator);

	/**
	 * Returns the last preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching preferred creditor
	 * @throws NoSuchPreferredCreditorException if a matching preferred creditor could not be found
	 */
	public PreferredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
				orderByComparator)
		throws NoSuchPreferredCreditorException;

	/**
	 * Returns the last preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching preferred creditor, or <code>null</code> if a matching preferred creditor could not be found
	 */
	public PreferredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
			orderByComparator);

	/**
	 * Returns the preferred creditors before and after the current preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param preferredCreditorId the primary key of the current preferred creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	public PreferredCreditor[] findBygetOsiById_PrevAndNext(
			long preferredCreditorId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
				orderByComparator)
		throws NoSuchPreferredCreditorException;

	/**
	 * Removes all the preferred creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching preferred creditors
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the preferred creditor in the entity cache if it is enabled.
	 *
	 * @param preferredCreditor the preferred creditor
	 */
	public void cacheResult(PreferredCreditor preferredCreditor);

	/**
	 * Caches the preferred creditors in the entity cache if it is enabled.
	 *
	 * @param preferredCreditors the preferred creditors
	 */
	public void cacheResult(
		java.util.List<PreferredCreditor> preferredCreditors);

	/**
	 * Creates a new preferred creditor with the primary key. Does not add the preferred creditor to the database.
	 *
	 * @param preferredCreditorId the primary key for the new preferred creditor
	 * @return the new preferred creditor
	 */
	public PreferredCreditor create(long preferredCreditorId);

	/**
	 * Removes the preferred creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor that was removed
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	public PreferredCreditor remove(long preferredCreditorId)
		throws NoSuchPreferredCreditorException;

	public PreferredCreditor updateImpl(PreferredCreditor preferredCreditor);

	/**
	 * Returns the preferred creditor with the primary key or throws a <code>NoSuchPreferredCreditorException</code> if it could not be found.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	public PreferredCreditor findByPrimaryKey(long preferredCreditorId)
		throws NoSuchPreferredCreditorException;

	/**
	 * Returns the preferred creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor, or <code>null</code> if a preferred creditor with the primary key could not be found
	 */
	public PreferredCreditor fetchByPrimaryKey(long preferredCreditorId);

	/**
	 * Returns all the preferred creditors.
	 *
	 * @return the preferred creditors
	 */
	public java.util.List<PreferredCreditor> findAll();

	/**
	 * Returns a range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of preferred creditors
	 */
	public java.util.List<PreferredCreditor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preferred creditors
	 */
	public java.util.List<PreferredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of preferred creditors
	 */
	public java.util.List<PreferredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PreferredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the preferred creditors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of preferred creditors.
	 *
	 * @return the number of preferred creditors
	 */
	public int countAll();

}