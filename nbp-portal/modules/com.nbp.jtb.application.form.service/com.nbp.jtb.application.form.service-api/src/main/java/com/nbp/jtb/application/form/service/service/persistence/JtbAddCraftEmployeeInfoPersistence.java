/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddCraftEmployeeInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb add craft employee info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfoUtil
 * @generated
 */
@ProviderType
public interface JtbAddCraftEmployeeInfoPersistence
	extends BasePersistence<JtbAddCraftEmployeeInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbAddCraftEmployeeInfoUtil} to access the jtb add craft employee info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @return the range of matching jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftEmployeeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftEmployeeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a matching jtb add craft employee info could not be found
	 */
	public JtbAddCraftEmployeeInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddCraftEmployeeInfo> orderByComparator)
		throws NoSuchJtbAddCraftEmployeeInfoException;

	/**
	 * Returns the first jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft employee info, or <code>null</code> if a matching jtb add craft employee info could not be found
	 */
	public JtbAddCraftEmployeeInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftEmployeeInfo> orderByComparator);

	/**
	 * Returns the last jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a matching jtb add craft employee info could not be found
	 */
	public JtbAddCraftEmployeeInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddCraftEmployeeInfo> orderByComparator)
		throws NoSuchJtbAddCraftEmployeeInfoException;

	/**
	 * Returns the last jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft employee info, or <code>null</code> if a matching jtb add craft employee info could not be found
	 */
	public JtbAddCraftEmployeeInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftEmployeeInfo> orderByComparator);

	/**
	 * Returns the jtb add craft employee infos before and after the current jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the current jtb add craft employee info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	public JtbAddCraftEmployeeInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddCraftEmployeeInfoId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddCraftEmployeeInfo> orderByComparator)
		throws NoSuchJtbAddCraftEmployeeInfoException;

	/**
	 * Removes all the jtb add craft employee infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Returns the number of jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add craft employee infos
	 */
	public int countBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Caches the jtb add craft employee info in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 */
	public void cacheResult(JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo);

	/**
	 * Caches the jtb add craft employee infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftEmployeeInfos the jtb add craft employee infos
	 */
	public void cacheResult(
		java.util.List<JtbAddCraftEmployeeInfo> jtbAddCraftEmployeeInfos);

	/**
	 * Creates a new jtb add craft employee info with the primary key. Does not add the jtb add craft employee info to the database.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key for the new jtb add craft employee info
	 * @return the new jtb add craft employee info
	 */
	public JtbAddCraftEmployeeInfo create(long jtbAddCraftEmployeeInfoId);

	/**
	 * Removes the jtb add craft employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	public JtbAddCraftEmployeeInfo remove(long jtbAddCraftEmployeeInfoId)
		throws NoSuchJtbAddCraftEmployeeInfoException;

	public JtbAddCraftEmployeeInfo updateImpl(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo);

	/**
	 * Returns the jtb add craft employee info with the primary key or throws a <code>NoSuchJtbAddCraftEmployeeInfoException</code> if it could not be found.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	public JtbAddCraftEmployeeInfo findByPrimaryKey(
			long jtbAddCraftEmployeeInfoId)
		throws NoSuchJtbAddCraftEmployeeInfoException;

	/**
	 * Returns the jtb add craft employee info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info, or <code>null</code> if a jtb add craft employee info with the primary key could not be found
	 */
	public JtbAddCraftEmployeeInfo fetchByPrimaryKey(
		long jtbAddCraftEmployeeInfoId);

	/**
	 * Returns all the jtb add craft employee infos.
	 *
	 * @return the jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findAll();

	/**
	 * Returns a range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @return the range of jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftEmployeeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add craft employee infos
	 */
	public java.util.List<JtbAddCraftEmployeeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftEmployeeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb add craft employee infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb add craft employee infos.
	 *
	 * @return the number of jtb add craft employee infos
	 */
	public int countAll();

}