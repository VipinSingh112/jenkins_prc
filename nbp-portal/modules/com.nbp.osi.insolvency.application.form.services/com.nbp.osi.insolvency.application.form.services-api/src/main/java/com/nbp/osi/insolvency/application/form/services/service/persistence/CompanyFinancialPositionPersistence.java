/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyFinancialPositionException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPosition;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company financial position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPositionUtil
 * @generated
 */
@ProviderType
public interface CompanyFinancialPositionPersistence
	extends BasePersistence<CompanyFinancialPosition> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyFinancialPositionUtil} to access the company financial position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or throws a <code>NoSuchCompanyFinancialPositionException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a matching company financial position could not be found
	 */
	public CompanyFinancialPosition findBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyFinancialPositionException;

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company financial position, or <code>null</code> if a matching company financial position could not be found
	 */
	public CompanyFinancialPosition fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the company financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching company financial position, or <code>null</code> if a matching company financial position could not be found
	 */
	public CompanyFinancialPosition fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the company financial position where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the company financial position that was removed
	 */
	public CompanyFinancialPosition removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchCompanyFinancialPositionException;

	/**
	 * Returns the number of company financial positions where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company financial positions
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the company financial position in the entity cache if it is enabled.
	 *
	 * @param companyFinancialPosition the company financial position
	 */
	public void cacheResult(CompanyFinancialPosition companyFinancialPosition);

	/**
	 * Caches the company financial positions in the entity cache if it is enabled.
	 *
	 * @param companyFinancialPositions the company financial positions
	 */
	public void cacheResult(
		java.util.List<CompanyFinancialPosition> companyFinancialPositions);

	/**
	 * Creates a new company financial position with the primary key. Does not add the company financial position to the database.
	 *
	 * @param companyFinancialPositionId the primary key for the new company financial position
	 * @return the new company financial position
	 */
	public CompanyFinancialPosition create(long companyFinancialPositionId);

	/**
	 * Removes the company financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position that was removed
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	public CompanyFinancialPosition remove(long companyFinancialPositionId)
		throws NoSuchCompanyFinancialPositionException;

	public CompanyFinancialPosition updateImpl(
		CompanyFinancialPosition companyFinancialPosition);

	/**
	 * Returns the company financial position with the primary key or throws a <code>NoSuchCompanyFinancialPositionException</code> if it could not be found.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position
	 * @throws NoSuchCompanyFinancialPositionException if a company financial position with the primary key could not be found
	 */
	public CompanyFinancialPosition findByPrimaryKey(
			long companyFinancialPositionId)
		throws NoSuchCompanyFinancialPositionException;

	/**
	 * Returns the company financial position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position, or <code>null</code> if a company financial position with the primary key could not be found
	 */
	public CompanyFinancialPosition fetchByPrimaryKey(
		long companyFinancialPositionId);

	/**
	 * Returns all the company financial positions.
	 *
	 * @return the company financial positions
	 */
	public java.util.List<CompanyFinancialPosition> findAll();

	/**
	 * Returns a range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @return the range of company financial positions
	 */
	public java.util.List<CompanyFinancialPosition> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company financial positions
	 */
	public java.util.List<CompanyFinancialPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyFinancialPosition> orderByComparator);

	/**
	 * Returns an ordered range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company financial positions
	 */
	public java.util.List<CompanyFinancialPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyFinancialPosition> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the company financial positions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of company financial positions.
	 *
	 * @return the number of company financial positions
	 */
	public int countAll();

}