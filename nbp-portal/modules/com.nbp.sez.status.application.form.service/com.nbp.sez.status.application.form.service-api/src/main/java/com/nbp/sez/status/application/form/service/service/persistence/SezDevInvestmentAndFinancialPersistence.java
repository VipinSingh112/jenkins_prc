/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevInvestmentAndFinancialException;
import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev investment and financial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevInvestmentAndFinancialUtil
 * @generated
 */
@ProviderType
public interface SezDevInvestmentAndFinancialPersistence
	extends BasePersistence<SezDevInvestmentAndFinancial> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevInvestmentAndFinancialUtil} to access the sez dev investment and financial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevInvestmentAndFinancialException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a matching sez dev investment and financial could not be found
	 */
	public SezDevInvestmentAndFinancial findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevInvestmentAndFinancialException;

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev investment and financial, or <code>null</code> if a matching sez dev investment and financial could not be found
	 */
	public SezDevInvestmentAndFinancial fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev investment and financial, or <code>null</code> if a matching sez dev investment and financial could not be found
	 */
	public SezDevInvestmentAndFinancial fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez dev investment and financial where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev investment and financial that was removed
	 */
	public SezDevInvestmentAndFinancial removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevInvestmentAndFinancialException;

	/**
	 * Returns the number of sez dev investment and financials where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev investment and financials
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev investment and financial in the entity cache if it is enabled.
	 *
	 * @param sezDevInvestmentAndFinancial the sez dev investment and financial
	 */
	public void cacheResult(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial);

	/**
	 * Caches the sez dev investment and financials in the entity cache if it is enabled.
	 *
	 * @param sezDevInvestmentAndFinancials the sez dev investment and financials
	 */
	public void cacheResult(
		java.util.List<SezDevInvestmentAndFinancial>
			sezDevInvestmentAndFinancials);

	/**
	 * Creates a new sez dev investment and financial with the primary key. Does not add the sez dev investment and financial to the database.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key for the new sez dev investment and financial
	 * @return the new sez dev investment and financial
	 */
	public SezDevInvestmentAndFinancial create(
		long sezDevInvestmentAndFinancialId);

	/**
	 * Removes the sez dev investment and financial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial that was removed
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	public SezDevInvestmentAndFinancial remove(
			long sezDevInvestmentAndFinancialId)
		throws NoSuchSezDevInvestmentAndFinancialException;

	public SezDevInvestmentAndFinancial updateImpl(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial);

	/**
	 * Returns the sez dev investment and financial with the primary key or throws a <code>NoSuchSezDevInvestmentAndFinancialException</code> if it could not be found.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	public SezDevInvestmentAndFinancial findByPrimaryKey(
			long sezDevInvestmentAndFinancialId)
		throws NoSuchSezDevInvestmentAndFinancialException;

	/**
	 * Returns the sez dev investment and financial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial, or <code>null</code> if a sez dev investment and financial with the primary key could not be found
	 */
	public SezDevInvestmentAndFinancial fetchByPrimaryKey(
		long sezDevInvestmentAndFinancialId);

	/**
	 * Returns all the sez dev investment and financials.
	 *
	 * @return the sez dev investment and financials
	 */
	public java.util.List<SezDevInvestmentAndFinancial> findAll();

	/**
	 * Returns a range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @return the range of sez dev investment and financials
	 */
	public java.util.List<SezDevInvestmentAndFinancial> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev investment and financials
	 */
	public java.util.List<SezDevInvestmentAndFinancial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevInvestmentAndFinancial> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev investment and financials
	 */
	public java.util.List<SezDevInvestmentAndFinancial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevInvestmentAndFinancial> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev investment and financials from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev investment and financials.
	 *
	 * @return the number of sez dev investment and financials
	 */
	public int countAll();

}