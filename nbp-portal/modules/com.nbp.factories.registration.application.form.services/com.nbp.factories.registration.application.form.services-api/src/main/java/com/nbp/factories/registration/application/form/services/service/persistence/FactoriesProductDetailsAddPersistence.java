/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesProductDetailsAddException;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories product details add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAddUtil
 * @generated
 */
@ProviderType
public interface FactoriesProductDetailsAddPersistence
	extends BasePersistence<FactoriesProductDetailsAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesProductDetailsAddUtil} to access the factories product details add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId);

	/**
	 * Returns a range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of matching factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProductDetailsAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProductDetailsAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a matching factories product details add could not be found
	 */
	public FactoriesProductDetailsAdd findBygetFactoriesById_First(
			long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesProductDetailsAdd> orderByComparator)
		throws NoSuchFactoriesProductDetailsAddException;

	/**
	 * Returns the first factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories product details add, or <code>null</code> if a matching factories product details add could not be found
	 */
	public FactoriesProductDetailsAdd fetchBygetFactoriesById_First(
		long factoriesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProductDetailsAdd> orderByComparator);

	/**
	 * Returns the last factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a matching factories product details add could not be found
	 */
	public FactoriesProductDetailsAdd findBygetFactoriesById_Last(
			long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesProductDetailsAdd> orderByComparator)
		throws NoSuchFactoriesProductDetailsAddException;

	/**
	 * Returns the last factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories product details add, or <code>null</code> if a matching factories product details add could not be found
	 */
	public FactoriesProductDetailsAdd fetchBygetFactoriesById_Last(
		long factoriesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProductDetailsAdd> orderByComparator);

	/**
	 * Returns the factories product details adds before and after the current factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the current factories product details add
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	public FactoriesProductDetailsAdd[] findBygetFactoriesById_PrevAndNext(
			long factoriesProductDetailsAddId, long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesProductDetailsAdd> orderByComparator)
		throws NoSuchFactoriesProductDetailsAddException;

	/**
	 * Removes all the factories product details adds where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 */
	public void removeBygetFactoriesById(long factoriesApplicationId);

	/**
	 * Returns the number of factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories product details adds
	 */
	public int countBygetFactoriesById(long factoriesApplicationId);

	/**
	 * Caches the factories product details add in the entity cache if it is enabled.
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 */
	public void cacheResult(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd);

	/**
	 * Caches the factories product details adds in the entity cache if it is enabled.
	 *
	 * @param factoriesProductDetailsAdds the factories product details adds
	 */
	public void cacheResult(
		java.util.List<FactoriesProductDetailsAdd> factoriesProductDetailsAdds);

	/**
	 * Creates a new factories product details add with the primary key. Does not add the factories product details add to the database.
	 *
	 * @param factoriesProductDetailsAddId the primary key for the new factories product details add
	 * @return the new factories product details add
	 */
	public FactoriesProductDetailsAdd create(long factoriesProductDetailsAddId);

	/**
	 * Removes the factories product details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add that was removed
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	public FactoriesProductDetailsAdd remove(long factoriesProductDetailsAddId)
		throws NoSuchFactoriesProductDetailsAddException;

	public FactoriesProductDetailsAdd updateImpl(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd);

	/**
	 * Returns the factories product details add with the primary key or throws a <code>NoSuchFactoriesProductDetailsAddException</code> if it could not be found.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	public FactoriesProductDetailsAdd findByPrimaryKey(
			long factoriesProductDetailsAddId)
		throws NoSuchFactoriesProductDetailsAddException;

	/**
	 * Returns the factories product details add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add, or <code>null</code> if a factories product details add with the primary key could not be found
	 */
	public FactoriesProductDetailsAdd fetchByPrimaryKey(
		long factoriesProductDetailsAddId);

	/**
	 * Returns all the factories product details adds.
	 *
	 * @return the factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findAll();

	/**
	 * Returns a range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProductDetailsAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories product details adds
	 */
	public java.util.List<FactoriesProductDetailsAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesProductDetailsAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories product details adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories product details adds.
	 *
	 * @return the number of factories product details adds
	 */
	public int countAll();

}