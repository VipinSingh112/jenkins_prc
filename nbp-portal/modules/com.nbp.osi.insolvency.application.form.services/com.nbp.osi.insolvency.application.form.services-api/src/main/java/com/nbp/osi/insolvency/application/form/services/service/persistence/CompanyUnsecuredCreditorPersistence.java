/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanyUnsecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company unsecured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditorUtil
 * @generated
 */
@ProviderType
public interface CompanyUnsecuredCreditorPersistence
	extends BasePersistence<CompanyUnsecuredCreditor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyUnsecuredCreditorUtil} to access the company unsecured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of matching company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyUnsecuredCreditor> orderByComparator);

	/**
	 * Returns an ordered range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyUnsecuredCreditor> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a matching company unsecured creditor could not be found
	 */
	public CompanyUnsecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CompanyUnsecuredCreditor> orderByComparator)
		throws NoSuchCompanyUnsecuredCreditorException;

	/**
	 * Returns the first company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company unsecured creditor, or <code>null</code> if a matching company unsecured creditor could not be found
	 */
	public CompanyUnsecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyUnsecuredCreditor> orderByComparator);

	/**
	 * Returns the last company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a matching company unsecured creditor could not be found
	 */
	public CompanyUnsecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CompanyUnsecuredCreditor> orderByComparator)
		throws NoSuchCompanyUnsecuredCreditorException;

	/**
	 * Returns the last company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company unsecured creditor, or <code>null</code> if a matching company unsecured creditor could not be found
	 */
	public CompanyUnsecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyUnsecuredCreditor> orderByComparator);

	/**
	 * Returns the company unsecured creditors before and after the current company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the current company unsecured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	public CompanyUnsecuredCreditor[] findBygetOsiById_PrevAndNext(
			long companyUnsecuredCreditorId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CompanyUnsecuredCreditor> orderByComparator)
		throws NoSuchCompanyUnsecuredCreditorException;

	/**
	 * Removes all the company unsecured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company unsecured creditors
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the company unsecured creditor in the entity cache if it is enabled.
	 *
	 * @param companyUnsecuredCreditor the company unsecured creditor
	 */
	public void cacheResult(CompanyUnsecuredCreditor companyUnsecuredCreditor);

	/**
	 * Caches the company unsecured creditors in the entity cache if it is enabled.
	 *
	 * @param companyUnsecuredCreditors the company unsecured creditors
	 */
	public void cacheResult(
		java.util.List<CompanyUnsecuredCreditor> companyUnsecuredCreditors);

	/**
	 * Creates a new company unsecured creditor with the primary key. Does not add the company unsecured creditor to the database.
	 *
	 * @param companyUnsecuredCreditorId the primary key for the new company unsecured creditor
	 * @return the new company unsecured creditor
	 */
	public CompanyUnsecuredCreditor create(long companyUnsecuredCreditorId);

	/**
	 * Removes the company unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor that was removed
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	public CompanyUnsecuredCreditor remove(long companyUnsecuredCreditorId)
		throws NoSuchCompanyUnsecuredCreditorException;

	public CompanyUnsecuredCreditor updateImpl(
		CompanyUnsecuredCreditor companyUnsecuredCreditor);

	/**
	 * Returns the company unsecured creditor with the primary key or throws a <code>NoSuchCompanyUnsecuredCreditorException</code> if it could not be found.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	public CompanyUnsecuredCreditor findByPrimaryKey(
			long companyUnsecuredCreditorId)
		throws NoSuchCompanyUnsecuredCreditorException;

	/**
	 * Returns the company unsecured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor, or <code>null</code> if a company unsecured creditor with the primary key could not be found
	 */
	public CompanyUnsecuredCreditor fetchByPrimaryKey(
		long companyUnsecuredCreditorId);

	/**
	 * Returns all the company unsecured creditors.
	 *
	 * @return the company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findAll();

	/**
	 * Returns a range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyUnsecuredCreditor> orderByComparator);

	/**
	 * Returns an ordered range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company unsecured creditors
	 */
	public java.util.List<CompanyUnsecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CompanyUnsecuredCreditor> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the company unsecured creditors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of company unsecured creditors.
	 *
	 * @return the number of company unsecured creditors
	 */
	public int countAll();

}