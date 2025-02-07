/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchCompanySecretaryException;
import com.nbp.osi.insolvency.application.form.services.model.CompanySecretary;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company secretary service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecretaryUtil
 * @generated
 */
@ProviderType
public interface CompanySecretaryPersistence
	extends BasePersistence<CompanySecretary> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanySecretaryUtil} to access the company secretary persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company secretaries
	 */
	public java.util.List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @return the range of matching company secretaries
	 */
	public java.util.List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company secretaries
	 */
	public java.util.List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
			orderByComparator);

	/**
	 * Returns an ordered range of all the company secretaries where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company secretaries
	 */
	public java.util.List<CompanySecretary> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secretary
	 * @throws NoSuchCompanySecretaryException if a matching company secretary could not be found
	 */
	public CompanySecretary findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
				orderByComparator)
		throws NoSuchCompanySecretaryException;

	/**
	 * Returns the first company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secretary, or <code>null</code> if a matching company secretary could not be found
	 */
	public CompanySecretary fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
			orderByComparator);

	/**
	 * Returns the last company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secretary
	 * @throws NoSuchCompanySecretaryException if a matching company secretary could not be found
	 */
	public CompanySecretary findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
				orderByComparator)
		throws NoSuchCompanySecretaryException;

	/**
	 * Returns the last company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secretary, or <code>null</code> if a matching company secretary could not be found
	 */
	public CompanySecretary fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
			orderByComparator);

	/**
	 * Returns the company secretaries before and after the current company secretary in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companySecretaryId the primary key of the current company secretary
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company secretary
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	public CompanySecretary[] findBygetOsiById_PrevAndNext(
			long companySecretaryId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
				orderByComparator)
		throws NoSuchCompanySecretaryException;

	/**
	 * Removes all the company secretaries where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of company secretaries where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company secretaries
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the company secretary in the entity cache if it is enabled.
	 *
	 * @param companySecretary the company secretary
	 */
	public void cacheResult(CompanySecretary companySecretary);

	/**
	 * Caches the company secretaries in the entity cache if it is enabled.
	 *
	 * @param companySecretaries the company secretaries
	 */
	public void cacheResult(
		java.util.List<CompanySecretary> companySecretaries);

	/**
	 * Creates a new company secretary with the primary key. Does not add the company secretary to the database.
	 *
	 * @param companySecretaryId the primary key for the new company secretary
	 * @return the new company secretary
	 */
	public CompanySecretary create(long companySecretaryId);

	/**
	 * Removes the company secretary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary that was removed
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	public CompanySecretary remove(long companySecretaryId)
		throws NoSuchCompanySecretaryException;

	public CompanySecretary updateImpl(CompanySecretary companySecretary);

	/**
	 * Returns the company secretary with the primary key or throws a <code>NoSuchCompanySecretaryException</code> if it could not be found.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary
	 * @throws NoSuchCompanySecretaryException if a company secretary with the primary key could not be found
	 */
	public CompanySecretary findByPrimaryKey(long companySecretaryId)
		throws NoSuchCompanySecretaryException;

	/**
	 * Returns the company secretary with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary, or <code>null</code> if a company secretary with the primary key could not be found
	 */
	public CompanySecretary fetchByPrimaryKey(long companySecretaryId);

	/**
	 * Returns all the company secretaries.
	 *
	 * @return the company secretaries
	 */
	public java.util.List<CompanySecretary> findAll();

	/**
	 * Returns a range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @return the range of company secretaries
	 */
	public java.util.List<CompanySecretary> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company secretaries
	 */
	public java.util.List<CompanySecretary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
			orderByComparator);

	/**
	 * Returns an ordered range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company secretaries
	 */
	public java.util.List<CompanySecretary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompanySecretary>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the company secretaries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of company secretaries.
	 *
	 * @return the number of company secretaries
	 */
	public int countAll();

}