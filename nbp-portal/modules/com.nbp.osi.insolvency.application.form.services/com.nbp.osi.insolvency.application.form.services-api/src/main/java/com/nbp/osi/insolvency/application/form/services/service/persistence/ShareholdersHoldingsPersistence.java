/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchShareholdersHoldingsException;
import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the shareholders holdings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldingsUtil
 * @generated
 */
@ProviderType
public interface ShareholdersHoldingsPersistence
	extends BasePersistence<ShareholdersHoldings> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShareholdersHoldingsUtil} to access the shareholders holdings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of matching shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareholdersHoldings>
			orderByComparator);

	/**
	 * Returns an ordered range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareholdersHoldings>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a matching shareholders holdings could not be found
	 */
	public ShareholdersHoldings findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ShareholdersHoldings> orderByComparator)
		throws NoSuchShareholdersHoldingsException;

	/**
	 * Returns the first shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shareholders holdings, or <code>null</code> if a matching shareholders holdings could not be found
	 */
	public ShareholdersHoldings fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<ShareholdersHoldings>
			orderByComparator);

	/**
	 * Returns the last shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a matching shareholders holdings could not be found
	 */
	public ShareholdersHoldings findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ShareholdersHoldings> orderByComparator)
		throws NoSuchShareholdersHoldingsException;

	/**
	 * Returns the last shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shareholders holdings, or <code>null</code> if a matching shareholders holdings could not be found
	 */
	public ShareholdersHoldings fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<ShareholdersHoldings>
			orderByComparator);

	/**
	 * Returns the shareholders holdingses before and after the current shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param shareholdersHoldingsId the primary key of the current shareholders holdings
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	public ShareholdersHoldings[] findBygetOsiById_PrevAndNext(
			long shareholdersHoldingsId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ShareholdersHoldings> orderByComparator)
		throws NoSuchShareholdersHoldingsException;

	/**
	 * Removes all the shareholders holdingses where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching shareholders holdingses
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the shareholders holdings in the entity cache if it is enabled.
	 *
	 * @param shareholdersHoldings the shareholders holdings
	 */
	public void cacheResult(ShareholdersHoldings shareholdersHoldings);

	/**
	 * Caches the shareholders holdingses in the entity cache if it is enabled.
	 *
	 * @param shareholdersHoldingses the shareholders holdingses
	 */
	public void cacheResult(
		java.util.List<ShareholdersHoldings> shareholdersHoldingses);

	/**
	 * Creates a new shareholders holdings with the primary key. Does not add the shareholders holdings to the database.
	 *
	 * @param shareholdersHoldingsId the primary key for the new shareholders holdings
	 * @return the new shareholders holdings
	 */
	public ShareholdersHoldings create(long shareholdersHoldingsId);

	/**
	 * Removes the shareholders holdings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings that was removed
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	public ShareholdersHoldings remove(long shareholdersHoldingsId)
		throws NoSuchShareholdersHoldingsException;

	public ShareholdersHoldings updateImpl(
		ShareholdersHoldings shareholdersHoldings);

	/**
	 * Returns the shareholders holdings with the primary key or throws a <code>NoSuchShareholdersHoldingsException</code> if it could not be found.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	public ShareholdersHoldings findByPrimaryKey(long shareholdersHoldingsId)
		throws NoSuchShareholdersHoldingsException;

	/**
	 * Returns the shareholders holdings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings, or <code>null</code> if a shareholders holdings with the primary key could not be found
	 */
	public ShareholdersHoldings fetchByPrimaryKey(long shareholdersHoldingsId);

	/**
	 * Returns all the shareholders holdingses.
	 *
	 * @return the shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findAll();

	/**
	 * Returns a range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareholdersHoldings>
			orderByComparator);

	/**
	 * Returns an ordered range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of shareholders holdingses
	 */
	public java.util.List<ShareholdersHoldings> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareholdersHoldings>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the shareholders holdingses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of shareholders holdingses.
	 *
	 * @return the number of shareholders holdingses
	 */
	public int countAll();

}