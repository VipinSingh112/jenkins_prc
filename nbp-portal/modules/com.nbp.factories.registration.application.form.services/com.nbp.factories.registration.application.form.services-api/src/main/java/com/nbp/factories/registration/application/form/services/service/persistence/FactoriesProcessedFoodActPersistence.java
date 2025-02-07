/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesProcessedFoodActException;
import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories processed food act service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodActUtil
 * @generated
 */
@ProviderType
public interface FactoriesProcessedFoodActPersistence
	extends BasePersistence<FactoriesProcessedFoodAct> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesProcessedFoodActUtil} to access the factories processed food act persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesProcessedFoodActException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a matching factories processed food act could not be found
	 */
	public FactoriesProcessedFoodAct findBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesProcessedFoodActException;

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories processed food act, or <code>null</code> if a matching factories processed food act could not be found
	 */
	public FactoriesProcessedFoodAct fetchBygetFactoriesById(
		long factoriesApplicationId);

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories processed food act, or <code>null</code> if a matching factories processed food act could not be found
	 */
	public FactoriesProcessedFoodAct fetchBygetFactoriesById(
		long factoriesApplicationId, boolean useFinderCache);

	/**
	 * Removes the factories processed food act where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories processed food act that was removed
	 */
	public FactoriesProcessedFoodAct removeBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesProcessedFoodActException;

	/**
	 * Returns the number of factories processed food acts where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories processed food acts
	 */
	public int countBygetFactoriesById(long factoriesApplicationId);

	/**
	 * Caches the factories processed food act in the entity cache if it is enabled.
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 */
	public void cacheResult(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct);

	/**
	 * Caches the factories processed food acts in the entity cache if it is enabled.
	 *
	 * @param factoriesProcessedFoodActs the factories processed food acts
	 */
	public void cacheResult(
		java.util.List<FactoriesProcessedFoodAct> factoriesProcessedFoodActs);

	/**
	 * Creates a new factories processed food act with the primary key. Does not add the factories processed food act to the database.
	 *
	 * @param factoriesProcessedFoodActId the primary key for the new factories processed food act
	 * @return the new factories processed food act
	 */
	public FactoriesProcessedFoodAct create(long factoriesProcessedFoodActId);

	/**
	 * Removes the factories processed food act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act that was removed
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	public FactoriesProcessedFoodAct remove(long factoriesProcessedFoodActId)
		throws NoSuchFactoriesProcessedFoodActException;

	public FactoriesProcessedFoodAct updateImpl(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct);

	/**
	 * Returns the factories processed food act with the primary key or throws a <code>NoSuchFactoriesProcessedFoodActException</code> if it could not be found.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	public FactoriesProcessedFoodAct findByPrimaryKey(
			long factoriesProcessedFoodActId)
		throws NoSuchFactoriesProcessedFoodActException;

	/**
	 * Returns the factories processed food act with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act, or <code>null</code> if a factories processed food act with the primary key could not be found
	 */
	public FactoriesProcessedFoodAct fetchByPrimaryKey(
		long factoriesProcessedFoodActId);

	/**
	 * Returns all the factories processed food acts.
	 *
	 * @return the factories processed food acts
	 */
	public java.util.List<FactoriesProcessedFoodAct> findAll();

	/**
	 * Returns a range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @return the range of factories processed food acts
	 */
	public java.util.List<FactoriesProcessedFoodAct> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories processed food acts
	 */
	public java.util.List<FactoriesProcessedFoodAct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProcessedFoodAct> orderByComparator);

	/**
	 * Returns an ordered range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories processed food acts
	 */
	public java.util.List<FactoriesProcessedFoodAct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProcessedFoodAct> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories processed food acts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories processed food acts.
	 *
	 * @return the number of factories processed food acts
	 */
	public int countAll();

}