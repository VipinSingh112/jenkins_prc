/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchFitPropFinancialProfileException;
import com.nbp.hsra.application.service.model.FitPropFinancialProfile;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fit prop financial profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropFinancialProfileUtil
 * @generated
 */
@ProviderType
public interface FitPropFinancialProfilePersistence
	extends BasePersistence<FitPropFinancialProfile> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FitPropFinancialProfileUtil} to access the fit prop financial profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fit prop financial profile where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropFinancialProfileException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop financial profile
	 * @throws NoSuchFitPropFinancialProfileException if a matching fit prop financial profile could not be found
	 */
	public FitPropFinancialProfile findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropFinancialProfileException;

	/**
	 * Returns the fit prop financial profile where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop financial profile, or <code>null</code> if a matching fit prop financial profile could not be found
	 */
	public FitPropFinancialProfile fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the fit prop financial profile where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop financial profile, or <code>null</code> if a matching fit prop financial profile could not be found
	 */
	public FitPropFinancialProfile fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the fit prop financial profile where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop financial profile that was removed
	 */
	public FitPropFinancialProfile removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropFinancialProfileException;

	/**
	 * Returns the number of fit prop financial profiles where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop financial profiles
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the fit prop financial profile in the entity cache if it is enabled.
	 *
	 * @param fitPropFinancialProfile the fit prop financial profile
	 */
	public void cacheResult(FitPropFinancialProfile fitPropFinancialProfile);

	/**
	 * Caches the fit prop financial profiles in the entity cache if it is enabled.
	 *
	 * @param fitPropFinancialProfiles the fit prop financial profiles
	 */
	public void cacheResult(
		java.util.List<FitPropFinancialProfile> fitPropFinancialProfiles);

	/**
	 * Creates a new fit prop financial profile with the primary key. Does not add the fit prop financial profile to the database.
	 *
	 * @param fitPropFinancialProfileId the primary key for the new fit prop financial profile
	 * @return the new fit prop financial profile
	 */
	public FitPropFinancialProfile create(long fitPropFinancialProfileId);

	/**
	 * Removes the fit prop financial profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile that was removed
	 * @throws NoSuchFitPropFinancialProfileException if a fit prop financial profile with the primary key could not be found
	 */
	public FitPropFinancialProfile remove(long fitPropFinancialProfileId)
		throws NoSuchFitPropFinancialProfileException;

	public FitPropFinancialProfile updateImpl(
		FitPropFinancialProfile fitPropFinancialProfile);

	/**
	 * Returns the fit prop financial profile with the primary key or throws a <code>NoSuchFitPropFinancialProfileException</code> if it could not be found.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile
	 * @throws NoSuchFitPropFinancialProfileException if a fit prop financial profile with the primary key could not be found
	 */
	public FitPropFinancialProfile findByPrimaryKey(
			long fitPropFinancialProfileId)
		throws NoSuchFitPropFinancialProfileException;

	/**
	 * Returns the fit prop financial profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile, or <code>null</code> if a fit prop financial profile with the primary key could not be found
	 */
	public FitPropFinancialProfile fetchByPrimaryKey(
		long fitPropFinancialProfileId);

	/**
	 * Returns all the fit prop financial profiles.
	 *
	 * @return the fit prop financial profiles
	 */
	public java.util.List<FitPropFinancialProfile> findAll();

	/**
	 * Returns a range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @return the range of fit prop financial profiles
	 */
	public java.util.List<FitPropFinancialProfile> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop financial profiles
	 */
	public java.util.List<FitPropFinancialProfile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FitPropFinancialProfile> orderByComparator);

	/**
	 * Returns an ordered range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop financial profiles
	 */
	public java.util.List<FitPropFinancialProfile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FitPropFinancialProfile> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fit prop financial profiles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fit prop financial profiles.
	 *
	 * @return the number of fit prop financial profiles
	 */
	public int countAll();

}