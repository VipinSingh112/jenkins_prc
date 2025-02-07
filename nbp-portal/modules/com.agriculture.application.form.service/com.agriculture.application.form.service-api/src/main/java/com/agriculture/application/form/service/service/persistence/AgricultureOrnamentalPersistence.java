/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureOrnamentalException;
import com.agriculture.application.form.service.model.AgricultureOrnamental;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture ornamental service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamentalUtil
 * @generated
 */
@ProviderType
public interface AgricultureOrnamentalPersistence
	extends BasePersistence<AgricultureOrnamental> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureOrnamentalUtil} to access the agriculture ornamental persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureOrnamentalException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureOrnamentalException;

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture ornamental where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture ornamental that was removed
	 */
	public AgricultureOrnamental removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureOrnamentalException;

	/**
	 * Returns the number of agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture ornamentals
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of matching agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureOrnamental>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureOrnamental>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental findBygetAO_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureOrnamental> orderByComparator)
		throws NoSuchAgricultureOrnamentalException;

	/**
	 * Returns the first agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental fetchBygetAO_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureOrnamental>
			orderByComparator);

	/**
	 * Returns the last agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental findBygetAO_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureOrnamental> orderByComparator)
		throws NoSuchAgricultureOrnamentalException;

	/**
	 * Returns the last agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public AgricultureOrnamental fetchBygetAO_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureOrnamental>
			orderByComparator);

	/**
	 * Returns the agriculture ornamentals before and after the current agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureOrnamentalId the primary key of the current agriculture ornamental
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	public AgricultureOrnamental[] findBygetAO_by_AAI_PrevAndNext(
			long agricultureOrnamentalId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureOrnamental> orderByComparator)
		throws NoSuchAgricultureOrnamentalException;

	/**
	 * Removes all the agriculture ornamentals where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAO_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture ornamentals
	 */
	public int countBygetAO_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture ornamental in the entity cache if it is enabled.
	 *
	 * @param agricultureOrnamental the agriculture ornamental
	 */
	public void cacheResult(AgricultureOrnamental agricultureOrnamental);

	/**
	 * Caches the agriculture ornamentals in the entity cache if it is enabled.
	 *
	 * @param agricultureOrnamentals the agriculture ornamentals
	 */
	public void cacheResult(
		java.util.List<AgricultureOrnamental> agricultureOrnamentals);

	/**
	 * Creates a new agriculture ornamental with the primary key. Does not add the agriculture ornamental to the database.
	 *
	 * @param agricultureOrnamentalId the primary key for the new agriculture ornamental
	 * @return the new agriculture ornamental
	 */
	public AgricultureOrnamental create(long agricultureOrnamentalId);

	/**
	 * Removes the agriculture ornamental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental that was removed
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	public AgricultureOrnamental remove(long agricultureOrnamentalId)
		throws NoSuchAgricultureOrnamentalException;

	public AgricultureOrnamental updateImpl(
		AgricultureOrnamental agricultureOrnamental);

	/**
	 * Returns the agriculture ornamental with the primary key or throws a <code>NoSuchAgricultureOrnamentalException</code> if it could not be found.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	public AgricultureOrnamental findByPrimaryKey(long agricultureOrnamentalId)
		throws NoSuchAgricultureOrnamentalException;

	/**
	 * Returns the agriculture ornamental with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental, or <code>null</code> if a agriculture ornamental with the primary key could not be found
	 */
	public AgricultureOrnamental fetchByPrimaryKey(
		long agricultureOrnamentalId);

	/**
	 * Returns all the agriculture ornamentals.
	 *
	 * @return the agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findAll();

	/**
	 * Returns a range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureOrnamental>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture ornamentals
	 */
	public java.util.List<AgricultureOrnamental> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureOrnamental>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture ornamentals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture ornamentals.
	 *
	 * @return the number of agriculture ornamentals
	 */
	public int countAll();

}