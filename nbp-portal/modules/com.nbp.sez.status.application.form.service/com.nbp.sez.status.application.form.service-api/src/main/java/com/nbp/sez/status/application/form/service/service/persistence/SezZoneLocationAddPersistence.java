/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneLocationAddException;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone location add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAddUtil
 * @generated
 */
@ProviderType
public interface SezZoneLocationAddPersistence
	extends BasePersistence<SezZoneLocationAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneLocationAddUtil} to access the sez zone location add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of matching sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a matching sez zone location add could not be found
	 */
	public SezZoneLocationAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
				orderByComparator)
		throws NoSuchSezZoneLocationAddException;

	/**
	 * Returns the first sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone location add, or <code>null</code> if a matching sez zone location add could not be found
	 */
	public SezZoneLocationAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
			orderByComparator);

	/**
	 * Returns the last sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a matching sez zone location add could not be found
	 */
	public SezZoneLocationAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
				orderByComparator)
		throws NoSuchSezZoneLocationAddException;

	/**
	 * Returns the last sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone location add, or <code>null</code> if a matching sez zone location add could not be found
	 */
	public SezZoneLocationAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
			orderByComparator);

	/**
	 * Returns the sez zone location adds before and after the current sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneLocationAddId the primary key of the current sez zone location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	public SezZoneLocationAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneLocationAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
				orderByComparator)
		throws NoSuchSezZoneLocationAddException;

	/**
	 * Removes all the sez zone location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone location adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone location add in the entity cache if it is enabled.
	 *
	 * @param sezZoneLocationAdd the sez zone location add
	 */
	public void cacheResult(SezZoneLocationAdd sezZoneLocationAdd);

	/**
	 * Caches the sez zone location adds in the entity cache if it is enabled.
	 *
	 * @param sezZoneLocationAdds the sez zone location adds
	 */
	public void cacheResult(
		java.util.List<SezZoneLocationAdd> sezZoneLocationAdds);

	/**
	 * Creates a new sez zone location add with the primary key. Does not add the sez zone location add to the database.
	 *
	 * @param sezZoneLocationAddId the primary key for the new sez zone location add
	 * @return the new sez zone location add
	 */
	public SezZoneLocationAdd create(long sezZoneLocationAddId);

	/**
	 * Removes the sez zone location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add that was removed
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	public SezZoneLocationAdd remove(long sezZoneLocationAddId)
		throws NoSuchSezZoneLocationAddException;

	public SezZoneLocationAdd updateImpl(SezZoneLocationAdd sezZoneLocationAdd);

	/**
	 * Returns the sez zone location add with the primary key or throws a <code>NoSuchSezZoneLocationAddException</code> if it could not be found.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	public SezZoneLocationAdd findByPrimaryKey(long sezZoneLocationAddId)
		throws NoSuchSezZoneLocationAddException;

	/**
	 * Returns the sez zone location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add, or <code>null</code> if a sez zone location add with the primary key could not be found
	 */
	public SezZoneLocationAdd fetchByPrimaryKey(long sezZoneLocationAddId);

	/**
	 * Returns all the sez zone location adds.
	 *
	 * @return the sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findAll();

	/**
	 * Returns a range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone location adds
	 */
	public java.util.List<SezZoneLocationAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneLocationAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone location adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone location adds.
	 *
	 * @return the number of sez zone location adds
	 */
	public int countAll();

}