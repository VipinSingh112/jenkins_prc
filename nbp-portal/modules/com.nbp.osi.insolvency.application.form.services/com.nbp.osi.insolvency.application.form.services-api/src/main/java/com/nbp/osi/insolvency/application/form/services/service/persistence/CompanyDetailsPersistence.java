/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyDetailsException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetailsUtil
 * @generated
 */
@ProviderType
public interface CompanyDetailsPersistence
	extends BasePersistence<CompanyDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyDetailsUtil} to access the company details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyDetailsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company details
	 * @throws NoSuchCompanyDetailsException if a matching company details could not be found
	 */
	public CompanyDetails findBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyDetailsException;

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company details, or <code>null</code> if a matching company details could not be found
	 */
	public CompanyDetails fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the company details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company details, or <code>null</code> if a matching company details could not be found
	 */
	public CompanyDetails fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the company details where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company details that was removed
	 */
	public CompanyDetails removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyDetailsException;

	/**
	 * Returns the number of company detailses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company detailses
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the company details in the entity cache if it is enabled.
	 *
	 * @param companyDetails the company details
	 */
	public void cacheResult(CompanyDetails companyDetails);

	/**
	 * Caches the company detailses in the entity cache if it is enabled.
	 *
	 * @param companyDetailses the company detailses
	 */
	public void cacheResult(java.util.List<CompanyDetails> companyDetailses);

	/**
	 * Creates a new company details with the primary key. Does not add the company details to the database.
	 *
	 * @param companyDetailsId the primary key for the new company details
	 * @return the new company details
	 */
	public CompanyDetails create(long companyDetailsId);

	/**
	 * Removes the company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details that was removed
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	public CompanyDetails remove(long companyDetailsId)
		throws NoSuchCompanyDetailsException;

	public CompanyDetails updateImpl(CompanyDetails companyDetails);

	/**
	 * Returns the company details with the primary key or throws a <code>NoSuchCompanyDetailsException</code> if it could not be found.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details
	 * @throws NoSuchCompanyDetailsException if a company details with the primary key could not be found
	 */
	public CompanyDetails findByPrimaryKey(long companyDetailsId)
		throws NoSuchCompanyDetailsException;

	/**
	 * Returns the company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details, or <code>null</code> if a company details with the primary key could not be found
	 */
	public CompanyDetails fetchByPrimaryKey(long companyDetailsId);

	/**
	 * Returns all the company detailses.
	 *
	 * @return the company detailses
	 */
	public java.util.List<CompanyDetails> findAll();

	/**
	 * Returns a range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @return the range of company detailses
	 */
	public java.util.List<CompanyDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company detailses
	 */
	public java.util.List<CompanyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanyDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company detailses
	 */
	public java.util.List<CompanyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanyDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the company detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of company detailses.
	 *
	 * @return the number of company detailses
	 */
	public int countAll();

}