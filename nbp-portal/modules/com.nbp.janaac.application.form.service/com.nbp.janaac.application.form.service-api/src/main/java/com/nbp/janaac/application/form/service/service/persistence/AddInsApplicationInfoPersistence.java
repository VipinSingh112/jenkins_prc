/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsApplicationInfoException;
import com.nbp.janaac.application.form.service.model.AddInsApplicationInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add ins application info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsApplicationInfoUtil
 * @generated
 */
@ProviderType
public interface AddInsApplicationInfoPersistence
	extends BasePersistence<AddInsApplicationInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddInsApplicationInfoUtil} to access the add ins application info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of matching add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsApplicationInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsApplicationInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a matching add ins application info could not be found
	 */
	public AddInsApplicationInfo findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddInsApplicationInfo> orderByComparator)
		throws NoSuchAddInsApplicationInfoException;

	/**
	 * Returns the first add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins application info, or <code>null</code> if a matching add ins application info could not be found
	 */
	public AddInsApplicationInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsApplicationInfo>
			orderByComparator);

	/**
	 * Returns the last add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a matching add ins application info could not be found
	 */
	public AddInsApplicationInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddInsApplicationInfo> orderByComparator)
		throws NoSuchAddInsApplicationInfoException;

	/**
	 * Returns the last add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins application info, or <code>null</code> if a matching add ins application info could not be found
	 */
	public AddInsApplicationInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsApplicationInfo>
			orderByComparator);

	/**
	 * Returns the add ins application infos before and after the current add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsApplicationInfoId the primary key of the current add ins application info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	public AddInsApplicationInfo[] findBygetJanaacById_PrevAndNext(
			long addInsApplicationInfoId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddInsApplicationInfo> orderByComparator)
		throws NoSuchAddInsApplicationInfoException;

	/**
	 * Removes all the add ins application infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add ins application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins application infos
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add ins application info in the entity cache if it is enabled.
	 *
	 * @param addInsApplicationInfo the add ins application info
	 */
	public void cacheResult(AddInsApplicationInfo addInsApplicationInfo);

	/**
	 * Caches the add ins application infos in the entity cache if it is enabled.
	 *
	 * @param addInsApplicationInfos the add ins application infos
	 */
	public void cacheResult(
		java.util.List<AddInsApplicationInfo> addInsApplicationInfos);

	/**
	 * Creates a new add ins application info with the primary key. Does not add the add ins application info to the database.
	 *
	 * @param addInsApplicationInfoId the primary key for the new add ins application info
	 * @return the new add ins application info
	 */
	public AddInsApplicationInfo create(long addInsApplicationInfoId);

	/**
	 * Removes the add ins application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info that was removed
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	public AddInsApplicationInfo remove(long addInsApplicationInfoId)
		throws NoSuchAddInsApplicationInfoException;

	public AddInsApplicationInfo updateImpl(
		AddInsApplicationInfo addInsApplicationInfo);

	/**
	 * Returns the add ins application info with the primary key or throws a <code>NoSuchAddInsApplicationInfoException</code> if it could not be found.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	public AddInsApplicationInfo findByPrimaryKey(long addInsApplicationInfoId)
		throws NoSuchAddInsApplicationInfoException;

	/**
	 * Returns the add ins application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info, or <code>null</code> if a add ins application info with the primary key could not be found
	 */
	public AddInsApplicationInfo fetchByPrimaryKey(
		long addInsApplicationInfoId);

	/**
	 * Returns all the add ins application infos.
	 *
	 * @return the add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findAll();

	/**
	 * Returns a range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsApplicationInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins application infos
	 */
	public java.util.List<AddInsApplicationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsApplicationInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add ins application infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add ins application infos.
	 *
	 * @return the number of add ins application infos
	 */
	public int countAll();

}