/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabAppliInfoException;
import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabAppliInfoUtil
 * @generated
 */
@ProviderType
public interface AddLabAppliInfoPersistence
	extends BasePersistence<AddLabAppliInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabAppliInfoUtil} to access the add lab appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of matching add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a matching add lab appli info could not be found
	 */
	public AddLabAppliInfo findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
				orderByComparator)
		throws NoSuchAddLabAppliInfoException;

	/**
	 * Returns the first add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab appli info, or <code>null</code> if a matching add lab appli info could not be found
	 */
	public AddLabAppliInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
			orderByComparator);

	/**
	 * Returns the last add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a matching add lab appli info could not be found
	 */
	public AddLabAppliInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
				orderByComparator)
		throws NoSuchAddLabAppliInfoException;

	/**
	 * Returns the last add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab appli info, or <code>null</code> if a matching add lab appli info could not be found
	 */
	public AddLabAppliInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
			orderByComparator);

	/**
	 * Returns the add lab appli infos before and after the current add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabAppliInfoId the primary key of the current add lab appli info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	public AddLabAppliInfo[] findBygetJanaacById_PrevAndNext(
			long addLabAppliInfoId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
				orderByComparator)
		throws NoSuchAddLabAppliInfoException;

	/**
	 * Removes all the add lab appli infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab appli infos
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab appli info in the entity cache if it is enabled.
	 *
	 * @param addLabAppliInfo the add lab appli info
	 */
	public void cacheResult(AddLabAppliInfo addLabAppliInfo);

	/**
	 * Caches the add lab appli infos in the entity cache if it is enabled.
	 *
	 * @param addLabAppliInfos the add lab appli infos
	 */
	public void cacheResult(java.util.List<AddLabAppliInfo> addLabAppliInfos);

	/**
	 * Creates a new add lab appli info with the primary key. Does not add the add lab appli info to the database.
	 *
	 * @param addLabAppliInfoId the primary key for the new add lab appli info
	 * @return the new add lab appli info
	 */
	public AddLabAppliInfo create(long addLabAppliInfoId);

	/**
	 * Removes the add lab appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info that was removed
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	public AddLabAppliInfo remove(long addLabAppliInfoId)
		throws NoSuchAddLabAppliInfoException;

	public AddLabAppliInfo updateImpl(AddLabAppliInfo addLabAppliInfo);

	/**
	 * Returns the add lab appli info with the primary key or throws a <code>NoSuchAddLabAppliInfoException</code> if it could not be found.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	public AddLabAppliInfo findByPrimaryKey(long addLabAppliInfoId)
		throws NoSuchAddLabAppliInfoException;

	/**
	 * Returns the add lab appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info, or <code>null</code> if a add lab appli info with the primary key could not be found
	 */
	public AddLabAppliInfo fetchByPrimaryKey(long addLabAppliInfoId);

	/**
	 * Returns all the add lab appli infos.
	 *
	 * @return the add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findAll();

	/**
	 * Returns a range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab appli infos
	 */
	public java.util.List<AddLabAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabAppliInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab appli infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab appli infos.
	 *
	 * @return the number of add lab appli infos
	 */
	public int countAll();

}