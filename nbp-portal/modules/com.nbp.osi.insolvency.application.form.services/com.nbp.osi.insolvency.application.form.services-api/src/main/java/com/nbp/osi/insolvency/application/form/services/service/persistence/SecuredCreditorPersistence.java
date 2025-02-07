/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchSecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the secured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditorUtil
 * @generated
 */
@ProviderType
public interface SecuredCreditorPersistence
	extends BasePersistence<SecuredCreditor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SecuredCreditorUtil} to access the secured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching secured creditors
	 */
	public java.util.List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of matching secured creditors
	 */
	public java.util.List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secured creditors
	 */
	public java.util.List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secured creditors
	 */
	public java.util.List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secured creditor
	 * @throws NoSuchSecuredCreditorException if a matching secured creditor could not be found
	 */
	public SecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
				orderByComparator)
		throws NoSuchSecuredCreditorException;

	/**
	 * Returns the first secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secured creditor, or <code>null</code> if a matching secured creditor could not be found
	 */
	public SecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
			orderByComparator);

	/**
	 * Returns the last secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secured creditor
	 * @throws NoSuchSecuredCreditorException if a matching secured creditor could not be found
	 */
	public SecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
				orderByComparator)
		throws NoSuchSecuredCreditorException;

	/**
	 * Returns the last secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secured creditor, or <code>null</code> if a matching secured creditor could not be found
	 */
	public SecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
			orderByComparator);

	/**
	 * Returns the secured creditors before and after the current secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param securedCreditorId the primary key of the current secured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	public SecuredCreditor[] findBygetOsiById_PrevAndNext(
			long securedCreditorId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
				orderByComparator)
		throws NoSuchSecuredCreditorException;

	/**
	 * Removes all the secured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching secured creditors
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the secured creditor in the entity cache if it is enabled.
	 *
	 * @param securedCreditor the secured creditor
	 */
	public void cacheResult(SecuredCreditor securedCreditor);

	/**
	 * Caches the secured creditors in the entity cache if it is enabled.
	 *
	 * @param securedCreditors the secured creditors
	 */
	public void cacheResult(java.util.List<SecuredCreditor> securedCreditors);

	/**
	 * Creates a new secured creditor with the primary key. Does not add the secured creditor to the database.
	 *
	 * @param securedCreditorId the primary key for the new secured creditor
	 * @return the new secured creditor
	 */
	public SecuredCreditor create(long securedCreditorId);

	/**
	 * Removes the secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor that was removed
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	public SecuredCreditor remove(long securedCreditorId)
		throws NoSuchSecuredCreditorException;

	public SecuredCreditor updateImpl(SecuredCreditor securedCreditor);

	/**
	 * Returns the secured creditor with the primary key or throws a <code>NoSuchSecuredCreditorException</code> if it could not be found.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	public SecuredCreditor findByPrimaryKey(long securedCreditorId)
		throws NoSuchSecuredCreditorException;

	/**
	 * Returns the secured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor, or <code>null</code> if a secured creditor with the primary key could not be found
	 */
	public SecuredCreditor fetchByPrimaryKey(long securedCreditorId);

	/**
	 * Returns all the secured creditors.
	 *
	 * @return the secured creditors
	 */
	public java.util.List<SecuredCreditor> findAll();

	/**
	 * Returns a range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of secured creditors
	 */
	public java.util.List<SecuredCreditor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of secured creditors
	 */
	public java.util.List<SecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of secured creditors
	 */
	public java.util.List<SecuredCreditor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecuredCreditor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the secured creditors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of secured creditors.
	 *
	 * @return the number of secured creditors
	 */
	public int countAll();

}