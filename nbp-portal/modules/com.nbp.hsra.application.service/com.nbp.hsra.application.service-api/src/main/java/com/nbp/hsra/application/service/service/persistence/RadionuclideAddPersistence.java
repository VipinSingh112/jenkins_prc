/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadionuclideAddException;
import com.nbp.hsra.application.service.model.RadionuclideAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radionuclide add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAddUtil
 * @generated
 */
@ProviderType
public interface RadionuclideAddPersistence
	extends BasePersistence<RadionuclideAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadionuclideAddUtil} to access the radionuclide add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of matching radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radionuclide add
	 * @throws NoSuchRadionuclideAddException if a matching radionuclide add could not be found
	 */
	public RadionuclideAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
				orderByComparator)
		throws NoSuchRadionuclideAddException;

	/**
	 * Returns the first radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radionuclide add, or <code>null</code> if a matching radionuclide add could not be found
	 */
	public RadionuclideAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
			orderByComparator);

	/**
	 * Returns the last radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radionuclide add
	 * @throws NoSuchRadionuclideAddException if a matching radionuclide add could not be found
	 */
	public RadionuclideAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
				orderByComparator)
		throws NoSuchRadionuclideAddException;

	/**
	 * Returns the last radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radionuclide add, or <code>null</code> if a matching radionuclide add could not be found
	 */
	public RadionuclideAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
			orderByComparator);

	/**
	 * Returns the radionuclide adds before and after the current radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radionuclideAddId the primary key of the current radionuclide add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	public RadionuclideAdd[] findBygetHsraById_PrevAndNext(
			long radionuclideAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
				orderByComparator)
		throws NoSuchRadionuclideAddException;

	/**
	 * Removes all the radionuclide adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radionuclide adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radionuclide add in the entity cache if it is enabled.
	 *
	 * @param radionuclideAdd the radionuclide add
	 */
	public void cacheResult(RadionuclideAdd radionuclideAdd);

	/**
	 * Caches the radionuclide adds in the entity cache if it is enabled.
	 *
	 * @param radionuclideAdds the radionuclide adds
	 */
	public void cacheResult(java.util.List<RadionuclideAdd> radionuclideAdds);

	/**
	 * Creates a new radionuclide add with the primary key. Does not add the radionuclide add to the database.
	 *
	 * @param radionuclideAddId the primary key for the new radionuclide add
	 * @return the new radionuclide add
	 */
	public RadionuclideAdd create(long radionuclideAddId);

	/**
	 * Removes the radionuclide add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add that was removed
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	public RadionuclideAdd remove(long radionuclideAddId)
		throws NoSuchRadionuclideAddException;

	public RadionuclideAdd updateImpl(RadionuclideAdd radionuclideAdd);

	/**
	 * Returns the radionuclide add with the primary key or throws a <code>NoSuchRadionuclideAddException</code> if it could not be found.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	public RadionuclideAdd findByPrimaryKey(long radionuclideAddId)
		throws NoSuchRadionuclideAddException;

	/**
	 * Returns the radionuclide add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add, or <code>null</code> if a radionuclide add with the primary key could not be found
	 */
	public RadionuclideAdd fetchByPrimaryKey(long radionuclideAddId);

	/**
	 * Returns all the radionuclide adds.
	 *
	 * @return the radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findAll();

	/**
	 * Returns a range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radionuclide adds
	 */
	public java.util.List<RadionuclideAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radionuclide adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radionuclide adds.
	 *
	 * @return the number of radionuclide adds
	 */
	public int countAll();

}