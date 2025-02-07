/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchNotUsedSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the not used security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurityUtil
 * @generated
 */
@ProviderType
public interface NotUsedSecurityPersistence
	extends BasePersistence<NotUsedSecurity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NotUsedSecurityUtil} to access the not used security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching not used securities
	 */
	public java.util.List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of matching not used securities
	 */
	public java.util.List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching not used securities
	 */
	public java.util.List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching not used securities
	 */
	public java.util.List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching not used security
	 * @throws NoSuchNotUsedSecurityException if a matching not used security could not be found
	 */
	public NotUsedSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
				orderByComparator)
		throws NoSuchNotUsedSecurityException;

	/**
	 * Returns the first not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching not used security, or <code>null</code> if a matching not used security could not be found
	 */
	public NotUsedSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
			orderByComparator);

	/**
	 * Returns the last not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching not used security
	 * @throws NoSuchNotUsedSecurityException if a matching not used security could not be found
	 */
	public NotUsedSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
				orderByComparator)
		throws NoSuchNotUsedSecurityException;

	/**
	 * Returns the last not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching not used security, or <code>null</code> if a matching not used security could not be found
	 */
	public NotUsedSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
			orderByComparator);

	/**
	 * Returns the not used securities before and after the current not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param notUsedSecurityId the primary key of the current not used security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	public NotUsedSecurity[] findBygetOsiById_PrevAndNext(
			long notUsedSecurityId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
				orderByComparator)
		throws NoSuchNotUsedSecurityException;

	/**
	 * Removes all the not used securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of not used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching not used securities
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the not used security in the entity cache if it is enabled.
	 *
	 * @param notUsedSecurity the not used security
	 */
	public void cacheResult(NotUsedSecurity notUsedSecurity);

	/**
	 * Caches the not used securities in the entity cache if it is enabled.
	 *
	 * @param notUsedSecurities the not used securities
	 */
	public void cacheResult(java.util.List<NotUsedSecurity> notUsedSecurities);

	/**
	 * Creates a new not used security with the primary key. Does not add the not used security to the database.
	 *
	 * @param notUsedSecurityId the primary key for the new not used security
	 * @return the new not used security
	 */
	public NotUsedSecurity create(long notUsedSecurityId);

	/**
	 * Removes the not used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security that was removed
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	public NotUsedSecurity remove(long notUsedSecurityId)
		throws NoSuchNotUsedSecurityException;

	public NotUsedSecurity updateImpl(NotUsedSecurity notUsedSecurity);

	/**
	 * Returns the not used security with the primary key or throws a <code>NoSuchNotUsedSecurityException</code> if it could not be found.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	public NotUsedSecurity findByPrimaryKey(long notUsedSecurityId)
		throws NoSuchNotUsedSecurityException;

	/**
	 * Returns the not used security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security, or <code>null</code> if a not used security with the primary key could not be found
	 */
	public NotUsedSecurity fetchByPrimaryKey(long notUsedSecurityId);

	/**
	 * Returns all the not used securities.
	 *
	 * @return the not used securities
	 */
	public java.util.List<NotUsedSecurity> findAll();

	/**
	 * Returns a range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of not used securities
	 */
	public java.util.List<NotUsedSecurity> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of not used securities
	 */
	public java.util.List<NotUsedSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of not used securities
	 */
	public java.util.List<NotUsedSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NotUsedSecurity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the not used securities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of not used securities.
	 *
	 * @return the number of not used securities
	 */
	public int countAll();

}