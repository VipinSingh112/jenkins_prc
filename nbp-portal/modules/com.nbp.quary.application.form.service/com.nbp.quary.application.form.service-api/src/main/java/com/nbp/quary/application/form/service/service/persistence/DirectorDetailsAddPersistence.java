/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchDirectorDetailsAddException;
import com.nbp.quary.application.form.service.model.DirectorDetailsAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the director details add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DirectorDetailsAddUtil
 * @generated
 */
@ProviderType
public interface DirectorDetailsAddPersistence
	extends BasePersistence<DirectorDetailsAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DirectorDetailsAddUtil} to access the director details add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the director details adds where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId);

	/**
	 * Returns a range of all the director details adds where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @return the range of matching director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the director details adds where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the director details adds where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching director details add
	 * @throws NoSuchDirectorDetailsAddException if a matching director details add could not be found
	 */
	public DirectorDetailsAdd findBygetQuarry_ById_First(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
				orderByComparator)
		throws NoSuchDirectorDetailsAddException;

	/**
	 * Returns the first director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching director details add, or <code>null</code> if a matching director details add could not be found
	 */
	public DirectorDetailsAdd fetchBygetQuarry_ById_First(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
			orderByComparator);

	/**
	 * Returns the last director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching director details add
	 * @throws NoSuchDirectorDetailsAddException if a matching director details add could not be found
	 */
	public DirectorDetailsAdd findBygetQuarry_ById_Last(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
				orderByComparator)
		throws NoSuchDirectorDetailsAddException;

	/**
	 * Returns the last director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching director details add, or <code>null</code> if a matching director details add could not be found
	 */
	public DirectorDetailsAdd fetchBygetQuarry_ById_Last(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
			orderByComparator);

	/**
	 * Returns the director details adds before and after the current director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param directorDetailsAddId the primary key of the current director details add
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next director details add
	 * @throws NoSuchDirectorDetailsAddException if a director details add with the primary key could not be found
	 */
	public DirectorDetailsAdd[] findBygetQuarry_ById_PrevAndNext(
			long directorDetailsAddId, long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
				orderByComparator)
		throws NoSuchDirectorDetailsAddException;

	/**
	 * Removes all the director details adds where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns the number of director details adds where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching director details adds
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Caches the director details add in the entity cache if it is enabled.
	 *
	 * @param directorDetailsAdd the director details add
	 */
	public void cacheResult(DirectorDetailsAdd directorDetailsAdd);

	/**
	 * Caches the director details adds in the entity cache if it is enabled.
	 *
	 * @param directorDetailsAdds the director details adds
	 */
	public void cacheResult(
		java.util.List<DirectorDetailsAdd> directorDetailsAdds);

	/**
	 * Creates a new director details add with the primary key. Does not add the director details add to the database.
	 *
	 * @param directorDetailsAddId the primary key for the new director details add
	 * @return the new director details add
	 */
	public DirectorDetailsAdd create(long directorDetailsAddId);

	/**
	 * Removes the director details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add that was removed
	 * @throws NoSuchDirectorDetailsAddException if a director details add with the primary key could not be found
	 */
	public DirectorDetailsAdd remove(long directorDetailsAddId)
		throws NoSuchDirectorDetailsAddException;

	public DirectorDetailsAdd updateImpl(DirectorDetailsAdd directorDetailsAdd);

	/**
	 * Returns the director details add with the primary key or throws a <code>NoSuchDirectorDetailsAddException</code> if it could not be found.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add
	 * @throws NoSuchDirectorDetailsAddException if a director details add with the primary key could not be found
	 */
	public DirectorDetailsAdd findByPrimaryKey(long directorDetailsAddId)
		throws NoSuchDirectorDetailsAddException;

	/**
	 * Returns the director details add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add, or <code>null</code> if a director details add with the primary key could not be found
	 */
	public DirectorDetailsAdd fetchByPrimaryKey(long directorDetailsAddId);

	/**
	 * Returns all the director details adds.
	 *
	 * @return the director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findAll();

	/**
	 * Returns a range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @return the range of director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of director details adds
	 */
	public java.util.List<DirectorDetailsAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DirectorDetailsAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the director details adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of director details adds.
	 *
	 * @return the number of director details adds
	 */
	public int countAll();

}