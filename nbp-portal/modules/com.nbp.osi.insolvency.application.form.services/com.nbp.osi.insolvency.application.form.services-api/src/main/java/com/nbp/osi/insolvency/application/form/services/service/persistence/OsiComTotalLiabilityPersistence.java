/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiComTotalLiabilityException;
import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiability;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi com total liability service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiabilityUtil
 * @generated
 */
@ProviderType
public interface OsiComTotalLiabilityPersistence
	extends BasePersistence<OsiComTotalLiability> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiComTotalLiabilityUtil} to access the osi com total liability persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiComTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a matching osi com total liability could not be found
	 */
	public OsiComTotalLiability findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComTotalLiabilityException;

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com total liability, or <code>null</code> if a matching osi com total liability could not be found
	 */
	public OsiComTotalLiability fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi com total liability, or <code>null</code> if a matching osi com total liability could not be found
	 */
	public OsiComTotalLiability fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi com total liability where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi com total liability that was removed
	 */
	public OsiComTotalLiability removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComTotalLiabilityException;

	/**
	 * Returns the number of osi com total liabilities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi com total liabilities
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the osi com total liability in the entity cache if it is enabled.
	 *
	 * @param osiComTotalLiability the osi com total liability
	 */
	public void cacheResult(OsiComTotalLiability osiComTotalLiability);

	/**
	 * Caches the osi com total liabilities in the entity cache if it is enabled.
	 *
	 * @param osiComTotalLiabilities the osi com total liabilities
	 */
	public void cacheResult(
		java.util.List<OsiComTotalLiability> osiComTotalLiabilities);

	/**
	 * Creates a new osi com total liability with the primary key. Does not add the osi com total liability to the database.
	 *
	 * @param osiComTotalLiabilityId the primary key for the new osi com total liability
	 * @return the new osi com total liability
	 */
	public OsiComTotalLiability create(long osiComTotalLiabilityId);

	/**
	 * Removes the osi com total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability that was removed
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	public OsiComTotalLiability remove(long osiComTotalLiabilityId)
		throws NoSuchOsiComTotalLiabilityException;

	public OsiComTotalLiability updateImpl(
		OsiComTotalLiability osiComTotalLiability);

	/**
	 * Returns the osi com total liability with the primary key or throws a <code>NoSuchOsiComTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	public OsiComTotalLiability findByPrimaryKey(long osiComTotalLiabilityId)
		throws NoSuchOsiComTotalLiabilityException;

	/**
	 * Returns the osi com total liability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability, or <code>null</code> if a osi com total liability with the primary key could not be found
	 */
	public OsiComTotalLiability fetchByPrimaryKey(long osiComTotalLiabilityId);

	/**
	 * Returns all the osi com total liabilities.
	 *
	 * @return the osi com total liabilities
	 */
	public java.util.List<OsiComTotalLiability> findAll();

	/**
	 * Returns a range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @return the range of osi com total liabilities
	 */
	public java.util.List<OsiComTotalLiability> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi com total liabilities
	 */
	public java.util.List<OsiComTotalLiability> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiComTotalLiability>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi com total liabilities
	 */
	public java.util.List<OsiComTotalLiability> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiComTotalLiability>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi com total liabilities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi com total liabilities.
	 *
	 * @return the number of osi com total liabilities
	 */
	public int countAll();

}