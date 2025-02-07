/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusWFMLocationAddException;
import com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status wfm location add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAddUtil
 * @generated
 */
@ProviderType
public interface SezStatusWFMLocationAddPersistence
	extends BasePersistence<SezStatusWFMLocationAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusWFMLocationAddUtil} to access the sez status wfm location add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez status wfm location add where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWFMLocationAddException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWFMLocationAddException;

	/**
	 * Returns the sez status wfm location add where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez status wfm location add where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez status wfm location add where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status wfm location add that was removed
	 */
	public SezStatusWFMLocationAdd removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWFMLocationAddException;

	/**
	 * Returns the number of sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfm location adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd>
		findBygetSezStatusListByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @return the range of matching sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd>
		findBygetSezStatusListByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd>
		findBygetSezStatusListByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFMLocationAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd>
		findBygetSezStatusListByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFMLocationAdd> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd findBygetSezStatusListByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFMLocationAdd> orderByComparator)
		throws NoSuchSezStatusWFMLocationAddException;

	/**
	 * Returns the first sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd fetchBygetSezStatusListByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFMLocationAdd> orderByComparator);

	/**
	 * Returns the last sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd findBygetSezStatusListByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFMLocationAdd> orderByComparator)
		throws NoSuchSezStatusWFMLocationAddException;

	/**
	 * Returns the last sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public SezStatusWFMLocationAdd fetchBygetSezStatusListByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFMLocationAdd> orderByComparator);

	/**
	 * Returns the sez status wfm location adds before and after the current sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusWFHLocId the primary key of the current sez status wfm location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a sez status wfm location add with the primary key could not be found
	 */
	public SezStatusWFMLocationAdd[] findBygetSezStatusListByAppId_PrevAndNext(
			long sezStatusWFHLocId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFMLocationAdd> orderByComparator)
		throws NoSuchSezStatusWFMLocationAddException;

	/**
	 * Removes all the sez status wfm location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusListByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfm location adds
	 */
	public int countBygetSezStatusListByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez status wfm location add in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFMLocationAdd the sez status wfm location add
	 */
	public void cacheResult(SezStatusWFMLocationAdd sezStatusWFMLocationAdd);

	/**
	 * Caches the sez status wfm location adds in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFMLocationAdds the sez status wfm location adds
	 */
	public void cacheResult(
		java.util.List<SezStatusWFMLocationAdd> sezStatusWFMLocationAdds);

	/**
	 * Creates a new sez status wfm location add with the primary key. Does not add the sez status wfm location add to the database.
	 *
	 * @param sezStatusWFHLocId the primary key for the new sez status wfm location add
	 * @return the new sez status wfm location add
	 */
	public SezStatusWFMLocationAdd create(long sezStatusWFHLocId);

	/**
	 * Removes the sez status wfm location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add that was removed
	 * @throws NoSuchSezStatusWFMLocationAddException if a sez status wfm location add with the primary key could not be found
	 */
	public SezStatusWFMLocationAdd remove(long sezStatusWFHLocId)
		throws NoSuchSezStatusWFMLocationAddException;

	public SezStatusWFMLocationAdd updateImpl(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd);

	/**
	 * Returns the sez status wfm location add with the primary key or throws a <code>NoSuchSezStatusWFMLocationAddException</code> if it could not be found.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a sez status wfm location add with the primary key could not be found
	 */
	public SezStatusWFMLocationAdd findByPrimaryKey(long sezStatusWFHLocId)
		throws NoSuchSezStatusWFMLocationAddException;

	/**
	 * Returns the sez status wfm location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add, or <code>null</code> if a sez status wfm location add with the primary key could not be found
	 */
	public SezStatusWFMLocationAdd fetchByPrimaryKey(long sezStatusWFHLocId);

	/**
	 * Returns all the sez status wfm location adds.
	 *
	 * @return the sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd> findAll();

	/**
	 * Returns a range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @return the range of sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFMLocationAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status wfm location adds
	 */
	public java.util.List<SezStatusWFMLocationAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFMLocationAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status wfm location adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status wfm location adds.
	 *
	 * @return the number of sez status wfm location adds
	 */
	public int countAll();

}