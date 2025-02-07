/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevGenBusinessInfoAddException;
import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev gen business info add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGenBusinessInfoAddUtil
 * @generated
 */
@ProviderType
public interface SezDevGenBusinessInfoAddPersistence
	extends BasePersistence<SezDevGenBusinessInfoAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevGenBusinessInfoAddUtil} to access the sez dev gen business info add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @return the range of matching sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGenBusinessInfoAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGenBusinessInfoAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a matching sez dev gen business info add could not be found
	 */
	public SezDevGenBusinessInfoAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevGenBusinessInfoAdd> orderByComparator)
		throws NoSuchSezDevGenBusinessInfoAddException;

	/**
	 * Returns the first sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev gen business info add, or <code>null</code> if a matching sez dev gen business info add could not be found
	 */
	public SezDevGenBusinessInfoAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGenBusinessInfoAdd> orderByComparator);

	/**
	 * Returns the last sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a matching sez dev gen business info add could not be found
	 */
	public SezDevGenBusinessInfoAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevGenBusinessInfoAdd> orderByComparator)
		throws NoSuchSezDevGenBusinessInfoAddException;

	/**
	 * Returns the last sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev gen business info add, or <code>null</code> if a matching sez dev gen business info add could not be found
	 */
	public SezDevGenBusinessInfoAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGenBusinessInfoAdd> orderByComparator);

	/**
	 * Returns the sez dev gen business info adds before and after the current sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the current sez dev gen business info add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	public SezDevGenBusinessInfoAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevGenBusinessInfoAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevGenBusinessInfoAdd> orderByComparator)
		throws NoSuchSezDevGenBusinessInfoAddException;

	/**
	 * Removes all the sez dev gen business info adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev gen business info adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev gen business info add in the entity cache if it is enabled.
	 *
	 * @param sezDevGenBusinessInfoAdd the sez dev gen business info add
	 */
	public void cacheResult(SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd);

	/**
	 * Caches the sez dev gen business info adds in the entity cache if it is enabled.
	 *
	 * @param sezDevGenBusinessInfoAdds the sez dev gen business info adds
	 */
	public void cacheResult(
		java.util.List<SezDevGenBusinessInfoAdd> sezDevGenBusinessInfoAdds);

	/**
	 * Creates a new sez dev gen business info add with the primary key. Does not add the sez dev gen business info add to the database.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key for the new sez dev gen business info add
	 * @return the new sez dev gen business info add
	 */
	public SezDevGenBusinessInfoAdd create(long sezDevGenBusinessInfoAddId);

	/**
	 * Removes the sez dev gen business info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add that was removed
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	public SezDevGenBusinessInfoAdd remove(long sezDevGenBusinessInfoAddId)
		throws NoSuchSezDevGenBusinessInfoAddException;

	public SezDevGenBusinessInfoAdd updateImpl(
		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd);

	/**
	 * Returns the sez dev gen business info add with the primary key or throws a <code>NoSuchSezDevGenBusinessInfoAddException</code> if it could not be found.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	public SezDevGenBusinessInfoAdd findByPrimaryKey(
			long sezDevGenBusinessInfoAddId)
		throws NoSuchSezDevGenBusinessInfoAddException;

	/**
	 * Returns the sez dev gen business info add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add, or <code>null</code> if a sez dev gen business info add with the primary key could not be found
	 */
	public SezDevGenBusinessInfoAdd fetchByPrimaryKey(
		long sezDevGenBusinessInfoAddId);

	/**
	 * Returns all the sez dev gen business info adds.
	 *
	 * @return the sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findAll();

	/**
	 * Returns a range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @return the range of sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGenBusinessInfoAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev gen business info adds
	 */
	public java.util.List<SezDevGenBusinessInfoAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGenBusinessInfoAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev gen business info adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev gen business info adds.
	 *
	 * @return the number of sez dev gen business info adds
	 */
	public int countAll();

}