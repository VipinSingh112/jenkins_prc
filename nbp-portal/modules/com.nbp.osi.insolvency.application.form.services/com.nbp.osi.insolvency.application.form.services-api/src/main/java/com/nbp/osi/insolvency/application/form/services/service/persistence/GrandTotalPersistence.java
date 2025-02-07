/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchGrandTotalException;
import com.nbp.osi.insolvency.application.form.services.model.GrandTotal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the grand total service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotalUtil
 * @generated
 */
@ProviderType
public interface GrandTotalPersistence extends BasePersistence<GrandTotal> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GrandTotalUtil} to access the grand total persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or throws a <code>NoSuchGrandTotalException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching grand total
	 * @throws NoSuchGrandTotalException if a matching grand total could not be found
	 */
	public GrandTotal findBygetOsiById(long osiInsolvencyId)
		throws NoSuchGrandTotalException;

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching grand total, or <code>null</code> if a matching grand total could not be found
	 */
	public GrandTotal fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching grand total, or <code>null</code> if a matching grand total could not be found
	 */
	public GrandTotal fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the grand total where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the grand total that was removed
	 */
	public GrandTotal removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchGrandTotalException;

	/**
	 * Returns the number of grand totals where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching grand totals
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the grand total in the entity cache if it is enabled.
	 *
	 * @param grandTotal the grand total
	 */
	public void cacheResult(GrandTotal grandTotal);

	/**
	 * Caches the grand totals in the entity cache if it is enabled.
	 *
	 * @param grandTotals the grand totals
	 */
	public void cacheResult(java.util.List<GrandTotal> grandTotals);

	/**
	 * Creates a new grand total with the primary key. Does not add the grand total to the database.
	 *
	 * @param grandTotalId the primary key for the new grand total
	 * @return the new grand total
	 */
	public GrandTotal create(long grandTotalId);

	/**
	 * Removes the grand total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total that was removed
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	public GrandTotal remove(long grandTotalId)
		throws NoSuchGrandTotalException;

	public GrandTotal updateImpl(GrandTotal grandTotal);

	/**
	 * Returns the grand total with the primary key or throws a <code>NoSuchGrandTotalException</code> if it could not be found.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	public GrandTotal findByPrimaryKey(long grandTotalId)
		throws NoSuchGrandTotalException;

	/**
	 * Returns the grand total with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total, or <code>null</code> if a grand total with the primary key could not be found
	 */
	public GrandTotal fetchByPrimaryKey(long grandTotalId);

	/**
	 * Returns all the grand totals.
	 *
	 * @return the grand totals
	 */
	public java.util.List<GrandTotal> findAll();

	/**
	 * Returns a range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @return the range of grand totals
	 */
	public java.util.List<GrandTotal> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of grand totals
	 */
	public java.util.List<GrandTotal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GrandTotal>
			orderByComparator);

	/**
	 * Returns an ordered range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of grand totals
	 */
	public java.util.List<GrandTotal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GrandTotal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the grand totals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of grand totals.
	 *
	 * @return the number of grand totals
	 */
	public int countAll();

}