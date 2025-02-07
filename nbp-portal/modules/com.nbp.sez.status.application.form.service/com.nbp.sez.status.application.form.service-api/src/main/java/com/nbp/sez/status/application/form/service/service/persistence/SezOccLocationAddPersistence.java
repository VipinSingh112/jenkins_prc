/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccLocationAddException;
import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occ location add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccLocationAddUtil
 * @generated
 */
@ProviderType
public interface SezOccLocationAddPersistence
	extends BasePersistence<SezOccLocationAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccLocationAddUtil} to access the sez occ location add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of matching sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a matching sez occ location add could not be found
	 */
	public SezOccLocationAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
				orderByComparator)
		throws NoSuchSezOccLocationAddException;

	/**
	 * Returns the first sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occ location add, or <code>null</code> if a matching sez occ location add could not be found
	 */
	public SezOccLocationAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
			orderByComparator);

	/**
	 * Returns the last sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a matching sez occ location add could not be found
	 */
	public SezOccLocationAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
				orderByComparator)
		throws NoSuchSezOccLocationAddException;

	/**
	 * Returns the last sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occ location add, or <code>null</code> if a matching sez occ location add could not be found
	 */
	public SezOccLocationAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
			orderByComparator);

	/**
	 * Returns the sez occ location adds before and after the current sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccLocationAddId the primary key of the current sez occ location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	public SezOccLocationAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccLocationAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
				orderByComparator)
		throws NoSuchSezOccLocationAddException;

	/**
	 * Removes all the sez occ location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occ location adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occ location add in the entity cache if it is enabled.
	 *
	 * @param sezOccLocationAdd the sez occ location add
	 */
	public void cacheResult(SezOccLocationAdd sezOccLocationAdd);

	/**
	 * Caches the sez occ location adds in the entity cache if it is enabled.
	 *
	 * @param sezOccLocationAdds the sez occ location adds
	 */
	public void cacheResult(
		java.util.List<SezOccLocationAdd> sezOccLocationAdds);

	/**
	 * Creates a new sez occ location add with the primary key. Does not add the sez occ location add to the database.
	 *
	 * @param sezOccLocationAddId the primary key for the new sez occ location add
	 * @return the new sez occ location add
	 */
	public SezOccLocationAdd create(long sezOccLocationAddId);

	/**
	 * Removes the sez occ location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add that was removed
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	public SezOccLocationAdd remove(long sezOccLocationAddId)
		throws NoSuchSezOccLocationAddException;

	public SezOccLocationAdd updateImpl(SezOccLocationAdd sezOccLocationAdd);

	/**
	 * Returns the sez occ location add with the primary key or throws a <code>NoSuchSezOccLocationAddException</code> if it could not be found.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	public SezOccLocationAdd findByPrimaryKey(long sezOccLocationAddId)
		throws NoSuchSezOccLocationAddException;

	/**
	 * Returns the sez occ location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add, or <code>null</code> if a sez occ location add with the primary key could not be found
	 */
	public SezOccLocationAdd fetchByPrimaryKey(long sezOccLocationAddId);

	/**
	 * Returns all the sez occ location adds.
	 *
	 * @return the sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findAll();

	/**
	 * Returns a range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occ location adds
	 */
	public java.util.List<SezOccLocationAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezOccLocationAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occ location adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occ location adds.
	 *
	 * @return the number of sez occ location adds
	 */
	public int countAll();

}