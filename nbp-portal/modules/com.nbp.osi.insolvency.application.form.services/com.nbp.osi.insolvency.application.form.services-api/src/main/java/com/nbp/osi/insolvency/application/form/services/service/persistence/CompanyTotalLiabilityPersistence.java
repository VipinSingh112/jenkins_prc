/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyTotalLiabilityException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiability;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company total liability service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityUtil
 * @generated
 */
@ProviderType
public interface CompanyTotalLiabilityPersistence
	extends BasePersistence<CompanyTotalLiability> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyTotalLiabilityUtil} to access the company total liability persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a matching company total liability could not be found
	 */
	public CompanyTotalLiability findBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyTotalLiabilityException;

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company total liability, or <code>null</code> if a matching company total liability could not be found
	 */
	public CompanyTotalLiability fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the company total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company total liability, or <code>null</code> if a matching company total liability could not be found
	 */
	public CompanyTotalLiability fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the company total liability where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company total liability that was removed
	 */
	public CompanyTotalLiability removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyTotalLiabilityException;

	/**
	 * Returns the number of company total liabilities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company total liabilities
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the company total liability in the entity cache if it is enabled.
	 *
	 * @param companyTotalLiability the company total liability
	 */
	public void cacheResult(CompanyTotalLiability companyTotalLiability);

	/**
	 * Caches the company total liabilities in the entity cache if it is enabled.
	 *
	 * @param companyTotalLiabilities the company total liabilities
	 */
	public void cacheResult(
		java.util.List<CompanyTotalLiability> companyTotalLiabilities);

	/**
	 * Creates a new company total liability with the primary key. Does not add the company total liability to the database.
	 *
	 * @param companyTotalLiabilityId the primary key for the new company total liability
	 * @return the new company total liability
	 */
	public CompanyTotalLiability create(long companyTotalLiabilityId);

	/**
	 * Removes the company total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability that was removed
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	public CompanyTotalLiability remove(long companyTotalLiabilityId)
		throws NoSuchCompanyTotalLiabilityException;

	public CompanyTotalLiability updateImpl(
		CompanyTotalLiability companyTotalLiability);

	/**
	 * Returns the company total liability with the primary key or throws a <code>NoSuchCompanyTotalLiabilityException</code> if it could not be found.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability
	 * @throws NoSuchCompanyTotalLiabilityException if a company total liability with the primary key could not be found
	 */
	public CompanyTotalLiability findByPrimaryKey(long companyTotalLiabilityId)
		throws NoSuchCompanyTotalLiabilityException;

	/**
	 * Returns the company total liability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability, or <code>null</code> if a company total liability with the primary key could not be found
	 */
	public CompanyTotalLiability fetchByPrimaryKey(
		long companyTotalLiabilityId);

	/**
	 * Returns all the company total liabilities.
	 *
	 * @return the company total liabilities
	 */
	public java.util.List<CompanyTotalLiability> findAll();

	/**
	 * Returns a range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @return the range of company total liabilities
	 */
	public java.util.List<CompanyTotalLiability> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company total liabilities
	 */
	public java.util.List<CompanyTotalLiability> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanyTotalLiability>
			orderByComparator);

	/**
	 * Returns an ordered range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company total liabilities
	 */
	public java.util.List<CompanyTotalLiability> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanyTotalLiability>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the company total liabilities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of company total liabilities.
	 *
	 * @return the number of company total liabilities
	 */
	public int countAll();

}