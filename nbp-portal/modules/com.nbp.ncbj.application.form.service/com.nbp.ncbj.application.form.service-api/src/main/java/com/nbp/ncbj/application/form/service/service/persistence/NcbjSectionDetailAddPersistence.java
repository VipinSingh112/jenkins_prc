/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionDetailAddException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj section detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddUtil
 * @generated
 */
@ProviderType
public interface NcbjSectionDetailAddPersistence
	extends BasePersistence<NcbjSectionDetailAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSectionDetailAddUtil} to access the ncbj section detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjSectionDetailAddException;

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd fetchBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj section detail add where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section detail add that was removed
	 */
	public NcbjSectionDetailAdd removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjSectionDetailAddException;

	/**
	 * Returns the number of ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section detail adds
	 */
	public int countBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of matching ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionDetailAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionDetailAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjSectionDetailAdd> orderByComparator)
		throws NoSuchNcbjSectionDetailAddException;

	/**
	 * Returns the first ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionDetailAdd>
			orderByComparator);

	/**
	 * Returns the last ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjSectionDetailAdd> orderByComparator)
		throws NoSuchNcbjSectionDetailAddException;

	/**
	 * Returns the last ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public NcbjSectionDetailAdd fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionDetailAdd>
			orderByComparator);

	/**
	 * Returns the ncbj section detail adds before and after the current ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the current ncbj section detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	public NcbjSectionDetailAdd[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjSectionDetailAddId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjSectionDetailAdd> orderByComparator)
		throws NoSuchNcbjSectionDetailAddException;

	/**
	 * Removes all the ncbj section detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section detail adds
	 */
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj section detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 */
	public void cacheResult(NcbjSectionDetailAdd ncbjSectionDetailAdd);

	/**
	 * Caches the ncbj section detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionDetailAdds the ncbj section detail adds
	 */
	public void cacheResult(
		java.util.List<NcbjSectionDetailAdd> ncbjSectionDetailAdds);

	/**
	 * Creates a new ncbj section detail add with the primary key. Does not add the ncbj section detail add to the database.
	 *
	 * @param ncbjSectionDetailAddId the primary key for the new ncbj section detail add
	 * @return the new ncbj section detail add
	 */
	public NcbjSectionDetailAdd create(long ncbjSectionDetailAddId);

	/**
	 * Removes the ncbj section detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	public NcbjSectionDetailAdd remove(long ncbjSectionDetailAddId)
		throws NoSuchNcbjSectionDetailAddException;

	public NcbjSectionDetailAdd updateImpl(
		NcbjSectionDetailAdd ncbjSectionDetailAdd);

	/**
	 * Returns the ncbj section detail add with the primary key or throws a <code>NoSuchNcbjSectionDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	public NcbjSectionDetailAdd findByPrimaryKey(long ncbjSectionDetailAddId)
		throws NoSuchNcbjSectionDetailAddException;

	/**
	 * Returns the ncbj section detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add, or <code>null</code> if a ncbj section detail add with the primary key could not be found
	 */
	public NcbjSectionDetailAdd fetchByPrimaryKey(long ncbjSectionDetailAddId);

	/**
	 * Returns all the ncbj section detail adds.
	 *
	 * @return the ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findAll();

	/**
	 * Returns a range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionDetailAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section detail adds
	 */
	public java.util.List<NcbjSectionDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionDetailAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj section detail adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj section detail adds.
	 *
	 * @return the number of ncbj section detail adds
	 */
	public int countAll();

}