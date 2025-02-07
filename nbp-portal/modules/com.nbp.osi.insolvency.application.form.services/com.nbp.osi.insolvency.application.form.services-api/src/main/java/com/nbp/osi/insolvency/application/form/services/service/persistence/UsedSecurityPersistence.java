/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchUsedSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.UsedSecurity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the used security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsedSecurityUtil
 * @generated
 */
@ProviderType
public interface UsedSecurityPersistence extends BasePersistence<UsedSecurity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UsedSecurityUtil} to access the used security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching used securities
	 */
	public java.util.List<UsedSecurity> findBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns a range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @return the range of matching used securities
	 */
	public java.util.List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching used securities
	 */
	public java.util.List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching used securities
	 */
	public java.util.List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching used security
	 * @throws NoSuchUsedSecurityException if a matching used security could not be found
	 */
	public UsedSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
				orderByComparator)
		throws NoSuchUsedSecurityException;

	/**
	 * Returns the first used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching used security, or <code>null</code> if a matching used security could not be found
	 */
	public UsedSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
			orderByComparator);

	/**
	 * Returns the last used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching used security
	 * @throws NoSuchUsedSecurityException if a matching used security could not be found
	 */
	public UsedSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
				orderByComparator)
		throws NoSuchUsedSecurityException;

	/**
	 * Returns the last used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching used security, or <code>null</code> if a matching used security could not be found
	 */
	public UsedSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
			orderByComparator);

	/**
	 * Returns the used securities before and after the current used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param usedSecurityId the primary key of the current used security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	public UsedSecurity[] findBygetOsiById_PrevAndNext(
			long usedSecurityId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
				orderByComparator)
		throws NoSuchUsedSecurityException;

	/**
	 * Removes all the used securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching used securities
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the used security in the entity cache if it is enabled.
	 *
	 * @param usedSecurity the used security
	 */
	public void cacheResult(UsedSecurity usedSecurity);

	/**
	 * Caches the used securities in the entity cache if it is enabled.
	 *
	 * @param usedSecurities the used securities
	 */
	public void cacheResult(java.util.List<UsedSecurity> usedSecurities);

	/**
	 * Creates a new used security with the primary key. Does not add the used security to the database.
	 *
	 * @param usedSecurityId the primary key for the new used security
	 * @return the new used security
	 */
	public UsedSecurity create(long usedSecurityId);

	/**
	 * Removes the used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security that was removed
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	public UsedSecurity remove(long usedSecurityId)
		throws NoSuchUsedSecurityException;

	public UsedSecurity updateImpl(UsedSecurity usedSecurity);

	/**
	 * Returns the used security with the primary key or throws a <code>NoSuchUsedSecurityException</code> if it could not be found.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	public UsedSecurity findByPrimaryKey(long usedSecurityId)
		throws NoSuchUsedSecurityException;

	/**
	 * Returns the used security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security, or <code>null</code> if a used security with the primary key could not be found
	 */
	public UsedSecurity fetchByPrimaryKey(long usedSecurityId);

	/**
	 * Returns all the used securities.
	 *
	 * @return the used securities
	 */
	public java.util.List<UsedSecurity> findAll();

	/**
	 * Returns a range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @return the range of used securities
	 */
	public java.util.List<UsedSecurity> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of used securities
	 */
	public java.util.List<UsedSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of used securities
	 */
	public java.util.List<UsedSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UsedSecurity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the used securities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of used securities.
	 *
	 * @return the number of used securities
	 */
	public int countAll();

}