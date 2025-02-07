/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchFinancialPositionException;
import com.nbp.osi.insolvency.application.form.services.model.FinancialPosition;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the financial position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FinancialPositionUtil
 * @generated
 */
@ProviderType
public interface FinancialPositionPersistence
	extends BasePersistence<FinancialPosition> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FinancialPositionUtil} to access the financial position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or throws a <code>NoSuchFinancialPositionException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching financial position
	 * @throws NoSuchFinancialPositionException if a matching financial position could not be found
	 */
	public FinancialPosition findBygetOsiById(long osiInsolvencyId)
		throws NoSuchFinancialPositionException;

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching financial position, or <code>null</code> if a matching financial position could not be found
	 */
	public FinancialPosition fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching financial position, or <code>null</code> if a matching financial position could not be found
	 */
	public FinancialPosition fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the financial position where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the financial position that was removed
	 */
	public FinancialPosition removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchFinancialPositionException;

	/**
	 * Returns the number of financial positions where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching financial positions
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the financial position in the entity cache if it is enabled.
	 *
	 * @param financialPosition the financial position
	 */
	public void cacheResult(FinancialPosition financialPosition);

	/**
	 * Caches the financial positions in the entity cache if it is enabled.
	 *
	 * @param financialPositions the financial positions
	 */
	public void cacheResult(
		java.util.List<FinancialPosition> financialPositions);

	/**
	 * Creates a new financial position with the primary key. Does not add the financial position to the database.
	 *
	 * @param financialPositionId the primary key for the new financial position
	 * @return the new financial position
	 */
	public FinancialPosition create(long financialPositionId);

	/**
	 * Removes the financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position that was removed
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	public FinancialPosition remove(long financialPositionId)
		throws NoSuchFinancialPositionException;

	public FinancialPosition updateImpl(FinancialPosition financialPosition);

	/**
	 * Returns the financial position with the primary key or throws a <code>NoSuchFinancialPositionException</code> if it could not be found.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	public FinancialPosition findByPrimaryKey(long financialPositionId)
		throws NoSuchFinancialPositionException;

	/**
	 * Returns the financial position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position, or <code>null</code> if a financial position with the primary key could not be found
	 */
	public FinancialPosition fetchByPrimaryKey(long financialPositionId);

	/**
	 * Returns all the financial positions.
	 *
	 * @return the financial positions
	 */
	public java.util.List<FinancialPosition> findAll();

	/**
	 * Returns a range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @return the range of financial positions
	 */
	public java.util.List<FinancialPosition> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of financial positions
	 */
	public java.util.List<FinancialPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FinancialPosition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of financial positions
	 */
	public java.util.List<FinancialPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FinancialPosition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the financial positions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of financial positions.
	 *
	 * @return the number of financial positions
	 */
	public int countAll();

}