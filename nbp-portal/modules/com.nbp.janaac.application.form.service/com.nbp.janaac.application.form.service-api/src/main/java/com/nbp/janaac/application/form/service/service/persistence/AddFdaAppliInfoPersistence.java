/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaAppliInfoException;
import com.nbp.janaac.application.form.service.model.AddFdaAppliInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add fda appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfoUtil
 * @generated
 */
@ProviderType
public interface AddFdaAppliInfoPersistence
	extends BasePersistence<AddFdaAppliInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddFdaAppliInfoUtil} to access the add fda appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of matching add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a matching add fda appli info could not be found
	 */
	public AddFdaAppliInfo findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
				orderByComparator)
		throws NoSuchAddFdaAppliInfoException;

	/**
	 * Returns the first add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda appli info, or <code>null</code> if a matching add fda appli info could not be found
	 */
	public AddFdaAppliInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
			orderByComparator);

	/**
	 * Returns the last add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a matching add fda appli info could not be found
	 */
	public AddFdaAppliInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
				orderByComparator)
		throws NoSuchAddFdaAppliInfoException;

	/**
	 * Returns the last add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda appli info, or <code>null</code> if a matching add fda appli info could not be found
	 */
	public AddFdaAppliInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
			orderByComparator);

	/**
	 * Returns the add fda appli infos before and after the current add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaAppliInfoId the primary key of the current add fda appli info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	public AddFdaAppliInfo[] findBygetJanaacById_PrevAndNext(
			long addFdaAppliInfoId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
				orderByComparator)
		throws NoSuchAddFdaAppliInfoException;

	/**
	 * Removes all the add fda appli infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda appli infos
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add fda appli info in the entity cache if it is enabled.
	 *
	 * @param addFdaAppliInfo the add fda appli info
	 */
	public void cacheResult(AddFdaAppliInfo addFdaAppliInfo);

	/**
	 * Caches the add fda appli infos in the entity cache if it is enabled.
	 *
	 * @param addFdaAppliInfos the add fda appli infos
	 */
	public void cacheResult(java.util.List<AddFdaAppliInfo> addFdaAppliInfos);

	/**
	 * Creates a new add fda appli info with the primary key. Does not add the add fda appli info to the database.
	 *
	 * @param addFdaAppliInfoId the primary key for the new add fda appli info
	 * @return the new add fda appli info
	 */
	public AddFdaAppliInfo create(long addFdaAppliInfoId);

	/**
	 * Removes the add fda appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info that was removed
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	public AddFdaAppliInfo remove(long addFdaAppliInfoId)
		throws NoSuchAddFdaAppliInfoException;

	public AddFdaAppliInfo updateImpl(AddFdaAppliInfo addFdaAppliInfo);

	/**
	 * Returns the add fda appli info with the primary key or throws a <code>NoSuchAddFdaAppliInfoException</code> if it could not be found.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	public AddFdaAppliInfo findByPrimaryKey(long addFdaAppliInfoId)
		throws NoSuchAddFdaAppliInfoException;

	/**
	 * Returns the add fda appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info, or <code>null</code> if a add fda appli info with the primary key could not be found
	 */
	public AddFdaAppliInfo fetchByPrimaryKey(long addFdaAppliInfoId);

	/**
	 * Returns all the add fda appli infos.
	 *
	 * @return the add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findAll();

	/**
	 * Returns a range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda appli infos
	 */
	public java.util.List<AddFdaAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add fda appli infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add fda appli infos.
	 *
	 * @return the number of add fda appli infos
	 */
	public int countAll();

}