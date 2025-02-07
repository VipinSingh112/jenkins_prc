/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionOneAddException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj section one add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAddUtil
 * @generated
 */
@ProviderType
public interface NcbjSectionOneAddPersistence
	extends BasePersistence<NcbjSectionOneAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSectionOneAddUtil} to access the ncbj section one add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @return the range of matching ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a matching ncbj section one add could not be found
	 */
	public NcbjSectionOneAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
				orderByComparator)
		throws NoSuchNcbjSectionOneAddException;

	/**
	 * Returns the first ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section one add, or <code>null</code> if a matching ncbj section one add could not be found
	 */
	public NcbjSectionOneAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
			orderByComparator);

	/**
	 * Returns the last ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a matching ncbj section one add could not be found
	 */
	public NcbjSectionOneAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
				orderByComparator)
		throws NoSuchNcbjSectionOneAddException;

	/**
	 * Returns the last ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section one add, or <code>null</code> if a matching ncbj section one add could not be found
	 */
	public NcbjSectionOneAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
			orderByComparator);

	/**
	 * Returns the ncbj section one adds before and after the current ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSectionOneAddId the primary key of the current ncbj section one add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a ncbj section one add with the primary key could not be found
	 */
	public NcbjSectionOneAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjSectionOneAddId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
				orderByComparator)
		throws NoSuchNcbjSectionOneAddException;

	/**
	 * Removes all the ncbj section one adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section one adds
	 */
	public int countBygetNCBJById(long ncbjApplicationId);

	/**
	 * Caches the ncbj section one add in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOneAdd the ncbj section one add
	 */
	public void cacheResult(NcbjSectionOneAdd ncbjSectionOneAdd);

	/**
	 * Caches the ncbj section one adds in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOneAdds the ncbj section one adds
	 */
	public void cacheResult(
		java.util.List<NcbjSectionOneAdd> ncbjSectionOneAdds);

	/**
	 * Creates a new ncbj section one add with the primary key. Does not add the ncbj section one add to the database.
	 *
	 * @param ncbjSectionOneAddId the primary key for the new ncbj section one add
	 * @return the new ncbj section one add
	 */
	public NcbjSectionOneAdd create(long ncbjSectionOneAddId);

	/**
	 * Removes the ncbj section one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add that was removed
	 * @throws NoSuchNcbjSectionOneAddException if a ncbj section one add with the primary key could not be found
	 */
	public NcbjSectionOneAdd remove(long ncbjSectionOneAddId)
		throws NoSuchNcbjSectionOneAddException;

	public NcbjSectionOneAdd updateImpl(NcbjSectionOneAdd ncbjSectionOneAdd);

	/**
	 * Returns the ncbj section one add with the primary key or throws a <code>NoSuchNcbjSectionOneAddException</code> if it could not be found.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a ncbj section one add with the primary key could not be found
	 */
	public NcbjSectionOneAdd findByPrimaryKey(long ncbjSectionOneAddId)
		throws NoSuchNcbjSectionOneAddException;

	/**
	 * Returns the ncbj section one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add, or <code>null</code> if a ncbj section one add with the primary key could not be found
	 */
	public NcbjSectionOneAdd fetchByPrimaryKey(long ncbjSectionOneAddId);

	/**
	 * Returns all the ncbj section one adds.
	 *
	 * @return the ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findAll();

	/**
	 * Returns a range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @return the range of ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section one adds
	 */
	public java.util.List<NcbjSectionOneAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOneAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj section one adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj section one adds.
	 *
	 * @return the number of ncbj section one adds
	 */
	public int countAll();

}