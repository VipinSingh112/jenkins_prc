/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjBusinessDetailAddException;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj business detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailAddUtil
 * @generated
 */
@ProviderType
public interface NcbjBusinessDetailAddPersistence
	extends BasePersistence<NcbjBusinessDetailAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjBusinessDetailAddUtil} to access the ncbj business detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @return the range of matching ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetailAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetailAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a matching ncbj business detail add could not be found
	 */
	public NcbjBusinessDetailAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjBusinessDetailAdd> orderByComparator)
		throws NoSuchNcbjBusinessDetailAddException;

	/**
	 * Returns the first ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail add, or <code>null</code> if a matching ncbj business detail add could not be found
	 */
	public NcbjBusinessDetailAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetailAdd>
			orderByComparator);

	/**
	 * Returns the last ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a matching ncbj business detail add could not be found
	 */
	public NcbjBusinessDetailAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjBusinessDetailAdd> orderByComparator)
		throws NoSuchNcbjBusinessDetailAddException;

	/**
	 * Returns the last ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail add, or <code>null</code> if a matching ncbj business detail add could not be found
	 */
	public NcbjBusinessDetailAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetailAdd>
			orderByComparator);

	/**
	 * Returns the ncbj business detail adds before and after the current ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the current ncbj business detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	public NcbjBusinessDetailAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjBusinessDetailAddId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjBusinessDetailAdd> orderByComparator)
		throws NoSuchNcbjBusinessDetailAddException;

	/**
	 * Removes all the ncbj business detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj business detail adds
	 */
	public int countBygetNCBJById(long ncbjApplicationId);

	/**
	 * Caches the ncbj business detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetailAdd the ncbj business detail add
	 */
	public void cacheResult(NcbjBusinessDetailAdd ncbjBusinessDetailAdd);

	/**
	 * Caches the ncbj business detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetailAdds the ncbj business detail adds
	 */
	public void cacheResult(
		java.util.List<NcbjBusinessDetailAdd> ncbjBusinessDetailAdds);

	/**
	 * Creates a new ncbj business detail add with the primary key. Does not add the ncbj business detail add to the database.
	 *
	 * @param ncbjBusinessDetailAddId the primary key for the new ncbj business detail add
	 * @return the new ncbj business detail add
	 */
	public NcbjBusinessDetailAdd create(long ncbjBusinessDetailAddId);

	/**
	 * Removes the ncbj business detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add that was removed
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	public NcbjBusinessDetailAdd remove(long ncbjBusinessDetailAddId)
		throws NoSuchNcbjBusinessDetailAddException;

	public NcbjBusinessDetailAdd updateImpl(
		NcbjBusinessDetailAdd ncbjBusinessDetailAdd);

	/**
	 * Returns the ncbj business detail add with the primary key or throws a <code>NoSuchNcbjBusinessDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	public NcbjBusinessDetailAdd findByPrimaryKey(long ncbjBusinessDetailAddId)
		throws NoSuchNcbjBusinessDetailAddException;

	/**
	 * Returns the ncbj business detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add, or <code>null</code> if a ncbj business detail add with the primary key could not be found
	 */
	public NcbjBusinessDetailAdd fetchByPrimaryKey(
		long ncbjBusinessDetailAddId);

	/**
	 * Returns all the ncbj business detail adds.
	 *
	 * @return the ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findAll();

	/**
	 * Returns a range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @return the range of ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetailAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj business detail adds
	 */
	public java.util.List<NcbjBusinessDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjBusinessDetailAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj business detail adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj business detail adds.
	 *
	 * @return the number of ncbj business detail adds
	 */
	public int countAll();

}