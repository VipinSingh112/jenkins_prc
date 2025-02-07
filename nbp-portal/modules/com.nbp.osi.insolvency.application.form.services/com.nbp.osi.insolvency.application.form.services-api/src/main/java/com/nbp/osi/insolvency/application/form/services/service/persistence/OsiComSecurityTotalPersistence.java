/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiComSecurityTotalException;
import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi com security total service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotalUtil
 * @generated
 */
@ProviderType
public interface OsiComSecurityTotalPersistence
	extends BasePersistence<OsiComSecurityTotal> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiComSecurityTotalUtil} to access the osi com security total persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiComSecurityTotalException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a matching osi com security total could not be found
	 */
	public OsiComSecurityTotal findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComSecurityTotalException;

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com security total, or <code>null</code> if a matching osi com security total could not be found
	 */
	public OsiComSecurityTotal fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi com security total, or <code>null</code> if a matching osi com security total could not be found
	 */
	public OsiComSecurityTotal fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi com security total where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi com security total that was removed
	 */
	public OsiComSecurityTotal removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComSecurityTotalException;

	/**
	 * Returns the number of osi com security totals where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi com security totals
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the osi com security total in the entity cache if it is enabled.
	 *
	 * @param osiComSecurityTotal the osi com security total
	 */
	public void cacheResult(OsiComSecurityTotal osiComSecurityTotal);

	/**
	 * Caches the osi com security totals in the entity cache if it is enabled.
	 *
	 * @param osiComSecurityTotals the osi com security totals
	 */
	public void cacheResult(
		java.util.List<OsiComSecurityTotal> osiComSecurityTotals);

	/**
	 * Creates a new osi com security total with the primary key. Does not add the osi com security total to the database.
	 *
	 * @param osiComSecurityTotalId the primary key for the new osi com security total
	 * @return the new osi com security total
	 */
	public OsiComSecurityTotal create(long osiComSecurityTotalId);

	/**
	 * Removes the osi com security total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total that was removed
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	public OsiComSecurityTotal remove(long osiComSecurityTotalId)
		throws NoSuchOsiComSecurityTotalException;

	public OsiComSecurityTotal updateImpl(
		OsiComSecurityTotal osiComSecurityTotal);

	/**
	 * Returns the osi com security total with the primary key or throws a <code>NoSuchOsiComSecurityTotalException</code> if it could not be found.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	public OsiComSecurityTotal findByPrimaryKey(long osiComSecurityTotalId)
		throws NoSuchOsiComSecurityTotalException;

	/**
	 * Returns the osi com security total with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total, or <code>null</code> if a osi com security total with the primary key could not be found
	 */
	public OsiComSecurityTotal fetchByPrimaryKey(long osiComSecurityTotalId);

	/**
	 * Returns all the osi com security totals.
	 *
	 * @return the osi com security totals
	 */
	public java.util.List<OsiComSecurityTotal> findAll();

	/**
	 * Returns a range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @return the range of osi com security totals
	 */
	public java.util.List<OsiComSecurityTotal> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi com security totals
	 */
	public java.util.List<OsiComSecurityTotal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiComSecurityTotal>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi com security totals
	 */
	public java.util.List<OsiComSecurityTotal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiComSecurityTotal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi com security totals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi com security totals.
	 *
	 * @return the number of osi com security totals
	 */
	public int countAll();

}