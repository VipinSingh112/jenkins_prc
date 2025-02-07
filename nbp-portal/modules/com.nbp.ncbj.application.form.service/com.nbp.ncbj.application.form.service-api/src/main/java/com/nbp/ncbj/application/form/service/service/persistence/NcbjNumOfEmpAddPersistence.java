/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjNumOfEmpAddException;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj num of emp add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAddUtil
 * @generated
 */
@ProviderType
public interface NcbjNumOfEmpAddPersistence
	extends BasePersistence<NcbjNumOfEmpAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjNumOfEmpAddUtil} to access the ncbj num of emp add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjNumOfEmpAddException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjNumOfEmpAddException;

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj num of emp add where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj num of emp add that was removed
	 */
	public NcbjNumOfEmpAdd removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjNumOfEmpAddException;

	/**
	 * Returns the number of ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj num of emp adds
	 */
	public int countBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of matching ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
				orderByComparator)
		throws NoSuchNcbjNumOfEmpAddException;

	/**
	 * Returns the first ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
			orderByComparator);

	/**
	 * Returns the last ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
				orderByComparator)
		throws NoSuchNcbjNumOfEmpAddException;

	/**
	 * Returns the last ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
			orderByComparator);

	/**
	 * Returns the ncbj num of emp adds before and after the current ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the current ncbj num of emp add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	public NcbjNumOfEmpAdd[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjNumOfEmpAddId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
				orderByComparator)
		throws NoSuchNcbjNumOfEmpAddException;

	/**
	 * Removes all the ncbj num of emp adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj num of emp adds
	 */
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj num of emp add in the entity cache if it is enabled.
	 *
	 * @param ncbjNumOfEmpAdd the ncbj num of emp add
	 */
	public void cacheResult(NcbjNumOfEmpAdd ncbjNumOfEmpAdd);

	/**
	 * Caches the ncbj num of emp adds in the entity cache if it is enabled.
	 *
	 * @param ncbjNumOfEmpAdds the ncbj num of emp adds
	 */
	public void cacheResult(java.util.List<NcbjNumOfEmpAdd> ncbjNumOfEmpAdds);

	/**
	 * Creates a new ncbj num of emp add with the primary key. Does not add the ncbj num of emp add to the database.
	 *
	 * @param ncbjNumOfEmpAddId the primary key for the new ncbj num of emp add
	 * @return the new ncbj num of emp add
	 */
	public NcbjNumOfEmpAdd create(long ncbjNumOfEmpAddId);

	/**
	 * Removes the ncbj num of emp add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add that was removed
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	public NcbjNumOfEmpAdd remove(long ncbjNumOfEmpAddId)
		throws NoSuchNcbjNumOfEmpAddException;

	public NcbjNumOfEmpAdd updateImpl(NcbjNumOfEmpAdd ncbjNumOfEmpAdd);

	/**
	 * Returns the ncbj num of emp add with the primary key or throws a <code>NoSuchNcbjNumOfEmpAddException</code> if it could not be found.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	public NcbjNumOfEmpAdd findByPrimaryKey(long ncbjNumOfEmpAddId)
		throws NoSuchNcbjNumOfEmpAddException;

	/**
	 * Returns the ncbj num of emp add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add, or <code>null</code> if a ncbj num of emp add with the primary key could not be found
	 */
	public NcbjNumOfEmpAdd fetchByPrimaryKey(long ncbjNumOfEmpAddId);

	/**
	 * Returns all the ncbj num of emp adds.
	 *
	 * @return the ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findAll();

	/**
	 * Returns a range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj num of emp adds
	 */
	public java.util.List<NcbjNumOfEmpAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjNumOfEmpAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj num of emp adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj num of emp adds.
	 *
	 * @return the number of ncbj num of emp adds
	 */
	public int countAll();

}