/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddListDriverInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb add list driver info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfoUtil
 * @generated
 */
@ProviderType
public interface JtbAddListDriverInfoPersistence
	extends BasePersistence<JtbAddListDriverInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbAddListDriverInfoUtil} to access the jtb add list driver info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of matching jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListDriverInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListDriverInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a matching jtb add list driver info could not be found
	 */
	public JtbAddListDriverInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddListDriverInfo> orderByComparator)
		throws NoSuchJtbAddListDriverInfoException;

	/**
	 * Returns the first jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list driver info, or <code>null</code> if a matching jtb add list driver info could not be found
	 */
	public JtbAddListDriverInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListDriverInfo>
			orderByComparator);

	/**
	 * Returns the last jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a matching jtb add list driver info could not be found
	 */
	public JtbAddListDriverInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddListDriverInfo> orderByComparator)
		throws NoSuchJtbAddListDriverInfoException;

	/**
	 * Returns the last jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list driver info, or <code>null</code> if a matching jtb add list driver info could not be found
	 */
	public JtbAddListDriverInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListDriverInfo>
			orderByComparator);

	/**
	 * Returns the jtb add list driver infos before and after the current jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the current jtb add list driver info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	public JtbAddListDriverInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddListDriverInfoId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddListDriverInfo> orderByComparator)
		throws NoSuchJtbAddListDriverInfoException;

	/**
	 * Removes all the jtb add list driver infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Returns the number of jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add list driver infos
	 */
	public int countBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Caches the jtb add list driver info in the entity cache if it is enabled.
	 *
	 * @param jtbAddListDriverInfo the jtb add list driver info
	 */
	public void cacheResult(JtbAddListDriverInfo jtbAddListDriverInfo);

	/**
	 * Caches the jtb add list driver infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddListDriverInfos the jtb add list driver infos
	 */
	public void cacheResult(
		java.util.List<JtbAddListDriverInfo> jtbAddListDriverInfos);

	/**
	 * Creates a new jtb add list driver info with the primary key. Does not add the jtb add list driver info to the database.
	 *
	 * @param jtbAddListDriverInfoId the primary key for the new jtb add list driver info
	 * @return the new jtb add list driver info
	 */
	public JtbAddListDriverInfo create(long jtbAddListDriverInfoId);

	/**
	 * Removes the jtb add list driver info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info that was removed
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	public JtbAddListDriverInfo remove(long jtbAddListDriverInfoId)
		throws NoSuchJtbAddListDriverInfoException;

	public JtbAddListDriverInfo updateImpl(
		JtbAddListDriverInfo jtbAddListDriverInfo);

	/**
	 * Returns the jtb add list driver info with the primary key or throws a <code>NoSuchJtbAddListDriverInfoException</code> if it could not be found.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	public JtbAddListDriverInfo findByPrimaryKey(long jtbAddListDriverInfoId)
		throws NoSuchJtbAddListDriverInfoException;

	/**
	 * Returns the jtb add list driver info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info, or <code>null</code> if a jtb add list driver info with the primary key could not be found
	 */
	public JtbAddListDriverInfo fetchByPrimaryKey(long jtbAddListDriverInfoId);

	/**
	 * Returns all the jtb add list driver infos.
	 *
	 * @return the jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findAll();

	/**
	 * Returns a range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListDriverInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add list driver infos
	 */
	public java.util.List<JtbAddListDriverInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddListDriverInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb add list driver infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb add list driver infos.
	 *
	 * @return the number of jtb add list driver infos
	 */
	public int countAll();

}