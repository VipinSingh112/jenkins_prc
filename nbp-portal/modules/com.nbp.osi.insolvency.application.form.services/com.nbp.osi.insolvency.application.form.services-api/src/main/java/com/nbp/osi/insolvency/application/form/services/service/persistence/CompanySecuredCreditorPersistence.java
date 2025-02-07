/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanySecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecuredCreditor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company secured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecuredCreditorUtil
 * @generated
 */
@ProviderType
public interface CompanySecuredCreditorPersistence
	extends BasePersistence<CompanySecuredCreditor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanySecuredCreditorUtil} to access the company secured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of matching company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecuredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecuredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a matching company secured creditor could not be found
	 */
	public CompanySecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CompanySecuredCreditor> orderByComparator)
		throws NoSuchCompanySecuredCreditorException;

	/**
	 * Returns the first company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secured creditor, or <code>null</code> if a matching company secured creditor could not be found
	 */
	public CompanySecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecuredCreditor>
			orderByComparator);

	/**
	 * Returns the last company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a matching company secured creditor could not be found
	 */
	public CompanySecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CompanySecuredCreditor> orderByComparator)
		throws NoSuchCompanySecuredCreditorException;

	/**
	 * Returns the last company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secured creditor, or <code>null</code> if a matching company secured creditor could not be found
	 */
	public CompanySecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecuredCreditor>
			orderByComparator);

	/**
	 * Returns the company secured creditors before and after the current company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companySecuredCreditorId the primary key of the current company secured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	public CompanySecuredCreditor[] findBygetOsiById_PrevAndNext(
			long companySecuredCreditorId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CompanySecuredCreditor> orderByComparator)
		throws NoSuchCompanySecuredCreditorException;

	/**
	 * Removes all the company secured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company secured creditors
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the company secured creditor in the entity cache if it is enabled.
	 *
	 * @param companySecuredCreditor the company secured creditor
	 */
	public void cacheResult(CompanySecuredCreditor companySecuredCreditor);

	/**
	 * Caches the company secured creditors in the entity cache if it is enabled.
	 *
	 * @param companySecuredCreditors the company secured creditors
	 */
	public void cacheResult(
		java.util.List<CompanySecuredCreditor> companySecuredCreditors);

	/**
	 * Creates a new company secured creditor with the primary key. Does not add the company secured creditor to the database.
	 *
	 * @param companySecuredCreditorId the primary key for the new company secured creditor
	 * @return the new company secured creditor
	 */
	public CompanySecuredCreditor create(long companySecuredCreditorId);

	/**
	 * Removes the company secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor that was removed
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	public CompanySecuredCreditor remove(long companySecuredCreditorId)
		throws NoSuchCompanySecuredCreditorException;

	public CompanySecuredCreditor updateImpl(
		CompanySecuredCreditor companySecuredCreditor);

	/**
	 * Returns the company secured creditor with the primary key or throws a <code>NoSuchCompanySecuredCreditorException</code> if it could not be found.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	public CompanySecuredCreditor findByPrimaryKey(
			long companySecuredCreditorId)
		throws NoSuchCompanySecuredCreditorException;

	/**
	 * Returns the company secured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor, or <code>null</code> if a company secured creditor with the primary key could not be found
	 */
	public CompanySecuredCreditor fetchByPrimaryKey(
		long companySecuredCreditorId);

	/**
	 * Returns all the company secured creditors.
	 *
	 * @return the company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findAll();

	/**
	 * Returns a range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecuredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company secured creditors
	 */
	public java.util.List<CompanySecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecuredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the company secured creditors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of company secured creditors.
	 *
	 * @return the number of company secured creditors
	 */
	public int countAll();

}