/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchUnsecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the unsecured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsecuredCreditorUtil
 * @generated
 */
@ProviderType
public interface UnsecuredCreditorPersistence
	extends BasePersistence<UnsecuredCreditor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UnsecuredCreditorUtil} to access the unsecured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of matching unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a matching unsecured creditor could not be found
	 */
	public UnsecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
				orderByComparator)
		throws NoSuchUnsecuredCreditorException;

	/**
	 * Returns the first unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsecured creditor, or <code>null</code> if a matching unsecured creditor could not be found
	 */
	public UnsecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
			orderByComparator);

	/**
	 * Returns the last unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a matching unsecured creditor could not be found
	 */
	public UnsecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
				orderByComparator)
		throws NoSuchUnsecuredCreditorException;

	/**
	 * Returns the last unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsecured creditor, or <code>null</code> if a matching unsecured creditor could not be found
	 */
	public UnsecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
			orderByComparator);

	/**
	 * Returns the unsecured creditors before and after the current unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param unsecuredCreditorId the primary key of the current unsecured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	public UnsecuredCreditor[] findBygetOsiById_PrevAndNext(
			long unsecuredCreditorId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
				orderByComparator)
		throws NoSuchUnsecuredCreditorException;

	/**
	 * Removes all the unsecured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching unsecured creditors
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the unsecured creditor in the entity cache if it is enabled.
	 *
	 * @param unsecuredCreditor the unsecured creditor
	 */
	public void cacheResult(UnsecuredCreditor unsecuredCreditor);

	/**
	 * Caches the unsecured creditors in the entity cache if it is enabled.
	 *
	 * @param unsecuredCreditors the unsecured creditors
	 */
	public void cacheResult(
		java.util.List<UnsecuredCreditor> unsecuredCreditors);

	/**
	 * Creates a new unsecured creditor with the primary key. Does not add the unsecured creditor to the database.
	 *
	 * @param unsecuredCreditorId the primary key for the new unsecured creditor
	 * @return the new unsecured creditor
	 */
	public UnsecuredCreditor create(long unsecuredCreditorId);

	/**
	 * Removes the unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor that was removed
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	public UnsecuredCreditor remove(long unsecuredCreditorId)
		throws NoSuchUnsecuredCreditorException;

	public UnsecuredCreditor updateImpl(UnsecuredCreditor unsecuredCreditor);

	/**
	 * Returns the unsecured creditor with the primary key or throws a <code>NoSuchUnsecuredCreditorException</code> if it could not be found.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	public UnsecuredCreditor findByPrimaryKey(long unsecuredCreditorId)
		throws NoSuchUnsecuredCreditorException;

	/**
	 * Returns the unsecured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor, or <code>null</code> if a unsecured creditor with the primary key could not be found
	 */
	public UnsecuredCreditor fetchByPrimaryKey(long unsecuredCreditorId);

	/**
	 * Returns all the unsecured creditors.
	 *
	 * @return the unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findAll();

	/**
	 * Returns a range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of unsecured creditors
	 */
	public java.util.List<UnsecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsecuredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the unsecured creditors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of unsecured creditors.
	 *
	 * @return the number of unsecured creditors
	 */
	public int countAll();

}